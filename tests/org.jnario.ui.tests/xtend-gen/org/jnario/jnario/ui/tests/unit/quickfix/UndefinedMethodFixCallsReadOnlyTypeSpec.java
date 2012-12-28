package org.jnario.jnario.ui.tests.unit.quickfix;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.jnario.ui.tests.unit.quickfix.JavaElementFinderStub;
import org.jnario.jnario.ui.tests.unit.quickfix.UndefinedMethodFixSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.ui.quickfix.CallsReadOnlyType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("CallsReadOnlyType")
@RunWith(ExampleGroupRunner.class)
public class UndefinedMethodFixCallsReadOnlyTypeSpec extends UndefinedMethodFixSpec {
  public CallsReadOnlyType subject;
  
  JavaElementFinderStub javaElementProvider = new Function0<JavaElementFinderStub>() {
    public JavaElementFinderStub apply() {
      JavaElementFinderStub _javaElementFinderStub = new JavaElementFinderStub();
      return _javaElementFinderStub;
    }
  }.apply();
  
  @Before
  public void before() throws Exception {
    CallsReadOnlyType _callsReadOnlyType = new CallsReadOnlyType(this.javaElementProvider, this.targetTypeProvider);
    this.subject = _callsReadOnlyType;
  }
  
  @Test
  @Named("true if java element is read-only")
  @Order(9)
  public void _trueIfJavaElementIsReadOnly() throws Exception {
    this.javaElementProvider.setReadOnly();
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
    boolean _receiverIsReadOnly = this.receiverIsReadOnly(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_receiverIsReadOnly), Boolean.valueOf(true));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.receiverIsReadOnly => true but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.receiverIsReadOnly is " + new StringDescription().appendValue(Boolean.valueOf(_receiverIsReadOnly)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("false if java element is changeable")
  @Order(10)
  public void _falseIfJavaElementIsChangeable() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SomethingSpec x");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact x.unresolved");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    boolean _receiverIsReadOnly = this.receiverIsReadOnly(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(Boolean.valueOf(_receiverIsReadOnly), Boolean.valueOf(false));
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tSomethingSpec x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.receiverIsReadOnly => false but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tSomethingSpec x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.receiverIsReadOnly is " + new StringDescription().appendValue(Boolean.valueOf(_receiverIsReadOnly)).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tSomethingSpec x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  public boolean receiverIsReadOnly(final CharSequence s) {
    this.parseSpec(s);
    XMemberFeatureCall _firstFeatureCall = this.firstFeatureCall();
    return this.subject.receiverIsReadOnly(_firstFeatureCall);
  }
}
