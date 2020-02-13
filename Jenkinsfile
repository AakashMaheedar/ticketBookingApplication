node{
  stage('SCM Checkout'){
    
    git 'https://github.com/AakashMaheedar/sample1/'
  }
  stage('Compile-package'){
    def mvnHome =  tool name: '', type: 'maven'
    sh "{mvnHome}/bin/mvn package" 
  }
 }
