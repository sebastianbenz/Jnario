package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ConsoleRecorder;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Extensions can be used to share common setup and tear down behavior across different specifications.
 * For example, given a normal java class with some JUnit setup and tear down methods:
 * 
 * <pre class="prettify">
 * public class ExtensionExample {
 *   @BeforeClass
 *   public static void beforeClass(){
 *     System.out.println("before Class");
 *   }
 * 
 *   @Before
 *   public void before(){
 *     System.out.println("before");
 *   }
 * 
 *   @AfterClass
 *   public static void afterClass(){
 *     System.out.println("after Class");
 *   }
 * 
 *   @After
 *   public void after(){
 *     System.out.println("after");
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
@Named("Spec Extensions")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class SpecExtensionsSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Example:")
  @Order(1)
  public void _example() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
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
    _builder.append("context \"Nested Spec\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact println(\"test 3\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"test 1\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"test 2\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("before Class");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("test 3");
    _builder_1.newLine();
    _builder_1.append("after");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("test 1");
    _builder_1.newLine();
    _builder_1.append("after");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("test 2");
    _builder_1.newLine();
    _builder_1.append("after");
    _builder_1.newLine();
    _builder_1.append("after Class");
    _builder_1.newLine();
    this.prints(_builder, _builder_1.toString());
  }
  
  public void prints(final CharSequence spec, final String expected) {
    final ConsoleRecorder recording = ConsoleRecorder.start();
    this._behaviorExecutor.executesSuccessfully(spec);
    final String actual = recording.stop();
    Assert.assertEquals(expected, actual);
  }
}
