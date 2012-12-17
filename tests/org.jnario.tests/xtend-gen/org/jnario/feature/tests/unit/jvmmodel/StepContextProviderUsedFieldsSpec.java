package org.jnario.feature.tests.unit.jvmmodel;

import java.util.Set;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.feature.tests.unit.jvmmodel.StepContextProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("usedFields")
@RunWith(ExampleGroupRunner.class)
public class StepContextProviderUsedFieldsSpec extends StepContextProviderSpec {
  @Test
  @Named("returns all called fields of scenario")
  @Order(1)
  public void _returnsAllCalledFieldsOfScenario() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: My Scenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val field1 = \"\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val field2 = \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(field1)");
    _builder.newLine();
    final Set<XtendField> usedFields = this.usedFields(_builder);
    Set<XtendField> _fields = this.fields("field1");
    boolean _doubleArrow = Should.operator_doubleArrow(usedFields, _fields);
    Assert.assertTrue("\nExpected usedFields => fields(\"field1\") but"
     + "\n     usedFields is " + new StringDescription().appendValue(usedFields).toString()
     + "\n     fields(\"field1\") is " + new StringDescription().appendValue(_fields).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("returns all called fields of scenario and background")
  @Order(2)
  public void _returnsAllCalledFieldsOfScenarioAndBackground() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Background: ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val field3 = \"\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val field4 = \"\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: My Scenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val field1 = \"\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val field2 = \"\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(field1)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(field3)");
    _builder.newLine();
    final Set<XtendField> usedFields = this.usedFields(_builder);
    Set<XtendField> _fields = this.fields("field1", "field3");
    boolean _doubleArrow = Should.operator_doubleArrow(usedFields, _fields);
    Assert.assertTrue("\nExpected usedFields => fields(\"field1\", \"field3\") but"
     + "\n     usedFields is " + new StringDescription().appendValue(usedFields).toString()
     + "\n     fields(\"field1\", \"field3\") is " + new StringDescription().appendValue(_fields).toString() + "\n", _doubleArrow);
    
  }
}
