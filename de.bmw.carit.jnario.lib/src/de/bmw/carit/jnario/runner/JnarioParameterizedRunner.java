package de.bmw.carit.jnario.runner;

import static java.util.Arrays.asList;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.Parameterized;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

import com.google.common.collect.Iterables;

public class JnarioParameterizedRunner extends Parameterized{

//	private class JnarioTestClassRunnerForParameters extends
//	ScenarioRunner {
//		private final int fParameterSetNumber;
//
//		private final List<Object[]> fParameterList;
//		
//		Object testObject;
//
//		JnarioTestClassRunnerForParameters(Class<?> type,
//				List<Object[]> parameterList, int i) throws InitializationError {
//			super(type);
//			fParameterList= parameterList;
//			fParameterSetNumber= i;
//		}
//
//		@Override
//		public Object createTest() throws Exception {
//			if(testObject == null){
//				testObject = getTestClass().getOnlyConstructor().newInstance(
//					computeParams());
//			}
//			return testObject;
//		}
//
//		private Object[] computeParams() throws Exception {
//			try {
//				return fParameterList.get(fParameterSetNumber);
//			} catch (ClassCastException e) {
//				throw new Exception(String.format(
//						"%s.%s() must return a Collection of arrays.",
//						getTestClass().getName()));
//			}
//		}
//
//		@Override
//		protected String getName() {
//			String params = "";
//			Object[] objects = fParameterList.get(fParameterSetNumber);
//			for(int i = 0; i < objects.length; i++){
//				params += objects[i].toString() + ", ";
//			}
//			return String.format("[Example %s: %s]", fParameterSetNumber, params);
//		}
//
//		@Override
//		protected String testName(final FrameworkMethod method) {
//			return String.format("%s[%s]", method.getName(),
//					fParameterSetNumber);
//		}
//
//		@Override
//		protected void validateConstructor(List<Throwable> errors) {
//			validateOnlyOneConstructor(errors);
//		}
//
//		@Override
//		protected Statement classBlock(RunNotifier notifier) {
//			return childrenInvoker(notifier);
//		}
//	}
	
	private final ArrayList<Runner> runners= new ArrayList<Runner>();

	public JnarioParameterizedRunner(Class<?> klass) throws Throwable {
		super(klass);
		List<Object[]> parametersList= getParametersList(getTestClass());
		for (int i= 0; i < parametersList.size(); i++){
			//runners.add(new JnarioTestClassRunnerForParameters(getTestClass().getJavaClass(), parametersList, i));
		}
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
	
	@SuppressWarnings("unchecked")
	private List<Object[]> getParametersList(TestClass klass)
			throws Throwable {
		return (List<Object[]>) getParametersMethod(klass).invokeExplosively(
				null);
	}
	
	@Override
	protected List<Runner> getChildren() {
		return runners;
	}

	private FrameworkMethod getParametersMethod(TestClass testClass)
			throws Exception {
		List<FrameworkMethod> methods= testClass
				.getAnnotatedMethods(Parameters.class);
		for (FrameworkMethod each : methods) {
			int modifiers= each.getMethod().getModifiers();
			if (Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers))
				return each;
		}

		throw new Exception("No public static parameters method on class "
				+ testClass.getName());
	}

	@Override
	protected String getName() {
		return nameOf(getTestClass().getJavaClass());
	}

	protected String nameOf(Class<?> klass) {
		Annotation[] annotations = klass.getAnnotations();
		Iterator<Named> names = Iterables.filter(asList(annotations), Named.class).iterator();
		return names.hasNext() ? names.next().value() : super.getName();
	}
}
