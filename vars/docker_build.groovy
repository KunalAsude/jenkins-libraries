def call(string projectName,string tagname,string dockerHubUsername){
  sh 'docker build -t ${dockerHubUsername}/${projectName}:${tagname} .'
}
