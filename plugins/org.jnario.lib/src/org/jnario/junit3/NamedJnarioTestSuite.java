package org.jnario.junit3;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;

import org.jnario.runner.NameProvider;

@SuppressWarnings("rawtypes")
public class NamedJnarioTestSuite extends TestSuite{
	
	private Class testClass;

	public NamedJnarioTestSuite(Class theClass) {
		super(NameProvider.create().nameOf(theClass));
		this.testClass = theClass;
		try {
			getTestConstructor(theClass); // Avoid generating multiple error messages
		} catch (NoSuchMethodException e) {
			addTest(warning("Class "+theClass.getName()+" has no public constructor TestCase(String name) or TestCase()"));
			return;
		}

		if (!Modifier.isPublic(theClass.getModifiers())) {
			addTest(warning("Class "+theClass.getName()+" is not public"));
			return;
		}

		Class<?> superClass= theClass;
		List<String> names= new ArrayList<String>();
		for (Method each : superClass.getDeclaredMethods())
			addTestMethod(each, names, theClass);
		if (testCount() == 0)
			addTest(warning("No tests found in "+theClass.getName()));
	}
	
	@Override
	public void addTestSuite(Class testClass) {
		addTest(new NamedJnarioTestSuite(testClass));
	}

	@Override
	public String getName() {
		return NameProvider.create().nameOf(testClass);
	}
	
	private void addTestMethod(Method m, List<String> names, Class<?> theClass) {
		String name= m.getName();
		if (names.contains(name))
			return;
		if (! isPublicTestMethod(m)) {
			if (isTestMethod(m))
				addTest(warning("Test method isn't public: "+ m.getName() + "(" + theClass.getCanonicalName() + ")"));
			return;
		}
		names.add(name);
		addTest(createTest(theClass, name));
	}
	
	private boolean isPublicTestMethod(Method m) {
		return isTestMethod(m) && Modifier.isPublic(m.getModifiers());
	 }
	 
	private boolean isTestMethod(Method m) {
		return 
			m.getParameterTypes().length == 0 && 
			m.getName().startsWith("test") && 
			m.getReturnType().equals(Void.TYPE);
	 }
}
