package de.bmw.carit.jnario.common.jvmmodel;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.xbase.compiler.CompilationStrategyAdapter;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
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


	/**
	 * 	Solves problem with constructor generation: originally checks whether the constructor has parameters
	 * 	or if an XExpression is associated in the logical container
	 * 	For Jnario no parameters and no XExpression are set due to usage of a Function for setBody
	 */

	@Override
	protected CharSequence _generateMember(final JvmConstructor it, final ImportManager importManager) {
		CharSequence result = super._generateMember(it, importManager);
		if(result == null){
			EList<Adapter> adapters = it.eAdapters();
			Iterable<CompilationStrategyAdapter> filter = IterableExtensions.<CompilationStrategyAdapter>filter(adapters, org.eclipse.xtext.xbase.compiler.CompilationStrategyAdapter.class);
			CompilationStrategyAdapter adapter = IterableExtensions.<CompilationStrategyAdapter>head(filter);
			if(adapter != null){
				StringConcatenation _builder = new StringConcatenation();
				StringConcatenation _generateJavaDoc = this.generateJavaDoc(it);
				_builder.append(_generateJavaDoc, "");
				_builder.newLineIfNotEmpty();
				{
					EList<JvmAnnotationReference> _annotations = it.getAnnotations();
					boolean _isEmpty_1 = _annotations.isEmpty();
					boolean _operator_not_1 = BooleanExtensions.operator_not(_isEmpty_1);
					if (_operator_not_1) { 
						EList<JvmAnnotationReference> _annotations_1 = it.getAnnotations();
						CharSequence _generateAnnotations = this.generateAnnotations(_annotations_1, importManager);
						_builder.append(_generateAnnotations, "");
					}
				}
				_builder.newLineIfNotEmpty();
				CharSequence _generateModifier = this.generateModifier(it);
				_builder.append(_generateModifier, "");
				String _simpleName = it.getSimpleName();
				_builder.append(_simpleName, "");
				_builder.append("()");
				CharSequence _generateThrowsClause = this.generateThrowsClause(it, importManager);
				_builder.append(_generateThrowsClause, "");
				_builder.append(" {");
				_builder.newLineIfNotEmpty();
				_builder.append("  ");
				CharSequence _generateBody = this.generateBody(it, importManager);
				_builder.append(_generateBody, "  ");
				_builder.newLineIfNotEmpty();
				_builder.append("}");
				_builder.newLine();
				result = _builder;
			}
		}
		return result;
	}

}
