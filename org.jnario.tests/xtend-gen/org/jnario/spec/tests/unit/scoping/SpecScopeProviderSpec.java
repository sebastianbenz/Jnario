package org.jnario.spec.tests.unit.scoping;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.scoping.SpecScopeProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SpecScopeProvider")
@InstantiateWith(value = SpecTestInstantiator.class)
public class SpecScopeProviderSpec {
  @Subject
  public SpecScopeProvider subject;
  
  @Inject
  @Extension
  public ModelStore modelStore;
  
  @Test
  @Named("should resolve operations from surrounding ExampleGroup\\\'s target")
  @Order(99)
  public void shouldResolveOperationsFromSurroundingExampleGroupSTarget() throws Exception {
    this.modelStore.parseSpec("\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport org.junit.Assert\r\n\r\n\t\t\tdescribe Assert{\r\n\t\t\t\tdescribe assertNotNull(String, Object){\r\n\t\t\t\t\t\"assertNotNull(String, Object)\"{\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t} \r\n\r\n\t\t");
    Query _query = this.modelStore.query();
    final ExampleGroup exampleGroup = _query.<ExampleGroup>second(ExampleGroup.class);
    IScope _targetOperation = this.targetOperation(exampleGroup);
    this.contains(_targetOperation, "assertNotNull(String, Object)");
    IScope _targetOperation_1 = this.targetOperation(exampleGroup);
    this.contains(_targetOperation_1, "assertNotNull");
  }
  
  public void contains(final IScope scope, final String element) {
    String[] _split = element.split("//.");
    QualifiedName _create = QualifiedName.create(((List<String>)Conversions.doWrapArray(_split)));
    final IEObjectDescription result = scope.getSingleElement(_create);
    String _plus = ObjectExtensions.operator_plus("scope did not contain:", element);
    Assert.assertNotNull(_plus, result);
  }
  
  public void containsNot(final IScope scope, final String element) {
    String[] _split = element.split("//.");
    QualifiedName _create = QualifiedName.create(((List<String>)Conversions.doWrapArray(_split)));
    final IEObjectDescription result = scope.getSingleElement(_create);
    String _plus = ObjectExtensions.operator_plus("scope did not contain:", element);
    Assert.assertNull(_plus, result);
  }
  
  public IScope targetOperation(final EObject source) {
    EReference _exampleGroup_TargetOperation = SpecPackage.eINSTANCE.getExampleGroup_TargetOperation();
    return this.subject.getScope(source, _exampleGroup_TargetOperation);
  }
}
