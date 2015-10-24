from os import walk
import sys, os
import fnmatch

print 'Running code analysis to check comment to code ratio\n'

mypath = os.getcwd()
if len(sys.argv)>=2 and os.path.exists(sys.argv[1]):
    mypath = sys.argv[1]

threshold = 10
if len(sys.argv)>=3 and sys.argv[2].isdigit():
    threshold = int(sys.argv[2])

filelist = []
for (dirpath, dirnames, filenames) in walk(mypath):
    for filename in fnmatch.filter(filenames, '*.c'):
        filelist.append(os.path.join(dirpath,filename))
    for filename in fnmatch.filter(filenames, '*.cpp'):
        filelist.append(os.path.join(dirpath,filename))
    for filename in fnmatch.filter(filenames, '*.java'):
        filelist.append(os.path.join(dirpath,filename))

comment_dict = {'c':{'single':'//','multi':'/*'},'cpp':{'single':'//','multi':'/*'},'java':{'single':'//','multi':'/*'}}

outfile = os.path.dirname(os.path.abspath(sys.argv[0]))
print 'Writing output to: {}/codeanalysis.result\n'.format(outfile)
with open(outfile + '/codeanalysis.result','w') as fp:
    failflag = False
    filecontent = 'Code analysis result:\n'
    for filename in filelist:
        filetype = filename.split('.')[-1]
        single = 'single'
        multi = 'multi'
        codecount = 0
        linecount = 0
        commentflag = False
        commentcount = 0
        with open(filename) as f:
            for eachline in f:
                eachline = eachline.lstrip().rstrip()
                linecount+=1
                if len(eachline) == 0:
                    continue
                if eachline.startswith(comment_dict[filetype][multi]):
                    if eachline.endswith(comment_dict[filetype][multi][::-1]):
                        commentcount+=1
                        continue
                    else:
                        commentcount+=1
                        commentflag=True
                        continue
                if eachline.endswith(comment_dict[filetype][multi][::-1]):
                    commentflag = False
                    commentcount+=1
                    continue
                elif eachline.find(comment_dict[filetype][multi][::-1])!=-1:
                    commentflag = False
                    commentcount+=1
                    codecount+=1
                if commentflag:
                    commentcount+=1
                    continue
                if eachline.startswith(comment_dict[filetype][single]):
                    commentcount+=1
                    continue
                if eachline.find(comment_dict[filetype][single])!=-1:
                    commentcount+=1
                    codecount+=1
                    continue
                codecount+=1
        if commentcount*100/codecount < threshold:
            print 'Comment to code ratio is lesser than',threshold
            print 'Filename:',filename
            print "\t# of comments:",commentcount
            print "\t# of lines of code:",codecount
            print "\tTotal # of lines:",linecount
        commratio = float(commentcount*100/codecount)
        filecontent = filecontent + '\n' + 'Filename: {}\n# of comments: {}\n# of code lines: {}\n#Total # of lines: {}\n'.format(
            filename, commentcount, codecount, linecount)
        if commratio < threshold:
            failflag = True
            filecontent = filecontent + 'Comment to code ratio: {}\n'.format(commratio)
            print '\tComment to code ratio: {}\n'.format(commratio)
    if failflag:
        print '\nSTATUS: FAILURE'
        filecontent = filecontent + '\nSTATUS: FAILURE'
    else:
        print '\nSTATUS: SUCCESS'
        filecontent = filecontent + '\nSTATUS: SUCCESS'
    fp.write(filecontent)
