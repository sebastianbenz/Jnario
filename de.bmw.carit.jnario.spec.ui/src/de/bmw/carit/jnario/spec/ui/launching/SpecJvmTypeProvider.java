package de.bmw.carit.jnario.spec.ui.launching;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory;

import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;

@SuppressWarnings("restriction")
public class SpecJvmTypeProvider {
	
	public ExampleNameProvider nameProvider;
	public Factory typeProviderFactory;

	@Inject
	public SpecJvmTypeProvider(ExampleNameProvider nameProvider,
			Factory typeProviderFactory) {
		this.nameProvider = nameProvider;
		this.typeProviderFactory = typeProviderFactory;
	}

	protected JvmType resolveJvmType(SpecFile specFile) {
		ExampleGroup exampleGroup = (ExampleGroup) specFile.getXtendClass();
		return resolveJvmType(exampleGroup);
	}

	protected JvmType resolveJvmType(ExampleGroup exampleGroup) {
		Resource resource = exampleGroup.eResource();
		if(resource == null){
			return null;
		}
		ResourceSet resourceSet = resource.getResourceSet();
		if(resourceSet == null){
			return null;
		}
		String javaClassName = getTypeName(exampleGroup);
		IJvmTypeProvider typeProvider = typeProviderFactory.createTypeProvider(resourceSet);
		return typeProvider.findTypeByName(javaClassName);
	}

	protected String getTypeName(ExampleGroup exampleGroup) {
		String typeName = nameProvider.toJavaClassName(exampleGroup);
		SpecFile specFile = getContainerOfType(exampleGroup, SpecFile.class);
		return specFile.getPackage() + "." + typeName;
	}
}