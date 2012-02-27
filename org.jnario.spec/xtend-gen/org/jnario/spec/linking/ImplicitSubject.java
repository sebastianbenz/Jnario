package org.jnario.spec.linking;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.BasicEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.xtend.XtendFactory;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendParameter;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.spec.jvmmodel.Constants;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.TestFunction;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class ImplicitSubject {
  public void addImplicitSubject(final ExampleGroup exampleGroup) {
      JvmTypeReference _resolveTargetType = this.resolveTargetType(exampleGroup);
      final JvmTypeReference targetType = _resolveTargetType;
      boolean _operator_equals = ObjectExtensions.operator_equals(targetType, null);
      if (_operator_equals) {
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
      XtendField _createXtendField = XtendFactory.eINSTANCE.createXtendField();
      final XtendField subjectField = _createXtendField;
      subjectField.setName(Constants.SUBJECT_FIELD_NAME);
      subjectField.setType(targetType);
      XtendParameter _createXtendParameter = XtendFactory.eINSTANCE.createXtendParameter();
      subjectField.setAnnotationInfo(_createXtendParameter);
      EList<XtendMember> _members = exampleGroup.getMembers();
      _members.add(0, subjectField);
  }
  
  public JvmTypeReference resolveTargetType(final ExampleGroup exampleGroup) {
      JvmTypeReference _targetType = exampleGroup.getTargetType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_targetType, null);
      if (_operator_notEquals) {
        {
          JvmTypeReference _targetType_1 = exampleGroup.getTargetType();
          EClass _eClass = _targetType_1.eClass();
          EObject _create = EcoreUtil.create(_eClass);
          final InternalEObject proxy = ((BasicEObjectImpl) _create);
          JvmTypeReference _targetType_2 = exampleGroup.getTargetType();
          final InternalEObject source = ((InternalEObject) _targetType_2);
          URI _eProxyURI = source.eProxyURI();
          proxy.eSetProxyURI(_eProxyURI);
          return ((JvmTypeReference) proxy);
        }
      }
      EObject _eContainer = exampleGroup.eContainer();
      ExampleGroup _containerOfType = EcoreUtil2.<ExampleGroup>getContainerOfType(_eContainer, org.jnario.spec.spec.ExampleGroup.class);
      final ExampleGroup parentGroup = _containerOfType;
      boolean _operator_equals = ObjectExtensions.operator_equals(parentGroup, null);
      if (_operator_equals) {
        return null;
      }
      JvmTypeReference _resolveTargetType = this.resolveTargetType(parentGroup);
      return _resolveTargetType;
  }
  
  public boolean hasSubject(final ExampleGroup type) {
      EList<XtendMember> _members = type.getMembers();
      Iterable<XtendField> _filter = Iterables.<XtendField>filter(_members, org.eclipse.xtend.core.xtend.XtendField.class);
      final Iterable<XtendField> fields = _filter;
      final Function1<XtendField,Boolean> _function = new Function1<XtendField,Boolean>() {
          public Boolean apply(final XtendField it) {
            String _name = it.getName();
            boolean _operator_equals = ObjectExtensions.operator_equals(_name, Constants.SUBJECT_FIELD_NAME);
            return Boolean.valueOf(_operator_equals);
          }
        };
      XtendField _findFirst = IterableExtensions.<XtendField>findFirst(fields, _function);
      final XtendField subjectField = _findFirst;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(subjectField, null);
      if (_operator_notEquals) {
        return true;
      }
      EObject _eContainer = type.eContainer();
      ExampleGroup _containerOfType = EcoreUtil2.<ExampleGroup>getContainerOfType(_eContainer, org.jnario.spec.spec.ExampleGroup.class);
      final ExampleGroup extendedClass = _containerOfType;
      boolean _operator_equals = ObjectExtensions.operator_equals(extendedClass, null);
      if (_operator_equals) {
        return false;
      }
      boolean _hasSubject = this.hasSubject(extendedClass);
      return _hasSubject;
  }
  
  public boolean neverUsesSubject(final ExampleGroup exampleGroup) {
      UnmodifiableIterator<XFeatureCall> _emptyIterator = Iterators.<XFeatureCall>emptyIterator();
      Iterator<XFeatureCall> allFeatureCalls = _emptyIterator;
      EList<XtendMember> _members = exampleGroup.getMembers();
      final EList<XtendMember> members = _members;
      Iterable<XtendFunction> _filter = Iterables.<XtendFunction>filter(members, org.eclipse.xtend.core.xtend.XtendFunction.class);
      for (final XtendFunction example : _filter) {
        TreeIterator<EObject> _eAllContents = example.eAllContents();
        UnmodifiableIterator<XFeatureCall> _filter_1 = Iterators.<XFeatureCall>filter(_eAllContents, org.eclipse.xtext.xbase.XFeatureCall.class);
        Iterator<XFeatureCall> _concat = Iterators.<XFeatureCall>concat(allFeatureCalls, _filter_1);
        allFeatureCalls = _concat;
      }
      Iterable<TestFunction> _filter_2 = Iterables.<TestFunction>filter(members, org.jnario.spec.spec.TestFunction.class);
      for (final TestFunction example_1 : _filter_2) {
        TreeIterator<EObject> _eAllContents_1 = example_1.eAllContents();
        UnmodifiableIterator<XFeatureCall> _filter_3 = Iterators.<XFeatureCall>filter(_eAllContents_1, org.eclipse.xtext.xbase.XFeatureCall.class);
        Iterator<XFeatureCall> _concat_1 = Iterators.<XFeatureCall>concat(allFeatureCalls, _filter_3);
        allFeatureCalls = _concat_1;
      }
      final Function1<XFeatureCall,Boolean> _function = new Function1<XFeatureCall,Boolean>() {
          public Boolean apply(final XFeatureCall it) {
            String _concreteSyntaxFeatureName = it.getConcreteSyntaxFeatureName();
            boolean _operator_equals = ObjectExtensions.operator_equals(_concreteSyntaxFeatureName, Constants.SUBJECT_FIELD_NAME);
            return Boolean.valueOf(_operator_equals);
          }
        };
      XFeatureCall _findFirst = IteratorExtensions.<XFeatureCall>findFirst(allFeatureCalls, _function);
      boolean _operator_equals = ObjectExtensions.operator_equals(null, _findFirst);
      return _operator_equals;
  }
}
