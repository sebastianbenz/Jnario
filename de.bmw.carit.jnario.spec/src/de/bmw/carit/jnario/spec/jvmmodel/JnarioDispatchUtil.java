package de.bmw.carit.jnario.spec.jvmmodel;

import static com.google.common.collect.Iterables.filter;

import java.util.Iterator;

import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xtend2.jvmmodel.DispatchUtil;
import org.eclipse.xtext.xtend2.xtend2.XtendFunction;

import com.google.inject.Inject;

public class JnarioDispatchUtil extends DispatchUtil {
	
	@Inject
	private IJvmModelAssociations associations;
	
	public boolean isDispatcherFunction(JvmOperation inferredOperation) {
		Iterator<XtendFunction> operations = filter(associations.getSourceElements(inferredOperation), XtendFunction.class).iterator();
		if(!operations.hasNext()){
			return false;
		}
		XtendFunction xtendFunction = operations.next();
		return !inferredOperation.getSimpleName().startsWith("_") && xtendFunction.isDispatch();
	}

}
