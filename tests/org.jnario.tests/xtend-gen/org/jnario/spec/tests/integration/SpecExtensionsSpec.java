package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.ExtensionExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Extensions can be used to share common setup and tear down behavior across different specifications.
 * For example, given a normal java class with some JUnit setup and tear down methods:
 * 
 * <pre class="prettify">
 * public class ExtensionExample {
 *   private static List<String> EXECUTED_METHODS = new ArrayList<String>();
 * 
 *   @BeforeClass
 *   public static void beforeClass(){
 *     run("ExtensionExample#beforeClass");
 *   }
 * 
 *   @Before
 *   public void before(){
 *     run("ExtensionExample#before");
 *   }
 * 
 *   @AfterClass
 *   public static void afterClass(){
 *     run("ExtensionExample#afterClass");
 *   }
 * 
 *   @After
 *   public void after(){
 *     run("ExtensionExample#after");
 *   }
 * 
 *   private static void run(String name) {
 *     EXECUTED_METHODS.add(name);
 *   }
 * 
 *   public static List<String> getExecutedMethods() {
 *     return EXECUTED_METHODS;
 *   }
 * }
 * </pre>
 * 
 * When you declare an instance of this class
 * as an extension field in your spec, all the setup
 * and tear down methods will be executed before/after
 * each fact/spec, respectively:
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Spec Extensions")
@CreateWith(value = SpecTestCreator.class)
public class SpecExtensionsSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Example:")
  @Order(0)
  public void _example() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.jnario.spec.tests.integration.ExtensionExample");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Extension\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("extension static ExtensionExample = new ExtensionExample()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"test 1\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ExtensionExample::executedMethods += \"ExtensionSpec#test1\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"test 2\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ExtensionExample::executedMethods += \"ExtensionSpec#test2\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.execute(_builder);
    List<String> _executedMethods = ExtensionExample.getExecutedMethods();
    List<String> _list = JnarioCollectionLiterals.<String>list("ExtensionExample#beforeClass", 
      "ExtensionExample#before", 
      "ExtensionSpec#test1", 
      "ExtensionExample#after", 
      "ExtensionExample#before", 
      "ExtensionSpec#test2", 
      "ExtensionExample#after", 
      "ExtensionExample#afterClass");
    boolean _doubleArrow = Should.operator_doubleArrow(_executedMethods, _list);
    Assert.assertTrue("\nExpected executedMethods =>\n\t\t\t   list(\"ExtensionExample#beforeClass\", \n\t\t\t\t\t\"ExtensionExample#before\",  \n\t\t\t\t\t\"ExtensionSpec#test1\",  \n\t\t\t\t\t\"ExtensionExample#after\",  \n\t\t\t\t\t\"ExtensionExample#before\",\n\t\t\t\t\t\"ExtensionSpec#test2\",  \n\t\t\t\t\t\"ExtensionExample#after\",\n\t\t\t\t\t\"ExtensionExample#afterClass\") but"
     + "\n     executedMethods is " + new StringDescription().appendValue(_executedMethods).toString()
     + "\n     list(\"ExtensionExample#beforeClass\", \n\t\t\t\t\t\"ExtensionExample#before\",  \n\t\t\t\t\t\"ExtensionSpec#test1\",  \n\t\t\t\t\t\"ExtensionExample#after\",  \n\t\t\t\t\t\"ExtensionExample#before\",\n\t\t\t\t\t\"ExtensionSpec#test2\",  \n\t\t\t\t\t\"ExtensionExample#after\",\n\t\t\t\t\t\"ExtensionExample#afterClass\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
}
