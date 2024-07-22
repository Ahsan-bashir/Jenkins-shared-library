#!/user/bin/env groovy
def call (String imageName){
    echo 'Building the Docker Image...'
    withCredentials([
            usernamePassword(credentialsId: 'docker-hub-repo-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')
    ]) {
        
        sh "docker build -t $imageName ."
        sh 'echo $PASSWORD | docker login -u $USERNAME --password-stdin '
        sh "docker push $imageName"
    }
}