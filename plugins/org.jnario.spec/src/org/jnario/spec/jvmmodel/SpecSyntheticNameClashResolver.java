package org.jnario.spec.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.jvmmodel.SyntheticNameClashResolver;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.jnario.spec.spec.Example;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SpecSyntheticNameClashResolver extends
		SyntheticNameClashResolver {
	
	@Inject
	private IXtendJvmAssociations associations;
	
	@Override
	protected boolean isRenameable(JvmIdentifiableElement element) {
		if(super.isRenameable(element)){
			return true;
		}
		EObject source = associations.getPrimarySourceElement(element);
		return source instanceof Example;
	}

}
