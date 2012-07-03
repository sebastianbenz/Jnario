/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.doc

import com.google.inject.Inject
import org.eclipse.xtend.core.xtend.XtendClass
import org.jnario.doc.AbstractDocGenerator
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Step
import org.jnario.feature.naming.FeatureClassNameProvider
import org.jnario.feature.naming.StepNameProvider
import org.jnario.feature.feature.Scenario
import org.jnario.doc.HtmlFile

import static extension org.jnario.util.Strings.*

class FeatureDocGenerator extends AbstractDocGenerator {
	
	@Inject extension FeatureClassNameProvider 
	@Inject extension StepNameProvider 

	override createHtmlFile(XtendClass xtendClass) {
		if(!(xtendClass instanceof Feature)){
			return HtmlFile::EMPTY_FILE
		}
		val feature = xtendClass as Feature
		return HtmlFile::newHtmlFile[
			name = feature.getClassName 
			title = feature.name
			content = feature.generateContent
			rootFolder = feature.root
		]
	}

	def generateContent(Feature feature)'''
		<p>«feature.description?.markdown2Html»</p>
		«IF feature.background != null»
		«generate(feature.background)»
		«ENDIF»
		«FOR scenario : feature.scenarios»
		«generate(scenario)»
		«ENDFOR»
		«FOR member : feature.members»
		«generate(member)»
		«ENDFOR»
	'''

	def dispatch generate(Scenario scenario)'''
		<h3>«scenario.name»</h3>
		«generate(scenario.steps.filter(typeof(Step)))»
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
		«step.format»
	'''

	def private format(Step step){
		var result = step.nameOf
		var codeBlock = ""
		val index = result.indexOf('\n')
		if(index != -1){
			codeBlock = result.substring(index)
			result = result.substring(0, index)
		}
		result = result.replaceFirst("(" + result.firstWord + ")", "<strong>$1</strong>")
		result = (" " + result).replaceAll("\"(.*?)\"", "<code>$1</code>")
		result = result.markdown2Html
		result + addCodeBlock(codeBlock)
	}

	def private addCodeBlock(String code){
		if(code.length == 0){
			return ""
		}
		var codeBlock = code.trim
		codeBlock = codeBlock.substring(3, codeBlock.length-3)
		return '''<pre>«codeBlock.codeToHtml»</pre>'''
	} 
}