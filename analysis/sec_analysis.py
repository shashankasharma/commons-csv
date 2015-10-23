from os import walk
import sys, os, fnmatch, re

mypath = ''
if len(sys.argv)==2 and os.path.exists(sys.argv[1]):
    mypath = sys.argv[1]
else:
    mypath = os.getcwd()

filelist = []
opbufferinit = 'Running security analysis:\n'
opbuffer = ''
for (dirpath, dirnames, filenames) in walk(mypath):
    for filename in fnmatch.filter(filenames, '*.c'):
        filelist.append(os.path.join(dirpath,filename))
    for filename in fnmatch.filter(filenames, '*.cpp'):
        filelist.append(os.path.join(dirpath,filename))
    for filename in fnmatch.filter(filenames, '*.java'):
        filelist.append(os.path.join(dirpath,filename))
    for filename in fnmatch.filter(filenames, '*.json'):
        filelist.append(os.path.join(dirpath,filename))

doregex = re.compile('([A-Z0-9]{64})[\s\'\"\;\)\]\}]*$')
awsregex = re.compile('([A-Z]*[0-9][A-Z0-9]+)[\s\'\"\;\)\]\}]*$')
for filename in filelist:
    filetype = filename.split('.')[-1]
    linenum = 0
    with open(filename) as f:
        for eachline in f:
            linenum+=1
            eachline = eachline.lstrip().rstrip()
            if len(doregex.findall(eachline)):
                opbuffer+='\n' + 'Filename: {}\nLine number: {}\n'.format(filename, linenum)
                break
            elif len(awsregex.findall(eachline)):
                flag = False
                for eachtoken in awsregex.findall(eachline):
                    if len(eachtoken) == 40:
                        opbuffer+='\n' + 'Filename: {}\nLine number: {}\n'.format(filename, linenum)
                        flag = True
                        break
                if flag:
                    break
with open(os.path.join(os.path.dirname(os.path.abspath(sys.argv[0])),'secanalysis.result'),'w') as opfile:
    opfile.write(opbufferinit)
    if len(opbuffer):
        opbuffer+='\nSTATUS: FAILURE'
    else:
        opbuffer+='\nSTATUS: SUCCESS'
    opfile.write(opbuffer)
print opbufferinit + opbuffer + '\n'