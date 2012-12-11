package org.jnario.compiler

import org.apache.tools.ant.Task
import org.apache.tools.ant.BuildException
import static org.jnario.compiler.CompilerMain.*
import org.apache.tools.ant.types.Path
import org.apache.tools.ant.types.Reference

class ReportTask extends Task {
	
	/*
	 * Set target for the generated Jnario reports. Default is "doc-gen".
	 */
	@Property String outputPath = "doc-gen";
	
	/*
	 * Set folder containing JUnit XML test results. Default is "test-reports".
	 */
	@Property String resultFolder = "test-reports";
	
	/*
	 * The spec encoding. Default is UTF-8.
	 */
	@Property String fileEncoding = "UTF-8";
	Path sourcePath = null;
	
	override execute() throws BuildException {
		val compiler = new DocCompilerMain() => [
			outputPath = this.outputPath
			fileEncoding = this.fileEncoding
			it.sourcePath = this.sourcePath.toString
			resultFolder = this.resultFolder
		]
		if(compiler.compile() == COMPILATION_ERROR){
			throw new BuildException("Error when generating Jnario report")
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
	
	def private createSourcepath(){
    	if(sourcePath == null){
    		sourcePath = new Path(getProject)
    	}
    	sourcePath
    }

}   