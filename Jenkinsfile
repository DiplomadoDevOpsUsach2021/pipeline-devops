
pipeline {
    agent any
    environment {
        NEXUS_USER         = credentials('NEXUS-USER')
        NEXUS_PASSWORD     = credentials('NEXUS-PASSWPRD')
    }
    parameters {
        /*choice(
            name:'compileTool',
            choices: ['Maven', 'Gradle'],
            description: 'Seleccione herramienta de compilacion'
        )*/
        string(
            name: 'stage', 
            defaultValue: ' ', 
            description='stage'
        )
    }
    stages {
        stage("Pipeline"){
            steps {
                script{
                    def ejecucion = load 'maven.groovy'
                            ejecucion.call()

                  /* switch(params.compileTool)
                    {
                        case 'Maven':
                            def ejecucion = load 'maven.groovy'
                            ejecucion.call()
                        break;
                        case 'Gradle':
                            def ejecucion = load 'gradle.groovy'
                            ejecucion.call()
                        break;
                    }
                    */
                }
            }
        }
    }
}