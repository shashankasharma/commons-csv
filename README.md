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
...For this part we have found the code to comment ratio and if the ratio is below a given thresh hold, 10% for us, the build will fail. We wrote a pre-push hook to reject the commit for this case.
Screencast of failure based on the code to comment ratio:
[![IMAGE Build Failure due to comment to code ratio](http://img.youtube.com/vi/Ti7vYmwPbRg/0.jpg)](https://www.youtube.com/watch?v=Ti7vYmwPbRg&feature=youtu.be)

7. Security Token Gate
...If any of the files in project is has an extension .pem, .key  or if it contains api keys or tokens the push is rejected. The check for these conditions is written using a python script and pre push hook.
Screencast of failure based on the presence of keyfile or key tokens:
[![IMAGE Build Failure due to security analysis](http://img.youtube.com/vi/700yRmC2um8/0.jpg)](https://www.youtube.com/watch?v=700yRmC2um8&feature=youtu.be)  
Screencast of successful build:
[![IMAGE Build Success](http://img.youtube.com/vi/pA_oqnlFUt8/0.jpg)](https://www.youtube.com/watch?v=pA_oqnlFUt8&feature=youtu.be)
