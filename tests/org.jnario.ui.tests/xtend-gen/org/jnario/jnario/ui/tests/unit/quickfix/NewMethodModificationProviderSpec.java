package org.jnario.jnario.ui.tests.unit.quickfix;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecUiTestCreator;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.ui.quickfix.CreateJavaMethod;
import org.jnario.ui.quickfix.CreateXtendMethod;
import org.jnario.ui.quickfix.FeatureCallTargetTypeProvider;
import org.jnario.ui.quickfix.NewMethodModificationProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("NewMethodModificationProvider")
@CreateWith(value = SpecUiTestCreator.class)
public class NewMethodModificationProviderSpec {
  @Subject
  public NewMethodModificationProvider subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  @Extension
  public FeatureCallTargetTypeProvider _featureCallTargetTypeProvider;
  
  @Before
  public void before() throws Exception {
    SpecStandaloneSetup.doSetup();
  }
  
  @Test
  @Named("creates CreateJavaMethod modification for Java class")
  @Order(0)
  public void _createsCreateJavaMethodModificationForJavaClass() throws Exception {
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
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\tdescribe \"Something\"{\r\n\t\t\tString x\r\n\t\t\tfact x.unresolved\r\n\t\t}\r\n\t\t\'\'\'.createModification => typeof(CreateJavaMethod) but"
     + "\n     \'\'\'\r\n\t\tdescribe \"Something\"{\r\n\t\t\tString x\r\n\t\t\tfact x.unresolved\r\n\t\t}\r\n\t\t\'\'\'.createModification is " + new StringDescription().appendValue(_createModification).toString()
     + "\n     \'\'\'\r\n\t\tdescribe \"Something\"{\r\n\t\t\tString x\r\n\t\t\tfact x.unresolved\r\n\t\t}\r\n\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("creates CreateXtendMethod modification for Xtend class")
  @Order(1)
  public void _createsCreateXtendMethodModificationForXtendClass() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Example{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseXtend(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("describe \"Something\"{");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Example example");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("fact example.unresolved");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    IModification _createModification = this.createModification(_builder_1);
    boolean _doubleArrow = Should.operator_doubleArrow(_createModification, CreateXtendMethod.class);
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\tdescribe \"Something\"{\r\n\t\t\tExample example\r\n\t\t\tfact example.unresolved\r\n\t\t}\r\n\t\t\'\'\'.createModification => typeof(CreateXtendMethod) but"
     + "\n     \'\'\'\r\n\t\tdescribe \"Something\"{\r\n\t\t\tExample example\r\n\t\t\tfact example.unresolved\r\n\t\t}\r\n\t\t\'\'\'.createModification is " + new StringDescription().appendValue(_createModification).toString()
     + "\n     \'\'\'\r\n\t\tdescribe \"Something\"{\r\n\t\t\tExample example\r\n\t\t\tfact example.unresolved\r\n\t\t}\r\n\t\t\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _doubleArrow);
    
  }
  
  public IModification createModification(final CharSequence s) {
    IModification _xblockexpression = null;
    {
      this._modelStore.parseSpec(s);
      XMemberFeatureCall _firstFeatureCall = this.firstFeatureCall();
      IModification _createModification = this.subject.createModification(_firstFeatureCall, "unresolved");
      _xblockexpression = (_createModification);
    }
    return _xblockexpression;
  }
  
  public XMemberFeatureCall firstFeatureCall() {
    XMemberFeatureCall _first = this._modelStore.<XMemberFeatureCall>first(XMemberFeatureCall.class);
    return _first;
  }
}
