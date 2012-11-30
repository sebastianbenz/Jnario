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
import org.jnario.doc.HtmlFile
import org.jnario.feature.feature.Feature
import org.jnario.feature.feature.Scenario
import org.jnario.feature.feature.Step
import org.jnario.feature.naming.FeatureClassNameProvider
import org.jnario.feature.naming.StepNameProvider

import static org.jnario.feature.jvmmodel.StepArgumentsProvider.*

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
			name = feature.toJavaClassName 
			title = feature.name
			content = feature.generateContent
			rootFolder = feature.root
			sourceCode = feature.eContainer.pre("lang-feature")
			fileName = feature.fileName
			executionStatus = feature.executionStateClass
		]
	}

	def generateContent(Feature feature)'''
		«feature.description?.markdown2Html»
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
		<div><h3 class="scenario «scenario.executionStateClass»" «id(scenario.name)»>«scenario.name»</h3>
		«generate(scenario.steps)»</div>
	'''

	def dispatch generate(Iterable<Step> steps)'''
		<ul>
		«FOR step : steps»
		<li>«generate(step)»</li>
		«ENDFOR»
		</ul>
	'''
	
	def dispatch generate(Step step)'''
		<span class="step «step.executionStateClass»">«step.format»</span>
		«step.errorMessage»
	'''

	def private format(Step step){
		var result = step.describe.convertFromJavaString(true)
		result = result.highlighFirstWord
		result = result.highlightArguments
		result = result.markdown2Html
		result = result + addCodeBlock(step)
		return result
	}

	def private highlightArguments(String s){
		ARG_PATTERN.matcher(" " + s).replaceAll("<code>$0</code>")
	}

	def private highlighFirstWord(String s){
//		s.replaceFirst("(" + s.firstWord + ")", "<strong>$1</strong>")
		s
	}

	def private addCodeBlock(Step step){
		val text = step.nameOf
		val multiLineStart = text.indexOf("\n")
		if(multiLineStart == -1){
			return "" 
		}
		var codeBlock = text.substring(multiLineStart).trim
		codeBlock = codeBlock.substring(MULTILINE_STRING.length, codeBlock.length - MULTILINE_STRING.length)
		codeBlock = codeBlock.codeToHtml
		return '''<pre>«codeBlock»</pre>'''
	} 
}