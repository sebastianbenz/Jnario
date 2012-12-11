package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
import org.jnario.spec.spec.Before;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("toMethodName[Before]")
@RunWith(ExampleGroupRunner.class)
public class ExampleNameProviderToMethodNameBeforeSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert before description to camel case starting in lowercase")
  @Order(15)
  public void _shouldConvertBeforeDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "before \'my example\'", 
      "before \'my\nexample\'", 
      "before \'my\texample\'", 
      "before \'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstMethodName = ExampleNameProviderToMethodNameBeforeSpec.this.firstMethodName(it);
          boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "_myExample");
          Assert.assertTrue("\nExpected firstMethodName => \'_myExample\' but"
           + "\n     firstMethodName is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("should use before as default name")
  @Order(16)
  public void _shouldUseBeforeAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("before{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "before");
    Assert.assertTrue("\nExpected firstMethodName(\"before{}\") => \"before\" but"
     + "\n     firstMethodName(\"before{}\") is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should use beforeAll as default name")
  @Order(17)
  public void _shouldUseBeforeAllAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("before all{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "beforeAll");
    Assert.assertTrue("\nExpected firstMethodName(\"before all{}\") => \"beforeAll\" but"
     + "\n     firstMethodName(\"before all{}\") is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should enumerate before without description")
  @Order(18)
  public void _shouldEnumerateBeforeWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("before{}\r\n                 before{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondMethodName, "before2");
    Assert.assertTrue("\nExpected secondMethodName(\"before{}\r\n                 before{}\") => \"before2\" but"
     + "\n     secondMethodName(\"before{}\r\n                 before{}\") is " + new StringDescription().appendValue(_secondMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should enumerate nested before without description")
  @Order(19)
  public void _shouldEnumerateNestedBeforeWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "before{}\r\n                 context{\r\n                   before{}\r\n                 }");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondMethodName, "before2");
    Assert.assertTrue("\nExpected secondMethodName(\r\n                \"before{}\r\n                 context{\r\n                   before{}\r\n                 }\") => \"before2\" but"
     + "\n     secondMethodName(\r\n                \"before{}\r\n                 context{\r\n                   before{}\r\n                 }\") is " + new StringDescription().appendValue(_secondMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should enumerate nested before all without description")
  @Order(20)
  public void _shouldEnumerateNestedBeforeAllWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "before all{}\r\n                 context{\r\n                   before all{}\r\n                 }");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondMethodName, "beforeAll2");
    Assert.assertTrue("\nExpected secondMethodName(\r\n                \"before all{}\r\n                 context{\r\n                   before all{}\r\n                 }\") => \"beforeAll2\" but"
     + "\n     secondMethodName(\r\n                \"before all{}\r\n                 context{\r\n                   before all{}\r\n                 }\") is " + new StringDescription().appendValue(_secondMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should keep default name of nested before and before all")
  @Order(21)
  public void _shouldKeepDefaultNameOfNestedBeforeAndBeforeAll() throws Exception {
    String _secondMethodName = this.secondMethodName(
      "before{}\r\n                 context{\r\n                   before all{}\r\n                 }");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondMethodName, "beforeAll");
    Assert.assertTrue("\nExpected secondMethodName(\r\n                \"before{}\r\n                 context{\r\n                   before all{}\r\n                 }\") => \"beforeAll\" but"
     + "\n     secondMethodName(\r\n                \"before{}\r\n                 context{\r\n                   before all{}\r\n                 }\") is " + new StringDescription().appendValue(_secondMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should escape invalid names")
  @Order(22)
  public void _shouldEscapeInvalidNames() throws Exception {
    String _firstMethodName = this.firstMethodName("before \'null\'{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "_null");
    Assert.assertTrue("\nExpected firstMethodName(\"before \'null\'{}\") => \"_null\" but"
     + "\n     firstMethodName(\"before \'null\'{}\") is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
    
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
