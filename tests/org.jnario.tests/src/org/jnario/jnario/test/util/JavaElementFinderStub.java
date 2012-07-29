package org.jnario.jnario.test.util;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IOpenable;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;

public class JavaElementFinderStub implements IJavaElementFinder{

	private IJavaElement result = new IJavaElement() {
		
		public Object getAdapter(Class adapter) {
			return null;
		}
		
		public boolean isStructureKnown() throws JavaModelException {
			return false;
		}
		
		public boolean isReadOnly() {
			return isReadable;
		}
		
		public IResource getUnderlyingResource() throws JavaModelException {
			return null;
		}
		
		public ISchedulingRule getSchedulingRule() {
			return null;
		}
		
		public IResource getResource() {
			return null;
		}
		
		public IJavaElement getPrimaryElement() {
			return null;
		}
		
		public IPath getPath() {
			return null;
		}
		
		public IJavaElement getParent() {
			return null;
		}
		
		public IOpenable getOpenable() {
			return null;
		}
		
		public IJavaProject getJavaProject() {
			return null;
		}
		
		public IJavaModel getJavaModel() {
			return null;
		}
		
		public String getHandleIdentifier() {
			return null;
		}
		
		public int getElementType() {
			return 0;
		}
		
		public String getElementName() {
			return null;
		}
		
		public IResource getCorrespondingResource() throws JavaModelException {
			return null;
		}
		
		public String getAttachedJavadoc(IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}
		
		public IJavaElement getAncestor(int ancestorType) {
			return null;
		}
		
		public boolean exists() {
			return false;
		}
	};
	
	private boolean isReadable = false;

	public IJavaElement findElementFor(JvmIdentifiableElement element) {
		return result;
	}

	public IJavaElement findExactElementFor(JvmIdentifiableElement element) {
		return result;
	}
	
	public void setReadOnly(){
		this.isReadable = true;
	}

}
