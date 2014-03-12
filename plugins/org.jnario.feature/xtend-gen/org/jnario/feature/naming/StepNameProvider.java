/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.naming;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.naming.ArgumentsHelper;
import org.jnario.util.Nodes;
import org.jnario.util.Strings;

/**
 * @author Sebastian Benz - Initial contribution and API
 * @author Birgit Engelmann
 */
@SuppressWarnings("all")
public class StepNameProvider {
  protected String _nameOf(final Step step) {
    String _xblockexpression = null;
    {
      boolean _or = false;
      boolean _equals = Objects.equal(step, null);
      if (_equals) {
        _or = true;
      } else {
        String _name = step.getName();
        boolean _equals_1 = Objects.equal(_name, null);
        _or = _equals_1;
      }
      if (_or) {
        return null;
      }
      EAttribute _xtendTypeDeclaration_Name = XtendPackage.eINSTANCE.getXtendTypeDeclaration_Name();
      _xblockexpression = Nodes.textForFeature(step, _xtendTypeDeclaration_Name);
    }
    return _xblockexpression;
  }
  
  protected String _nameOf(final StepReference ref) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(ref, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      EReference _stepReference_Reference = FeaturePackage.eINSTANCE.getStepReference_Reference();
      _xifexpression = Nodes.textForFeature(ref, _stepReference_Reference);
    }
    return _xifexpression;
  }
  
  public String getMethodName(final Step step) {
    String _nameOf = this.nameOf(step);
    String _firstLine = Strings.firstLine(_nameOf);
    String originalName = _firstLine.trim();
    return Strings.toMethodName(originalName);
  }
  
  public String describe(final Feature feature) {
    String _name = feature.getName();
    return Strings.makeJunitConform(_name);
  }
  
  public String describe(final Scenario scenario) {
    String _name = scenario.getName();
    return Strings.makeJunitConform(_name);
  }
  
  public String describe(final Step step) {
    String _nameOf = this.nameOf(step);
    StringBuilder name = new StringBuilder(_nameOf);
    boolean _isPending = step.isPending();
    if (_isPending) {
      Strings.markAsPending(name);
    }
    String _string = name.toString();
    String _firstLine = Strings.firstLine(_string);
    return Strings.makeJunitConform(_firstLine);
  }
  
  public String removeKeywords(final String name) {
    boolean _isNullOrEmpty = com.google.common.base.Strings.isNullOrEmpty(name);
    if (_isNullOrEmpty) {
      return "";
    }
    int index = name.indexOf(" ");
    if ((index == (-1))) {
      return "";
    }
    return name.substring((index + 1));
  }
  
  public String removeArguments(final String text) {
    String _xblockexpression = null;
    {
      String name = Strings.firstLine(text);
      String _removeArgumentValues = ArgumentsHelper.removeArgumentValues(name);
      _xblockexpression = _removeArgumentValues.trim();
    }
    return _xblockexpression;
  }
  
  public String nameOf(final Step ref) {
    if (ref instanceof StepReference) {
      return _nameOf((StepReference)ref);
    } else if (ref != null) {
      return _nameOf(ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ref).toString());
    }
  }
}
