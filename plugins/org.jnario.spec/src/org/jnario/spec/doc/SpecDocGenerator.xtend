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
import org.jnario.doc.HtmlFile
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.Example
import org.jnario.spec.spec.ExampleGroup
import static org.eclipse.xtend.core.xtend.XtendPackage$Literals.*
class SpecDocGenerator extends AbstractDocGenerator {

	@Inject extension ExampleNameProvider 
	
	@Inject extension FilterExtractor

	override createHtmlFile(XtendClass xtendClass) {
		if(!(xtendClass instanceof ExampleGroup)){
			return HtmlFile::EMPTY_FILE
		}
		val exampleGroup = xtendClass as ExampleGroup
		HtmlFile::newHtmlFile[
			name = exampleGroup.toJavaClassName 
			title = exampleGroup.asTitle
			content = exampleGroup.generateContent
			rootFolder = exampleGroup.root
			sourceCode = xtendClass.eContainer.pre("lang-spec")
			fileName = xtendClass.fileName
			executionStatus = exampleGroup.executionStateClass
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
		var filters = <Filter>emptyList
		if(docString != null){
			val filterResult = docString.apply
			filters = filterResult.filters
			docString = filterResult.string
			docString = docString.markdown2Html
		}
		'''
			«IF example.name != null»
			<p«id(example.name)» class="example «example.executionStateClass»"><strong>«example.describe.decode»</strong></p>
			«ELSE»
			«ENDIF»
			«docString»
			«IF !example.pending && example.eIsSet(XTEND_FUNCTION__EXPRESSION)»
			«example.toCodeBlock(filters)»
			«example.errorMessage»
			«ENDIF»
		'''
	}
	
	def toCodeBlock(Example example, List<Filter> filters){
		var prefix = '<pre class="prettyprint lang-spec linenums">'
		prefix = filters.apply(prefix)
		val code = example.expression.serialize(filters)
		if(code.length == 0) return ""
		'''
		«prefix»
		«code»</pre>'''
	}
	

	 
	def dispatch generate(ExampleTable table, int level)'''
		<p«id(table.toFieldName)»><strong>«table.toFieldName.toTitle»</strong></p>
		«table.generateDoc»
		«super.generate(table)»
	'''
		
	def dispatch generate(ExampleGroup exampleGroup, int level)'''
		«IF level > 1»
		<div class="level">
		«ENDIF»
		<h«exampleGroup.header(level)» class="exampleGroup «exampleGroup.executionStateClass»" «id(exampleGroup.describe)»>«exampleGroup.asTitle»</h«exampleGroup.header(level)»>
		«exampleGroup.generateDoc»
		«generateMembers(exampleGroup, level + 1)»
		«IF level > 1»
		</div>
		«ENDIF»
	'''
	
	def private header(ExampleGroup exampleGroup, int level){
		if(level <= 1){
			"3"
		}else if(level == 2){
			"4"
		}else {
			"5"
		}
	}
	
	def dispatch asTitle(ExampleGroup exampleGroup){
		exampleGroup.describe.toTitle
	}
	 
	def dispatch asTitle(Example example){
		example.describe.toTitle
	}
	
}
