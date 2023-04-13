pipeline{
    agent {
        label "jenkins-agent"
    }
    tools {
        jdk 'Java17'
        maven 'Maven3'
    }
    stages{
        stage("Cleanup Workspace") {
            steps {
                script {
                    cleanWs()
                }
            }
        }
    }
}