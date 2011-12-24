package de.bmw.carit.jnario.spec.ui.editor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtend2.ui.editor.Xtend2FoldingRegionProvider;

import de.bmw.carit.jnario.spec.spec.SpecPackage;

@SuppressWarnings("restriction")
public class SpecFoldingRegionProvider extends Xtend2FoldingRegionProvider {

	@Override
	protected boolean isHandled(EObject object) {
		EClass clazz = object.eClass();
		return clazz == SpecPackage.Literals.EXAMPLE_GROUP || clazz == SpecPackage.Literals.EXAMPLE || super.isHandled(object);
	}
	
	@Override
	protected boolean shouldProcessContent(EObject object) {
		EClass clazz = object.eClass();
		return clazz == SpecPackage.Literals.EXAMPLE_GROUP || clazz == SpecPackage.Literals.EXAMPLE || super.isHandled(object);
	}
}
