package org.jnario.compiler

import com.google.common.collect.Iterables
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler
import org.eclipse.xtend.lib.Property
import org.jnario.doc.AbstractDocGenerator
import org.jnario.doc.DocOutputConfigurationProvider
import org.eclipse.emf.ecore.util.EcoreUtil

class JnarioDocCompiler extends XtendBatchCompiler{
	
	@Property String resultFolder
	@Inject AbstractDocGenerator docGenerator
	
	override compile() {
		val resourceSet = loadXtendFiles()
		val classDirectory = createTempDir("classes")
		installJvmTypeProvider(resourceSet, classDirectory);
		EcoreUtil::resolveAll(resourceSet);
		val issues = validate(resourceSet);
		val errors = Iterables::filter(issues, SeverityFilter::ERROR);
		val warnings = Iterables::filter(issues, SeverityFilter::WARNING);
		reportIssues(errors + warnings);
		if (!errors.empty) {
			return false;
		}
		generateDocumentation(resourceSet);
		true
	}
	
	def generateDocumentation(ResourceSet rs){
		val javaIoFileSystemAccess = javaIoFileSystemAccessProvider.get()
		javaIoFileSystemAccess.setOutputPath(DocOutputConfigurationProvider::DOC_OUTPUT, outputPath)
		for(r : rs.resources){
			if(fileExtensionProvider.isValid(r.URI.fileExtension)){
				docGenerator.doGenerate(r, javaIoFileSystemAccess)
			}
		}
	}
	
}