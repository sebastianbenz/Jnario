package org.jnario.jnario.tests.unit;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.hamcrest.StringDescription;
import org.jnario.jnario.tests.unit.CreateMissingMethodSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.ui.quickfix.CreateJavaMethod;
import org.jnario.ui.quickfix.CreateXtendMethod;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("createModification")
public class CreateMissingMethodCreateModificationSpec extends CreateMissingMethodSpec {
  @Test
  @Named("creates CreateJavaMethod modification for Java class")
  @Order(99)
  public void createsCreateJavaMethodModificationForJavaClass() throws Exception {
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
    IModification _createModification = this.createModification(_builder);
    boolean _doubleArrow = Should.operator_doubleArrow(_createModification, CreateJavaMethod.class);
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.createModification => typeof(CreateJavaMethod) but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.createModification is " + new StringDescription().appendValue(_createModification).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tString x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Ignore
  @Named("creates CreateXtendMethod modification for Xtend class [PENDING]")
  @Order(99)
  public void createsCreateXtendMethodModificationForXtendClass() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Example{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseXtend(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("describe \"Something\"{");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Example x");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("fact x.unresolved");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    IModification _createModification = this.createModification(_builder_1);
    boolean _doubleArrow = Should.operator_doubleArrow(_createModification, CreateXtendMethod.class);
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tExample x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.createModification => typeof(CreateXtendMethod) but"
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tExample x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\'.createModification is " + new StringDescription().appendValue(_createModification).toString()
     + "\n     \'\'\'\n\t\t\tdescribe \"Something\"{\n\t\t\t\tExample x\n\t\t\t\tfact x.unresolved\n\t\t\t}\n\t\t\t\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _doubleArrow);
    
  }
  
  public IModification createModification(final CharSequence s) {
    this.parseSpec(s);
    XMemberFeatureCall _firstFeatureCall = this.firstFeatureCall();
    return this.subject.createModification(_firstFeatureCall, "unresolved");
  }
}
