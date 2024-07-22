pipeline {
    agent any
    stages {
        stage('Build and Test') {
            parallel {
                stage('Build') {
                    steps {
                        sh 'make build'
                    }
                }
                stage('Test') {
                    steps {
                        sh 'make test'
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                sh 'make deploy'
            }
        }
    }
}
