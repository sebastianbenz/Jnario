package de.bmw.carit.jnario.generator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.CompilationStrategyAdapter;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.inject.Inject;

import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmModelGenerator;

public class JnarioJvmModelGenerator extends ExtendedJvmModelGenerator {

	@Inject private ILogicalContainerProvider logicalContainerProvider;

	@Override
	public CharSequence generateBody(final JvmExecutable op, final ImportManager importManager) {

		EList<Adapter> adapters = op.eAdapters();
		Iterable<CompilationStrategyAdapter> _filter = IterableExtensions.<CompilationStrategyAdapter>filter(adapters, CompilationStrategyAdapter.class);
		CompilationStrategyAdapter adapter = IterableExtensions.<CompilationStrategyAdapter>head(_filter);
		XExpression expr = logicalContainerProvider.getAssociatedExpression(op);
		if(adapter == null && expr == null){
			return new StringConcatenation();
		}
		return super.generateBody(op, importManager);		
	}

}
