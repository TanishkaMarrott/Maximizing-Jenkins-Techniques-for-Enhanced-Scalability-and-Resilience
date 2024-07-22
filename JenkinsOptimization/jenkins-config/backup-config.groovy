pipeline {
    agent any
    stages {
        stage('Backup') {
            steps {
                sh 'tar -czf /backup/jenkins_backup_$(date +%F).tar.gz $JENKINS_HOME'
            }
        }
    }
}
