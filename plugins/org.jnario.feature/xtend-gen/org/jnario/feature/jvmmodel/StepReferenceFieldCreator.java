/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepImplementation;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.ExpressionCopier;
import org.jnario.feature.jvmmodel.VisibleMembersCalculator;
import org.jnario.util.SourceAdapter;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepReferenceFieldCreator {
  @Inject
  @Extension
  private VisibleMembersCalculator _visibleMembersCalculator;
  
  @Inject
  @Extension
  private ExpressionCopier _expressionCopier;
  
  public void copyXtendMemberForReferences(final Scenario scenario) {
    EList<Step> _steps = scenario.getSteps();
    Iterable<StepReference> _filter = Iterables.<StepReference>filter(_steps, StepReference.class);
    final Function1<StepReference, Boolean> _function = new Function1<StepReference, Boolean>() {
      public Boolean apply(final StepReference it) {
        StepImplementation _reference = it.getReference();
        XExpression _expression = null;
        if (_reference!=null) {
          _expression=_reference.getExpression();
        }
        return Boolean.valueOf((!Objects.equal(_expression, null)));
      }
    };
    final Iterable<StepReference> refs = IterableExtensions.<StepReference>filter(_filter, _function);
    final Set<String> fieldNames = this.getExistingFieldNamesForContainerOfStepReference(scenario);
    for (final StepReference ref : refs) {
      {
        StepImplementation _reference = ref.getReference();
        final Iterable<XtendMember> members = this._visibleMembersCalculator.allVisibleMembers(_reference);
        this.copyFields(scenario, members, fieldNames);
      }
    }
  }
  
  private Set<String> getExistingFieldNamesForContainerOfStepReference(final Scenario scenario) {
    Iterable<XtendMember> _allVisibleMembers = this._visibleMembersCalculator.allVisibleMembers(scenario);
    return this.getExistingFieldNames(_allVisibleMembers);
  }
  
  private Set<String> getExistingFieldNames(final Iterable<XtendMember> members) {
    Iterable<XtendField> _filter = Iterables.<XtendField>filter(members, XtendField.class);
    final Function1<XtendField, Boolean> _function = new Function1<XtendField, Boolean>() {
      public Boolean apply(final XtendField it) {
        return Boolean.valueOf((!Objects.equal(it, null)));
      }
    };
    Iterable<XtendField> _filter_1 = IterableExtensions.<XtendField>filter(_filter, _function);
    final Function1<XtendField, String> _function_1 = new Function1<XtendField, String>() {
      public String apply(final XtendField it) {
        return it.getName();
      }
    };
    Iterable<String> _map = IterableExtensions.<XtendField, String>map(_filter_1, _function_1);
    return IterableExtensions.<String>toSet(_map);
  }
  
  private void copyFields(final EObject objectWithReference, final Iterable<XtendMember> members, final Set<String> fieldNames) {
    if ((!(objectWithReference instanceof XtendClass))) {
      return;
    }
    final XtendClass type = ((XtendClass) objectWithReference);
    final ArrayList<XtendField> newFields = CollectionLiterals.<XtendField>newArrayList();
    Iterable<XtendField> _filter = Iterables.<XtendField>filter(members, XtendField.class);
    for (final XtendField field : _filter) {
      String _name = field.getName();
      boolean _contains = fieldNames.contains(_name);
      boolean _not = (!_contains);
      if (_not) {
        final XtendField copiedMember = this._expressionCopier.<XtendField>cloneWithProxies(field);
        SourceAdapter.adapt(copiedMember, field);
        newFields.add(((XtendField) copiedMember));
        String _name_1 = field.getName();
        fieldNames.add(_name_1);
      }
    }
    EList<XtendMember> _members = type.getMembers();
    _members.addAll(newFields);
  }
}
