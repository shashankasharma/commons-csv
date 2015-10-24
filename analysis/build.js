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
		console.log('status now1: ' + status);
		exec("tail -1 " + pathdir + "/secanalysis.result", function(error, stdout, stderr){
			if(!error){
				var resline = stdout.split(':');
				var stat = resline[resline.length-1].replace(' ','');
				if (stat == 'FAILURE'){
					status = false
				}
				console.log('status now2: ' + status);
				if (status == true){
					console.log('Initial code analysis passed.\nContinuing build.')
					/*exec("basename `git rev-parse --show-toplevel`", function(error, stdout, stderr){
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
					});*/
				}	
				else{
					console.log('Initial code analysis failure.\nAborting build.\nBUILD STATUS: FAILURE');
					process.exit(1);
				}
			}
		});
	}
});

