package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toMethodName[Example]")
@RunWith(ExampleGroupRunner.class)
public class ExampleNameProviderToMethodNameExampleSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("converts method description to camel case starting in lowercase")
  @Order(13)
  public void _convertsMethodDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "\'my example\'", 
      "\'my\nexample\'", 
      "\'my\texample\'", 
      "\'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstMethodName = ExampleNameProviderToMethodNameExampleSpec.this.firstMethodName(it);
          boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "_myExample");
          Assert.assertTrue("\nExpected firstMethodName(it) => \'_myExample\' but"
           + "\n     firstMethodName(it) is " + new StringDescription().appendValue(_firstMethodName).toString()
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _doubleArrow);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("shortens method name to 250 chars")
  @Order(14)
  public void _shortensMethodNameTo250Chars() throws Exception {
    String _nameOfLength = this.nameOfLength(251);
    String _firstMethodName = this.firstMethodName(_nameOfLength);
    int _length = _firstMethodName.length();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_length), Integer.valueOf(250));
    Assert.assertTrue("\nExpected firstMethodName(nameOfLength(251)).length => 250 but"
     + "\n     firstMethodName(nameOfLength(251)).length is " + new StringDescription().appendValue(Integer.valueOf(_length)).toString()
     + "\n     firstMethodName(nameOfLength(251)) is " + new StringDescription().appendValue(_firstMethodName).toString()
     + "\n     nameOfLength(251) is " + new StringDescription().appendValue(_nameOfLength).toString() + "\n", _doubleArrow);
    
  }
  
  public String nameOfLength(final int i) {
    String _xblockexpression = null;
    {
      String result = "";
      IntegerRange _upTo = new IntegerRange(0, i);
      for (final Integer j : _upTo) {
        String _plus = (result + "a");
        result = _plus;
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
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
