pipeline {
    agent any

    stages {
        stage('Build with Gradle') {
            steps {
                sh './gradlew run'
            }
        }

        stage('Docker Build and Push') {
            // when {
            //     expression { return false } // disable in Jenkins
            // }
            steps {
                sh 'docker build -t mrunalvekariya/student-management-system:latest .'
                sh 'docker push mrunalvekariya/student-management-system:latest'
            }
        }
    }
}
