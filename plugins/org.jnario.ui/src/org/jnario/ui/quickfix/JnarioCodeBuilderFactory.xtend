package org.jnario.ui.quickfix

import org.eclipse.xtend.ide.codebuilder.CodeBuilderFactory
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmType
import org.eclipse.xtend.core.xtend.XtendClass

class JnarioCodeBuilderFactory extends CodeBuilderFactory {
	
	override getSource(JvmDeclaredType element) {
		val xtendClass = element.xtendClass
		if(xtendClass != null){
			return xtendClass
		}
		super.getSource(element)
	}
	
	def private xtendClass(JvmType type){
		if(type == null){
			return null
		}
		type.eResource.allContents.filter(typeof(XtendClass)).findFirst[it.name == type.simpleName]
	}
}