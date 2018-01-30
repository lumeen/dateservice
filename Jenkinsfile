node {
    def app
    stage('Checkout') {

            checkout scm
        }

    stage('Test image')

    withMaven(
            maven: 'Maven',
    )
            {
                sh 'mvn test'
            }

    stage('Build image') {
        app = docker.build("dataservice/dataservice")
    }
    
    stage('Push image') {
        docker.withRegistry('http://54.77.188.106:5000/','docker-reg-cred') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
        
    }
}

