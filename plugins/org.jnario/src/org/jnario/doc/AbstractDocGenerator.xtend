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
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.pegdown.PegDownProcessor
import org.eclipse.xtext.EcoreUtil2
import org.jnario.ExampleTable

import static extension org.eclipse.xtext.util.Strings.*
import org.apache.commons.lang.StringEscapeUtils
import static extension org.jnario.util.Strings.*
import org.apache.log4j.Logger

abstract class AbstractDocGenerator implements IGenerator {

	static val LOG = Logger::getLogger(typeof(AbstractDocGenerator))

	static val SEP = "_"

	@Inject extension WhiteSpaceNormalizer
	@Inject extension PegDownProcessor
	@Inject extension HtmlFileBuilder
	@Inject extension DocumentationProvider documentationProvider

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		input.contents.filter(typeof(XtendFile)).forEach[
			xtendClasses.forEach[
				generate(fsa, createHtmlFile())
			]
		]
	}

	def createHtmlFile(XtendClass xtendClass){
		return HtmlFile::EMPTY_FILE
	}

	def toTitle(String string){
		string.decode.toFirstUpper
	}
	
	def decode(String string){
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
	
	def markdown2Html(String string){
		if(string == null){
			return ""
		}
		val normalized = string.normalize + "\n" // line break is necessary to recognize single markdown headlines
		normalized.markdownToHtml
				.replaceAll("<pre><code>", '<pre class="prettyprint">')
				.replaceAll("</pre></code>", '</pre>')
	}
	
	def dispatch String serialize(XExpression expr, List<Filter> filters){
		return expr.serialize.codeToHtml.trim
	}
	
	def dispatch String serialize(XBlockExpression expr, List<Filter> filters){
		var code = expr.serialize.trim
		code = filters.apply(code)
		if(code.length == 0){
			return ""
		}
		code = code.substring(1, code.length-1) 
		return code.codeToHtml
	}
	
	def String codeToHtml(String code){
		code.normalize.toHtml.replace("\t", "  ")
	}
	
	def toHtml(String input){
		StringEscapeUtils::escapeHtml(input)
	}
	
	def serialize(EObject obj){
		val node = NodeModelUtils::getNode(obj)
		if(node == null) return ""
		return node.text
	}
	
	def id(String id){
		return ' id="' + id?.replaceAll("\\W+", SEP)?.trim(SEP.charAt(0)) + '"'
	}
	
	def apply(List<Filter> filters, String input){
		var result = input
		for(filter : filters){
			result = filter.apply(result)
		}
		return result
	}
	
	def root(EObject xtendClass){
		val specFile = EcoreUtil2::getContainerOfType(xtendClass, typeof(XtendFile))
		val packageName= specFile.^package
		if(packageName == null){
			return ""
		}
		val fragments = packageName.split("\\.")
		val path = fragments.map(s | "../")
		return path.join("")
	}
	
	def generate(ExampleTable table)'''
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
	
	def htmlFileName(String name){
		name.toHtmlFileName
	}
	
	def documentation(EObject obj){
		documentationProvider.getDocumentation(obj)
	}

}