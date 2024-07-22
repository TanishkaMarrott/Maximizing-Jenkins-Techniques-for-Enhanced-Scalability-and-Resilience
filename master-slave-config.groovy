node('master') {
    stage('Checkout') {
        checkout scm
    }
    parallel(
        'Test on Linux': {
            node('linux-slave') {
                stage('Test') {
                    sh 'make test'
                }
            }
        },
        'Test on Windows': {
            node('windows-slave') {
                stage('Test') {
                    bat 'make test'
                }
            }
        }
    )
}
