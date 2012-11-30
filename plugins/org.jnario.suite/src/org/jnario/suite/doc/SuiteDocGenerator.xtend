/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.doc

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendClass
import org.jnario.Specification
import org.jnario.doc.AbstractDocGenerator
import org.jnario.suite.jvmmodel.SuiteClassNameProvider
import org.jnario.suite.suite.Reference
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.suite.Suite
import org.jnario.suite.jvmmodel.SpecResolver
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.jnario.suite.suite.SuiteFile
import org.jnario.doc.HtmlFileBuilder
import org.jnario.doc.HtmlFile

import static extension org.jnario.util.Strings.*
import static extension org.eclipse.xtext.util.Strings.*
import org.jnario.report.Executable2ResultMapping

class SuiteDocGenerator extends AbstractDocGenerator {
	
	@Inject extension SuiteClassNameProvider 
	@Inject extension SpecResolver
	@Inject extension HtmlFileBuilder
	
	override doGenerate(Resource input, IFileSystemAccess fsa, Executable2ResultMapping spec2ResultMapping) {
		initResultMapping(spec2ResultMapping)
		input.contents.filter(typeof(SuiteFile)).forEach[
			val htmlFile = createHtmlFile()
			xtendClasses.head.generate(fsa, htmlFile)	
		]
	}
   
	def HtmlFile createHtmlFile(SuiteFile file) {
		val suites = file.xtendClasses.filter(typeof(Suite))
		if(suites.empty) return HtmlFile::EMPTY_FILE
		val rootSuite = suites.head
		HtmlFile::newHtmlFile[
			name = rootSuite.toJavaClassName
			title = rootSuite.describe.decode
			content = suites.generateContent
			rootFolder = rootSuite.root
			sourceCode = file.pre("lang-suite")
			fileName = file.fileName
			executionStatus = rootSuite.executionStateClass
		]
	}

	override HtmlFile createHtmlFile(XtendClass file) {
		val suite = file as Suite
		HtmlFile::newHtmlFile[
			name = suite.toJavaClassName 
			title = suite.describe.decode
			content = suite.generateContent
			rootFolder = suite.root
			sourceCode = file.pre("lang-suite")
			fileName = file.fileName
			executionStatus = suite.executionStateClass
		]
	}
	
	def generateContent(Iterable<Suite> suites)'''
		«FOR suite : suites»
			«IF !(suite == suites.head)»
			«suite.title»
			«ENDIF»
			«suite.generateContent»
		«ENDFOR»
	'''
	
	def title(Suite suite)'''
		«val title = suite.name.firstLine»
		<span«title.id» class="suite «suite.executionStateClass»">«title.markdown2Html»</span>
	'''
	
	def desc(Suite suite){
		suite.name.trimFirstLine.markdown2Html
	}

	def generateContent(Suite suite)'''
		«suite.desc»
		«IF !suite.elements.empty»
		<ul>
			«FOR spec : suite.elements»
				«generate(spec)»
			«ENDFOR»
		</ul>
		«ENDIF»
	'''

	def generate(Reference ref)'''
	«FOR spec : ref.resolveSpecs»
		<li><a class="specref «spec.executionStateClass»" href="«ref.linkTo(spec)»">«spec.describe»</a>«spec.executionState»«ref.text»</li>
	«ENDFOR»
	''' 
	
	def linkTo(EObject context, Specification spec){
		val path = if(spec.packageName == null){
			""
		}else{
			spec.packageName.replace(".", "/")
		}
		context.root + path + "/" + spec.toJavaClassName.htmlFileName
	}
	
	def text(Reference ref){
		switch ref{
			SpecReference case !ref.text?.trim.nullOrEmpty : {
				var result = ref.text.markdown2Html
				result = result.substring(3, result.length-4) // remove <p>..</p>
				return ': ' + result
			}
		}
		return ""
	}
	
}