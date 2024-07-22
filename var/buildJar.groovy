#!/user/bin/env groovy
def call (){
    echo "Building the application for branch $BRANCH_NAME"
    sh 'mvn package'
}