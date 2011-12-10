package de.bmw.carit.jnario.spec.naming;

import static de.bmw.carit.jnario.spec.util.Strings.convertToCamelCase;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;

public class JavaNameProvider {

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
		StringBuilder result = internalGetName(exampleGroup);
		result.append("Spec");
		return result.toString();
	}

	protected StringBuilder internalGetName(ExampleGroup exampleGroup) {
		StringBuilder result = new StringBuilder();
		ExampleGroup parent = getContainerOfType(exampleGroup.eContainer(), ExampleGroup.class);
		if(parent != null){
			result.append(internalGetName(parent));
		}
		if(exampleGroup.getTargetType() != null){
			result.append(exampleGroup.getTargetType().getSimpleName());
		}
		if(exampleGroup.getTargetOperation() != null){
			result.append(new OperationNameProvider().apply(exampleGroup.getTargetOperation()).toString());
		}
		appendMemberDescription(exampleGroup, result);
		result = convertToCamelCase(result);
		return result;
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

	public void appendMemberDescription(XtendMember member, StringBuilder result) {
		String newName = SimpleAttributeResolver.NAME_RESOLVER.apply(member);
		if(newName != null){
			result.append(newName);
		}
	}
	
	public String getExampleMethodName(Example example){
		StringBuilder result = new StringBuilder();
		appendMemberDescription(example, result);
		return convertToCamelCase(result).toString();
	}

}
