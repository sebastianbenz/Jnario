/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.doc

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendMember
import org.eclipse.xtend2.lib.StringConcatenation
import org.jnario.ExampleTable
import org.jnario.doc.AbstractDocGenerator
import org.jnario.doc.Filter
import org.jnario.doc.FilterExtractor
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.Example
import org.jnario.spec.spec.ExampleGroup
import static org.jnario.doc.HtmlFile.*

class DocGenerator extends AbstractDocGenerator {

	@Inject extension ExampleNameProvider 
	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension FilterExtractor

	override createHtmlFile(XtendClass xtendClass) {
		if(!(xtendClass instanceof ExampleGroup)){
			return EMPTY_FILE
		}
		val exampleGroup = xtendClass as ExampleGroup
		newHtmlFile[
			fileName = exampleGroup.toJavaClassName 
			title = exampleGroup.asTitle
			content = exampleGroup.generateContent
			rootFolder = exampleGroup.root
		]
	}

	def private generateContent(ExampleGroup exampleGroup)'''
		«exampleGroup.generateDoc()»
		«exampleGroup.generateMembers(1)»
	'''
	
	def private generateMembers(ExampleGroup exampleGroup, int level){
		val result = new StringConcatenation
		var inList = false	
		val members = exampleGroup.members.filter[(it instanceof Example) 
			|| (it instanceof ExampleGroup) 
			|| (it instanceof ExampleTable)
		]
		for(member : members){
			val isExampleGroup = member instanceof ExampleGroup
			if (inList && !isExampleGroup){
				result.append("<li>")
				result.append(generate(member, level))
				result.append("</li>")
			}else if(!inList && !isExampleGroup){
				result.append("<ul>")
				result.append("<li>")
				result.append(generate(member, level))
				result.append("</li>")
				inList = true
			}else if(inList && isExampleGroup){
				result.append("</ul>")
				result.append(generate(member, level))
				inList = false
			}else if(!inList && isExampleGroup){
				result.append(generate(member, level))
			}
		}
		if(inList){
			result.append("</ul>")
		}
		return result
	}
	
	def private generateDoc(EObject eObject)'''
		«IF eObject.documentation != null»
			«eObject.documentation.markdown2Html»
		«ENDIF»
	'''
	def dispatch generate(XtendMember member, int level)'''
	'''
	
	def dispatch generate(Example example, int level){
		var String docString = example.documentation
		var List<Filter> filters = emptyList
		if(docString != null){
			val filterResult = docString.apply
			filters = filterResult.filters
			docString = filterResult.string
			docString = docString.markdown2Html
		}
		'''
			«IF example.name != null»
			<p>«anchor(example.name)»
			<strong>«example.describe.convertToText»</strong>
			«ELSE»
			<p>
			«ENDIF»
			«docString»
			«IF !example.pending && example.body != null»
			«example.toCodeBlock(filters)»
			«ENDIF»</p>
		'''
	}
	

	
	def toCodeBlock(Example example, List<Filter> filters){
		var prefix = '<pre class="prettyprint lang-spec">'
		prefix = filters.apply(prefix)
		val code = example.implementation.toXtendCode(filters)
		if(code.length == 0) return ''''''
		'''
		«prefix»
		«code»</pre>'''
	}
	

	 
	def dispatch generate(ExampleTable table, int level)'''
		<h4>«anchor(table.toFieldName)»«table.toFieldName.convertToTitle»</h4>
		<p>«table.generateDoc»</p>
		«super.generate(table)»
	'''
		
	def dispatch generate(ExampleGroup exampleGroup, int level)'''
		<«level.heading»>«anchor(exampleGroup.name)»«exampleGroup.asTitle»</«level.heading»>
		<p>«exampleGroup.generateDoc»</p>
		«generateMembers(exampleGroup, level + 1)»
	'''


	
	def heading(int level){
		//"h" + (if (level <= 5) level else 5)
		"h3" 
	}
	
	def dispatch asTitle(ExampleGroup exampleGroup){
		exampleGroup.describe.convertToTitle
	}
	 
	def dispatch asTitle(Example example){
		example.describe.convertToTitle
	}
	
}

