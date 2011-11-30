package de.bmw.carit.jnario.spec.naming;

import static org.eclipse.xtext.util.Strings.toFirstLower;
import static org.eclipse.xtext.util.Strings.toFirstUpper;

import org.eclipse.xtext.util.Strings;

import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.Member;

public class JavaNameProvider {

	private static final String UNKNOWN_NAME = "Unknown";

	public String describe(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		if(exampleGroup.getTargetType() != null){
			result.append(exampleGroup.getTargetType().getSimpleName());
			result.append(" ");
		}
		if(exampleGroup.getTargetOperation() != null){
			result.append(new OperationNameProvider().apply(exampleGroup.getTargetOperation()));
			result.append(" ");
		}
		if(exampleGroup.getName() != null){
			result.append(exampleGroup.getName());
		}
		return result.toString().replace("(", "[").replace(")", "]").replace("#", "");
	}
	
	public String getJavaClassName(ExampleGroup exampleGroup) {
		String name = UNKNOWN_NAME;
		if(exampleGroup.getTargetType() != null){
			name = exampleGroup.getTargetType().getSimpleName() ;
		}
		if(exampleGroup.getTargetOperation() != null){
			name = new OperationNameProvider().apply(exampleGroup.getTargetOperation()).toString();
		}
		name = appendMemberDescription(exampleGroup, name);
		return toFirstUpper(clean(name)) + "Spec";
	}
	
	public String describe(Example example){
		StringBuilder sb = new StringBuilder();
		if(example.getException() != null){
			sb.append("throws ");
			sb.append(example.getException().getSimpleName());
			sb.append(" ");
		}
		sb.append(example.getName());
		return sb.toString();
	}

	protected String clean(String name) {
		if(name == null){
			name = "Null";
		}
		return name.replaceAll("[^a-zA-Z0-9]","");
	}

	public String appendMemberDescription(Member member, String name) {
		if(member.getName() != null){
			name = member.getName();
		}
		return name;
	}
	
	public String getExampleMethodName(Example example){
		String name = UNKNOWN_NAME;
		name = appendMemberDescription(example, name);
		return toFirstLower(clean(name));
	}

}
