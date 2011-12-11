package de.bmw.carit.jnario.spec.naming;

import static de.bmw.carit.jnario.spec.util.Strings.convertToCamelCase;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.util.Strings.toFirstLower;
import static org.eclipse.xtext.util.Strings.toFirstUpper;

import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

import de.bmw.carit.jnario.spec.spec.Example;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;

public class ExampleNameProvider {

	private OperationNameProvider operationNameProvider = new OperationNameProvider();

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
		return result.toString().replace("(", "[").replace(")", "]").replace("#", "").trim();
	}
	
	public String describe(Example example){
		StringBuilder sb = new StringBuilder();
		if(example.getException() != null){
			sb.append("throws ");
			sb.append(example.getException().getSimpleName());
			sb.append(" ");
		}
		if(example.getName() != null){
			sb.append(example.getName());
		}
		return sb.toString().trim();
	}

	public String toJavaClassName(ExampleGroup exampleGroup) {
		StringBuilder result = internalGetName(exampleGroup);
		result.append("Spec");
		return result.toString();
	}

	public String toMethodName(Example example){
		StringBuilder result = new StringBuilder();
		appendMemberDescription(example, result);
		return toFirstLower(convertToCamelCase(result).toString());
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
			String operationName = operationNameProvider.apply(exampleGroup.getTargetOperation()).toString();
			result.append(toFirstUpper(operationName));
		}
		appendMemberDescription(exampleGroup, result);
		result = convertToCamelCase(result);
		return result;
	}
	
	private void appendMemberDescription(XtendMember member, StringBuilder result) {
		String newName = SimpleAttributeResolver.NAME_RESOLVER.apply(member);
		if(newName != null){
			result.append(newName);
		}
	}

}
