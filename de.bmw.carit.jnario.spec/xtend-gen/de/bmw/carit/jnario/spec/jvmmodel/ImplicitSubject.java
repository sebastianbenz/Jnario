package de.bmw.carit.jnario.spec.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Inject;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.spec.jvmmodel.Constants;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.TestFunction;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xtend2.xtend2.XtendFunction;
import org.eclipse.xtext.xtend2.xtend2.XtendMember;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class ImplicitSubject {
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  public void addImplicitSubject(final JvmGenericType type, final ExampleGroup exampleGroup) {
      JvmTypeReference _resolveTargetType = this.resolveTargetType(exampleGroup);
      final JvmTypeReference targetType = _resolveTargetType;
      boolean _operator_or = false;
      boolean _operator_equals = ObjectExtensions.operator_equals(targetType, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        boolean _eIsProxy = targetType.eIsProxy();
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _eIsProxy);
      }
      if (_operator_or) {
        return;
      }
      boolean _hasSubject = this.hasSubject(type);
      if (_hasSubject) {
        return;
      }
      boolean _neverUsesSubject = this.neverUsesSubject(exampleGroup);
      if (_neverUsesSubject) {
        return;
      }
      EList<JvmMember> _members = type.getMembers();
      final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            {
              EList<JvmAnnotationReference> _annotations = it.getAnnotations();
              JvmAnnotationReference _annotation = ImplicitSubject.this._extendedJvmTypesBuilder.toAnnotation(exampleGroup, de.bmw.carit.jnario.runner.Subject.class);
              CollectionExtensions.<JvmAnnotationReference>operator_add(_annotations, _annotation);
              it.setVisibility(JvmVisibility.PUBLIC);
            }
          }
        };
      JvmField _field = this._extendedJvmTypesBuilder.toField(exampleGroup, Constants.SUBJECT_FIELD_NAME, targetType, _function);
      _members.add(0, _field);
  }
  
  public JvmTypeReference resolveTargetType(final ExampleGroup exampleGroup) {
      JvmTypeReference _targetType = exampleGroup.getTargetType();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_targetType, null);
      if (_operator_notEquals) {
        JvmTypeReference _targetType_1 = exampleGroup.getTargetType();
        JvmTypeReference _cloneWithProxies = this._extendedJvmTypesBuilder.cloneWithProxies(_targetType_1);
        return _cloneWithProxies;
      }
      EObject _eContainer = exampleGroup.eContainer();
      ExampleGroup _containerOfType = EcoreUtil2.<ExampleGroup>getContainerOfType(_eContainer, de.bmw.carit.jnario.spec.spec.ExampleGroup.class);
      final ExampleGroup parentGroup = _containerOfType;
      boolean _operator_equals = ObjectExtensions.operator_equals(parentGroup, null);
      if (_operator_equals) {
        return null;
      }
      JvmTypeReference _resolveTargetType = this.resolveTargetType(parentGroup);
      return _resolveTargetType;
  }
  
  public boolean hasSubject(final JvmGenericType type) {
      EList<JvmMember> _members = type.getMembers();
      Iterable<JvmField> _filter = Iterables.<JvmField>filter(_members, org.eclipse.xtext.common.types.JvmField.class);
      final Iterable<JvmField> fields = _filter;
      final Function1<JvmField,Boolean> _function = new Function1<JvmField,Boolean>() {
          public Boolean apply(final JvmField it) {
            String _simpleName = it.getSimpleName();
            boolean _operator_equals = ObjectExtensions.operator_equals(_simpleName, Constants.SUBJECT_FIELD_NAME);
            return Boolean.valueOf(_operator_equals);
          }
        };
      JvmField _findFirst = IterableExtensions.<JvmField>findFirst(fields, _function);
      final JvmField subjectField = _findFirst;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(subjectField, null);
      if (_operator_notEquals) {
        return true;
      }
      JvmTypeReference _extendedClass = type.getExtendedClass();
      JvmType _type = _extendedClass==null?(JvmType)null:_extendedClass.getType();
      final JvmType extendedClass = _type;
      boolean _operator_equals = ObjectExtensions.operator_equals(extendedClass, null);
      if (_operator_equals) {
        return false;
      }
      boolean _hasSubject = this.hasSubject(((JvmGenericType) extendedClass));
      return _hasSubject;
  }
  
  public boolean neverUsesSubject(final ExampleGroup exampleGroup) {
      UnmodifiableIterator<XMemberFeatureCall> _emptyIterator = Iterators.<XMemberFeatureCall>emptyIterator();
      Iterator<XMemberFeatureCall> allFeatureCalls = _emptyIterator;
      EList<XtendMember> _members = exampleGroup.getMembers();
      final EList<XtendMember> members = _members;
      Iterable<XtendFunction> _filter = Iterables.<XtendFunction>filter(members, org.eclipse.xtext.xtend2.xtend2.XtendFunction.class);
      for (final XtendFunction example : _filter) {
        TreeIterator<EObject> _eAllContents = example.eAllContents();
        UnmodifiableIterator<XMemberFeatureCall> _filter_1 = Iterators.<XMemberFeatureCall>filter(_eAllContents, org.eclipse.xtext.xbase.XMemberFeatureCall.class);
        Iterator<XMemberFeatureCall> _concat = Iterators.<XMemberFeatureCall>concat(allFeatureCalls, _filter_1);
        allFeatureCalls = _concat;
      }
      Iterable<TestFunction> _filter_2 = Iterables.<TestFunction>filter(members, de.bmw.carit.jnario.spec.spec.TestFunction.class);
      for (final TestFunction example_1 : _filter_2) {
        TreeIterator<EObject> _eAllContents_1 = example_1.eAllContents();
        UnmodifiableIterator<XMemberFeatureCall> _filter_3 = Iterators.<XMemberFeatureCall>filter(_eAllContents_1, org.eclipse.xtext.xbase.XMemberFeatureCall.class);
        Iterator<XMemberFeatureCall> _concat_1 = Iterators.<XMemberFeatureCall>concat(allFeatureCalls, _filter_3);
        allFeatureCalls = _concat_1;
      }
      final Function1<XMemberFeatureCall,Boolean> _function = new Function1<XMemberFeatureCall,Boolean>() {
          public Boolean apply(final XMemberFeatureCall call) {
            {
              XExpression _memberCallTarget = call.getMemberCallTarget();
              boolean _operator_equals = ObjectExtensions.operator_equals(_memberCallTarget, null);
              if (_operator_equals) {
                return Boolean.valueOf(false);
              }
              XExpression _memberCallTarget_1 = call.getMemberCallTarget();
              boolean _operator_not = BooleanExtensions.operator_not((_memberCallTarget_1 instanceof XFeatureCall));
              if (_operator_not) {
                return Boolean.valueOf(false);
              }
              XExpression _memberCallTarget_2 = call.getMemberCallTarget();
              final XFeatureCall featureCall = ((XFeatureCall) _memberCallTarget_2);
              String _concreteSyntaxFeatureName = featureCall.getConcreteSyntaxFeatureName();
              boolean _operator_equals_1 = ObjectExtensions.operator_equals(_concreteSyntaxFeatureName, Constants.SUBJECT_FIELD_NAME);
              return Boolean.valueOf(_operator_equals_1);
            }
          }
        };
      XMemberFeatureCall _findFirst = IteratorExtensions.<XMemberFeatureCall>findFirst(allFeatureCalls, _function);
      boolean _operator_equals = ObjectExtensions.operator_equals(null, _findFirst);
      return _operator_equals;
  }
}
