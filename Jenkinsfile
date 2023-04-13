pipeline{
    agent {
        label "jenkins-agent"
    }
    tools {
        jdk 'Java17'
        maven 'Maven3'
    }
    stages {
        stage("Cleanup Workspace") {
            steps {
                script {
                    cleanWs()
                }
            }
        }

        stage("Checkout Code") {
            steps {
                script {
                    git branch: 'main', credentialsId: 'github', url: 'https://github.com/dmancloud/complete-devops-pipeline'
                }
            }        
        }

        stage("Build Application") {
            steps {
                script {
                    sh "mvn clean package"
                }
            }        
        }
    }
}