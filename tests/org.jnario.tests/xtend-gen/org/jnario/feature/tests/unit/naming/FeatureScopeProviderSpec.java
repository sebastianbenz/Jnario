package org.jnario.feature.tests.unit.naming;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.tests.unit.naming.FeatureScopeProviderStepReferenceSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ScopeTestExtension;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(FeatureScopeProviderStepReferenceSpec.class)
@SuppressWarnings("all")
@Named("FeatureScopeProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class FeatureScopeProviderSpec {
  @Inject
  @Extension
  public ScopeTestExtension e;
  
  public Set<String> targetOperationScope() {
    Set<String> _xblockexpression = null;
    {
      final EObject source = this.e.first(StepReference.class);
      EReference _stepReference_Reference = FeaturePackage.eINSTANCE.getStepReference_Reference();
      Set<String> _scope = this.e.scope(source, _stepReference_Reference);
      _xblockexpression = (_scope);
    }
    return _xblockexpression;
  }
}
