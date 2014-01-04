package org.jnario.spec.jvmmodel

import org.eclipse.xtext.xbase.linking.XbaseLazyLinker
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer
import com.google.common.collect.Multimap
import org.eclipse.emf.ecore.EStructuralFeature$Setting
import org.eclipse.xtext.diagnostics.IDiagnosticProducer
import org.eclipse.xtext.nodemodel.INode
import org.jnario.spec.spec.ExampleGroup
import com.google.inject.Inject
import org.eclipse.xtend.core.linking.Linker

class SpecLazyLinker extends Linker {
	
	@Inject extension ImplicitSubject
	
	override protected installProxies(EObject obj, IDiagnosticProducer producer, Multimap<Setting,INode> settingsToLink) {
//		if(obj instanceof ExampleGroup){
//			(obj as ExampleGroup).addImplicitSubject
//		}
		super.installProxies(obj, producer, settingsToLink)
	}
	 
}