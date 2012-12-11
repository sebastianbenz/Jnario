package org.jnario.spec.tests.unit.scoping;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.ScopeTestExtension;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SpecScopeProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class SpecScopeProviderSpec {
  @Inject
  @Extension
  public ScopeTestExtension _scopeTestExtension;
  
  @Test
  @Named("resolves operations from surrounding ExampleGroup\\\'s target")
  @Order(1)
  public void _resolvesOperationsFromSurroundingExampleGroupSTarget() throws Exception {
    this._scopeTestExtension.parseSpec("\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport org.junit.Assert\r\n\r\n\t\t\tdescribe Assert{\r\n\t\t\t\tcontext assertNotNull(String, Object){\r\n\t\t\t\t\tfact \"assertNotNull(String, Object)\"{\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t} \r\n\r\n\t\t");
    Set<String> _targetOperationScope = this.targetOperationScope();
    boolean _should_contain = Should.<String>should_contain(_targetOperationScope, "assertNotNull(String, Object)");
    Assert.assertTrue("\nExpected targetOperationScope should contain \"assertNotNull(String, Object)\" but"
     + "\n     targetOperationScope is " + new StringDescription().appendValue(_targetOperationScope).toString() + "\n", _should_contain);
    
    Set<String> _targetOperationScope_1 = this.targetOperationScope();
    boolean _should_contain_1 = Should.<String>should_contain(_targetOperationScope_1, "assertNotNull");
    Assert.assertTrue("\nExpected targetOperationScope should contain  \"assertNotNull\" but"
     + "\n     targetOperationScope is " + new StringDescription().appendValue(_targetOperationScope_1).toString() + "\n", _should_contain_1);
    
  }
  
  public Set<String> targetOperationScope() {
    final EObject source = this._scopeTestExtension.second(ExampleGroup.class);
    EReference _exampleGroup_TargetOperation = SpecPackage.eINSTANCE.getExampleGroup_TargetOperation();
    return this._scopeTestExtension.scope(source, _exampleGroup_TargetOperation);
  }
}
