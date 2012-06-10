package org.jnario.suite.ui.hover

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.jnario.Specification
import org.jnario.suite.jvmmodel.SpecificationResolver
import org.jnario.suite.suite.PatternReference
import org.jnario.ui.doc.JnarioHoverProvider
import org.eclipse.jface.text.IRegion

class SuiteHoverProvider extends JnarioHoverProvider {
	
	@Inject extension SpecificationResolver	

	override getHoverInfoAsHtml(EObject call, EObject objectToView, IRegion hoverRegion) {
		var String comment
		if (objectToView instanceof PatternReference) {
			val spec = objectToView as PatternReference
			comment = spec.resolveSpecs.document.toString
		}else{
			comment = super.getHoverInfoAsHtml(call, objectToView, hoverRegion);
		}
		return comment;
	}
	
	def document(List<Specification> specs)'''
		<ul>
			«FOR spec : specs.filter[name != null]»
			<li>«spec.name»</li>
			«ENDFOR»
		</ul>
	'''
}