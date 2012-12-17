package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * It is possible to customize the instantiation of features, specs and subjects.
 * This can be useful when a dependency injection container or a mocking
 * framework should be used for creating specs. To do so, create a custom `SpecCreator` and
 * annotate your spec with `CreateWith` and pass as a value the type of the custom `SpecCreator`.
 * Here is an example for a custom `SpecCreator` that uses Google Guice to create the specification:
 * 
 * <pre class="prettyprint">
 * package org.jnario.lib;
 * 
 * import com.google.inject.Guice;
 * import com.google.inject.util.Modules;
 * 
 * public class GuiceSpecCreator extends AbstractSpecCreator {
 *   public Object create(Class<?> klass) throws Exception {
 *     return Guice.createInjector(Modules.EMPTY_MODULE).getInstance(klass);
 *   }
 * }
 * </pre>
 * 
 * [Here](https://gist.github.com/2869959) is another example that demonstrates
 * how to create a custom **SpecCreator** for [Mockito](http://code.google.com/p/mockito/).
 */
@SuppressWarnings("all")
@Named("Customizing the Spec Creation")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class CustomizingTheSpecCreationSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  /**
   * This example uses the Google Guice to instantiate the specification.
   *  @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Example")
  @Order(1)
  public void _example() throws Exception {
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
    _builder.append("describe \"Something\" {");
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
    this._behaviorExecutor.executesSuccessfully(_builder);
  }
}
