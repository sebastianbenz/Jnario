package org.jnario.ui.quickfix

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Provider
import java.util.Collections
import java.util.Set
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.Image
import org.eclipse.xtend.ide.quickfix.XtendTypeReferenceSerializer
import org.eclipse.xtend.lib.Property
import org.eclipse.xtext.common.types.JvmPrimitiveType
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.util.Primitives
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions
import org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions$CompletionDataAcceptor
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.compiler.IAppendable
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.typing.ITypeProvider

import static org.eclipse.xtext.common.types.util.Primitives$Primitive.*
import static org.eclipse.xtext.common.types.xtext.ui.JdtVariableCompletions$VariableType.*

class MethodBuilderProvider{
	
	@Inject Provider<XtendMethodBuilder> xtendMethodBuilderProvider
	@Inject Provider<JavaMethodBuilder> javaMethodBuilderProvider
	
	def newXtendMethodBuilder(String methodName){
		val builder = xtendMethodBuilderProvider.get
		builder.methodName = methodName
		builder
	}

	def newJavaMethodBuilder(String methodName){
		val builder = javaMethodBuilderProvider.get
		builder.methodName = methodName
		builder.importManager = new ImportManager(false, ".".charAt(0))
		builder
	}
}

class XtendMethodBuilder {
	
	@Inject	extension ITypeProvider 
	@Inject extension JdtVariableCompletions 
	@Inject extension XtendTypeReferenceSerializer 
	@Inject extension Primitives 
	@Inject extension TypeSubstitutionHelper 
	 
	@Property String methodName 
	@Property XAbstractFeatureCall featureCall
	@Property ImportManager importManager =  new ImportManager(false, "$".charAt(0))
	
	def build(IAppendable appendable){
		appendable => [
			addPrefix
			addName
			addArguments
			addBody
		]
	}
	
	def protected addName(IAppendable appendable){
		appendable.append(methodName)
	}
	
	def protected addPrefix(IAppendable appendable){
		appendable.append("def ")
	}
	
	def protected addBody(IAppendable appendable){
		appendable.append('''
			{
				«returnStatement»
			}
		''')
	}
	
	def protected returnStatement(){
		if(featureCall == null || featureCall.isVoid){
			return ""
		}else{
			return defaultReturnStatement
		}
	}
	
	def protected defaultReturnStatement(){
		val expectedType = returnType
		val result = new StringBuilder("return ")
		if(isPrimitive(expectedType)){
			val primitiveKind = primitiveKind(expectedType.type as JvmPrimitiveType)
			switch (primitiveKind) {
				case Boolean:
					result.append("false")
				default:
					result.append("0")
			}
		}else{
			return result.append("null")
		}
		return result
	}
	
	def private isVoid(XAbstractFeatureCall featureCall){
		return returnType.simpleName == "void"
	}
	
	def protected returnType(){
		featureCall.expectedType
	}
	
	def protected addArguments(IAppendable appendable) {
		if(featureCall == null){
			return appendable.append("()")
		}
		var iterator = if(featureCall instanceof XMemberFeatureCall){
			(featureCall as XMemberFeatureCall).memberCallArguments.iterator
		}else{
			featureCall.explicitArguments.iterator
		}
		val notallowed = <String>newHashSet()
		appendable.append("(") 
		
		while(iterator.hasNext()){
			val expression = iterator.next()
			val typeRef = expression.type
			if(typeRef != null){
				appendable.append(typeRef)
				appendable.append(" ")
				val acceptor = new VariableNameAcceptor(notallowed)
				getVariableProposals(typeRef.getIdentifier(), featureCall, PARAMETER, notallowed, acceptor)
				appendable.append(acceptor.getVariableName())
			}
			if(iterator.hasNext())
				appendable.append(", ")
		}
		appendable.append(")")
	}
	
	def protected append(IAppendable appendable, JvmTypeReference typeRef){
		if(typeRef == null){
			appendable.append("void")			
		}else{
			val typeString = new StringBuilder
			importManager.appendType(typeRef.type, typeString)
			typeRef.type.eAllContents.filter(typeof(JvmTypeReference)).filter[type != null].forEach[
				importManager.appendType(it.type, typeString)
			]		
			val resolvedExpectedType= typeParameterByConstraintSubstitutor.substitute(typeRef);
			resolvedExpectedType.serialize(featureCall, appendable)
		}
		appendable
	}
	
	def imports(){
		importManager.imports
	} 
	
}

class JavaMethodBuilder extends XtendMethodBuilder{

	override protected defaultReturnStatement() {
		super.defaultReturnStatement().append(";")
	}
	
	override protected addPrefix(IAppendable appendable) {
		appendable.append("public ").append(returnType).append(" ")
	}
	
}


class VariableNameAcceptor implements JdtVariableCompletions$CompletionDataAcceptor {

	val Set<String> notallowed
	Set<String> variableNames = newHashSet()

	new(Set<String> notallowed) {
		this.notallowed = notallowed;
	}

	override accept(String replaceText, StyledString label, Image img) {
		variableNames.add(replaceText);
		notallowed.add(replaceText);
	}

	def getVariableName(){
		val candidates = Lists::newArrayList(variableNames);
		Collections::sort(candidates, [left, right|
			  if (left.length() < right.length()) {
		        return -1;
		      } else if (left.length() > right.length()) {
		        return 1;
		      } else {
		        return 0;
		      }
			])
		if(candidates.size > 0)
			return candidates.get(0)
		return ""
	}
}