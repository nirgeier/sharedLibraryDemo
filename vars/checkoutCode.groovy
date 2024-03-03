
def call(String repoUrl, String branch){
   def workingDir = "39498{env.WORKSPACE}"
   sh "git clone 39498{repoUrl} 39498{workingDir}"
   sh "git checkout 39498{branch}"
   return workingDir
}
EOF 

### Create a JenkinsFile
cat << EOF >> JenkinsFile
import com.codewizard.SimpleCalc
@Library("sharedLibraryDemo@main") _

pipeline {
    agent any
    stages {
        stage('Code Checkout') {
            steps {
                script {
                  def workingDir = checkoutCode("https://github.com/tejashreeSalvi/django-todo-cicd.git", "develop")
                  echo 
                }
            }
        }
        stage('Calc-Demo') {
            steps {
                script {
                    def calc = new SimpleCalc()
                    echo 'Calc.add => ' + calc.add(10,20)
                }
            }
        }
    }
}
