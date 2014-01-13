/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.jvmmodel.SyntheticNameClashResolver;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendConstructor;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.jnario.ExampleCell;
import org.jnario.ExampleColumn;
import org.jnario.ExampleRow;
import org.jnario.ExampleTable;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.lib.ExampleTableRow;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.jvmmodel.ImplicitSubject;
import org.jnario.spec.jvmmodel.SpecIgnoringXtendJvmModelInferrer;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.After;
import org.jnario.spec.spec.Before;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.TestFunction;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class SpecJvmModelInferrer extends JnarioJvmModelInferrer {
  private int exampleIndex = 0;
  
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  @Extension
  private ImplicitSubject _implicitSubject;
  
  @Inject
  @Extension
  private SyntheticNameClashResolver _syntheticNameClashResolver;
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  private SpecIgnoringXtendJvmModelInferrer xtendJvmModelInferrer;
  
  private int index = 0;
  
  public void doInfer(final EObject object, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if ((!(object instanceof XtendFile))) {
      return;
    }
    final XtendFile xtendFile = ((XtendFile) object);
    this.xtendJvmModelInferrer.infer(object, acceptor, preIndexingPhase);
    final ArrayList<Runnable> doLater = CollectionLiterals.<Runnable>newArrayList();
    EList<XtendTypeDeclaration> _xtendTypes = xtendFile.getXtendTypes();
    Iterable<ExampleGroup> _filter = Iterables.<ExampleGroup>filter(_xtendTypes, ExampleGroup.class);
    for (final ExampleGroup declaration : _filter) {
      this.infer(acceptor, declaration, null, doLater, preIndexingPhase);
    }
    this.exampleIndex = 0;
    if ((!preIndexingPhase)) {
      for (final Runnable runnable : doLater) {
        runnable.run();
      }
    }
  }
  
  public JvmGenericType infer(final IJvmDeclaredTypeAcceptor acceptor, final ExampleGroup exampleGroup, final JvmGenericType superType, final List<Runnable> doLater, final boolean preIndexingPhase) {
    boolean _notEquals = (!Objects.equal(superType, null));
    if (_notEquals) {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(superType);
      exampleGroup.setExtends(_createTypeRef);
    } else {
      this.addSuperClass(exampleGroup);
    }
    final JvmGenericType javaType = this.typesFactory.createJvmGenericType();
    XtendFile _xtendFile = this.xtendFile(exampleGroup);
    this.setNameAndAssociate(_xtendFile, exampleGroup, javaType);
    acceptor.<JvmGenericType>accept(javaType);
    if ((!preIndexingPhase)) {
      final Runnable _function = new Runnable() {
        public void run() {
          SpecJvmModelInferrer.this.initialize(exampleGroup, javaType);
        }
      };
      doLater.add(_function);
    }
    final ArrayList<JvmGenericType> children = CollectionLiterals.<JvmGenericType>newArrayList();
    EList<XtendMember> _members = exampleGroup.getMembers();
    Iterable<ExampleGroup> _filter = Iterables.<ExampleGroup>filter(_members, ExampleGroup.class);
    final Procedure1<ExampleGroup> _function_1 = new Procedure1<ExampleGroup>() {
      public void apply(final ExampleGroup child) {
        JvmGenericType _infer = SpecJvmModelInferrer.this.infer(acceptor, child, javaType, doLater, preIndexingPhase);
        children.add(_infer);
      }
    };
    IterableExtensions.<ExampleGroup>forEach(_filter, _function_1);
    boolean _isEmpty = children.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TestRuntimeSupport _testRuntime = this.getTestRuntime();
      final Function1<JvmGenericType,JvmTypeReference> _function_2 = new Function1<JvmGenericType,JvmTypeReference>() {
        public JvmTypeReference apply(final JvmGenericType it) {
          JvmParameterizedTypeReference _createTypeRef = SpecJvmModelInferrer.this._typeReferences.createTypeRef(it);
          return _createTypeRef;
        }
      };
      List<JvmTypeReference> _map = ListExtensions.<JvmGenericType, JvmTypeReference>map(children, _function_2);
      _testRuntime.addChildren(exampleGroup, javaType, _map);
    }
    return javaType;
  }
  
  public void initialize(final XtendClass source, final JvmGenericType inferredJvmType) {
    inferredJvmType.setVisibility(JvmVisibility.PUBLIC);
    JvmType _findDeclaredType = this._typeReferences.findDeclaredType(SuppressWarnings.class, source);
    final JvmAnnotationType annotation = ((JvmAnnotationType) _findDeclaredType);
    boolean _notEquals = (!Objects.equal(annotation, null));
    if (_notEquals) {
      final JvmAnnotationReference suppressWarnings = this.typesFactory.createJvmAnnotationReference();
      suppressWarnings.setAnnotation(annotation);
      final JvmStringAnnotationValue annotationValue = this.typesFactory.createJvmStringAnnotationValue();
      EList<String> _values = annotationValue.getValues();
      this._extendedJvmTypesBuilder.<String>operator_add(_values, "all");
      EList<JvmAnnotationValue> _values_1 = suppressWarnings.getValues();
      _values_1.add(annotationValue);
      EList<JvmAnnotationReference> _annotations = inferredJvmType.getAnnotations();
      _annotations.add(suppressWarnings);
    }
    EList<JvmAnnotationReference> _annotations_1 = inferredJvmType.getAnnotations();
    String _describe = this._exampleNameProvider.describe(source);
    JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(source, Named.class, _describe);
    this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation);
    this.addDefaultConstructor(source, inferredJvmType);
    JvmTypeReference _extends = source.getExtends();
    boolean _equals = Objects.equal(_extends, null);
    if (_equals) {
      final JvmTypeReference typeRefToObject = this._typeReferences.getTypeForName(Object.class, source);
      boolean _notEquals_1 = (!Objects.equal(typeRefToObject, null));
      if (_notEquals_1) {
        EList<JvmTypeReference> _superTypes = inferredJvmType.getSuperTypes();
        _superTypes.add(typeRefToObject);
      }
    } else {
      EList<JvmTypeReference> _superTypes_1 = inferredJvmType.getSuperTypes();
      JvmTypeReference _extends_1 = source.getExtends();
      JvmTypeReference _cloneWithProxies = this._extendedJvmTypesBuilder.cloneWithProxies(_extends_1);
      _superTypes_1.add(_cloneWithProxies);
    }
    TestRuntimeSupport _testRuntime = this.getTestRuntime();
    _testRuntime.updateExampleGroup(source, inferredJvmType);
    EList<JvmTypeReference> _implements = source.getImplements();
    for (final JvmTypeReference intf : _implements) {
      EList<JvmTypeReference> _superTypes_2 = inferredJvmType.getSuperTypes();
      JvmTypeReference _cloneWithProxies_1 = this._extendedJvmTypesBuilder.cloneWithProxies(intf);
      _superTypes_2.add(_cloneWithProxies_1);
    }
    EList<JvmTypeParameter> _typeParameters = source.getTypeParameters();
    this.copyAndFixTypeParameters(_typeParameters, inferredJvmType);
    this.exampleIndex = 0;
    EList<XtendMember> _members = source.getMembers();
    for (final XtendMember member : _members) {
      this.transformExamples(member, inferredJvmType);
    }
    this._implicitSubject.addImplicitSubject(inferredJvmType, ((ExampleGroup) source));
    this.appendSyntheticDispatchMethods(source, inferredJvmType);
    EList<XAnnotation> _annotations_2 = source.getAnnotations();
    this.translateAnnotationsTo(_annotations_2, inferredJvmType);
    String _documentation = this._extendedJvmTypesBuilder.getDocumentation(source);
    this._extendedJvmTypesBuilder.setDocumentation(inferredJvmType, _documentation);
    this._syntheticNameClashResolver.resolveNameClashes(inferredJvmType);
  }
  
  protected void transform(final XtendMember sourceMember, final JvmGenericType container, final boolean allowDispatch) {
  }
  
  public void transformExamples(final XtendMember sourceMember, final JvmGenericType container) {
    boolean _matched = false;
    if (!_matched) {
      if (sourceMember instanceof Example) {
        _matched=true;
        this.transform(((Example) sourceMember), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof Before) {
        _matched=true;
        this.transform(((Before) sourceMember), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof After) {
        _matched=true;
        this.transform(((After) sourceMember), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof ExampleTable) {
        _matched=true;
        this.transform(((ExampleTable) sourceMember), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof XtendFunction) {
        String _name = ((XtendFunction)sourceMember).getName();
        boolean _notEquals = (!Objects.equal(_name, null));
        if (_notEquals) {
          _matched=true;
          this.transform(((XtendFunction) sourceMember), container, false);
        }
      }
    }
    if (!_matched) {
      if (sourceMember instanceof XtendField) {
        _matched=true;
        this.transform(((XtendField) sourceMember), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof XtendConstructor) {
        _matched=true;
        this.transform(((XtendConstructor) sourceMember), container);
      }
    }
  }
  
  public boolean transform(final Example element, final JvmGenericType container) {
    boolean _xblockexpression = false;
    {
      this.exampleIndex = (this.exampleIndex + 1);
      XExpression _expression = element.getExpression();
      boolean _equals = Objects.equal(_expression, null);
      if (_equals) {
        XBlockExpression _createXBlockExpression = XbaseFactory.eINSTANCE.createXBlockExpression();
        element.setExpression(_createXBlockExpression);
      }
      final JvmOperation method = this.toMethod(element, container);
      TestRuntimeSupport _testRuntime = this.getTestRuntime();
      _testRuntime.markAsTestMethod(element, method);
      boolean _isPending = element.isPending();
      if (_isPending) {
        TestRuntimeSupport _testRuntime_1 = this.getTestRuntime();
        _testRuntime_1.markAsPending(element, method);
      }
      EList<JvmAnnotationReference> _annotations = method.getAnnotations();
      String _describe = this._exampleNameProvider.describe(element);
      JvmAnnotationReference _annotation = this._extendedJvmTypesBuilder.toAnnotation(element, Named.class, _describe);
      this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
      EList<JvmAnnotationReference> _annotations_1 = method.getAnnotations();
      JvmAnnotationReference _annotation_1 = this._extendedJvmTypesBuilder.toAnnotation(element, Order.class, Integer.valueOf(this.exampleIndex));
      this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations_1, _annotation_1);
      EList<JvmMember> _members = container.getMembers();
      boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, method);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public boolean transform(final Before element, final JvmGenericType container) {
    final Procedure2<XtendMember,JvmOperation> _function = new Procedure2<XtendMember,JvmOperation>() {
      public void apply(final XtendMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.beforeMethod(e, m);
      }
    };
    final Procedure2<XtendMember,JvmOperation> _function_1 = new Procedure2<XtendMember,JvmOperation>() {
      public void apply(final XtendMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.beforeAllMethod(e, m);
      }
    };
    boolean _transformAround = this.transformAround(element, container, _function, _function_1);
    return _transformAround;
  }
  
  public boolean transform(final After element, final JvmGenericType container) {
    final Procedure2<XtendMember,JvmOperation> _function = new Procedure2<XtendMember,JvmOperation>() {
      public void apply(final XtendMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.afterMethod(e, m);
      }
    };
    final Procedure2<XtendMember,JvmOperation> _function_1 = new Procedure2<XtendMember,JvmOperation>() {
      public void apply(final XtendMember e, final JvmOperation m) {
        TestRuntimeSupport _testRuntime = SpecJvmModelInferrer.this.getTestRuntime();
        _testRuntime.afterAllMethod(e, m);
      }
    };
    boolean _transformAround = this.transformAround(element, container, _function, _function_1);
    return _transformAround;
  }
  
  public boolean transformAround(final TestFunction element, final JvmGenericType container, final Procedure2<XtendMember,JvmOperation> around, final Procedure2<XtendMember,JvmOperation> aroundAll) {
    boolean _xblockexpression = false;
    {
      final JvmOperation afterMethod = this.toMethod(element, container);
      boolean _isStatic = element.isStatic();
      if (_isStatic) {
        aroundAll.apply(((XtendMember) element), afterMethod);
      } else {
        around.apply(element, afterMethod);
      }
      EList<JvmMember> _members = container.getMembers();
      boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, afterMethod);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public JvmOperation toMethod(final TestFunction element, final JvmGenericType container) {
    JvmOperation _xblockexpression = null;
    {
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, element);
      element.setReturnType(_typeForName);
      super.transform(element, container, true);
      Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(element);
      EObject _head = IterableExtensions.<EObject>head(_jvmElements);
      final JvmOperation result = ((JvmOperation) _head);
      String _methodName = this._exampleNameProvider.toMethodName(element);
      result.setSimpleName(_methodName);
      EList<JvmTypeReference> _exceptions = result.getExceptions();
      JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName(Exception.class, element);
      this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName_1);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public void configureWith(final JvmGenericType type, final EObject source, final XtendFile spec) {
    Resource _eResource = spec.eResource();
    EList<EObject> _contents = _eResource.getContents();
    this._extendedJvmTypesBuilder.<JvmGenericType>operator_add(_contents, type);
    String _package = spec.getPackage();
    type.setPackageName(_package);
    String _documentation = this._extendedJvmTypesBuilder.getDocumentation(source);
    this._extendedJvmTypesBuilder.setDocumentation(type, _documentation);
  }
  
  public JvmGenericType transform(final ExampleTable table, final JvmGenericType specType) {
    JvmGenericType _xblockexpression = null;
    {
      this.associateTableWithSpec(specType, table);
      XtendFile _xtendFile = this.xtendFile(table);
      String _javaClassName = this._exampleNameProvider.toJavaClassName(table);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType exampleTableType) {
          EList<JvmTypeReference> _superTypes = exampleTableType.getSuperTypes();
          JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(ExampleTableRow.class, table);
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
          XtendFile _xtendFile = SpecJvmModelInferrer.this.xtendFile(table);
          SpecJvmModelInferrer.this.configureWith(exampleTableType, table, _xtendFile);
          JvmParameterizedTypeReference _createTypeRef = SpecJvmModelInferrer.this._typeReferences.createTypeRef(exampleTableType);
          final JvmTypeReference type = SpecJvmModelInferrer.this._typeReferences.getTypeForName(org.jnario.lib.ExampleTable.class, table, _createTypeRef);
          String _javaClassName = SpecJvmModelInferrer.this._exampleNameProvider.toJavaClassName(table);
          final String initMethodName = ("_init" + _javaClassName);
          EList<JvmMember> _members = specType.getMembers();
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable a) {
                  SpecJvmModelInferrer.this.generateInitializationMethod(table, a);
                }
              };
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
            }
          };
          JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(table, initMethodName, type, _function);
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
          EList<JvmMember> _members_1 = specType.getMembers();
          String _fieldName = SpecJvmModelInferrer.this._exampleNameProvider.toFieldName(table);
          final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
              it.setVisibility(JvmVisibility.PROTECTED);
              final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  ITreeAppendable _append = it.append(initMethodName);
                  _append.append("()");
                }
              };
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setInitializer(it, _function);
            }
          };
          JvmField _field = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toField(table, _fieldName, type, _function_1);
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
          final Procedure1<JvmConstructor> _function_2 = new Procedure1<JvmConstructor>() {
            public void apply(final JvmConstructor it) {
              String _simpleName = exampleTableType.getSimpleName();
              it.setSimpleName(_simpleName);
            }
          };
          final JvmConstructor constructor = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toConstructor(table, _function_2);
          EList<JvmMember> _members_2 = exampleTableType.getMembers();
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members_2, constructor);
          final ArrayList<String> assignments = CollectionLiterals.<String>newArrayList();
          final JvmTypeReference stringType = SpecJvmModelInferrer.this._typeReferences.getTypeForName(String.class, table);
          final JvmTypeReference listType = SpecJvmModelInferrer.this._typeReferences.getTypeForName(List.class, table, stringType);
          final JvmFormalParameter cellNames = SpecJvmModelInferrer.this.typesFactory.createJvmFormalParameter();
          cellNames.setName("cellNames");
          cellNames.setParameterType(listType);
          EList<JvmFormalParameter> _parameters = constructor.getParameters();
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, cellNames);
          assignments.add("super(cellNames);");
          SpecJvmModelInferrer.this.index = 0;
          EList<ExampleColumn> _columns = table.getColumns();
          final Procedure1<ExampleColumn> _function_3 = new Procedure1<ExampleColumn>() {
            public void apply(final ExampleColumn column) {
              JvmTypeReference _xifexpression = null;
              JvmTypeReference _type = column.getType();
              boolean _notEquals = (!Objects.equal(_type, null));
              if (_notEquals) {
                JvmTypeReference _type_1 = column.getType();
                _xifexpression = _type_1;
              } else {
                JvmTypeReference _inferredType = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.inferredType();
                _xifexpression = _inferredType;
              }
              final JvmTypeReference columnType = _xifexpression;
              EList<JvmMember> _members = exampleTableType.getMembers();
              String _name = column.getName();
              JvmTypeReference _cloneWithProxies = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(columnType);
              JvmField _field = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toField(column, _name, _cloneWithProxies);
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _field);
              String _name_1 = column.getName();
              JvmTypeReference _cloneWithProxies_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(columnType);
              final JvmFormalParameter param = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toParameter(column, _name_1, _cloneWithProxies_1);
              EList<JvmFormalParameter> _parameters = constructor.getParameters();
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, param);
              String _name_2 = column.getName();
              JvmTypeReference _cloneWithProxies_2 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(columnType);
              final JvmOperation getter = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toGetter(column, _name_2, _cloneWithProxies_2);
              EList<JvmMember> _members_1 = exampleTableType.getMembers();
              SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, getter);
              String _name_3 = column.getName();
              String _plus = ("this." + _name_3);
              String _plus_1 = (_plus + " = ");
              String _name_4 = column.getName();
              String _plus_2 = (_plus_1 + _name_4);
              String _plus_3 = (_plus_2 + ";");
              assignments.add(_plus_3);
            }
          };
          IterableExtensions.<ExampleColumn>forEach(_columns, _function_3);
          EList<ExampleRow> _rows = table.getRows();
          final Procedure1<ExampleRow> _function_4 = new Procedure1<ExampleRow>() {
            public void apply(final ExampleRow it) {
              EList<ExampleCell> _cells = it.getCells();
              final Procedure1<ExampleCell> _function = new Procedure1<ExampleCell>() {
                public void apply(final ExampleCell it) {
                  String _initMethodName = SpecJvmModelInferrer.this.initMethodName(table, SpecJvmModelInferrer.this.index);
                  SpecJvmModelInferrer.this.generateCellInitializerMethod(specType, _initMethodName, it);
                  SpecJvmModelInferrer.this.index = (SpecJvmModelInferrer.this.index + 1);
                }
              };
              IterableExtensions.<ExampleCell>forEach(_cells, _function);
            }
          };
          IterableExtensions.<ExampleRow>forEach(_rows, _function_4);
          final Procedure1<ITreeAppendable> _function_5 = new Procedure1<ITreeAppendable>() {
            public void apply(final ITreeAppendable a) {
              final Procedure1<String> _function = new Procedure1<String>() {
                public void apply(final String it) {
                  ITreeAppendable _append = a.append(it);
                  _append.newLine();
                }
              };
              IterableExtensions.<String>forEach(assignments, _function);
            }
          };
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(constructor, _function_5);
        }
      };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(_xtendFile, _javaClassName, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public void generateInitializationMethod(final ExampleTable exampleTable, final ITreeAppendable appendable) {
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Arrays.class, exampleTable);
    final JvmType arraysType = _typeForName.getType();
    String _fieldName = this._exampleNameProvider.toFieldName(exampleTable);
    String _plus = ("return ExampleTable.create(\"" + _fieldName);
    String _plus_1 = (_plus + "\", \n");
    appendable.append(_plus_1);
    ITreeAppendable _append = appendable.append("  ");
    ITreeAppendable _append_1 = _append.append(arraysType);
    ITreeAppendable _append_2 = _append_1.append(".asList(\"");
    List<String> _columnNames = this.columnNames(exampleTable);
    String _join = IterableExtensions.join(_columnNames, "\", \"");
    String _plus_2 = (_join + "\"), ");
    _append_2.append(_plus_2);
    appendable.increaseIndentation();
    appendable.append("\n");
    this.index = 0;
    EList<ExampleRow> _rows = exampleTable.getRows();
    for (final ExampleRow row : _rows) {
      {
        ITreeAppendable _append_3 = appendable.append("new ");
        String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleTable);
        ITreeAppendable _append_4 = _append_3.append(_javaClassName);
        _append_4.append("(");
        ITreeAppendable _append_5 = appendable.append("  ");
        ITreeAppendable _append_6 = _append_5.append(arraysType);
        EList<ExampleCell> _cells = row.getCells();
        final Function1<ExampleCell,String> _function = new Function1<ExampleCell,String>() {
          public String apply(final ExampleCell it) {
            String _serialize = SpecJvmModelInferrer.this.serialize(it);
            String _trim = _serialize.trim();
            String _convertToJavaString = Strings.convertToJavaString(_trim);
            return _convertToJavaString;
          }
        };
        List<String> _map = ListExtensions.<ExampleCell, String>map(_cells, _function);
        String _join_1 = IterableExtensions.join(_map, "\", \"");
        String _plus_3 = (".asList(\"" + _join_1);
        String _plus_4 = (_plus_3 + "\"), ");
        _append_6.append(_plus_4);
        EList<ExampleCell> _cells_1 = row.getCells();
        for (final ExampleCell cell : _cells_1) {
          {
            XExpression _expression = cell.getExpression();
            if ((_expression instanceof XNullLiteral)) {
              appendable.append("null");
            } else {
              String _initMethodName = this.initMethodName(exampleTable, this.index);
              String _plus_5 = (_initMethodName + "()");
              appendable.append(_plus_5);
            }
            this.index = (this.index + 1);
            EList<ExampleCell> _cells_2 = row.getCells();
            ExampleCell _last = IterableExtensions.<ExampleCell>last(_cells_2);
            boolean _notEquals = (!Objects.equal(_last, cell));
            if (_notEquals) {
              appendable.append(", ");
            }
          }
        }
        appendable.append(")");
        EList<ExampleRow> _rows_1 = exampleTable.getRows();
        ExampleRow _last = IterableExtensions.<ExampleRow>last(_rows_1);
        boolean _notEquals = (!Objects.equal(_last, row));
        if (_notEquals) {
          appendable.append(",\n");
        }
      }
    }
    appendable.decreaseIndentation();
    appendable.append("\n);");
  }
  
  public void associateTableWithSpec(final JvmGenericType type, final ExampleTable table) {
    EList<ExampleRow> _rows = table.getRows();
    for (final ExampleRow row : _rows) {
      this._extendedJvmTypesBuilder.<JvmGenericType>associate(row, type);
    }
  }
  
  public String initMethodName(final ExampleTable exampleTable, final int i) {
    String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleTable);
    String _plus = ("_init" + _javaClassName);
    String _plus_1 = (_plus + "Cell");
    String _plus_2 = (_plus_1 + Integer.valueOf(i));
    return _plus_2;
  }
  
  public boolean generateCellInitializerMethod(final JvmGenericType specType, final String name, final ExampleCell cell) {
    EList<JvmMember> _members = specType.getMembers();
    JvmTypeReference _inferredType = this._extendedJvmTypesBuilder.inferredType();
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
      public void apply(final JvmOperation it) {
        XExpression _expression = cell.getExpression();
        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _expression);
      }
    };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(cell, name, _inferredType, _function);
    boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    return _add;
  }
  
  public List<String> columnNames(final ExampleTable exampleTable) {
    EList<ExampleColumn> _columns = exampleTable.getColumns();
    final Function1<ExampleColumn,String> _function = new Function1<ExampleColumn,String>() {
      public String apply(final ExampleColumn it) {
        String _name = null;
        if (it!=null) {
          _name=it.getName();
        }
        return _name;
      }
    };
    List<String> _map = ListExtensions.<ExampleColumn, String>map(_columns, _function);
    return _map;
  }
}
