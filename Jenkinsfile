
pipeline {
    agent any

    tools {
        jdk 'JDK'
        maven 'Maven'
    }

    environment {
        SONAR_PROJECT_KEY = 'sonarqube-maven-demo'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean verify'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh '''
                        mvn org.sonarsource.scanner.maven:sonar-maven-plugin:5.2.0.4988:sonar \
                            -Dsonar.projectKey=$SONAR_PROJECT_KEY
                    '''
                }
            }
        }
    }

    post {
        success {
            echo 'Build, tests, and SonarQube analysis completed.'
        }

        failure {
            echo 'Pipeline failed. Check the stage logs.'
        }
    }
}
