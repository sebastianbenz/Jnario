package org.jnario.jvmmodel;

import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.collect.Maps.newHashMap;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;

import com.google.common.collect.MapMaker;
import com.google.inject.Provider;
public abstract class JnarioNameProvider {
	
	private static class Cache{
		private Map<EObject, String> map = new MapMaker().weakKeys().makeMap();
		
		public String get(EObject key,	Provider<String> provider) {
			String result = map.get(key);
			if(result == null){
				result = provider.get();
				if(result != null){
					map.put(key, result); 
				}
			}
			return result;
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
		String packageName = xtendClass.getPackageName();
		return packageName;
	}
	
	private static Map<EObject, Integer> counter = newHashMap();
	
	public final String toJavaClassName(final EObject eObject){
		return classNameCache.get(eObject, new Provider<String>() {
			public String get() {
				Integer count = counter.get(eObject);
				if(count == null){
					count = 1;
				}else{
					count++;
				}
				counter.put(eObject, count);
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
