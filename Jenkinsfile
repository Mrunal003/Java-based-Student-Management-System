pipeline {
    agent {
        docker {
            image 'docker:24.0.7'
            args '-v /var/run/docker.sock:/var/run/docker.sock'
        }
    }

    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Docker Build and Push') {
            steps {
                sh 'docker build -t mrunalvekariya/student-management-system:latest .'
                sh 'docker push mrunalvekariya/student-management-system:latest'
            }
        }
    }
}
