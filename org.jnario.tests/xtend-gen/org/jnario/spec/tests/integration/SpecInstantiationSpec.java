package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * It is possible to customize the instantiation of tests and subjects.
 * 
 * <pre class="prettyprint">
 * package org.jnario.lib;
 * 
 * import com.google.inject.Guice;
 * import com.google.inject.util.Modules;
 * 
 * public class GuiceBasedTestInstantiator extends AbstractTestInstantiator {
 *   public Object createTest(Class<?> klass) throws Exception {
 *     return Guice.createInjector(Modules.EMPTY_MODULE).getInstance(klass);
 *   }
 * }
 * </pre>
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Spec Instantiation")
public class SpecInstantiationSpec {
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("how to use a custom spec creator")
  @Order(99)
  public void howToUseACustomSpecCreator() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.jnario.runner.CreateWith");
    _builder.newLine();
    _builder.append("import org.jnario.jnario.test.util.GuiceSpecCreator");
    _builder.newLine();
    _builder.append("import com.google.inject.Inject");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@CreateWith(typeof(GuiceSpecCreator))");
    _builder.newLine();
    _builder.append("describe GuiceBasedTestInstantiator {");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@Inject String toInject");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fact toInject should not be null");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
}
