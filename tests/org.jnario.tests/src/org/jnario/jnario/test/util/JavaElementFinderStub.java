package org.jnario.jnario.test.util;

import java.io.InputStream;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.jdt.core.CompletionRequestor;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.ICompletionRequestor;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IInitializer;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IOpenable;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.IWorkingCopy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.WorkingCopyOwner;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;

public class JavaElementFinderStub implements IJavaElementFinder{

	private IType result = new IType() {
		
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

		public String[] getCategories() throws JavaModelException {
			return null;
		}

		public IClassFile getClassFile() {
			return null;
		}

		public ICompilationUnit getCompilationUnit() {
			return null;
		}

		public IType getDeclaringType() {
			return null;
		}

		public int getFlags() throws JavaModelException {
			return 0;
		}

		public ISourceRange getJavadocRange() throws JavaModelException {
			return null;
		}

		public int getOccurrenceCount() {
			return 0;
		}

		public ITypeRoot getTypeRoot() {
			return null;
		}

		public IType getType(String name, int occurrenceCount) {
			return null;
		}

		public boolean isBinary() {
			return false;
		}

		public String getSource() throws JavaModelException {
			return null;
		}

		public ISourceRange getSourceRange() throws JavaModelException {
			return null;
		}

		public ISourceRange getNameRange() throws JavaModelException {
			return null;
		}

		public void copy(IJavaElement container, IJavaElement sibling,
				String rename, boolean replace, IProgressMonitor monitor)
				throws JavaModelException {
			
		}

		public void delete(boolean force, IProgressMonitor monitor)
				throws JavaModelException {
			
		}

		public void move(IJavaElement container, IJavaElement sibling,
				String rename, boolean replace, IProgressMonitor monitor)
				throws JavaModelException {
			
		}

		public void rename(String name, boolean replace,
				IProgressMonitor monitor) throws JavaModelException {
			
		}

		public IJavaElement[] getChildren() throws JavaModelException {
			return null;
		}

		public boolean hasChildren() throws JavaModelException {
			return false;
		}

		public IAnnotation getAnnotation(String name) {
			return null;
		}

		public IAnnotation[] getAnnotations() throws JavaModelException {
			return null;
		}

		public void codeComplete(char[] snippet, int insertion, int position,
				char[][] localVariableTypeNames, char[][] localVariableNames,
				int[] localVariableModifiers, boolean isStatic,
				ICompletionRequestor requestor) throws JavaModelException {
			
		}

		public void codeComplete(char[] snippet, int insertion, int position,
				char[][] localVariableTypeNames, char[][] localVariableNames,
				int[] localVariableModifiers, boolean isStatic,
				ICompletionRequestor requestor, WorkingCopyOwner owner)
				throws JavaModelException {
			
		}

		public void codeComplete(char[] snippet, int insertion, int position,
				char[][] localVariableTypeNames, char[][] localVariableNames,
				int[] localVariableModifiers, boolean isStatic,
				CompletionRequestor requestor) throws JavaModelException {
			
		}

		public void codeComplete(char[] snippet, int insertion, int position,
				char[][] localVariableTypeNames, char[][] localVariableNames,
				int[] localVariableModifiers, boolean isStatic,
				CompletionRequestor requestor, IProgressMonitor monitor)
				throws JavaModelException {
			
		}

		public void codeComplete(char[] snippet, int insertion, int position,
				char[][] localVariableTypeNames, char[][] localVariableNames,
				int[] localVariableModifiers, boolean isStatic,
				CompletionRequestor requestor, WorkingCopyOwner owner)
				throws JavaModelException {
			
		}

		public void codeComplete(char[] snippet, int insertion, int position,
				char[][] localVariableTypeNames, char[][] localVariableNames,
				int[] localVariableModifiers, boolean isStatic,
				CompletionRequestor requestor, WorkingCopyOwner owner,
				IProgressMonitor monitor) throws JavaModelException {
			
		}

		public IField createField(String contents, IJavaElement sibling,
				boolean force, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public IInitializer createInitializer(String contents,
				IJavaElement sibling, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public IMethod createMethod(String contents, IJavaElement sibling,
				boolean force, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public IType createType(String contents, IJavaElement sibling,
				boolean force, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public IMethod[] findMethods(IMethod method) {
			return null;
		}

		public IJavaElement[] getChildrenForCategory(String category)
				throws JavaModelException {
			return null;
		}

		public IField getField(String name) {
			return null;
		}

		public IField[] getFields() throws JavaModelException {
			return null;
		}

		public String getFullyQualifiedName() {
			return null;
		}

		public String getFullyQualifiedName(char enclosingTypeSeparator) {
			return null;
		}

		public String getFullyQualifiedParameterizedName()
				throws JavaModelException {
			return null;
		}

		public IInitializer getInitializer(int occurrenceCount) {
			return null;
		}

		public IInitializer[] getInitializers() throws JavaModelException {
			return null;
		}

		public String getKey() {
			return null;
		}

		public IMethod getMethod(String name, String[] parameterTypeSignatures) {
			return null;
		}

		public IMethod[] getMethods() throws JavaModelException {
			return null;
		}

		public IPackageFragment getPackageFragment() {
			return null;
		}

		public String getSuperclassName() throws JavaModelException {
			return null;
		}

		public String getSuperclassTypeSignature() throws JavaModelException {
			return null;
		}

		public String[] getSuperInterfaceTypeSignatures()
				throws JavaModelException {
			return null;
		}

		public String[] getSuperInterfaceNames() throws JavaModelException {
			return null;
		}

		public String[] getTypeParameterSignatures() throws JavaModelException {
			return null;
		}

		public ITypeParameter[] getTypeParameters() throws JavaModelException {
			return null;
		}

		public IType getType(String name) {
			return null;
		}

		public ITypeParameter getTypeParameter(String name) {
			return null;
		}

		public String getTypeQualifiedName() {
			return null;
		}

		public String getTypeQualifiedName(char enclosingTypeSeparator) {
			return null;
		}

		public IType[] getTypes() throws JavaModelException {
			return null;
		}

		public boolean isAnonymous() throws JavaModelException {
			return false;
		}

		public boolean isClass() throws JavaModelException {
			return false;
		}

		public boolean isEnum() throws JavaModelException {
			return false;
		}

		public boolean isInterface() throws JavaModelException {
			return false;
		}

		public boolean isAnnotation() throws JavaModelException {
			return false;
		}

		public boolean isLocal() throws JavaModelException {
			return false;
		}

		public boolean isMember() throws JavaModelException {
			return false;
		}

		public boolean isResolved() {
			return false;
		}

		public ITypeHierarchy loadTypeHierachy(InputStream input,
				IProgressMonitor monitor) throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newSupertypeHierarchy(IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newSupertypeHierarchy(
				ICompilationUnit[] workingCopies, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newSupertypeHierarchy(
				IWorkingCopy[] workingCopies, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newSupertypeHierarchy(WorkingCopyOwner owner,
				IProgressMonitor monitor) throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newTypeHierarchy(IJavaProject project,
				IProgressMonitor monitor) throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newTypeHierarchy(IJavaProject project,
				WorkingCopyOwner owner, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newTypeHierarchy(IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newTypeHierarchy(
				ICompilationUnit[] workingCopies, IProgressMonitor monitor)
				throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newTypeHierarchy(IWorkingCopy[] workingCopies,
				IProgressMonitor monitor) throws JavaModelException {
			return null;
		}

		public ITypeHierarchy newTypeHierarchy(WorkingCopyOwner owner,
				IProgressMonitor monitor) throws JavaModelException {
			return null;
		}

		public String[][] resolveType(String typeName)
				throws JavaModelException {
			return null;
		}

		public String[][] resolveType(String typeName, WorkingCopyOwner owner)
				throws JavaModelException {
			return null;
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
