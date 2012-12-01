/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.doc

import com.google.inject.Inject
import java.util.List
import org.apache.commons.lang.StringEscapeUtils
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.jnario.ExampleTable
import org.jnario.Executable
import org.jnario.report.Executable2ResultMapping
import org.jnario.report.ExecutableStateSwitch
import org.jnario.report.Failed
import org.jnario.report.NotRun
import org.jnario.report.Passed
import org.jnario.report.Pending
import org.pegdown.PegDownProcessor

import static org.jnario.doc.AbstractDocGenerator.*

import static extension org.eclipse.xtext.util.Strings.*
import static extension org.jnario.util.Strings.*

abstract class AbstractDocGenerator implements IGenerator {

	static val LOG = Logger::getLogger(typeof(AbstractDocGenerator))

	static val SEP = "_"

	@Inject extension WhiteSpaceNormalizer
	@Inject extension PegDownProcessor
	@Inject extension HtmlFileBuilder
	@Inject extension DocumentationProvider documentationProvider
	@Inject extension Executable2ResultMapping spec2ResultMapping
 
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		doGenerate(input, fsa, spec2ResultMapping)
	}

	def doGenerate(Resource input, IFileSystemAccess fsa, Executable2ResultMapping spec2ResultMapping) {
		initResultMapping(spec2ResultMapping)
		input.contents.filter(typeof(XtendFile)).forEach[
			xtendClasses.forEach[
				generate(fsa, createHtmlFile())
			]
		]
	}
	
	def protected initResultMapping(Executable2ResultMapping spec2ResultMapping){
		this.spec2ResultMapping = spec2ResultMapping
	}

	def createHtmlFile(XtendClass xtendClass){
		return HtmlFile::EMPTY_FILE
	}

	def protected toTitle(String string){
		string.decode.toFirstUpper
	}
	
	def protected decode(String string){
		try{
			if(string == null){
				return ""
			}else{
				return string.convertFromJavaString(true)
			}
		}catch(java.lang.IllegalArgumentException e){
			LOG.error("Exception when converting string", e)
			return string
		}
	}
	
	def protected markdown2Html(String string){
		if(string == null){
			return ""
		}
		val normalized = string.normalize + "\n" // line break is necessary to recognize single markdown headlines
		normalized.markdownToHtml
				.replaceAll("<pre><code>", '<pre class="prettyprint">')
				.replaceAll("</pre></code>", '</pre>')
	}
	
	def protected dispatch String serialize(XExpression expr, List<Filter> filters){
		return expr.serialize.codeToHtml.trim
	}
	
	def protected dispatch String serialize(XBlockExpression expr, List<Filter> filters){
		var code = expr.serialize.trim
		code = filters.apply(code)
		if(code.length == 0){
			return ""
		}
		code = code.substring(1, code.length-1) 
		return code.codeToHtml
	}
	
	def protected String codeToHtml(String code){
		code.normalize.trimWhitespaceAtEnd.toString.toHtml.replace("\t", "  ")
	}
	
	def protected toHtml(String input){
		StringEscapeUtils::escapeHtml(input)
	}
	
	def protected serialize(EObject obj){
		val node = NodeModelUtils::getNode(obj)
		if(node == null) return ""
		return node.text
	}
	
	def protected id(String id){
		return ' id="' + id?.replaceAll("\\W+", SEP)?.trim(SEP.charAt(0)) + '"'
	}
	
	def protected apply(List<Filter> filters, String input){
		var result = input
		for(filter : filters){
			result = filter.apply(result)
		}
		return result
	}
	
	def protected root(EObject xtendClass){
		val specFile = EcoreUtil2::getContainerOfType(xtendClass, typeof(XtendFile))
		val packageName= specFile.^package
		if(packageName == null){
			return ""
		}
		val fragments = packageName.split("\\.")
		val path = fragments.map(s | "../")
		return path.join("")
	}
	
	def protected generate(ExampleTable table)'''
		<table class="table table-striped table-bordered table-condensed">
			<thead>
				<tr>
				«FOR headingCell : table.columns»
					<th>«headingCell.name»</th>
				«ENDFOR»
				</tr>
			</thead>
			<tbody>
			«FOR row : table.rows»
			<tr>
				«FOR cell : row.cells»
				<td>«serialize(cell, emptyList)»</td>
				«ENDFOR»
			</tr>
		  	«ENDFOR»
			</tbody>
		</table>
	'''
	
	def protected htmlFileName(String name){
		name.toHtmlFileName
	}
	
	def protected documentation(EObject obj){
		documentationProvider.getDocumentation(obj)
	}
	
	def protected fileName(EObject eObject){
		eObject.eResource.URI.lastSegment
	}
	
	def protected pre(EObject eObject, String lang)'''
		<pre class="prettyprint «lang» linenums">
		«eObject.serialize.codeToHtml»
		</pre>
	'''
	
	def protected executionState(Executable executable){
		val result = executable.result
		new IconProvider().doSwitch(result)
	}
	
	def protected executionStateClass(Executable executable){
		new CssClassProvider().doSwitch(executable.result)
	}
	
	def protected errorMessage(Executable executable){
		new ErrorMessageProvider().doSwitch(executable.result)
	}
	
}

class IconProvider extends ExecutableStateSwitch<String> {
	override protected handleFailed(Failed result) ''' <strong class="icon failed">✘</strong>'''
	override protected handleNotRun(NotRun execution) ''''''
	override protected handlePassed(Passed execution) ''' <strong class="icon passed">✓</strong>'''
	override protected handlePending(Pending execution) ''' <strong class="icon pending">~</strong>'''
}

class CssClassProvider extends ExecutableStateSwitch<String> {
	override protected handleFailed(Failed result) '''failed'''
	override protected handleNotRun(NotRun execution) '''notrun'''
	override protected handlePassed(Passed execution) '''passed'''
	override protected handlePending(Pending execution) '''pending'''
}
 
class ErrorMessageProvider extends ExecutableStateSwitch<String> {
	override protected handleFailed(Failed result) '''
			«FOR failure : result.failures»
			 <pre class="errormessage">
			 «failure.message»</pre>
			«ENDFOR»
	'''
	override protected handleNotRun(NotRun execution) ''''''
	override protected handlePassed(Passed execution) ''''''
	override protected handlePending(Pending execution) ''''''
}