package org.jnario.jvmmodel;

import static com.google.common.base.Strings.isNullOrEmpty;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
public abstract class JnarioNameProvider {

	public String toQualifiedJavaClassName(EObject eObject) {
		if(eObject == null){
			return null;
		}
		String className = toJavaClassName(eObject);
		if(isNullOrEmpty(className)){
			return null;
		}
		String packageName = getPackageName(eObject);
		if(isNullOrEmpty(packageName)){
			return className;
		}
		return packageName + "." + className;
	}

	protected String getPackageName(EObject eObject) {
		XtendClass xtendClass = getContainerOfType(eObject, XtendClass.class);
		String packageName = xtendClass.getPackageName();
		return packageName;
	}
	
	public abstract String toJavaClassName(EObject eObject); 
	
	public abstract String describe(EObject eObject);
	
}
