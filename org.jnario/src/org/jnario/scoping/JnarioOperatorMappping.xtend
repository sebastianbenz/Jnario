package org.jnario.scoping

import org.eclipse.xtext.xbase.scoping.featurecalls.OperatorMapping
import static org.eclipse.xtext.naming.QualifiedName.*
import org.eclipse.xtext.naming.QualifiedName

class JnarioOperatorMappping extends OperatorMapping {
	
	private static String PREFIX = "should"
	private static String PREFIX_WITH_SEPARATOR = PREFIX + " "
	private static String METHOD_PREFIX = PREFIX + "_"
	
	override getMethodName(QualifiedName operator) {
		if(operator == null){
			return null
		}
		val name = operator.firstSegment
		if(name.startsWith(PREFIX_WITH_SEPARATOR)){
			val index = name.lastIndexOf(" ")
			if(index != -1){
				val methodName = METHOD_PREFIX + name.substring(index + 1)
				return create(methodName)
			}
		}
		super.getMethodName(operator)
	}
	
	override getOperator(QualifiedName methodName) {
		if(methodName == null){
			return null
		}
		val name = methodName.firstSegment
		if(!name.startsWith(METHOD_PREFIX)){
			return super.getOperator(methodName)
		}
		val operator = name.substring(METHOD_PREFIX.length)
		return create(PREFIX_WITH_SEPARATOR +  operator)
	}
	
}