def call(String projectName,String tagname,String dockerHubUsername){
  sh 'docker build -t ${dockerHubUsername}/${projectName}:${tagname} .'
}
