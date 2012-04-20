package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.feature.feature.Background;
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
        final EList<XtendMember> members = this.getMembersOfReferencedStep(_reference_1);
        this.copyFields(objectWithReference, members, fieldNames);
      }
    }
  }
  
  public Set<String> getExistingFieldNamesForContainerOfStepReference(final StepReference ref) {
    final Scenario refScenario = EcoreUtil2.<Scenario>getContainerOfType(ref, Scenario.class);
    Set<String> fieldNames = null;
    boolean _notEquals = (!Objects.equal(refScenario, null));
    if (_notEquals) {
      EList<XtendMember> _members = refScenario.getMembers();
      Set<String> _existingFieldNames = this.getExistingFieldNames(_members);
      fieldNames = _existingFieldNames;
    } else {
      final Background refBackground = EcoreUtil2.<Background>getContainerOfType(ref, Background.class);
      boolean _notEquals_1 = (!Objects.equal(refBackground, null));
      if (_notEquals_1) {
        EList<XtendMember> _members_1 = refBackground.getMembers();
        Set<String> _existingFieldNames_1 = this.getExistingFieldNames(_members_1);
        fieldNames = _existingFieldNames_1;
      }
    }
    return fieldNames;
  }
  
  public Set<String> getExistingFieldNames(final EList<XtendMember> members) {
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
  
  public EList<XtendMember> getMembersOfReferencedStep(final Step step) {
    EList<XtendMember> _xblockexpression = null;
    {
      final Scenario scenario = EcoreUtil2.<Scenario>getContainerOfType(step, Scenario.class);
      EList<XtendMember> members = null;
      EList<XtendMember> _xifexpression = null;
      boolean _notEquals = (!Objects.equal(scenario, null));
      if (_notEquals) {
        EList<XtendMember> _members = scenario.getMembers();
        EList<XtendMember> _members_1 = members = _members;
        _xifexpression = _members_1;
      } else {
        EList<XtendMember> _xblockexpression_1 = null;
        {
          final Background refBackground = EcoreUtil2.<Background>getContainerOfType(step, Background.class);
          EList<XtendMember> _members_2 = refBackground.getMembers();
          EList<XtendMember> _members_3 = members = _members_2;
          _xblockexpression_1 = (_members_3);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public void copyFields(final EObject objectWithReference, final List<XtendMember> members, final Set<String> fieldNames) {
    for (final XtendMember member : members) {
      if ((member instanceof XtendField)) {
        final XtendField field = ((XtendField) member);
        String _name = field.getName();
        boolean _contains = fieldNames.contains(_name);
        boolean _not = (!_contains);
        if (_not) {
          final XtendField copiedMember = EcoreUtil2.<XtendField>cloneWithProxies(field);
          if ((objectWithReference instanceof Scenario)) {
            final Scenario scen = ((Scenario) objectWithReference);
            EList<XtendMember> _members = scen.getMembers();
            _members.add(copiedMember);
          }
          if ((objectWithReference instanceof Background)) {
            final Background back = ((Background) objectWithReference);
            EList<XtendMember> _members_1 = back.getMembers();
            _members_1.add(copiedMember);
          }
          String _name_1 = field.getName();
          fieldNames.add(_name_1);
        }
      }
    }
  }
}
