package de.bmw.carit.jnario.spec.naming;

import de.bmw.carit.jnario.spec.spec.ExampleGroup;

public class JavaNameProvider {

	public String getJavaClassName(ExampleGroup exampleGroup) {
		if(exampleGroup.getTarget() != null){
			return exampleGroup.getTarget().getSimpleName() + "Spec";
		}
		if(exampleGroup.getName() != null){
			return exampleGroup.getName().replaceAll("[^a-zA-Z0-9]","");
		}
		return "NullSpec";
	}

}
