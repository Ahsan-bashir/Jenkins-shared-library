#!/user/bin/env groovy
def call (){
    echo 'Building the application...'
    sh 'mvn package'
}