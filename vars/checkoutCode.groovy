def call(Map config = [:]){
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${config.repoUrl} ${workingDir}"
   sh "git checkout ${config.branch}"
   return workingDir
}