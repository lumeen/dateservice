node {
    def app

    stage('Clone repository') {
        checkout scm
    }

    stage('Build image') {
sh 'sudo docker build dataservice/dataservice'

    }

    stage('Test image') {


        app.inside {
            sh 'mvn test'
        }
    }

    stage('Push image') {
        docker.withRegistry('http://46.51.141.195:5000/', 'docker-hub-credentials') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
        }

    }
}

