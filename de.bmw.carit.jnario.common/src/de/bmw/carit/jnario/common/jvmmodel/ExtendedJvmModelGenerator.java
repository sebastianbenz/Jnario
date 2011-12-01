package de.bmw.carit.jnario.common.jvmmodel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

public class ExtendedJvmModelGenerator extends JvmModelGenerator {

	public CharSequence toJavaLiteral(final JvmAnnotationValue it, final ImportManager importManager){
		if (it instanceof JvmIntAnnotationValue) {
			return _toJavaLiteral((JvmIntAnnotationValue)it, importManager);
		} else{
			return super.toJavaLiteral(it, importManager);
		}
	}

	public CharSequence _toJavaLiteral(JvmIntAnnotationValue it,
			ImportManager importManager) {
		StringBuilder builder = new StringBuilder();
		EList<Integer> values = it.getValues();
		int size = values.size();
		if (size == 1) {
			Integer value = IterableExtensions.<Integer>head(values);
			builder.append(value.toString());
		} else {
			builder.append("{");
			String join = IterableExtensions.join(values, ",");
			builder.append(join);
			builder.append("}");
		}
		return builder;
	}

}
