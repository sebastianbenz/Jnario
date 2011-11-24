package de.bmw.carit.jnario.spec;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.eclipse.xtext.xtend2.resource.Xtend2Resource;
import org.eclipse.xtext.xtend2.xtend2.XtendFunction;

import com.google.inject.Singleton;

import de.bmw.carit.jnario.spec.spec.Function;

@Singleton
public class SpecTypeProvider extends XbaseTypeProvider {


	@Override
	public JvmTypeReference getExpectedReturnType(XExpression expr, boolean rawType) {
		JvmTypeReference returnType = super.getExpectedReturnType(expr, rawType);
		if (returnType != null) {
			return returnType;
		}
		XClosure closure = EcoreUtil2.getContainerOfType(expr, XClosure.class);
		if (closure != null)
			return returnType;
		Function function = EcoreUtil2.getContainerOfType(expr, Function.class);
		if (function==null)
			return null;
		if (function.getReturnType() != null)
			return function.getReturnType();
		return getExpectedType(function.getExpression(), rawType);
	}
	
}
