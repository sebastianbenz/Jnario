package de.bmw.carit.jnario.runner;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;

import org.junit.runner.Description;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

public class JnarioRunner extends BlockJUnit4ClassRunner {

	public JnarioRunner(Class<?> klass) throws InitializationError {
		super(klass);
	}
	
	@Override
	public Description getDescription() {
		Description description = super.getDescription();
		Class<?>[] declaredClasses = getTestClass().getJavaClass().getDeclaredClasses();
		for (Class<?> subClass : declaredClasses) {
			try {
				description.addChild(new JnarioRunner(subClass).getDescription());
			} catch (InitializationError e) {
				// not a test
			}
		}
		return description;
	}
	
	@Override
	protected List<FrameworkMethod> getChildren() {
		return newArrayList(transform(super.getChildren(), new Function<FrameworkMethod, FrameworkMethod>(){

			@Override
			public FrameworkMethod apply(final FrameworkMethod from) {
				return new FrameworkMethod(from.getMethod()){
					@Override
					public String getName() {
						return nameOf(from);
					}
				};
			}
		}));
	}
	
	
	@Override
	protected String getName() {
		return nameOf(getTestClass().getJavaClass());
	}
	
	protected String nameOf(FrameworkMethod method) {
		Named named = method.getAnnotation(Named.class);
		if(named == null){
			return method.getName();
		}
		return named.value();
	}

	protected String nameOf(Class<?> klass) {
		Annotation[] annotations = klass.getAnnotations();
		Iterator<Named> names = Iterables.filter(asList(annotations), Named.class).iterator();
		return names.hasNext() ? names.next().value() : super.getName();
	}

}
