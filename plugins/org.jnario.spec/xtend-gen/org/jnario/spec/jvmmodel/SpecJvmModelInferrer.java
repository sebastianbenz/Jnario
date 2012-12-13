package org.jnario.spec.jvmmodel;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.jvmmodel.SyntheticNameClashResolver;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendConstructor;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.EcoreUtil2;
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
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
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
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.After;
import org.jnario.spec.spec.Before;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.jnario.spec.spec.TestFunction;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
public class SpecJvmModelInferrer extends JnarioJvmModelInferrer {
  private int exampleIndex = 0;
  
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
  @Inject
  private ImplicitSubject _implicitSubject;
  
  @Inject
  private IJvmModelAssociator _iJvmModelAssociator;
  
  @Inject
  private SyntheticNameClashResolver _syntheticNameClashResolver;
  
  public void doInfer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    boolean _not = (!(e instanceof SpecFile));
    if (_not) {
      return;
    }
    final SpecFile specFile = ((SpecFile) e);
    EList<XtendClass> _xtendClasses = specFile.getXtendClasses();
    Iterable<ExampleGroup> _filter = Iterables.<ExampleGroup>filter(_xtendClasses, ExampleGroup.class);
    final Procedure1<ExampleGroup> _function = new Procedure1<ExampleGroup>() {
        public void apply(final ExampleGroup it) {
          SpecJvmModelInferrer.this.infer(acceptor, it, null);
        }
      };
    IterableExtensions.<ExampleGroup>forEach(_filter, _function);
    this.exampleIndex = 0;
  }
  
  public JvmGenericType infer(final IJvmDeclaredTypeAcceptor acceptor, final ExampleGroup exampleGroup, final JvmGenericType superType) {
    boolean _notEquals = (!Objects.equal(superType, null));
    if (_notEquals) {
      JvmParameterizedTypeReference _createTypeRef = this._typeReferences.createTypeRef(superType);
      exampleGroup.setExtends(_createTypeRef);
    } else {
      this.addSuperClass(exampleGroup);
    }
    String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleGroup);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          String _packageName = exampleGroup.getPackageName();
          it.setPackageName(_packageName);
        }
      };
    final JvmGenericType inferredJvmType = this._extendedJvmTypesBuilder.toClass(exampleGroup, _javaClassName, _function);
    this.register(acceptor, exampleGroup, inferredJvmType);
    final ArrayList<JvmGenericType> children = CollectionLiterals.<JvmGenericType>newArrayList();
    EList<XtendMember> _members = exampleGroup.getMembers();
    Iterable<ExampleGroup> _filter = Iterables.<ExampleGroup>filter(_members, ExampleGroup.class);
    final Procedure1<ExampleGroup> _function_1 = new Procedure1<ExampleGroup>() {
        public void apply(final ExampleGroup child) {
          JvmGenericType _infer = SpecJvmModelInferrer.this.infer(acceptor, child, inferredJvmType);
          children.add(_infer);
        }
      };
    IterableExtensions.<ExampleGroup>forEach(_filter, _function_1);
    boolean _isEmpty = children.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      TestRuntimeSupport _testRuntime = this.getTestRuntime();
      _testRuntime.addChildren(exampleGroup, inferredJvmType, children);
    }
    return inferredJvmType;
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
    final ArrayList<XtendFunction> functions = CollectionLiterals.<XtendFunction>newArrayList();
    EList<XtendMember> _members = source.getMembers();
    for (final XtendMember member : _members) {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _or_2 = false;
      boolean _or_3 = false;
      if ((member instanceof XtendField)) {
        _or_3 = true;
      } else {
        _or_3 = ((member instanceof XtendField) || (member instanceof XtendConstructor));
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        _or_2 = (_or_3 || (member instanceof ExampleGroup));
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        _or_1 = (_or_2 || (member instanceof TestFunction));
      }
      if (_or_1) {
        _or = true;
      } else {
        _or = (_or_1 || (member instanceof ExampleTable));
      }
      if (_or) {
        this.transformExamples(member, inferredJvmType);
      } else {
        boolean _and = false;
        if (!(member instanceof XtendFunction)) {
          _and = false;
        } else {
          String _name = ((XtendFunction) member).getName();
          boolean _notEquals_2 = (!Objects.equal(_name, null));
          _and = ((member instanceof XtendFunction) && _notEquals_2);
        }
        if (_and) {
          functions.add(((XtendFunction) member));
        }
      }
    }
    this._implicitSubject.addImplicitSubject(inferredJvmType, ((ExampleGroup) source));
    for (final XtendFunction function : functions) {
      this.transform(function, inferredJvmType);
    }
    this.appendSyntheticDispatchMethods(source, inferredJvmType);
    this.computeInferredReturnTypes(inferredJvmType);
    EList<XAnnotation> _annotations_2 = source.getAnnotations();
    this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations_2, inferredJvmType);
    String _documentation = this._extendedJvmTypesBuilder.getDocumentation(source);
    this._extendedJvmTypesBuilder.setDocumentation(inferredJvmType, _documentation);
    this._syntheticNameClashResolver.resolveNameClashes(inferredJvmType);
  }
  
  public void register(final IJvmDeclaredTypeAcceptor acceptor, final XtendClass source, final JvmGenericType inferredJvmType) {
    this._iJvmModelAssociator.associatePrimary(source, inferredJvmType);
    IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(inferredJvmType);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          SpecJvmModelInferrer.this.initialize(source, inferredJvmType);
        }
      };
    _accept.initializeLater(_function);
  }
  
  public void transform(final XtendMember sourceMember, final JvmGenericType container) {
  }
  
  public void transformExamples(final XtendMember sourceMember, final JvmGenericType container) {
    boolean _matched = false;
    if (!_matched) {
      if (sourceMember instanceof Example) {
        final Example _example = (Example)sourceMember;
        _matched=true;
        this.transform(((Example) _example), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof Before) {
        final Before _before = (Before)sourceMember;
        _matched=true;
        this.transform(((Before) _before), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof After) {
        final After _after = (After)sourceMember;
        _matched=true;
        this.transform(((After) _after), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof ExampleTable) {
        final ExampleTable _exampleTable = (ExampleTable)sourceMember;
        _matched=true;
        this.transform(((ExampleTable) _exampleTable), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof XtendFunction) {
        final XtendFunction _xtendFunction = (XtendFunction)sourceMember;
        _matched=true;
        this.transform(((XtendFunction) _xtendFunction), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof XtendField) {
        final XtendField _xtendField = (XtendField)sourceMember;
        _matched=true;
        this.transform(((XtendField) _xtendField), container);
      }
    }
    if (!_matched) {
      if (sourceMember instanceof XtendConstructor) {
        final XtendConstructor _xtendConstructor = (XtendConstructor)sourceMember;
        _matched=true;
        this.transform(((XtendConstructor) _xtendConstructor), container);
      }
    }
  }
  
  public boolean transform(final Example element, final JvmGenericType container) {
    boolean _xblockexpression = false;
    {
      int _plus = (this.exampleIndex + 1);
      this.exampleIndex = _plus;
      final JvmOperation method = this.toMethod(element);
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
      final JvmOperation afterMethod = this.toMethod(element);
      boolean _isStatic = element.isStatic();
      if (_isStatic) {
        EList<JvmMember> _members = container.getMembers();
        JvmField _addIsExecutedField = this.addIsExecutedField(element);
        this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _addIsExecutedField);
        aroundAll.apply(((XtendMember) element), afterMethod);
      } else {
        around.apply(element, afterMethod);
      }
      EList<JvmMember> _members_1 = container.getMembers();
      boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, afterMethod);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public JvmField addIsExecutedField(final TestFunction element) {
    String _methodName = this._exampleNameProvider.toMethodName(element);
    String _plus = ("_" + _methodName);
    String _plus_1 = (_plus + "IsExecuted");
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Boolean.class, element);
    final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
        public void apply(final JvmField it) {
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                it.append(" false");
              }
            };
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setInitializer(it, _function);
          it.setStatic(true);
        }
      };
    JvmField _field = this._extendedJvmTypesBuilder.toField(element, _plus_1, _typeForName, _function);
    return _field;
  }
  
  public JvmOperation toMethod(final TestFunction element) {
    String _methodName = this._exampleNameProvider.toMethodName(element);
    JvmTypeReference _typeForName = this._typeReferences.getTypeForName(Void.TYPE, element);
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          String _documentation = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.getDocumentation(element);
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setDocumentation(it, _documentation);
          XExpression _expression = element.getExpression();
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _expression);
          EList<XAnnotation> _annotations = element.getAnnotations();
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.translateAnnotationsTo(_annotations, it);
          EList<JvmTypeReference> _exceptions = it.getExceptions();
          JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(Exception.class, element);
          SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
          SpecJvmModelInferrer.this._iJvmModelAssociator.associatePrimary(element, it);
          boolean _isStatic = element.isStatic();
          it.setStatic(_isStatic);
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(element, _methodName, _typeForName, _function);
    return _method;
  }
  
  public void configureWith(final JvmGenericType type, final EObject source, final SpecFile spec) {
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
      final SpecFile spec = this.specFile(table);
      String _javaClassName = this._exampleNameProvider.toJavaClassName(table);
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType exampleTableType) {
            EList<JvmTypeReference> _superTypes = exampleTableType.getSuperTypes();
            JvmTypeReference _typeForName = SpecJvmModelInferrer.this._typeReferences.getTypeForName(ExampleTableRow.class, table);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
            SpecJvmModelInferrer.this.configureWith(exampleTableType, table, spec);
            JvmParameterizedTypeReference _createTypeRef = SpecJvmModelInferrer.this._typeReferences.createTypeRef(exampleTableType);
            final JvmTypeReference type = SpecJvmModelInferrer.this._typeReferences.getTypeForName(org.jnario.lib.ExampleTable.class, table, _createTypeRef);
            String _javaClassName = SpecJvmModelInferrer.this._exampleNameProvider.toJavaClassName(table);
            final String initMethodName = ("_init" + _javaClassName);
            EList<JvmMember> _members = specType.getMembers();
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable a) {
                        SpecJvmModelInferrer.this.generateInitializationMethod(exampleTableType, table, a);
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
            EList<ExampleColumn> _columns = table.getColumns();
            final Procedure1<ExampleColumn> _function_3 = new Procedure1<ExampleColumn>() {
                public void apply(final ExampleColumn column) {
                  EList<JvmMember> _members = exampleTableType.getMembers();
                  JvmField _field = SpecJvmModelInferrer.this.toField(column);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _field);
                  final JvmFormalParameter jvmParam = SpecJvmModelInferrer.this.typesFactory.createJvmFormalParameter();
                  String _name = column.getName();
                  jvmParam.setName(_name);
                  JvmTypeReference _orCreateType = SpecJvmModelInferrer.this.getOrCreateType(column);
                  JvmTypeReference _cloneWithProxies = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.cloneWithProxies(_orCreateType);
                  jvmParam.setParameterType(_cloneWithProxies);
                  EList<JvmFormalParameter> _parameters = constructor.getParameters();
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, jvmParam);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmFormalParameter>associate(table, jvmParam);
                  String _name_1 = column.getName();
                  String _plus = ("this." + _name_1);
                  String _plus_1 = (_plus + " = ");
                  String _name_2 = column.getName();
                  String _plus_2 = (_plus_1 + _name_2);
                  String _plus_3 = (_plus_2 + ";");
                  assignments.add(_plus_3);
                  EList<JvmMember> _members_1 = exampleTableType.getMembers();
                  String _name_3 = column.getName();
                  String _firstUpper = Strings.toFirstUpper(_name_3);
                  String _plus_4 = ("get" + _firstUpper);
                  JvmTypeReference _orCreateType_1 = SpecJvmModelInferrer.this.getOrCreateType(column);
                  final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                      public void apply(final JvmOperation it) {
                        final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                            public void apply(final ITreeAppendable a) {
                              String _name = column.getName();
                              String _plus = ("return " + _name);
                              String _plus_1 = (_plus + ";");
                              a.append(_plus_1);
                            }
                          };
                        SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                      }
                    };
                  JvmOperation _method = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(table, _plus_4, _orCreateType_1, _function);
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_1, _method);
                }
              };
            IterableExtensions.<ExampleColumn>forEach(_columns, _function_3);
            final Procedure1<ITreeAppendable> _function_4 = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable a) {
                  String _newLine = Strings.newLine();
                  Joiner _on = Joiner.on(_newLine);
                  String _join = _on.join(assignments);
                  a.append(_join);
                }
              };
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(constructor, _function_4);
            EList<JvmMember> _members_3 = exampleTableType.getMembers();
            final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                      public void apply(final ITreeAppendable a) {
                        List<String> _columnNames = SpecJvmModelInferrer.this.columnNames(table);
                        String _join = IterableExtensions.join(_columnNames, ") ,toString(");
                        String _plus = ("return java.util.Arrays.asList(toString(" + _join);
                        String _plus_1 = (_plus + "));");
                        a.append(_plus_1);
                      }
                    };
                  SpecJvmModelInferrer.this._extendedJvmTypesBuilder.setBody(it, _function);
                }
              };
            JvmOperation _method_1 = SpecJvmModelInferrer.this._extendedJvmTypesBuilder.toMethod(table, "getCells", listType, _function_5);
            SpecJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
          }
        };
      JvmGenericType _class = this._extendedJvmTypesBuilder.toClass(spec, _javaClassName, _function);
      _xblockexpression = (_class);
    }
    return _xblockexpression;
  }
  
  public void associateTableWithSpec(final JvmGenericType type, final ExampleTable table) {
    EList<ExampleRow> _rows = table.getRows();
    for (final ExampleRow row : _rows) {
      this._extendedJvmTypesBuilder.<JvmGenericType>associate(row, type);
    }
  }
  
  public ITreeAppendable generateInitializationMethod(final JvmGenericType exampleTableType, final ExampleTable exampleTable, final ITreeAppendable appendable) {
    ITreeAppendable _xblockexpression = null;
    {
      EList<ExampleRow> _rows = exampleTable.getRows();
      for (final ExampleRow row : _rows) {
        EList<XExpression> _cells = row.getCells();
        for (final XExpression cell : _cells) {
          this.compiler.toJavaStatement(cell, appendable, true);
        }
      }
      String _fieldName = this._exampleNameProvider.toFieldName(exampleTable);
      String _plus = ("return ExampleTable.create(\"" + _fieldName);
      String _plus_1 = (_plus + "\", \n");
      appendable.append(_plus_1);
      List<String> _columnNames = this.columnNames(exampleTable);
      String _join = IterableExtensions.join(_columnNames, "\", \"");
      String _plus_2 = ("  java.util.Arrays.asList(\"" + _join);
      String _plus_3 = (_plus_2 + "\"), ");
      appendable.append(_plus_3);
      appendable.increaseIndentation();
      appendable.append("\n");
      EList<ExampleRow> _rows_1 = exampleTable.getRows();
      for (final ExampleRow row_1 : _rows_1) {
        {
          ITreeAppendable _append = appendable.append("new ");
          String _simpleName = exampleTableType.getSimpleName();
          ITreeAppendable _append_1 = _append.append(_simpleName);
          _append_1.append("(");
          EList<XExpression> _cells_1 = row_1.getCells();
          final Function1<XExpression,String> _function = new Function1<XExpression,String>() {
              public String apply(final XExpression it) {
                String _serialize = SpecJvmModelInferrer.this.serialize(it);
                String _trim = _serialize.trim();
                String _convertToJavaString = Strings.convertToJavaString(_trim);
                return _convertToJavaString;
              }
            };
          List<String> _map = ListExtensions.<XExpression, String>map(_cells_1, _function);
          String _join_1 = IterableExtensions.join(_map, "\", \"");
          String _plus_4 = ("  java.util.Arrays.asList(\"" + _join_1);
          String _plus_5 = (_plus_4 + "\"), ");
          appendable.append(_plus_5);
          EList<XExpression> _cells_2 = row_1.getCells();
          for (final XExpression cell_1 : _cells_2) {
            {
              this.compiler.toJavaExpression(cell_1, appendable);
              EList<XExpression> _cells_3 = row_1.getCells();
              XExpression _last = IterableExtensions.<XExpression>last(_cells_3);
              boolean _notEquals = (!Objects.equal(_last, cell_1));
              if (_notEquals) {
                appendable.append(", ");
              }
            }
          }
          appendable.append(")");
          EList<ExampleRow> _rows_2 = exampleTable.getRows();
          ExampleRow _last = IterableExtensions.<ExampleRow>last(_rows_2);
          boolean _notEquals = (!Objects.equal(_last, row_1));
          if (_notEquals) {
            appendable.append(",\n");
          }
        }
      }
      appendable.decreaseIndentation();
      ITreeAppendable _append = appendable.append("\n);");
      _xblockexpression = (_append);
    }
    return _xblockexpression;
  }
  
  public List<String> columnNames(final ExampleTable exampleTable) {
    EList<ExampleColumn> _columns = exampleTable.getColumns();
    final Function1<ExampleColumn,String> _function = new Function1<ExampleColumn,String>() {
        public String apply(final ExampleColumn it) {
          String _name = it==null?(String)null:it.getName();
          return _name;
        }
      };
    List<String> _map = ListExtensions.<ExampleColumn, String>map(_columns, _function);
    return _map;
  }
  
  public SpecFile specFile(final EObject context) {
    SpecFile _containerOfType = EcoreUtil2.<SpecFile>getContainerOfType(context, SpecFile.class);
    return _containerOfType;
  }
}
