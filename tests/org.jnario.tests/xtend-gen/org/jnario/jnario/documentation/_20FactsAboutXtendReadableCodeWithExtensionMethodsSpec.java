/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import java.util.Collections;
import java.util.List;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Extension methods allow adding new methods to existing
 * types without modifying them. When writing specs this is really
 * helpful as they can greatly improve the readability. They
 * use a simple syntactic trick: the first parameter of a method
 * can either be passed in after opening the parentheses or before the
 * method call. For example, given a method:
 * 
 * <pre class="prettyprint lang-spec">
 * def removeVowels (String s){
 *   s.replaceAll("[aeiouAEIOU]", "")
 * }
 * </pre>
 * 
 * We can call this method either like in Java:
 * 
 * <pre class="prettyprint lang-spec">
 * removeVowels("Hello")
 * </pre>
 * 
 * or as an extension method of String:
 * 
 * <pre class="prettyprint lang-spec">
 * "Hello".removeVowels
 * </pre>
 */
@Named("Readable Code with Extension Methods")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class _20FactsAboutXtendReadableCodeWithExtensionMethodsSpec extends _20FactsAboutXtendSpec {
  /**
   * You can import static methods as extensions, for example, when we import:
   * 
   * <pre class="prettyprint lang-spec">
   * import static extension java.util.Collections.&#42;
   * </pre>
   * 
   * we can directly call the imported static methods on our list objects:
   */
  @Test
  @Named("Import static extension methods.")
  @Order(1)
  public void _importStaticExtensionMethods() throws Exception {
    final List<String> colors = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    Collections.<String>sort(colors);
    List<String> _list = JnarioCollectionLiterals.<String>list("blue", "green", "red");
    Assert.assertTrue("\nExpected // sort is implemented by Collections#sort(List<T>)\r\n      colors => list(\"blue\", \"green\", \"red\") but"
     + "\n     // sort is implemented by Collections#sort(List<T>)\r\n      colors is " + new org.hamcrest.StringDescription().appendValue(colors).toString()
     + "\n     list(\"blue\", \"green\", \"red\") is " + new org.hamcrest.StringDescription().appendValue(_list).toString() + "\n", this.<String>operator_doubleArrow(colors, _list));
    
  }
  
  /**
   * All visible non-static methods of the current class and its super
   * types are automatically available as extensions. In specs this can
   * be used to write custom matchers:
   * 
   * <pre class="prettyprint lang-spec">
   * def hasOneElement(List<?> list){
   *  list.size == 1
   * }
   * </pre>
   * 
   * We can then use this method in our assertion:
   */
  @Test
  @Named("Local extension methods.")
  @Order(2)
  public void _localExtensionMethods() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red");
    boolean _hasOneElement = this.hasOneElement(_list);
    Assert.assertTrue("\nExpected list(\"red\").hasOneElement but"
     + "\n     list(\"red\") is " + new org.hamcrest.StringDescription().appendValue(_list).toString() + "\n", _hasOneElement);
    
  }
  
  public boolean hasOneElement(final List<? extends Object> list) {
    int _size = list.size();
    return (_size == 1);
  }
  
  /**
   * By adding the extension keyword to a field declaration,
   * its instance methods become extension methods. We use this
   * feature a lot to share helper methods or
   * setup and tear-down operations between different specs. For example,
   * we could move our `hasOneElement` method to a separate helper class
   * `ListHelpers` and declare it as an extension field:
   * 
   * <pre class="prettyprint lang-spec">
   * extension ListHelpers = new ListHelpers
   * </pre>
   * 
   * Then we can share our helper between different specs, while still
   * using the instance methods as extensions:
   */
  @Test
  @Named("Extension fields")
  @Order(3)
  public void _extensionFields() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red");
    boolean _hasOneElement = this.hasOneElement(_list);
    Assert.assertTrue("\nExpected list(\"red\").hasOneElement but"
     + "\n     list(\"red\") is " + new org.hamcrest.StringDescription().appendValue(_list).toString() + "\n", _hasOneElement);
    
  }
}
