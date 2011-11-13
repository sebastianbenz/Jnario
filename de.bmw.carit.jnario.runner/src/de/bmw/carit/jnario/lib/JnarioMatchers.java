package de.bmw.carit.jnario.lib;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;

public class JnarioMatchers {

	 /**
	   * Decorates another Matcher, retaining the behavior but allowing tests
	   * to be slightly more expressive. The behavior is equivalent to {@link Is#is(Matcher)}
	   * 
	   * cheese.should(be(smelly))
	   */
	  public static <T> org.hamcrest.Matcher<T> be(org.hamcrest.Matcher<T> matcher) {
	    return org.hamcrest.core.Is.is(matcher);
	  }

	  /**
	   * This is a shortcut to the frequently used be(equalTo(x)). The behavior is equivalent to {@link Is#is(Object))}
	   * 
	   */
	  public static <T> org.hamcrest.Matcher<T> be(T value) {
	    return org.hamcrest.core.Is.is(value);
	  }

	  /** 
	   * This is a shortcut to the frequently used be(instanceOf(SomeClass.class)).  The behavior is equivalent to {@link Is#is(Class))}
	   * 
	   */
	  public static org.hamcrest.Matcher<java.lang.Object> be(java.lang.Class<?> type) {
	    return org.hamcrest.core.Is.is(type);
	  }
	
}
