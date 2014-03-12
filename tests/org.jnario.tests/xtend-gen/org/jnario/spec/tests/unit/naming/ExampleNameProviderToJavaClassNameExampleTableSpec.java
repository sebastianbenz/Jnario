/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
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

@Named("toJavaClassName[ExampleTable]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToJavaClassNameExampleTableSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should combine example and parent name")
  @Order(1)
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
    Assert.assertTrue("\nExpected exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def MyExample{\r\n          }\r\n        }\r\n        \'\'\') => \"MyContextSpecMyExample\" but"
     + "\n     exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def MyExample{\r\n          }\r\n        }\r\n        \'\'\') is " + new org.hamcrest.StringDescription().appendValue(_exampleTableClassName).toString()
     + "\n     \'\'\'\r\n        describe \'My Context\'{\r\n          def MyExample{\r\n          }\r\n        }\r\n        \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder).toString() + "\n", Should.<String>operator_doubleArrow(_exampleTableClassName, "MyContextSpecMyExample"));
    
  }
  
  @Test
  @Named("should convert example name to first upper")
  @Order(2)
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
    Assert.assertTrue("\nExpected exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def myExample{\r\n          } \r\n        }\r\n        \'\'\') => \"MyContextSpecMyExample\" but"
     + "\n     exampleTableClassName(\'\'\'\r\n        describe \'My Context\'{\r\n          def myExample{\r\n          } \r\n        }\r\n        \'\'\') is " + new org.hamcrest.StringDescription().appendValue(_exampleTableClassName).toString()
     + "\n     \'\'\'\r\n        describe \'My Context\'{\r\n          def myExample{\r\n          } \r\n        }\r\n        \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder).toString() + "\n", Should.<String>operator_doubleArrow(_exampleTableClassName, "MyContextSpecMyExample"));
    
  }
  
  public String exampleTableClassName(final CharSequence s) {
    String _xblockexpression = null;
    {
      Query _parse = this.parse(s);
      final ExampleTable exampleTable = _parse.<ExampleTable>first(ExampleTable.class);
      _xblockexpression = (this.subject.toJavaClassName(exampleTable));
    }
    return _xblockexpression;
  }
}
