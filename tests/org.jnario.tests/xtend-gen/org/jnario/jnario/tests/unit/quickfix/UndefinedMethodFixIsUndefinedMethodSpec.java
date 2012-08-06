package org.jnario.jnario.tests.unit.quickfix;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.quickfix.UndefinedMethodFixSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.ui.quickfix.IsUndefinedMethod;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("IsUndefinedMethod")
public class UndefinedMethodFixIsUndefinedMethodSpec extends UndefinedMethodFixSpec {
  @Subject
  public IsUndefinedMethod subject;
  
  @Test
  @Named("false if method can be resolved")
  @Order(99)
  public void falseIfMethodCanBeResolved() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.toString");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _hasMissingMethod = this.hasMissingMethod(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasMissingMethod), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.toString\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod => false but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.toString\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod is " + new StringDescription().appendValue(Boolean.valueOf(_hasMissingMethod)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.toString\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("false if method receiver cannot be resolved")
  @Order(99)
  public void falseIfMethodReceiverCannotBeResolved() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.toString");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _hasMissingMethod = this.hasMissingMethod(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasMissingMethod), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tfact x.toString\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod => false but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tfact x.toString\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod is " + new StringDescription().appendValue(Boolean.valueOf(_hasMissingMethod)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tfact x.toString\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("false if method receiver has unknown type")
  @Order(99)
  public void falseIfMethodReceiverHasUnknownType() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Unknown x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.unresolved");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _hasMissingMethod = this.hasMissingMethod(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasMissingMethod), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tUnknown x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod => false but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tUnknown x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod is " + new StringDescription().appendValue(Boolean.valueOf(_hasMissingMethod)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tUnknown x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("false if method receiver is literal")
  @Order(99)
  public void falseIfMethodReceiverIsLiteral() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact 9.toString");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _hasMissingMethod = this.hasMissingMethod(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasMissingMethod), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tfact 9.toString\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod => false but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tfact 9.toString\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod is " + new StringDescription().appendValue(Boolean.valueOf(_hasMissingMethod)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tfact 9.toString\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("true if method cannot be resolved")
  @Order(99)
  public void trueIfMethodCannotBeResolved() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.unresolved");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _hasMissingMethod = this.hasMissingMethod(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasMissingMethod), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod => true but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod is " + new StringDescription().appendValue(Boolean.valueOf(_hasMissingMethod)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("true if method exists with different parameter count")
  @Order(99)
  public void trueIfMethodExistsWithDifferentParameterCount() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.toString(\"hello\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _hasMissingMethod = this.hasMissingMethod(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasMissingMethod), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.toString(\"hello\")\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod => true but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.toString(\"hello\")\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod is " + new StringDescription().appendValue(Boolean.valueOf(_hasMissingMethod)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.toString(\"hello\")\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("true if method exists with different parameter types")
  @Order(99)
  public void trueIfMethodExistsWithDifferentParameterTypes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.concat(4)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _hasMissingMethod = this.hasMissingMethod(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_hasMissingMethod), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.concat(4)\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod => true but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.concat(4)\n\t\t\t}\n\t\t\t\'\'\'.hasMissingMethod is " + new StringDescription().appendValue(Boolean.valueOf(_hasMissingMethod)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.concat(4)\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  public boolean hasMissingMethod(final CharSequence s) {
    boolean _xblockexpression = false;
    {
      this.parseSpec(s);
      XMemberFeatureCall _firstFeatureCall = this.firstFeatureCall();
      boolean _callsUndefinedMethod = this.subject.callsUndefinedMethod(_firstFeatureCall);
      _xblockexpression = (_callsUndefinedMethod);
    }
    return _xblockexpression;
  }
}
