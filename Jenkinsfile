pipeline{
    agent any
        stages{
            stage('complie stage')
            {
                steps
                {
                    withMaven(maven : 'Maven')
                    {
                        sh 'mvn clean compile'
                    }
                }
            }
            stage('Testing stage')
            {
                steps
                {
                    withMaven(maven : 'Maven')
                    {
                        sh 'mvn test'
                    }
                }
            }
            stage('Deployment stage')
            {
                steps
                {
                    withMaven(maven : 'Maven')
                         {
                            sh 'mvn test'
                         }
                }
            }
        }
}