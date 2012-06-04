package org.jnario.feature.tests.unit.naming;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.jnario.ExampleTable;
import org.jnario.JnarioFactory;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameBackgroundSpec;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameExampleTableSpec;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderGetClassNameFeatureSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.junit.runner.RunWith;

@Contains({ FeatureClassNameProviderGetClassNameFeatureSpec.class, FeatureClassNameProviderGetClassNameBackgroundSpec.class, FeatureClassNameProviderGetClassNameExampleTableSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("FeatureClassNameProvider")
public class FeatureClassNameProviderSpec {
  @Subject
  public FeatureClassNameProvider subject;
  
  static FeatureFactory factory = FeatureFactory.eINSTANCE;
  
  public String className(final EObject obj) {
    String _className = this.subject.getClassName(obj);
    return _className;
  }
  
  public Background background(final String backgroundName, final String featureName) {
    final Background result = FeatureClassNameProviderSpec.factory.createBackground();
    String _plus = ("Background: " + backgroundName);
    result.setName(_plus);
    final Feature feature = this.feature(featureName);
    feature.setBackground(result);
    return result;
  }
  
  public ExampleTable examples(final String examplesName, final String scenarioName, final String featureName) {
    final ExampleTable result = JnarioFactory.eINSTANCE.createExampleTable();
    String _plus = ("Examples: " + examplesName);
    result.setName(_plus);
    final Scenario scenario = this.scenario(scenarioName, featureName);
    EList<ExampleTable> _examples = scenario.getExamples();
    _examples.add(result);
    return result;
  }
  
  public Scenario scenario(final String name, final String featureName) {
    final Scenario scenario = FeatureClassNameProviderSpec.factory.createScenario();
    String _plus = ("Scenario: " + name);
    scenario.setName(_plus);
    final Feature feature = this.feature(featureName);
    EList<Scenario> _scenarios = feature.getScenarios();
    _scenarios.add(scenario);
    return scenario;
  }
  
  public Feature feature(final String name) {
    final Feature feature = FeatureClassNameProviderSpec.factory.createFeature();
    String _plus = ("Feature: " + name);
    feature.setName(_plus);
    return feature;
  }
}
