<!---
 Licensed to the Apache Software Foundation (ASF) under one or more
 contributor license agreements.  See the NOTICE file distributed with
 this work for additional information regarding copyright ownership.
 The ASF licenses this file to You under the Apache License, Version 2.0
 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
-->
<!---
 +======================================================================+
 |****                                                              ****|
 |****      THIS FILE IS GENERATED BY THE COMMONS BUILD PLUGIN      ****|
 |****                    DO NOT EDIT DIRECTLY                      ****|
 |****                                                              ****|
 +======================================================================+
 | TEMPLATE FILE: readme-md-template.md                                 |
 | commons-build-plugin/trunk/src/main/resources/commons-xdoc-templates |
 +======================================================================+
 |                                                                      |
 | 1) Re-generate using: mvn commons:readme-md                          |
 |                                                                      |
 | 2) Set the following properties in the component's pom:              |
 |    - commons.componentid (required, alphabetic, lower case)          |
 |    - commons.release.version (required)                              |
 |                                                                      |
 | 3) Example Properties                                                |
 |                                                                      |
 |  <properties>                                                        |
 |    <commons.componentid>math</commons.componentid>                   |
 |    <commons.release.version>1.2</commons.release.version>            |
 |  </properties>                                                       |
 |                                                                      |
 +======================================================================+
--->
CSC DevOps - Milestone 2
===================
MILESTONE : TEST + ANALYSIS
--------------------------
Milestone 2 is the testing and analysis section of the project, and comprises the components that ensure correctness of a commit.

Target Project
--------------
[Apache Commons CSV](http://commons.apache.org/proper/commons-csv/)  
Source: [Apache Commons CSV](https://github.com/apache/commons-csv)

Team Members
------------
Shashanka Sharma (srsharma)  
Jitesh Mohan (jitesh)  
Sheenam Mittal (smittal3)  

###Tools Used
1. Jenkins
2. Eclipse
3. Git
4. Node Package Manager

###TEST SECTION
Tools Used:  
1. Cobertura (Jenkins Plugin)  
2. Randoop (Eclipse Plugin)  

###ANALYSIS SECTION
Tools Used:  
1. Findbugs (Jenkins Plugin)  

MILESTONE COMPONENTS
--------------------
1. Unit Tests and Coverage  
We used cobertura to report the coverage obtained on running the standard unit tests provided in the target project. The coverage results for the unit test is:  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/initial_coverage.png)
Coverage resuts with failure:
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/coverage_failure.png)

2. Advanced Testing Technique  
We extended the coverage using an external test case generation plugin, Randoop. Randoop is installed on Eclipse, and is used to create multiple random testcases. The genaration report for randoop is:  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/randoop_generation.png)  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/randoop_generation_w_failure.png)  
Coverage report with Extended testcases:  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/extended_coverage.png)  
Logs of the randoop generated testcases:  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/tests_log.png)  

3. Base Analysis  
We use the Jenkins plugin namely findbugs to perform static analysis on the project.

4. Extended Analysis  
Implemented a new analysis from scratch which gives a detailed report on the ratio of the total number of code lines to the total comments for every file. It then compares this ratio against a threshold to deem success or failure. The analysis is implemented via a script written in Python which reports the results to console as well as writes it to a file.

