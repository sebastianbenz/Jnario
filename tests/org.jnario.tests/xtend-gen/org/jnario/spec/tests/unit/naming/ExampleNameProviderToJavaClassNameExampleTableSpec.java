package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toJavaClassName[ExampleTable]")
@RunWith(ExampleGroupRunner.class)
public class ExampleNameProviderToJavaClassNameExampleTableSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should combine example and parent name")
  @Order(11)
  public void _shouldCombineExampleAndParentName() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'My Context\'{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def MyExample{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _exampleTableClassName = this.exampleTableClassName(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(_exampleTableClassName, "MyContextSpecMyExample");
    Assert.assertTrue("\nExpected exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def MyExample{\r\n          }\r\n        }\r\n        \'\'\') => \"MyContextSpecMyExample\" but"
     + "\n     exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def MyExample{\r\n          }\r\n        }\r\n        \'\'\') is " + new StringDescription().appendValue(_exampleTableClassName).toString()
     + "\n     \'\'\'\r\n        describe \'My Context\'{\r\n          def MyExample{\r\n          }\r\n        }\r\n        \'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should convert example name to first upper")
  @Order(12)
  public void _shouldConvertExampleNameToFirstUpper() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'My Context\'{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def myExample{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    String _exampleTableClassName = this.exampleTableClassName(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(_exampleTableClassName, "MyContextSpecMyExample");
    Assert.assertTrue("\nExpected exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def myExample{\r\n          } \r\n        }\r\n        \'\'\') => \"MyContextSpecMyExample\" but"
     + "\n     exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def myExample{\r\n          } \r\n        }\r\n        \'\'\') is " + new StringDescription().appendValue(_exampleTableClassName).toString()
     + "\n     \'\'\'\r\n        describe \'My Context\'{\r\n          def myExample{\r\n          } \r\n        }\r\n        \'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  public String exampleTableClassName(final CharSequence s) {
    String _xblockexpression = null;
    {
      Query _parse = this.parse(s);
      final ExampleTable exampleTable = _parse.<ExampleTable>first(ExampleTable.class);
      String _javaClassName = this.subject.toJavaClassName(exampleTable);
      _xblockexpression = (_javaClassName);
    }
    return _xblockexpression;
  }
}
