/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
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
import static extension org.jnario.util.Strings.*
import static org.jnario.doc.HtmlFile.*
import org.jnario.feature.feature.Background

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
			title = feature.name
			content = feature.generateContent
			rootFolder = feature.root
		]
	}
	
	def generateContent(Feature feature)'''
		<p>«feature.description.markdown2Html»</p>
		«FOR member : feature.members»
		«generate(member)»
		«ENDFOR»
	'''

	def dispatch generate(Background bg)'''
		<h3>Background</h3>
		«FOR step : bg.steps.filter(typeof(Step))»
		«generate(step)»
		«ENDFOR»
	'''

	def dispatch generate(Scenario scenario)'''
		<h3>«scenario.name»</h3>
		«generate(scenario.steps.filter(typeof(Step)))»
		«IF !scenario.examples.empty»
		<h4>Examples:</h4>
		«FOR example : scenario.examples»
		<p>«generate(example)»</p>
		«ENDFOR»
		«ENDIF»
	'''
	
	def dispatch generate(Iterable<Step> steps)'''
		<ul>
		«FOR step : steps»
		<li>«generate(step)»
		«generate(step.and.filter(typeof(Step)))»</li>
		«ENDFOR»
		</ul>
	'''
	
	def dispatch generate(Step step)'''
		<p>«step.format»</p>
		«step.addCodeBlock»
	'''

	def format(Step step){
		var result = step.nameOf
		result = result.replaceFirst("(" + result.firstWord + ")", "**$1**")
		result = result.replaceAll("\"(.*?)\"", "<code>$1</code>")
		result.markdown2Html
	}

	def CharSequence addCodeBlock(Step step){
		val expressions = step.stepExpression?.blockExpression?.expressions
		if(expressions == null || expressions.empty) return ""
		val firstExpr = expressions.get(0)
		if(!(firstExpr instanceof RichString)){
			return ""
		} 
		val richString = firstExpr as RichString
		'''<pre>«richString.serialize.replace("'''", "").codeToHtml»</pre>
		'''
	} 
}