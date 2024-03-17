def call(Map config = [:]){
    sh "ssh ${config.remoteUser}@${config.remoteHost} sudo service ${config.serviceName} ${config.serviceOperation}"
}