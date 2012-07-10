package org.jnario.spec.scoping

import com.google.common.collect.ImmutableMap$Builder
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.core.resource.XtendResourceDescriptionStrategy
import org.jnario.spec.spec.ExampleGroup

import static java.lang.String.*
import static org.jnario.spec.scoping.SpecResourceDescriptionStrategy.*
class SpecResourceDescriptionStrategy extends XtendResourceDescriptionStrategy {
	
	public static val ROOT_SPEC = "root"
	public static val TRUE = "1"
	public static val FALSE = "0"
	
	override createUserData(EObject eObject, ImmutableMap$Builder<String, String> userData) {
		super.createUserData(eObject, userData);
		if (eObject instanceof ExampleGroup){
			val exampleGroup = eObject as ExampleGroup			
			userData.put(ROOT_SPEC, valueOf(exampleGroup.isRoot))
		}
	}
	
	def isRoot(ExampleGroup exampleGroup){
		if(!(exampleGroup.eContainer instanceof ExampleGroup)){
			TRUE
		}else{
			FALSE
		}
	}
	
}