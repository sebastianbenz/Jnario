package de.bmw.carit.jnario.runner;

import static com.google.common.collect.Lists.newArrayList;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.runners.model.FrameworkMethod;

public class Annotations {

	public static List<FrameworkMethod> allMethodsWithAnnotation(Class<?> type,
			Class<? extends Annotation> annotationType) {
		List<FrameworkMethod> methods = newArrayList();
		for (Method method : type.getMethods()) {
			if(method.isAnnotationPresent(annotationType)){
				methods.add(new FrameworkMethod(method));
			}
		}
		return methods;
	}

}
