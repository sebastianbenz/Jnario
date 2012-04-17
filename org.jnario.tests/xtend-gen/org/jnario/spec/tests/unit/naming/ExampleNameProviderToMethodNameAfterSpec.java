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
import org.jnario.spec.spec.After;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toMethodName[After]")
public class ExampleNameProviderToMethodNameAfterSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert after description to camel case starting in lowercase")
  @Order(99)
  public void shouldConvertAfterDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "after \'my example\'", 
      "after \'my\nexample\'", 
      "after \'my\texample\'", 
      "after \'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstMethodName = ExampleNameProviderToMethodNameAfterSpec.this.firstMethodName(it);
          boolean _should_be = Should.should_be(_firstMethodName, "myExample");Assert
          .assertTrue("\nExpected firstMethodName => \'myExample\' but:"
           + "\n     firstMethodName is " + "\"" + _firstMethodName + "\"" + "\n", _should_be);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("should use after as default name")
  @Order(99)
  public void shouldUseAfterAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("after{}");
    boolean _should_be = Should.should_be(_firstMethodName, "after");Assert
    .assertTrue("\nExpected firstMethodName(\"after{}\") => \"after\" but:"
     + "\n     firstMethodName(\"after{}\") is " + "\"" + _firstMethodName + "\"" + "\n", _should_be);
    
  }
  
  @Test
  @Named("should enumerate afters without description")
  @Order(99)
  public void shouldEnumerateAftersWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("after{}\r\n                 after{}");
    boolean _should_be = Should.should_be(_secondMethodName, "after2");Assert
    .assertTrue("\nExpected secondMethodName(\"after{}\r\n                 after{}\") => \"after2\" but:"
     + "\n     secondMethodName(\"after{}\r\n                 after{}\") is " + "\"" + _secondMethodName + "\"" + "\n", _should_be);
    
  }
  
  public String firstMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{" + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      After _first = _parse.<After>first(After.class);
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
      After _second = _parse.<After>second(After.class);
      String _methodName = this.subject.toMethodName(_second);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
}
