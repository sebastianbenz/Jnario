package de.bmw.carit.jnario.spec.ui.wizards;

import static com.google.common.collect.Iterables.filter;
import static org.eclipse.xtext.util.Strings.isEmpty;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;
import org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.naming.OperationNameProvider;

@SuppressWarnings("restriction")
public class SpecCreator {
	
	private final OperationNameProvider nameProvider;
	private final Factory typeProviderFactory;
	private final IJavaElementFinder javaElementFinder;

	@Inject
	public SpecCreator(JdtTypeProviderFactory typeProviderFactory, OperationNameProvider nameProvider, IJavaElementFinder javaElementFinder){
		this.typeProviderFactory = typeProviderFactory;
		this.nameProvider = nameProvider;
		this.javaElementFinder = javaElementFinder;
	}

	public String create(IJavaProject javaProject, String description,
			IPackageFragment packageFragment, String classUnderTest, IMethod[] contextMethods, IProgressMonitor monitor) {
		IJvmTypeProvider typeProvider = initTypeProvider(javaProject);
		StringBuffer sb = new StringBuffer();
		if(packageFragment.getElementName() != null && !packageFragment.getElementName().equals("")){
			sb.append("package ");
			sb.append(packageFragment.getElementName());
			sb.append("\n\n");
		}
		if(!isEmpty(classUnderTest)) {
			addImport(sb, classUnderTest);
			sb.append("\n");
		}
		
		sb.append("describe ");
		if(!isEmpty(classUnderTest)){
			sb.append(stripPackage(classUnderTest));
			sb.append(" ");
		}
		if(!isEmpty(description)){
			sb.append("\"");
			sb.append(description);
			sb.append("\"");
		}
		
		if(isEmpty(classUnderTest) && isEmpty(description)){
			sb.append("\"\"");
		}
		
		sb.append("{\n");
		for (IMethod method : contextMethods) {
			sb.append("\n\tcontext ");
			sb.append(signature(method, typeProvider));
			sb.append("{\n\t\t\n\t}\n");
		}
		sb.append("\n}");
		return sb.toString();
	}

	protected IJvmTypeProvider initTypeProvider(IJavaProject javaProject) {
		XtextResourceSet resourceSet = new XtextResourceSet();
		resourceSet.setClasspathURIContext(javaProject);
		IJvmTypeProvider typeProvider = typeProviderFactory.createTypeProvider(resourceSet);
		return typeProvider;
	}
	
	private String signature(IMethod method, IJvmTypeProvider typeProvider) {
		String typeName = method.getClassFile().getType().getFullyQualifiedName();
		JvmGenericType type = (JvmGenericType) typeProvider.findTypeByName(typeName);
		for (JvmOperation operation : filter(type.getMembers(), JvmOperation.class)) {
			IJavaElement javaElement = javaElementFinder.findElementFor(operation);
			if(javaElement.equals(method)){
				return nameProvider.apply(operation).getFirstSegment();
			}
		}
		throw new IllegalStateException("Could not resolve JVM identifiable for " + method);
	}

	private Object stripPackage(Object superType) {
		return superType.toString().replaceAll("^(\\w+\\.)*", "") ;
	}

	private void addImport(StringBuffer sb, Object object) {
		sb.append("import ");
		sb.append(removeGenerics(object));
		sb.append("\n");
	}

	private String removeGenerics(Object object) {
		return object.toString().replaceAll("<.*>$", "");
	}

}
