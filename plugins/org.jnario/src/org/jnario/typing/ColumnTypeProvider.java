package org.jnario.typing;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.typesystem.util.AbstractReentrantTypeReferenceProvider;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.eclipse.xtext.xtype.impl.XComputedTypeReferenceImplCustom;

public class ColumnTypeProvider extends AbstractReentrantTypeReferenceProvider {

	private final Function1<XComputedTypeReference, JvmTypeReference> function;
	
	public ColumnTypeProvider(Function1<XComputedTypeReference, JvmTypeReference> function) {
		this.function = function;
	}

	@Override
	protected JvmTypeReference doGetTypeReference(XComputedTypeReferenceImplCustom context) {
		return function.apply(context);
	}

}
