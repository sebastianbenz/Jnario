package org.jnario.feature.tests.unit.naming;

import org.eclipse.emf.ecore.EObject;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameBackgroundSpec;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameFeatureSpec;
import org.jnario.jnario.test.util.Features;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains({ FeatureClassNameProviderGetClassNameFeatureSpec.class, FeatureClassNameProviderGetClassNameBackgroundSpec.class })
@SuppressWarnings("all")
@Named("FeatureClassNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class FeatureClassNameProviderSpec {
  @Subject
  public FeatureClassNameProvider subject;
  
  static FeatureFactory factory = FeatureFactory.eINSTANCE;
  
  public String className(final EObject obj) {
    String _javaClassName = this.subject.toJavaClassName(obj);
    return _javaClassName;
  }
  
  public Background background(final String backgroundName, final String featureName) {
    final Background result = FeatureClassNameProviderSpec.factory.createBackground();
    String _plus = ("Background: " + backgroundName);
    result.setName(_plus);
    final Feature feature = Features.feature(featureName);
    feature.setBackground(result);
    return result;
  }
}
