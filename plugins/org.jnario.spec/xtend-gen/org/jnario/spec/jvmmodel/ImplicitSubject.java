package org.jnario.spec.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFactory;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsFactory;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.spec.jvmmodel.Constants;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.util.Nodes;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class ImplicitSubject {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  public void addImplicitSubject(final ExampleGroup exampleGroup) {
    final JvmTypeReference targetType = this.resolveTargetType(exampleGroup);
    boolean _or = false;
    boolean _equals = Objects.equal(targetType, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _eIsProxy = targetType.eIsProxy();
      _or = (_equals || _eIsProxy);
    }
    if (_or) {
      return;
    }
    boolean _hasSubject = this.hasSubject(exampleGroup);
    if (_hasSubject) {
      return;
    }
    boolean _neverUsesSubject = this.neverUsesSubject(exampleGroup);
    if (_neverUsesSubject) {
      return;
    }
    final XtendField subjectField = XtendFactory.eINSTANCE.createXtendField();
    subjectField.setName(Constants.SUBJECT_FIELD_NAME);
    subjectField.setType(targetType);
    boolean _doesNotInitializeSubject = this.doesNotInitializeSubject(exampleGroup);
    if (_doesNotInitializeSubject) {
      final XAnnotation annotation = XAnnotationsFactory.eINSTANCE.createXAnnotation();
    }
    EList<XtendMember> _members = exampleGroup.getMembers();
    _members.add(0, subjectField);
  }
  
  public JvmTypeReference resolveTargetType(final ExampleGroup exampleGroup) {
    JvmTypeReference _targetType = exampleGroup.getTargetType();
    boolean _notEquals = (!Objects.equal(_targetType, null));
    if (_notEquals) {
      JvmTypeReference _targetType_1 = exampleGroup.getTargetType();
      return this._extendedJvmTypesBuilder.cloneWithProxies(_targetType_1);
    }
    final ExampleGroup parentGroup = this.parent(exampleGroup);
    boolean _equals = Objects.equal(parentGroup, null);
    if (_equals) {
      return null;
    }
    return this.resolveTargetType(parentGroup);
  }
  
  public ExampleGroup parent(final ExampleGroup exampleGroup) {
    EObject _eContainer = exampleGroup.eContainer();
    ExampleGroup _containerOfType = EcoreUtil2.<ExampleGroup>getContainerOfType(_eContainer, ExampleGroup.class);
    return _containerOfType;
  }
  
  public boolean hasSubject(final XtendClass type) {
    EList<XtendMember> _members = type.getMembers();
    final Iterable<XtendField> fields = Iterables.<XtendField>filter(_members, XtendField.class);
    final Function1<XtendField,Boolean> _function = new Function1<XtendField,Boolean>() {
        public Boolean apply(final XtendField it) {
          String _name = it.getName();
          boolean _equals = Objects.equal(_name, Constants.SUBJECT_FIELD_NAME);
          return Boolean.valueOf(_equals);
        }
      };
    final XtendField subjectField = IterableExtensions.<XtendField>findFirst(fields, _function);
    boolean _notEquals = (!Objects.equal(subjectField, null));
    if (_notEquals) {
      return true;
    }
    EObject _eContainer = type.eContainer();
    final XtendClass extendedClass = EcoreUtil2.<XtendClass>getContainerOfType(_eContainer, XtendClass.class);
    boolean _equals = Objects.equal(extendedClass, null);
    if (_equals) {
      return false;
    }
    return this.hasSubject(extendedClass);
  }
  
  public boolean neverUsesSubject(final ExampleGroup exampleGroup) {
    Iterator<XAbstractFeatureCall> allFeatureCalls = Iterators.<XAbstractFeatureCall>emptyIterator();
    final EList<XtendMember> members = exampleGroup.getMembers();
    Iterable<XtendFunction> _filter = Iterables.<XtendFunction>filter(members, XtendFunction.class);
    for (final XtendFunction example : _filter) {
      TreeIterator<EObject> _eAllContents = example.eAllContents();
      UnmodifiableIterator<XAbstractFeatureCall> _filter_1 = Iterators.<XAbstractFeatureCall>filter(_eAllContents, XAbstractFeatureCall.class);
      Iterator<XAbstractFeatureCall> _concat = Iterators.<XAbstractFeatureCall>concat(allFeatureCalls, _filter_1);
      allFeatureCalls = _concat;
    }
    final Function1<XAbstractFeatureCall,Boolean> _function = new Function1<XAbstractFeatureCall,Boolean>() {
        public Boolean apply(final XAbstractFeatureCall it) {
          String _concreteSyntaxFeatureName = it.getConcreteSyntaxFeatureName();
          boolean _equals = Objects.equal(_concreteSyntaxFeatureName, Constants.SUBJECT_FIELD_NAME);
          return Boolean.valueOf(_equals);
        }
      };
    XAbstractFeatureCall _findFirst = IteratorExtensions.<XAbstractFeatureCall>findFirst(allFeatureCalls, _function);
    return Objects.equal(null, _findFirst);
  }
  
  public boolean doesNotInitializeSubject(final ExampleGroup exampleGroup) {
    Iterator<XAssignment> allAssignments = Iterators.<XAssignment>emptyIterator();
    final EList<XtendMember> members = exampleGroup.getMembers();
    Iterable<XtendFunction> _filter = Iterables.<XtendFunction>filter(members, XtendFunction.class);
    for (final XtendFunction example : _filter) {
      TreeIterator<EObject> _eAllContents = example.eAllContents();
      UnmodifiableIterator<XAssignment> _filter_1 = Iterators.<XAssignment>filter(_eAllContents, XAssignment.class);
      Iterator<XAssignment> _concat = Iterators.<XAssignment>concat(allAssignments, _filter_1);
      allAssignments = _concat;
    }
    final Function1<XAssignment,Boolean> _function = new Function1<XAssignment,Boolean>() {
        public Boolean apply(final XAssignment it) {
          EReference _xAbstractFeatureCall_Feature = XbasePackage.eINSTANCE.getXAbstractFeatureCall_Feature();
          final String assignable = Nodes.textForFeature(it, _xAbstractFeatureCall_Feature);
          return Boolean.valueOf(Objects.equal(assignable, Constants.SUBJECT_FIELD_NAME));
        }
      };
    XAssignment _findFirst = IteratorExtensions.<XAssignment>findFirst(allAssignments, _function);
    return Objects.equal(null, _findFirst);
  }
}
