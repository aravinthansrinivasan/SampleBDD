node{
    stage('SCM Checkout'){
    git 'https://github.com/aravinthansrinivasan/SampleBDD'
   }
  stage('Compile-Package'){
def mvnHome = tool name: 'Maven3', type: 'maven'
   sh SampleProject/"${mvnHome}/bin/mvn package"
   }
}
