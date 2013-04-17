/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.test.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;

@SuppressWarnings("all")
public class Features {
  private final static FeatureFactory factory = FeatureFactory.eINSTANCE;
  
  public static Given step(final String name) {
    Given _xblockexpression = null;
    {
      final Given step = Features.factory.createGiven();
      step.setName(name);
      _xblockexpression = (step);
    }
    return _xblockexpression;
  }
  
  public static Given stepWithoutImplementation() {
    Given _step = Features.step("Given a pending step");
    return _step;
  }
  
  public static Given implementedStep() {
    Given _xblockexpression = null;
    {
      final Given step = Features.step("Given a step with implementation");
      XBlockExpression _implementation = Features.implementation();
      step.setExpression(_implementation);
      _xblockexpression = (step);
    }
    return _xblockexpression;
  }
  
  public static XBlockExpression implementation() {
    XBlockExpression _xblockexpression = null;
    {
      final XBlockExpression blockExpression = XbaseFactory.eINSTANCE.createXBlockExpression();
      EList<XExpression> _expressions = blockExpression.getExpressions();
      XFeatureCall _createXFeatureCall = XbaseFactory.eINSTANCE.createXFeatureCall();
      _expressions.add(_createXFeatureCall);
      _xblockexpression = (blockExpression);
    }
    return _xblockexpression;
  }
  
  public static Scenario scenarioWith(final Step... steps) {
    Scenario _scenarioWith = Features.scenarioWith("Scenario: with steps", steps);
    return _scenarioWith;
  }
  
  public static Scenario scenarioWith(final String name, final Step... steps) {
    Scenario _xblockexpression = null;
    {
      final Scenario scenario = Features.scenario(name);
      EList<Step> _steps = scenario.getSteps();
      CollectionExtensions.<Step>addAll(_steps, steps);
      _xblockexpression = (scenario);
    }
    return _xblockexpression;
  }
  
  public static Scenario scenario(final String name) {
    final Scenario scenario = Features.factory.createScenario();
    scenario.setName(name);
    return scenario;
  }
  
  public static Background background(final String name) {
    final Background scenario = Features.factory.createBackground();
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
  
  public static Scenario implementedScenario() {
    Scenario _xblockexpression = null;
    {
      Given _implementedStep = Features.implementedStep();
      final Scenario scenario = Features.scenarioWith(_implementedStep);
      _xblockexpression = (scenario);
    }
    return _xblockexpression;
  }
  
  public static Scenario scenarioWithoutSteps() {
    Scenario _scenario = Features.scenario("Scenario: pending");
    return _scenario;
  }
  
  public static Feature feature(final String name) {
    final Feature feature = Features.factory.createFeature();
    feature.setName(name);
    return feature;
  }
  
  public static Feature featureWithBackgroundAndScenario(final Background background, final Scenario... scenarios) {
    Feature _xblockexpression = null;
    {
      final Feature feature = Features.featureWith(scenarios);
      feature.setBackground(background);
      _xblockexpression = (feature);
    }
    return _xblockexpression;
  }
  
  public static Feature featureWith(final Scenario... scenarios) {
    Feature _xblockexpression = null;
    {
      final Feature feature = Features.feature("Feature: with scenarios");
      EList<Scenario> _scenarios = feature.getScenarios();
      CollectionExtensions.<Scenario>addAll(_scenarios, scenarios);
      _xblockexpression = (feature);
    }
    return _xblockexpression;
  }
  
  public static Background implementedBackground() {
    Background _xblockexpression = null;
    {
      final Background bg = Features.background("Background: with implemented step");
      EList<Step> _steps = bg.getSteps();
      Given _implementedStep = Features.implementedStep();
      _steps.add(_implementedStep);
      _xblockexpression = (bg);
    }
    return _xblockexpression;
  }
  
  public static Background backgroundWithoutSteps() {
    Background _xblockexpression = null;
    {
      final Background bg = Features.background("Background: without steps");
      _xblockexpression = (bg);
    }
    return _xblockexpression;
  }
  
  public static Feature featureWithBackground(final Background scenario) {
    Feature _xblockexpression = null;
    {
      final Feature feature = Features.feature("Feature: with background");
      feature.setBackground(scenario);
      _xblockexpression = (feature);
    }
    return _xblockexpression;
  }
}
