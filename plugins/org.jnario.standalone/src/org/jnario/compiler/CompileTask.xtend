package org.jnario.compiler

import org.apache.tools.ant.Task
import org.apache.tools.ant.BuildException
import static org.jnario.compiler.CompilerMain.*
import org.apache.tools.ant.types.Path
import org.apache.tools.ant.types.Reference

class CompileTask extends Task {
	
	/*
	 * Set target for the generated Java source. Default is "xtend-gen".
	 */
	@Property String outputPath = "xtend-gen";
	Path classPath = null
	
	/*
	 * Set the temporary folder to use. Default is a temporary folder obtained via System::getProperty("java.io.tmpdir").
	 */
	@Property String tempDirectory = System::getProperty("java.io.tmpdir");
	
	/*
	 * The spec encoding. Default is UTF-8.
	 */
	@Property String fileEncoding = "UTF-8";
	
	Path sourcePath = null;
	
	override execute() throws BuildException {
		val compiler = new CompilerMain() => [
			it.outputPath = this.outputPath
			it.classPath = this.classPath.toString
			it.tempDirectory = this.tempDirectory
			it.fileEncoding = this.fileEncoding
			it.sourcePath = this.sourcePath.toString
		]
		if(compiler.compile() == COMPILATION_ERROR){
			throw new BuildException("Error when compiling Jnario specs")
		}
	}
	
     /**
     * Set the sourcepath to use by reference.
     *
     * @param r a reference to an existing sourcepath.
     */
	def void setSourcepathRef(Reference r) {
        createSourcepath().setRefid(r);
    }
    
    /**
     * Set the sourcepath to be used when compiling the Jnario specs.
     *
     * @param s an Ant Path object containing the sourcepath.
     */
    def void setSourcepath(Path s){
    	createSourcepath().append(s);
    }
	
	 /**
     * Set the classpath to use by reference.
     *
     * @param r a reference to an existing classpath.
     */
	def void setClasspathRef(Reference r) {
        createClasspath().setRefid(r);
    }
    
    /**
     * Set the classpath to be used when compiling the Jnario specs.
     *
     * @param s an Ant Path object containing the classpath.
     */
    def void setClasspath(Path s){
    	createClasspath().append(s);
    }
    
    def private createClasspath(){
    	if(classPath == null){
    		classPath = new Path(getProject)
    	}
    	classPath
    }
    
    def private createSourcepath(){
    	if(sourcePath == null){
    		sourcePath = new Path(getProject)
    	}
    	sourcePath
    }
}