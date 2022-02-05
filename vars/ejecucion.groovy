/*

	forma de invocación de método call:

	def ejecucion = load 'script.groovy'
	ejecucion.call()

*/

def call(){
  
  stage(){
    //Escribir directamente el código del stage, sin agregarle otra clausula de Jenkins.
    if(params.compileTool == 'maven'){
        //compilar maven
        //def executor = load "maven.groovy"
        //executor.call()
    maven.call(params.stage);
    }else{
        //compilar gradle
        //def executor = load "gradle.groovy"
        //executor.call()
    gradle.call(params.stage)
    }
    
  }

}

return this;