package org.jnario.suite.doc

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendClass
import org.jnario.Specification
import org.jnario.doc.AbstractDocGenerator
import org.jnario.suite.jvmmodel.SuiteClassNameProvider
import org.jnario.suite.suite.Reference
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite
import org.jnario.suite.suite.Heading
import org.jnario.suite.jvmmodel.SpecResolver

import static extension org.jnario.util.Strings.*
import static extension org.eclipse.xtext.util.Strings.*
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.jnario.suite.suite.SuiteFile
import org.jnario.doc.HtmlFileBuilder
import org.jnario.doc.HtmlFile

class SuiteDocGenerator extends AbstractDocGenerator {
	@Inject extension SuiteClassNameProvider 
	@Inject extension SpecResolver
	@Inject extension HtmlFileBuilder
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		input.contents.filter(typeof(SuiteFile)).forEach[
			val htmlFile = createHtmlFile()
			xtendClasses.head.generate(fsa, htmlFile)	
		]
	}
   
	def HtmlFile createHtmlFile(SuiteFile file) {
		val suites = file.xtendClasses.filter(typeof(Suite))
		if(suites.empty) return HtmlFile::EMPTY_FILE
		HtmlFile::newHtmlFile[
			fileName = suites.head.className 
			title = suites.head.describe.convertFromJavaString(true)
			content = suites.generateContent
			rootFolder = suites.head.root
		]
	}

	override HtmlFile createHtmlFile(XtendClass file) {
		val suite = file as Suite
		HtmlFile::newHtmlFile[
			fileName = suite.className 
			title = suite.describe.convertFromJavaString(true)
			content = suite.generateContent
			rootFolder = suite.root
		]
	}
	
	def generateContent(Iterable<Suite> suites)'''
		«FOR suite : suites»
		«IF !(suite == suites.head)»
		«suite.name.firstLine.markdown2Html»
		«ENDIF»
		«suite.generateContent»
		«ENDFOR»
	'''

	def generateContent(Suite suite)'''
		«suite.name.trimFirstLine.markdown2Html»
		«IF !suite.elements.empty»
		<ul>
		«FOR spec : suite.elements»
			«generate(spec, spec.resolveSpecs)»
		«ENDFOR»
		</ul>
		«ENDIF»
	'''

	def dispatch generate(Heading ref, List<Specification> specs)'''
	</ul>	
	«ref.name.markdown2Html»
	<ul>
	'''

	def dispatch generate(Reference ref, List<Specification> specs)'''
	«FOR spec : specs»
		<li><a href="«ref.linkTo(spec)»">«spec.describe»</a> «ref.text»</li>
	«ENDFOR»
	'''
	
	def linkTo(EObject context, Specification spec){
		context.root + spec.packageName.replace(".", "/") + "/" + spec.className + ".html"
	}
	
	def text(Reference ref){
		switch ref{
			SpecReference: return ref.text
		}
		return ""
	}
	
}