package org.jnario.suite.doc

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendClass
import org.jnario.Specification
import org.jnario.doc.AbstractDocGenerator
import org.jnario.suite.jvmmodel.SpecificationResolver
import org.jnario.suite.jvmmodel.SuiteClassNameProvider
import org.jnario.suite.suite.Reference
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite

import static org.jnario.doc.HtmlFile.*

import static extension org.jnario.util.Strings.*

class SuiteDocGenerator extends AbstractDocGenerator {
	@Inject extension SuiteClassNameProvider 
	@Inject extension SpecificationResolver

	override createHtmlFile(XtendClass xtendClass) {
		if(!(xtendClass instanceof Suite)){
			return EMPTY_FILE
		}
		val suite = xtendClass as Suite
		newHtmlFile[
			fileName = suite.className 
			title = suite.describe
			content = suite.generateContent
			rootFolder = suite.root
		]
	}

	def generateContent(Suite suite)'''
		<p>«suite.name.trimFirstLine.markdown2Html»</p>
		<ul>
		«FOR spec : suite.specs»
			«generate(spec, spec.resolveSpecs)»
		«ENDFOR»
		</ul>
	'''

	def generate(Reference ref, List<Specification> specs)'''
	«FOR spec : specs.filter[name != null]»
		<li><a href="«ref.linkTo(spec)»">«spec.name»</a> «ref.text»</li>
	«ENDFOR»
	'''
	
	def linkTo(EObject context, Specification spec){
		context.root + spec.packageName.replace(".", "/") + "/" + spec.className
	}
	
	def text(Reference ref){
		switch ref{
			SpecReference: return ref.text
		}
		return ""
	}
	
}