package org.jnario.jnario.tests.unit;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.jnario.jnario.test.util.JavaElementFinderStub;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.unit.CreateMissingMethodCreateModificationSpec;
import org.jnario.jnario.tests.unit.CreateMissingMethodHasMissingMethodSpec;
import org.jnario.jnario.tests.unit.CreateMissingMethodReceiverIsReadOnlyXMemberFeatureCallSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.ui.quickfix.CreateMissingMethod;
import org.jnario.ui.quickfix.MethodBuilderProvider;
import org.junit.runner.RunWith;

@Contains({ CreateMissingMethodHasMissingMethodSpec.class, CreateMissingMethodReceiverIsReadOnlyXMemberFeatureCallSpec.class, CreateMissingMethodCreateModificationSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("CreateMissingMethod")
@CreateWith(value = SpecTestCreator.class)
public class CreateMissingMethodSpec {
  @Inject
  ModelStore m;
  
  JavaElementFinderStub javaElementProvider = new Function0<JavaElementFinderStub>() {
    public JavaElementFinderStub apply() {
      JavaElementFinderStub _javaElementFinderStub = new JavaElementFinderStub();
      return _javaElementFinderStub;
    }
  }.apply();
  
  CreateMissingMethod subject;
  
  @Inject
  public CreateMissingMethod createSubject(final ITypeProvider typeProvider, final IXtendJvmAssociations jvmAssociations, final MethodBuilderProvider builderProvider) {
    CreateMissingMethod _createMissingMethod = new CreateMissingMethod(this.javaElementProvider, typeProvider, jvmAssociations, builderProvider);
    CreateMissingMethod _subject = this.subject = _createMissingMethod;
    return _subject;
  }
  
  public Resource parseSpec(final CharSequence content) {
    Resource _parseSpec = this.m.parseSpec(content);
    return _parseSpec;
  }
  
  public XMemberFeatureCall firstFeatureCall() {
    XMemberFeatureCall _first = this.m.<XMemberFeatureCall>first(XMemberFeatureCall.class);
    return _first;
  }
}
