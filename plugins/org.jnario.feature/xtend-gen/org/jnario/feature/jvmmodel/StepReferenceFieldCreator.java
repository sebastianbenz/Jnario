package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepExpression;
import org.jnario.feature.feature.StepReference;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@SuppressWarnings("all")
public class StepReferenceFieldCreator {
  public void copyXtendMemberForReferences(final EObject objectWithReference) {
    final List<StepReference> refs = EcoreUtil2.<StepReference>getAllContentsOfType(objectWithReference, StepReference.class);
    for (final StepReference ref : refs) {
      Step _reference = ref.getReference();
      StepExpression _stepExpression = _reference==null?(StepExpression)null:_reference.getStepExpression();
      boolean _notEquals = (!Objects.equal(_stepExpression, null));
      if (_notEquals) {
        final Set<String> fieldNames = this.getExistingFieldNamesForContainerOfStepReference(ref);
        Step _reference_1 = ref.getReference();
        final Iterable<XtendMember> members = this.getMembersOfReferencedStep(_reference_1);
        this.copyFields(objectWithReference, members, fieldNames);
      }
    }
  }
  
  public Set<String> getExistingFieldNamesForContainerOfStepReference(final StepReference ref) {
    Iterable<XtendMember> _membersOfReferencedStep = this.getMembersOfReferencedStep(ref);
    Set<String> _existingFieldNames = this.getExistingFieldNames(_membersOfReferencedStep);
    return _existingFieldNames;
  }
  
  public Set<String> getExistingFieldNames(final Iterable<XtendMember> members) {
    Iterable<XtendField> _filter = Iterables.<XtendField>filter(members, XtendField.class);
    final Function1<XtendField,String> _function = new Function1<XtendField,String>() {
        public String apply(final XtendField it) {
          String _name = it.getName();
          return _name;
        }
      };
    Iterable<String> _map = IterableExtensions.<XtendField, String>map(_filter, _function);
    Set<String> _set = IterableExtensions.<String>toSet(_map);
    return _set;
  }
  
  public Iterable<XtendMember> getMembersOfReferencedStep(final Step step) {
    final Scenario scenario = EcoreUtil2.<Scenario>getContainerOfType(step, Scenario.class);
    boolean _equals = Objects.equal(scenario, null);
    if (_equals) {
      return CollectionLiterals.<XtendMember>emptyList();
    }
    EList<XtendMember> members = scenario.getMembers();
    if ((scenario instanceof Background)) {
      return members;
    }
    final Feature feature = EcoreUtil2.<Feature>getContainerOfType(scenario, Feature.class);
    Background _background = feature.getBackground();
    boolean _equals_1 = Objects.equal(_background, null);
    if (_equals_1) {
      return members;
    }
    Background _background_1 = feature.getBackground();
    EList<XtendMember> _members = _background_1.getMembers();
    return Iterables.<XtendMember>concat(members, _members);
  }
  
  public void copyFields(final EObject objectWithReference, final Iterable<XtendMember> members, final Set<String> fieldNames) {
    boolean _not = (!(objectWithReference instanceof XtendClass));
    if (_not) {
      return;
    }
    final XtendClass type = ((XtendClass) objectWithReference);
    Iterable<XtendField> _filter = Iterables.<XtendField>filter(members, XtendField.class);
    for (final XtendField field : _filter) {
      String _name = field.getName();
      boolean _contains = fieldNames.contains(_name);
      boolean _not_1 = (!_contains);
      if (_not_1) {
        final EObject copiedMember = EcoreUtil.copy(field);
        EList<XtendMember> _members = type.getMembers();
        _members.add(((XtendField) copiedMember));
        String _name_1 = field.getName();
        fieldNames.add(_name_1);
      }
    }
  }
}
