pipeline {
  agent any
  stages {
    stage('Init') {
      steps {
        sh 'chmod +x gradlew'
      }
    }

    stage('Build') {
      steps {
        sh './gradlew build'
      }
    }

    stage('') {
      steps {
        archiveArtifacts(caseSensitive: true, defaultExcludes: true, artifacts: 'build/libs/')
      }
    }

  }
}