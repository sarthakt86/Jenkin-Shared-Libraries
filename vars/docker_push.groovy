def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:"dockerHubCred", passwordVariable: 'dockerHubOass', usernameVariable: 'dockerHubUser')])
  sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
}
sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
