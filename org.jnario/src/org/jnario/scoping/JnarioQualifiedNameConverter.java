package org.jnario.scoping;

import static org.eclipse.xtext.naming.QualifiedName.create;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.XbaseQualifiedNameConverter;

public class JnarioQualifiedNameConverter extends XbaseQualifiedNameConverter {

	public QualifiedName toQualifiedName(String qualifiedNameAsString) {
		if (qualifiedNameAsString.startsWith("should "))
			return create(qualifiedNameAsString.replaceFirst("not ", ""));
		if(qualifiedNameAsString.equals("=>")){
			return create("should be");
		}
		return super.toQualifiedName(qualifiedNameAsString);
	}
	
}
