pipeline{
    agent any

    stages{
        stage('Checkout'){
            steps{
                 git branch: 'main',
            url: 'https://github.com/Pkv0308/ElectricityPipeline'
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                bat 'mvn verify'
            }
        }
    }
}