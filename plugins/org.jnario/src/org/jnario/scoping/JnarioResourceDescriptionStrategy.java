package org.jnario.scoping;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.resource.XtendResourceDescriptionStrategy;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.util.IAcceptor;
import org.jnario.Executable;
import org.jnario.Specification;

public class JnarioResourceDescriptionStrategy extends	XtendResourceDescriptionStrategy {
	
	private static final Logger LOG = Logger.getLogger(JnarioResourceDescriptionStrategy.class);

	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		boolean isJvmType = (eObject instanceof JvmType) || isJnarioElement(eObject);
		if (!isJvmType){
			return false;
		}
		if (getQualifiedNameProvider() == null)
			return false;
		try {
			QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
			if (qualifiedName != null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, eObject, createLazyUserData(eObject)));
			}
		} catch (Exception exc) {
			LOG.error(exc.getMessage());
		}
		return true;
	}
	
	protected boolean isJnarioElement(EObject eObject) {
		return (eObject instanceof Executable) || 
		(eObject instanceof XtendFile) || 
		(eObject instanceof Specification);
	}

//	@Override
//	public boolean createReferenceDescriptions(EObject from, URI exportedContainerURI,
//			IAcceptor<IReferenceDescription> acceptor) {
//		if(isJnarioElement(from)){
//			System.out.println(from.eResource().getURI());
//			return true;
//		}
//		return false;
//	}

}
