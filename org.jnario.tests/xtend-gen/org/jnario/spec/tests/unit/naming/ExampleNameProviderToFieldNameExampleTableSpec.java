package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toFieldName[ExampleTable]")
public class ExampleNameProviderToFieldNameExampleTableSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should use the example name")
  @Order(99)
  public void shouldUseTheExampleName() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'My Context\'{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def myExample{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    Query _parse = this.parse(_builder);
    final ExampleTable exampleTable = _parse.<ExampleTable>first(ExampleTable.class);
    String _fieldName = this.subject.toFieldName(exampleTable);
    boolean _doubleArrow = Should.operator_doubleArrow(_fieldName, "myExample");
    Assert.assertTrue("\nExpected subject.toFieldName(exampleTable) => \"myExample\" but"
     + "\n     subject.toFieldName(exampleTable) is " + "\"" + _fieldName + "\""
     + "\n     subject is " + this.subject
     + "\n     exampleTable is " + exampleTable + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should use \\\'examples\\\' if no name is given")
  @Order(99)
  public void shouldUseExamplesIfNoNameIsGiven() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'My Context\'{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    Query _parse = this.parse(_builder);
    final ExampleTable exampleTable = _parse.<ExampleTable>first(ExampleTable.class);
    String _fieldName = this.subject.toFieldName(exampleTable);
    boolean _doubleArrow = Should.operator_doubleArrow(_fieldName, "examples");
    Assert.assertTrue("\nExpected subject.toFieldName(exampleTable) => \"examples\" but"
     + "\n     subject.toFieldName(exampleTable) is " + "\"" + _fieldName + "\""
     + "\n     subject is " + this.subject
     + "\n     exampleTable is " + exampleTable + "\n", _doubleArrow);
    
  }
}
