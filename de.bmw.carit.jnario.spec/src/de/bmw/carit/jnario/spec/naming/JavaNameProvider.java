package de.bmw.carit.jnario.spec.naming;

import org.eclipse.xtext.util.Strings;

import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;

public class JavaNameProvider {

	public String getJavaClassAnnotationValue(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		if(exampleGroup.getTarget() != null){
			result.append(exampleGroup.getTarget().getSimpleName());
			result.append(" ");
		}
		if(exampleGroup.getName() != null){
			result.append(exampleGroup.getName());
		}
		return result.toString();
	}
	
	public String getJavaClassName(ExampleGroup exampleGroup) {
		String name = "Unknown";
		if(exampleGroup.getTarget() != null){
			name = exampleGroup.getTarget().getSimpleName() ;
		}
		if(exampleGroup.getName() != null){
			name = exampleGroup.getName().replaceAll("[^a-zA-Z0-9]","");
		}
		return Strings.toFirstUpper(name) + "Spec";
	}
	
	public String getExampleMethodName(Example example){
		String name = "unknown";
		if(example.getFeature() != null){
			name = example.getFeature().getSimpleName() + "Spec";
		}
		if(example.getName() != null){
			name = example.getName().replaceAll("[^a-zA-Z0-9]","");
		}
		return Strings.toFirstLower(name);
	}

}
