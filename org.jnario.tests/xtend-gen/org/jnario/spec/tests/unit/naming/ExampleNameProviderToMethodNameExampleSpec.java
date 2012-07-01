package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toMethodName[Example]")
public class ExampleNameProviderToMethodNameExampleSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert method description to camel case starting in lowercase")
  @Order(99)
  public void shouldConvertMethodDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "\'my example\'", 
      "\'my\nexample\'", 
      "\'my\texample\'", 
      "\'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstMethodName = ExampleNameProviderToMethodNameExampleSpec.this.firstMethodName(it);
          boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "myExample");
          Assert.assertTrue("\nExpected firstMethodName(it) => \'myExample\' but"
           + "\n     firstMethodName(it) is " + new StringDescription().appendValue(_firstMethodName).toString()
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _doubleArrow);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  public String firstMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{ fact " + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      Example _first = _parse.<Example>first(Example.class);
      String _methodName = this.subject.toMethodName(_first);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
}
