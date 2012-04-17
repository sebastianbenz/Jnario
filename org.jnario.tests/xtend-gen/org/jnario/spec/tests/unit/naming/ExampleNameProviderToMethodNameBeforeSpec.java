package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Before;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toMethodName[Before]")
public class ExampleNameProviderToMethodNameBeforeSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert before description to camel case starting in lowercase")
  @Order(99)
  public void shouldConvertBeforeDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "before \'my example\'", 
      "before \'my\nexample\'", 
      "before \'my\texample\'", 
      "before \'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstMethodName = ExampleNameProviderToMethodNameBeforeSpec.this.firstMethodName(it);
          boolean _should_be = Should.should_be(_firstMethodName, "myExample");Assert
          .assertTrue("\nExpected firstMethodName => \'myExample\' but:"
           + "\n     firstMethodName is " + "\"" + _firstMethodName + "\"" + "\n", _should_be);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("should use before as default name")
  @Order(99)
  public void shouldUseBeforeAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("before{}");
    boolean _should_be = Should.should_be(_firstMethodName, "before");Assert
    .assertTrue("\nExpected firstMethodName(\"before{}\") => \"before\" but:"
     + "\n     firstMethodName(\"before{}\") is " + "\"" + _firstMethodName + "\"" + "\n", _should_be);
    
  }
  
  @Test
  @Named("should enumerate befores without description")
  @Order(99)
  public void shouldEnumerateBeforesWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("before{}\r\n                 before{}");
    boolean _should_be = Should.should_be(_secondMethodName, "before2");Assert
    .assertTrue("\nExpected secondMethodName(\"before{}\r\n                 before{}\") => \"before2\" but:"
     + "\n     secondMethodName(\"before{}\r\n                 before{}\") is " + "\"" + _secondMethodName + "\"" + "\n", _should_be);
    
  }
  
  public String firstMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{" + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      Before _first = _parse.<Before>first(Before.class);
      String _methodName = this.subject.toMethodName(_first);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
  
  public String secondMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{" + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      Before _second = _parse.<Before>second(Before.class);
      String _methodName = this.subject.toMethodName(_second);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
}
