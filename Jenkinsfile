pipeline{
    agent any

    stages{
        stage('Checkout'){
            steps{
                 git 'https://github.com/Pkv0308/ElectricityPipeline'
            }
        }
        
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}