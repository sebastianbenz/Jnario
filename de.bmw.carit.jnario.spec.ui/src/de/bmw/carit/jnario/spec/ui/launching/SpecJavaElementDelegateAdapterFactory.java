package de.bmw.carit.jnario.spec.ui.launching;

import org.eclipse.core.resources.IResource;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtext.xtend2.ui.launching.JavaElementDelegate;
import org.eclipse.xtext.xtend2.ui.launching.JavaElementDelegateAdapterFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class SpecJavaElementDelegateAdapterFactory extends
		JavaElementDelegateAdapterFactory {

	@Inject
	private Provider<JavaElementDelegate> delegateProvider;
	
	public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes")  Class adapterType) {
		if (SpecJavaElementDelegate.class.equals(adapterType)) {
			if (adaptableObject instanceof IFileEditorInput) {
				JavaElementDelegate result = delegateProvider.get();
				result.initializeWith((IFileEditorInput) adaptableObject);
				return result;
			}
			if (adaptableObject instanceof IResource) {
				JavaElementDelegate result = delegateProvider.get();
				result.initializeWith((IResource) adaptableObject);
				return result;
			}
			if (adaptableObject instanceof IEditorPart) {
				JavaElementDelegate result = delegateProvider.get();
				result.initializeWith((IEditorPart) adaptableObject);
				return result;
			}
		}
		if (adaptableObject instanceof SpecJavaElementDelegate) {
			return ((JavaElementDelegate) adaptableObject).getAdapter(adapterType);
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {
		return new Class[] { SpecJavaElementDelegate.class };
	}
	
}
