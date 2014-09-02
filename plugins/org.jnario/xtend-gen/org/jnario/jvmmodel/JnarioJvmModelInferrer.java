/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.NoSuchElementException;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.jvmmodel.TestRuntimeProvider;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.runner.Extends;

/**
 * @author Birgit Engelmann
 * @author Sebastian Benz
 */
@SuppressWarnings("all")
public class JnarioJvmModelInferrer extends XtendJvmModelInferrer {
  @Inject
  public XbaseCompiler compiler;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  private TestRuntimeProvider runtime;
  
  @Inject
  @Extension
  private JnarioNameProvider _jnarioNameProvider;
  
  private TestRuntimeSupport testRuntime;
  
  @Inject
  @Extension
  private JvmTypesBuilder jvmTypesBuilder;
  
  public void infer(final EObject obj, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    try {
      TestRuntimeSupport _get = this.runtime.get(obj);
      this.testRuntime = _get;
    } catch (final Throwable _t) {
      if (_t instanceof NoSuchElementException) {
        final NoSuchElementException ex = (NoSuchElementException)_t;
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    this.doInfer(obj, acceptor, preIndexingPhase);
  }
  
  public void doInfer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    throw new UnsupportedOperationException();
  }
  
  protected void transform(final XtendField source, final JvmGenericType container) {
    super.transform(source, container);
    Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(source);
    EObject _head = IterableExtensions.<EObject>head(_jvmElements);
    final JvmField field = ((JvmField) _head);
    boolean _equals = Objects.equal(field, null);
    if (_equals) {
      return;
    }
    JvmVisibility _visibility = field.getVisibility();
    boolean _equals_1 = Objects.equal(_visibility, JvmVisibility.PRIVATE);
    if (_equals_1) {
      field.setVisibility(JvmVisibility.DEFAULT);
    }
    boolean _isExtension = source.isExtension();
    if (_isExtension) {
      field.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmAnnotationReference> _annotations = field.getAnnotations();
      JvmAnnotationReference _annotation = this.jvmTypesBuilder.toAnnotation(source, org.jnario.runner.Extension.class);
      this.jvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
    }
  }
  
  public String serialize(final EObject obj) {
    ICompositeNode _node = NodeModelUtils.getNode(obj);
    String _text = null;
    if (_node!=null) {
      _text=_node.getText();
    }
    return _text;
  }
  
  public XtendFile xtendFile(final EObject obj) {
    return EcoreUtil2.<XtendFile>getContainerOfType(obj, XtendFile.class);
  }
  
  public String packageName(final EObject obj) {
    XtendFile _xtendFile = this.xtendFile(obj);
    String _package = null;
    if (_xtendFile!=null) {
      _package=_xtendFile.getPackage();
    }
    return _package;
  }
  
  protected TestRuntimeSupport getTestRuntime() {
    return this.testRuntime;
  }
  
  protected void addSuperClass(final XtendClass xtendClass) {
    EObject xtendType = xtendClass;
    while (((!Objects.equal(xtendType, null)) && (xtendType instanceof XtendClass))) {
      {
        final XtendClass current = ((XtendClass) xtendType);
        EList<XAnnotation> _annotations = current.getAnnotations();
        final Function1<XAnnotation, Boolean> _function = new Function1<XAnnotation, Boolean>() {
          public Boolean apply(final XAnnotation it) {
            return Boolean.valueOf(JnarioJvmModelInferrer.this.hasExtendsAnnotation(it));
          }
        };
        Iterable<XAnnotation> _filter = IterableExtensions.<XAnnotation>filter(_annotations, _function);
        final Function1<XAnnotation, XTypeLiteral> _function_1 = new Function1<XAnnotation, XTypeLiteral>() {
          public XTypeLiteral apply(final XAnnotation it) {
            XExpression _value = it.getValue();
            return ((XTypeLiteral) _value);
          }
        };
        Iterable<XTypeLiteral> _map = IterableExtensions.<XAnnotation, XTypeLiteral>map(_filter, _function_1);
        for (final XTypeLiteral extendedType : _map) {
          boolean _and = false;
          EList<JvmTypeReference> _implements = current.getImplements();
          boolean _isEmpty = _implements.isEmpty();
          if (!_isEmpty) {
            _and = false;
          } else {
            JvmType _type = extendedType.getType();
            boolean _notEquals = (!Objects.equal(_type, null));
            _and = _notEquals;
          }
          if (_and) {
            JvmType _type_1 = extendedType.getType();
            JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(_type_1);
            xtendClass.setExtends(_createTypeRef);
            return;
          }
        }
        EObject _eContainer = xtendType.eContainer();
        xtendType = _eContainer;
      }
    }
  }
  
  protected boolean hasExtendsAnnotation(final XAnnotation annotation) {
    boolean _and = false;
    JvmType _annotationType = annotation.getAnnotationType();
    String _qualifiedName = null;
    if (_annotationType!=null) {
      _qualifiedName=_annotationType.getQualifiedName();
    }
    String _name = Extends.class.getName();
    boolean _equals = Objects.equal(_qualifiedName, _name);
    if (!_equals) {
      _and = false;
    } else {
      XExpression _value = annotation.getValue();
      _and = (_value instanceof XTypeLiteral);
    }
    return _and;
  }
  
  protected void setNameAndAssociate(final XtendFile file, final XtendTypeDeclaration xtendType, final JvmDeclaredType javaType) {
    super.setNameAndAssociate(file, xtendType, javaType);
    String _javaClassName = this._jnarioNameProvider.toJavaClassName(xtendType);
    javaType.setSimpleName(_javaClassName);
  }
}
