package de.bmw.carit.jnario.spec.naming;

import static org.eclipse.xtext.util.Strings.toFirstLower;
import static org.eclipse.xtext.util.Strings.toFirstUpper;

import org.eclipse.xtext.util.Strings;

import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.Member;

public class JavaNameProvider {

	private static final String UNKNOWN_NAME = "Unknown";

	public String getJavaClassAnnotationValue(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		if(exampleGroup.getTargetType() != null){
			result.append(exampleGroup.getTargetType().getSimpleName());
			result.append(" ");
		}
		if(exampleGroup.getName() != null){
			result.append(exampleGroup.getName());
		}
		return result.toString();
	}
	
	public String getJavaClassName(ExampleGroup exampleGroup) {
		String name = UNKNOWN_NAME;
		if(exampleGroup.getTargetType() != null){
			name = exampleGroup.getTargetType().getSimpleName() ;
		}
		name = appendMemberDescription(exampleGroup, name);
		return toFirstUpper(name) + "Spec";
	}

	public String appendMemberDescription(Member member, String name) {
		if(member.getName() != null){
			name = member.getName().replaceAll("[^a-zA-Z0-9]","");
		}
		return name;
	}
	
	public String getExampleMethodName(Example example){
		String name = UNKNOWN_NAME;
		name = appendMemberDescription(example, name);
		return toFirstLower(name);
	}

}
