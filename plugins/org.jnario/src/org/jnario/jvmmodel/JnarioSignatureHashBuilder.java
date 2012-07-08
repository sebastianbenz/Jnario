package org.jnario.jvmmodel;

import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.xbase.resource.JvmDeclaredTypeSignatureHashProvider.SignatureHashBuilder;

public class JnarioSignatureHashBuilder extends SignatureHashBuilder {

	/*
	 * FIXME remove when feature step implementation is migrated
	 */
	protected SignatureHashBuilder appendSignature(JvmField field) {
		if(field.getSimpleName() == null){
			return this;
		}
		appendVisibility(field.getVisibility());
		append(" ");
		if (field.isStatic())
			append("static ");
		if (field.isFinal())
			append("final ");
		appendType(field.getType());
		append(" ");
		append(field.getSimpleName());
		return this;
	}
	
}
