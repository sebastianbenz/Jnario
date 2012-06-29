package org.jnario.jnario.test.util;

import org.eclipse.emf.common.util.EList;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.feature.Scenario;

@SuppressWarnings("all")
public class Features {
  private final static FeatureFactory factory = FeatureFactory.eINSTANCE;
  
  public static Scenario scenario(final String name) {
    final Scenario scenario = Features.factory.createScenario();
    scenario.setName(name);
    return scenario;
  }
  
  public static Scenario scenario(final String name, final String featureName) {
    final Scenario scenario = Features.factory.createScenario();
    String _plus = ("Scenario: " + name);
    scenario.setName(_plus);
    final Feature feature = Features.feature(featureName);
    EList<Scenario> _scenarios = feature.getScenarios();
    _scenarios.add(scenario);
    return scenario;
  }
  
  public static Feature feature(final String name) {
    final Feature feature = Features.factory.createFeature();
    feature.setName(name);
    return feature;
  }
}
