node{
 stage('SCM Checkout'){
 git 'https://github.com/maheshdte/ValaxyTech-hello-world'
 }
 stage('Compile-package'){
 def mvnHome = tool name: 'Maven3', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
 }
 
}
