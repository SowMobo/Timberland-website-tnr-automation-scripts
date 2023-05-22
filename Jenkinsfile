pipeline {
    agent any

    stages {
        stage('Launch TNR') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
     post {
            always {
              step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
            }
          }
}