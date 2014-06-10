package org.jnario.jvmmodel;

import static com.google.common.base.Strings.isNullOrEmpty;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.jnario.util.XtendTypes;

import com.google.inject.Provider;
public abstract class JnarioNameProvider {
		
	private static class Cache{
		public String get(EObject key,	Provider<String> provider) {
			Resource resource = key.eResource();
			if (resource instanceof XtextResource) {
				IResourceServiceProvider serviceProvider = ((XtextResource) resource).getResourceServiceProvider();
				IResourceScopeCache cache = serviceProvider.get(IResourceScopeCache.class);
				String result = cache.get(new Object[]{key, this}, resource, provider);
				return result;
			}
			return provider.get();
		}
	}
	
	private static Cache classNameCache = new Cache();
	private static Cache fieldNameCache = new Cache();
	private static Cache methodNameCache = new Cache();
	private static Cache qualifiedNameCache = new Cache();
	private static Cache describeCache = new Cache();
	
	public final String toQualifiedJavaClassName(final EObject eObject) {
		return qualifiedNameCache.get(eObject, new Provider<String>() {
			public String get() {
				return internalToQualifiedJavaClassName(eObject);
			}
		});
	}
	
	protected String internalToQualifiedJavaClassName(EObject eObject){
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
		String packageName = XtendTypes.packageName(xtendClass);
		return packageName;
	}
	
	public final String toJavaClassName(final EObject eObject){
		return classNameCache.get(eObject, new Provider<String>() {
			public String get() {
				return internalToJavaClassName(eObject);
			}
		});
	}
	
	public final String describe(final EObject eObject){
		return describeCache.get(eObject, new Provider<String>() {
			public String get() {
				return internalDescribe(eObject);
			}
		});
	}
	
	public final String toMethodName(final EObject eObject){
		return methodNameCache.get(eObject, new Provider<String>() {
			public String get() {
				return internalToMethodName(eObject);
			}
		});
	}
	
	public final String toFieldName(final EObject eObject){
		return fieldNameCache.get(eObject, new Provider<String>() {
			public String get() {
				return internalToFieldName(eObject);
			}
		});
	}
	
	protected abstract String internalToJavaClassName(EObject eObject); 
	
	protected abstract String internalDescribe(EObject eObject);
	
	protected abstract String internalToMethodName(EObject eObject);
	
	protected abstract String internalToFieldName(EObject eObject);
	
}
