pipeline {
    agent {
        label 'aws'
    }
    triggers {
      pollSCM '* * * * *'   
    }

    environment {
        RUN_MODE = "dev"
        USER_NAME = "ATIN"
    }
    options {
         buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '2', numToKeepStr: '3')
        timeout(time: 60, unit: 'SECONDS')
    }
    tools {
        jdk 'jdk11'
        maven 'maven3'
        git 'Default'
    }


    stages {
        stage('CLEAN UP') {
            steps {
                 cleanWs()
            }
           
        }
        stage('CHECKOUT') {
            steps {
                 checkout scm
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Publish Result') {
            steps {
                junit 'target/**/*.xml'
            }
        }

    }

    post {
        always {
            sh 'echo ALWAYS'
        }
        changed {
            sh 'echo CHANGED'
        }
        fixed {
            sh 'echo FIXED'
        }
    }
}