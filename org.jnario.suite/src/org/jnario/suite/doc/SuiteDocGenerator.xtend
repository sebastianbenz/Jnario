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

import static org.jnario.doc.HtmlFile.*

import static extension org.jnario.util.Strings.*
import static extension org.eclipse.xtext.util.Strings.*

class SuiteDocGenerator extends AbstractDocGenerator {
	@Inject extension SuiteClassNameProvider 
	@Inject extension SpecResolver

	override createHtmlFile(XtendClass xtendClass) {
		if(!(xtendClass instanceof Suite)){
			return EMPTY_FILE
		}
		val suite = xtendClass as Suite
		newHtmlFile[
			fileName = suite.className 
			title = suite.describe.convertFromJavaString(true)
			content = suite.generateContent
			rootFolder = suite.root
		]
	}

	def generateContent(Suite suite)'''
		«suite.name.trimFirstLine.markdown2Html»
		<ul>
		«FOR spec : suite.elements»
			«generate(spec, spec.resolveSpecs)»
		«ENDFOR»
		</ul>
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