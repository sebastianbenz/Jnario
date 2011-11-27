package de.bmw.carit.jnario.spec.ui.outline;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.SortOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;

import de.bmw.carit.jnario.spec.spec.SpecPackage;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class SpecOutlineNodeComparator extends SortOutlineContribution.DefaultComparator {
	@Override
	public int getCategory(IOutlineNode node) {
		if(node instanceof EStructuralFeatureNode) {
			EStructuralFeature feature = ((EStructuralFeatureNode) node).getEStructuralFeature();
			if(feature == SpecPackage.Literals.SPEC_FILE__PACKAGE_NAME)
				return 0;
			else 
				return 10;
		}
		if (node instanceof EObjectNode) {
			EClass eClass = ((EObjectNode) node).getEClass();
			if(eClass == SpecPackage.Literals.SPEC_FILE)
				return 20;
			else if(eClass == TypesPackage.Literals.JVM_OPERATION)
				return 30;
			else if(eClass == SpecPackage.Literals.FUNCTION)
				return 40;
		}
		return Integer.MAX_VALUE;
	}

}
