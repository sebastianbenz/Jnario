package de.bmw.carit.jnario.spec.ui.outline;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.xtend2.ui.outline.Xtend2OutlineTreeProvider;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

import de.bmw.carit.jnario.spec.spec.ExampleGroup;

public class SpecOutlineTreeProvider extends Xtend2OutlineTreeProvider {

	@Override
	protected void createFeatureNodes(IOutlineNode parentNode, XtendClass xtendClass) {
		for (XtendMember member : xtendClass.getMembers())
			createEObjectNode(parentNode, member);
	}
	
	protected boolean _isLeaf(ExampleGroup element) {
		return element.getMembers().isEmpty();
	}
	
}
