package org.jnario.feature.doc

import com.google.inject.Inject
import org.eclipse.xtend.core.xtend.RichString
import org.eclipse.xtend.core.xtend.XtendClass
import org.jnario.doc.AbstractDocGenerator
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.naming.JavaNameProvider
import org.jnario.feature.naming.StepNameProvider

import static org.jnario.doc.HtmlFile.*

class FeatureDocGenerator extends AbstractDocGenerator {
	@Inject extension JavaNameProvider 
	@Inject extension StepNameProvider 

	override createHtmlFile(XtendClass xtendClass) {
		if(!(xtendClass instanceof Feature)){
			return EMPTY_FILE
		}
		val feature = xtendClass as Feature
		newHtmlFile[
			fileName = feature.className 
			title = feature.name.removeKeywords
			content = feature.generateContent
			rootFolder = feature.root
		]
	}
	
	def generateContent(Feature feature)'''
		<p>«feature.description»</p>
		«IF feature.background != null»
		<h3>Background</h3>
		«FOR step : feature.background.steps.filter(typeof(Step))»
		«generate(step)»
		«ENDFOR»
		«ENDIF»
		«FOR scenario : feature.members.filter(typeof(Scenario))»
		«generate(scenario)»
		«ENDFOR»
	'''

	def generate(Scenario scenario)'''
		<h3>«scenario.name.removeKeywords»</h3>
		«FOR step : scenario.steps.filter(typeof(Step))»
		«generate(step)»
		«ENDFOR»
	'''
	
	def generate(Step step)'''
		<p>«step.nameOf.replaceAll("\"(.*)\"", "<code>$1</code>")»</p>
		«step.addCodeBlock»
	'''

	def CharSequence addCodeBlock(Step step){
		val expressions = step.stepExpression?.blockExpression?.expressions
		if(expressions != null && expressions.empty) return ""
		val richStrings = expressions.get(0).eAllContents.filter(typeof(RichString))
		'''
		«FOR string : richStrings.toList»
		<pre>«string.serialize»</pre>
		«ENDFOR»
		'''
		richStrings.forEach[
			
		]
	}
}