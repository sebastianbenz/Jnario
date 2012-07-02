package org.jnario.jnario.documentation;

import java.util.Collections;
import java.util.List;
import org.hamcrest.StringDescription;
import org.jnario.jnario.documentation._21FactsAboutXtendSpec;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Extension methods allow adding new methods to existing
 * types without modifying them. When writing specs this is really
 * helpful as they can greatly improve the readability.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Readable Code with Extension Methods")
public class _21FactsAboutXtendReadableCodeWithExtensionMethodsSpec extends _21FactsAboutXtendSpec {
  /**
   * You can import static methods as extensions, for example, when we import:
   * 
   * <pre class="prettyprint lang-spec">
   * import static extension java.util.Collections.
   * </pre>
   * 
   * we can directly call the imported static methods on our list objects:
   */
  @Test
  @Named("Import static extension methods.")
  @Order(99)
  public void importStaticExtensionMethods() throws Exception {
    final List<String> colors = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    Collections.<String>sort(colors);
    List<String> _list = JnarioCollectionLiterals.<String>list("blue", "green", "red");
    boolean _doubleArrow = this.<String>operator_doubleArrow(colors, _list);
    Assert.assertTrue("\nExpected // sort is implemented by Collections#sort(List<T>)\n      colors => list(\"blue\", \"green\", \"red\") but"
     + "\n     // sort is implemented by Collections#sort(List<T>)\n      colors is " + new StringDescription().appendValue(colors).toString()
     + "\n     list(\"blue\", \"green\", \"red\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
  
  /**
   * All visible non-static methods of the current class and its super
   * types are automatically available as extensions. In specs this can
   * be used to write custom matcher:
   * 
   * <pre class="prettyprint lang-spec">
   * def hasOneElement(List<?> list){
   * 	list.size == 1
   * }
   * </pre>
   * 
   * We can then use this method in our assertion:
   */
  @Test
  @Named("Local extension methods.")
  @Order(99)
  public void localExtensionMethods() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red");
    boolean _hasOneElement = this.hasOneElement(_list);
    Assert.assertTrue("\nExpected list(\"red\").hasOneElement but"
     + "\n     list(\"red\") is " + new StringDescription().appendValue(_list).toString() + "\n", _hasOneElement);
    
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
   * Then we can share our helper between different specs, but can still
   * use the provided methods as extensions:
   */
  @Test
  @Named("Extension fields")
  @Order(99)
  public void extensionFields() throws Exception {
    List<String> _list = JnarioCollectionLiterals.<String>list("red");
    boolean _hasOneElement = this.hasOneElement(_list);
    Assert.assertTrue("\nExpected list(\"red\").hasOneElement but"
     + "\n     list(\"red\") is " + new StringDescription().appendValue(_list).toString() + "\n", _hasOneElement);
    
  }
  
  public boolean hasOneElement(final List<? extends Object> list) {
    int _size = list.size();
    boolean _equals = (_size == 1);
    return _equals;
  }
}
