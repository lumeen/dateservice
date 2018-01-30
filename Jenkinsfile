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
        docker.withRegistry('http://46.51.141.195:5000/','docker-reg-cred') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }
        
    }
}

