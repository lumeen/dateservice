node {
    def app
    stage('Checkout') {

            checkout scm
        }

    stage('Test image')

            {
                sh 'git clone https://github.com/lumeen/dateservice'
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