5. Testing Gate  
The findbugs and cobertura plugins of Jenkins allows us to specify the status of the build based on specified thresholds. The build fails if the coverage is less than the sepcified minimum. For our project the coverage obtained from unit and randoop testcases was very high. We tried with the following: 97% for conditions and 92% coverage and the build failed.  
Screenshot of warnings generated on running FindBugs:  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/findbugs_warning.png)
Screenshot of the sample errors generated while running FindBugs:  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/findbugs_failure.png)
Screenshot capturing the Test Gate failure:  
![Alt text](https://github.com/shashankasharma/commons-csv/blob/trunk/images/test_gate_failure.png)

6. Analysis Gate  
For this part we have found the code to comment ratio and if the ratio is below a given thresh hold, 10% for us, the build will fail. We wrote a pre-push hook to reject the commit for this case.
Screencast of failure based on the code to comment ratio:  
[![IMAGE Build Failure due to comment to code ratio](http://img.youtube.com/vi/Ti7vYmwPbRg/0.jpg)](https://www.youtube.com/watch?v=Ti7vYmwPbRg&feature=youtu.be)

7. Security Token Gate  
If any of the files in project is has an extension .pem, .key  or if it contains api keys or tokens the push is rejected. The check for these conditions is written using a python script and pre push hook.
Screencast of failure based on the presence of keyfile or key tokens:  
[![IMAGE Build Failure due to security analysis](http://img.youtube.com/vi/700yRmC2um8/0.jpg)](https://www.youtube.com/watch?v=700yRmC2um8&feature=youtu.be)  
Screencast of successful build:  
[![IMAGE Build Success](http://img.youtube.com/vi/pA_oqnlFUt8/0.jpg)](https://www.youtube.com/watch?v=pA_oqnlFUt8&feature=youtu.be)

### Code section
#### pre-push hook
```#!/bin/sh

python "$(git rev-parse --show-toplevel)/analysis/code_analysis.py" $(git rev-parse --show-toplevel) 0
python "$(git rev-parse --show-toplevel)/analysis/sec_analysis.py" $(git rev-parse --show-toplevel)
cd "$(git rev-parse --show-toplevel)/analysis"
rm -rf node_modules
npm install
cd ../
nodejs "$(git rev-parse --show-toplevel)/analysis/build.js"
if [ $? = 1 ]
    then
        rm -rf analysis/node_modules
        exit 1
fi
rm -rf analysis/node_modules
exit 0
```  
#### Code Analysis Script
```
from os import walk
import sys, os
import fnmatch

print '\n\nRunning code analysis to check comment to code ratio:'

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
print 'Writing output to: {}/codeanalysis.result'.format(outfile)
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
```  
#### Security analysis script
```
    from os import walk
import sys, os, fnmatch, re

mypath = ''
if len(sys.argv)==2 and os.path.exists(sys.argv[1]):
    mypath = sys.argv[1]
else:
    mypath = os.getcwd()

filelist = []
keyfilelist = []
opbufferinit = '\nRunning security analysis:'
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
    for filename in fnmatch.filter(filenames, '*.key'):
        keyfilelist.append(os.path.join(dirpath,filename))
    for filename in fnmatch.filter(filenames, '*.pem'):
        keyfilelist.append(os.path.join(dirpath,filename))

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
                opbuffer+='\n\n' + 'Filename: {}\nLine number: {}'.format(filename, linenum)
                break
            elif len(awsregex.findall(eachline)):
                flag = False
                for eachtoken in awsregex.findall(eachline):
                    if len(eachtoken) == 40:
                        opbuffer+='\n\n' + 'Filename: {}\nLine number: {}'.format(filename, linenum)
                        flag = True
                        break
                if flag:
                    break
if len(keyfilelist):
    opbuffer+="\n\nFound files with security keys."
    for eachfile in keyfilelist:
        opbuffer+='\n' + 'Filename: {}'.format(eachfile)
    opbuffer+="\n\nPlease remove these files before pushing changes."

with open(os.path.join(os.path.dirname(os.path.abspath(sys.argv[0])),'secanalysis.result'),'w') as opfile:
    opfile.write(opbufferinit)
    if len(opbuffer) or len(keyfilelist):
        opbuffer+='\n\nSTATUS: FAILURE'
    else:
        opbuffer+='\n\nSTATUS: SUCCESS'
    opfile.write(opbuffer)
print opbufferinit + opbuffer + '\n'
```  
#### Jenkins configuration file
```
<?xml version='1.0' encoding='UTF-8'?>
<maven2-moduleset plugin="maven-plugin@2.7.1">
  <actions/>
  <description></description>
  <keepDependencies>false</keepDependencies>
  <properties/>
  <scm class="hudson.plugins.git.GitSCM" plugin="git@2.4.0">
    <configVersion>2</configVersion>
    <userRemoteConfigs>
      <hudson.plugins.git.UserRemoteConfig>
        <url>/home/srsharma/Studies/sem3/csc591/commons-csv</url>
      </hudson.plugins.git.UserRemoteConfig>
    </userRemoteConfigs>
    <branches>
      <hudson.plugins.git.BranchSpec>
        <name>*/trunk</name>
      </hudson.plugins.git.BranchSpec>
    </branches>
    <doGenerateSubmoduleConfigurations>false</doGenerateSubmoduleConfigurations>
    <submoduleCfg class="list"/>
    <extensions/>
  </scm>
  <canRoam>true</canRoam>
  <disabled>false</disabled>
  <blockBuildWhenDownstreamBuilding>false</blockBuildWhenDownstreamBuilding>
  <blockBuildWhenUpstreamBuilding>false</blockBuildWhenUpstreamBuilding>
  <triggers>
    <hudson.triggers.SCMTrigger>
      <spec></spec>
      <ignorePostCommitHooks>false</ignorePostCommitHooks>
    </hudson.triggers.SCMTrigger>
  </triggers>
  <concurrentBuild>false</concurrentBuild>
  <rootModule>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-csv</artifactId>
  </rootModule>
  <goals>clean compile findbugs:findbugs cobertura:cobertura -Dcobertura.report.format=xml</goals>
  <aggregatorStyleBuild>true</aggregatorStyleBuild>
  <incrementalBuild>false</incrementalBuild>
  <ignoreUpstremChanges>false</ignoreUpstremChanges>
  <archivingDisabled>false</archivingDisabled>
  <siteArchivingDisabled>false</siteArchivingDisabled>
  <fingerprintingDisabled>false</fingerprintingDisabled>
  <resolveDependencies>false</resolveDependencies>
  <processPlugins>false</processPlugins>
  <mavenValidationLevel>-1</mavenValidationLevel>
  <runHeadless>false</runHeadless>
  <disableTriggerDownstreamProjects>false</disableTriggerDownstreamProjects>
  <blockTriggerWhenBuilding>true</blockTriggerWhenBuilding>
  <settings class="jenkins.mvn.DefaultSettingsProvider"/>
  <globalSettings class="jenkins.mvn.DefaultGlobalSettingsProvider"/>
  <reporters>
    <hudson.plugins.findbugs.FindBugsReporter plugin="findbugs@4.62">
      <healthy></healthy>
      <unHealthy></unHealthy>
      <pluginName>[FINDBUGS] </pluginName>
      <thresholdLimit>low</thresholdLimit>
      <canRunOnFailed>false</canRunOnFailed>
      <useDeltaValues>false</useDeltaValues>
      <thresholds plugin="analysis-core@1.74">
        <unstableTotalAll></unstableTotalAll>
        <unstableTotalHigh></unstableTotalHigh>
        <unstableTotalNormal></unstableTotalNormal>
        <unstableTotalLow></unstableTotalLow>
        <unstableNewAll></unstableNewAll>
        <unstableNewHigh></unstableNewHigh>
        <unstableNewNormal></unstableNewNormal>
        <unstableNewLow></unstableNewLow>
        <failedTotalAll>5</failedTotalAll>
        <failedTotalHigh>1</failedTotalHigh>
        <failedTotalNormal>2</failedTotalNormal>
        <failedTotalLow>2</failedTotalLow>
        <failedNewAll></failedNewAll>
        <failedNewHigh></failedNewHigh>
        <failedNewNormal></failedNewNormal>
        <failedNewLow></failedNewLow>
      </thresholds>
      <dontComputeNew>true</dontComputeNew>
      <usePreviousBuildAsReference>false</usePreviousBuildAsReference>
      <useStableBuildAsReference>false</useStableBuildAsReference>
      <isRankActivated>false</isRankActivated>
      <excludePattern></excludePattern>
      <includePattern></includePattern>
    </hudson.plugins.findbugs.FindBugsReporter>
  </reporters>
  <publishers>
    <hudson.plugins.cobertura.CoberturaPublisher plugin="cobertura@1.9.7">
      <coberturaReportFile>**/target/site/cobertura/coverage.xml</coberturaReportFile>
      <onlyStable>false</onlyStable>
      <failUnhealthy>true</failUnhealthy>
      <failUnstable>false</failUnstable>
      <autoUpdateHealth>false</autoUpdateHealth>
      <autoUpdateStability>false</autoUpdateStability>
      <zoomCoverageChart>false</zoomCoverageChart>
      <maxNumberOfBuilds>0</maxNumberOfBuilds>
      <failNoReports>true</failNoReports>
      <healthyTarget>
        <targets class="enum-map" enum-type="hudson.plugins.cobertura.targets.CoverageMetric">
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>METHOD</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>8000000</int>
          </entry>
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>LINE</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>8000000</int>
          </entry>
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>CONDITIONAL</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>9900000</int>
          </entry>
        </targets>
      </healthyTarget>
      <unhealthyTarget>
        <targets class="enum-map" enum-type="hudson.plugins.cobertura.targets.CoverageMetric">
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>METHOD</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>8000000</int>
          </entry>
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>LINE</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>8000000</int>
          </entry>
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>CONDITIONAL</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>8000000</int>
          </entry>
        </targets>
      </unhealthyTarget>
      <failingTarget>
        <targets class="enum-map" enum-type="hudson.plugins.cobertura.targets.CoverageMetric">
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>METHOD</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>0</int>
          </entry>
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>LINE</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>0</int>
          </entry>
          <entry>
            <hudson.plugins.cobertura.targets.CoverageMetric>CONDITIONAL</hudson.plugins.cobertura.targets.CoverageMetric>
            <int>0</int>
          </entry>
        </targets>
      </failingTarget>
      <sourceEncoding>ASCII</sourceEncoding>
    </hudson.plugins.cobertura.CoberturaPublisher>
  </publishers>
  <buildWrappers/>
  <prebuilders/>
  <postbuilders/>
  <runPostStepsIfResult>
    <name>FAILURE</name>
    <ordinal>2</ordinal>
    <color>RED</color>
    <completeBuild>true</completeBuild>
  </runPostStepsIfResult>
</maven2-moduleset>
```   
#### Build script
```
var exec = require('child_process').exec;
var curl = require('node-curl');
var path = require('path');

var pathdir = path.dirname(process.argv[1])
var status = true
exec("tail -1 " + pathdir + "/codeanalysis.result", function(error, stdout, stderr){
	if(!error){
		var resline = stdout.split(':');
		var stat = resline[resline.length-1].replace(' ','');
		if (stat == 'FAILURE'){
			status = false
		}
	}
	exec("tail -1 " + pathdir + "secanalysis.result", function(error, stdout, stderr){
		if(!error){
			var resline = stdout.split(':');
			var stat = resline[resline.length-1].replace(' ','');
			if (stat == 'FAILURE'){
				status = false
			}
		}
		
		if (status == true){
			console.log('Initial code analysis passed.\nContinuing build.')
			exec("basename `git rev-parse --show-toplevel`", function(error, stdout, stderr){
				if (!error){
					var jobname = stdout.replace('\n','');
					curl('http://localhost:8080/job/'+jobname+'/build?delay=0sec',function(err) {
			    	console.log('Starting job build on the server.');
					});
					var new_curl = curl.create();
					console.log('Waiting for job build status.');
					setTimeout(function(){
						new_curl('http://localhost:8080/job/'+jobname+'/lastBuild/api/json',function(err) {
					    	var responsebody = JSON.parse(this.body);
					    	var status = responsebody['result'];
					    	console.log('Build Status: ' + status);
					    	if(status=='FAILURE'){
								console.log("BUILD STATUS: FAILURE\nReverting commit by a step.")
								process.exit(1);
							}
							if(status=='SUCCESS'){
								console.log('BUILD STATUS: SUCCESS\nBuild completed successfully.\nCheck run results at:\n'+responsebody['url']);
								process.exit(0);
							}
					    });
					},60000);
				}
			});
		}
		else{
			console.log('Initial code analysis failure.\nAborting build.\nBUILD STATUS: FAILURE');
			process.exit(1);
		}
	});
});
```   
