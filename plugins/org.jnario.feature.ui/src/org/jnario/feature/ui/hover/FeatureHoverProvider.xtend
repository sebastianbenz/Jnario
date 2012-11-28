package org.jnario.feature.ui.hover

import org.jnario.ui.doc.JnarioHoverProvider
import org.eclipse.emf.ecore.EObject
import org.jnario.feature.feature.StepReference
import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.*
import static extension org.jnario.util.Strings.*
import com.google.inject.Inject
import org.jnario.doc.WhiteSpaceNormalizer
import org.jnario.feature.feature.Step

class FeatureHoverProvider extends JnarioHoverProvider {
	
	@Inject extension WhiteSpaceNormalizer normalizer
	
	override protected getDocumentation(EObject o) {
		switch o{
			Step: getDocumentation(o)
			default: super.getDocumentation(o)
		}
	}
	
	def getDocumentation(Step step){
		val node = getNode(step.expression)
		'''
		<pre>
		«node.text.normalize»
		</pre>'''.toString
	}
}
