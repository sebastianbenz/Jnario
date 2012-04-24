package org.jnario.spec.tests.integration;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.jnario.test.util.SpecExecutor;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.ExtensionExample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Extensions can be used to share common setup and teardown behavior across different specifications.
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Extensions")
public class ExtensionsSpec {
  @Test
  @Named("all setup and tear down methods in extensions will be executed")
  @Order(99)
  public void allSetupAndTearDownMethodsInExtensionsWillBeExecuted() throws Exception {
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
    _builder.append("extension ExtensionExample = new ExtensionExample()");
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
    SpecExecutor.execute(_builder);
    List<String> _executedMethods = ExtensionExample.getExecutedMethods();
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "ExtensionExample#beforeClass", 
      "ExtensionExample#before", 
      "ExtensionSpec#test1", 
      "ExtensionExample#after", 
      "ExtensionExample#before", 
      "ExtensionSpec#test2", 
      "ExtensionExample#after", 
      "ExtensionExample#afterClass");
    boolean _should_be = Should.should_be(_executedMethods, _newArrayList);Assert
    .assertTrue("\nExpected executedMethods => newArrayList(\n\t\t\t\"ExtensionExample#beforeClass\", \n\t\t\t\"ExtensionExample#before\",  \n\t\t\t\"ExtensionSpec#test1\",  \n\t\t\t\"ExtensionExample#after\",  \n\t\t\t\"ExtensionExample#before\",\n\t\t\t\"ExtensionSpec#test2\",  \n\t\t\t\"ExtensionExample#after\",\n\t\t\t\"ExtensionExample#afterClass\"\n\t\t) but:"
     + "\n     executedMethods is " + _executedMethods
     + "\n     newArrayList(\n\t\t\t\"ExtensionExample#beforeClass\", \n\t\t\t\"ExtensionExample#before\",  \n\t\t\t\"ExtensionSpec#test1\",  \n\t\t\t\"ExtensionExample#after\",  \n\t\t\t\"ExtensionExample#before\",\n\t\t\t\"ExtensionSpec#test2\",  \n\t\t\t\"ExtensionExample#after\",\n\t\t\t\"ExtensionExample#afterClass\"\n\t\t) is " + _newArrayList + "\n", _should_be);
    
  }
}
