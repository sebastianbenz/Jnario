/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.scoping.SpecResourceDescriptionStrategy;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.suite.scoping.SuiteSpecFilter;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuitePackage;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("SuiteSpecFilter")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteSpecFilterSpec {
  @Subject
  public SuiteSpecFilter subject;
  
  @Extension
  @org.jnario.runner.Extension
  public SuitePackage _suitePackage = SuitePackage.eINSTANCE;
  
  @Extension
  @org.jnario.runner.Extension
  public SpecPackage _specPackage = SpecPackage.eINSTANCE;
  
  @Extension
  @org.jnario.runner.Extension
  public FeaturePackage _featurePackage = FeaturePackage.eINSTANCE;
  
  @Test
  @Named("Suites pass")
  @Order(1)
  public void _suitesPass() throws Exception {
    EClass _suite = this._suitePackage.getSuite();
    IEObjectDescription _desc = this.desc(_suite);
    boolean _apply = this.subject.apply(_desc);
    Assert.assertTrue("\nExpected subject.apply(desc(suite)) => true but"
     + "\n     subject.apply(desc(suite)) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     desc(suite) is " + new org.hamcrest.StringDescription().appendValue(_desc).toString()
     + "\n     suite is " + new org.hamcrest.StringDescription().appendValue(_suite).toString() + "\n", Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_apply), true));
    
  }
  
  @Test
  @Named("Features pass")
  @Order(2)
  public void _featuresPass() throws Exception {
    EClass _feature = this._featurePackage.getFeature();
    IEObjectDescription _desc = this.desc(_feature);
    boolean _apply = this.subject.apply(_desc);
    Assert.assertTrue("\nExpected subject.apply(desc(feature)) => true but"
     + "\n     subject.apply(desc(feature)) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     desc(feature) is " + new org.hamcrest.StringDescription().appendValue(_desc).toString()
     + "\n     feature is " + new org.hamcrest.StringDescription().appendValue(_feature).toString() + "\n", Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_apply), true));
    
  }
  
  @Test
  @Named("Root Specs pass")
  @Order(3)
  public void _rootSpecsPass() throws Exception {
    IEObjectDescription _rootSpec = this.rootSpec();
    boolean _apply = this.subject.apply(_rootSpec);
    Assert.assertTrue("\nExpected subject.apply(rootSpec) => true but"
     + "\n     subject.apply(rootSpec) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     rootSpec is " + new org.hamcrest.StringDescription().appendValue(_rootSpec).toString() + "\n", Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_apply), true));
    
  }
  
  @Test
  @Named("Child Specs fail")
  @Order(4)
  public void _childSpecsFail() throws Exception {
    IEObjectDescription _childSpec = this.childSpec();
    boolean _apply = this.subject.apply(_childSpec);
    Assert.assertTrue("\nExpected subject.apply(childSpec) => false but"
     + "\n     subject.apply(childSpec) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_apply)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     childSpec is " + new org.hamcrest.StringDescription().appendValue(_childSpec).toString() + "\n", Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_apply), false));
    
  }
  
  public IEObjectDescription desc(final EClass type) {
    Suite _suite = Suites.suite("mySuite");
    return EObjectDescription.create("name", _suite);
  }
  
  public IEObjectDescription rootSpec() {
    return this.spec(SpecResourceDescriptionStrategy.TRUE);
  }
  
  public IEObjectDescription childSpec() {
    return this.spec(SpecResourceDescriptionStrategy.FALSE);
  }
  
  public IEObjectDescription spec(final String value) {
    IEObjectDescription _xblockexpression = null;
    {
      final ExampleGroup spec = Specs.exampleGroup("name");
      Pair<String,String> _mappedTo = Pair.<String, String>of(SpecResourceDescriptionStrategy.ROOT_SPEC, value);
      Map<String,String> _map = JnarioCollectionLiterals.<String, String>map(_mappedTo);
      _xblockexpression = EObjectDescription.create("name", spec, _map);
    }
    return _xblockexpression;
  }
}
