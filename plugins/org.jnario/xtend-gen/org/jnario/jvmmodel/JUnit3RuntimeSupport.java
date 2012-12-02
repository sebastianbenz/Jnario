package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.Executable;
import org.jnario.Specification;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.jvmmodel.TestRuntimeSupport;

@SuppressWarnings("all")
public class JUnit3RuntimeSupport implements TestRuntimeSupport {
  @Inject
  private TypeReferences _typeReferences;
  
  @Inject
  private JnarioNameProvider _jnarioNameProvider;
  
  @Inject
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  public void afterAllMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void afterMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void beforeAllMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void beforeMethod(final XtendMember before, final JvmOperation operation) {
  }
  
  public void markAsPending(final Executable element, final JvmOperation operation) {
  }
  
  public void addChildren(final Specification context, final JvmGenericType parent, final Collection<JvmGenericType> children) {
    EClass _eClass = context.eClass();
    String _name = _eClass.getName();
    boolean _equals = Objects.equal(_name, "Suite");
    if (_equals) {
      final Function1<JvmGenericType,String> _function = new Function1<JvmGenericType,String>() {
          public String apply(final JvmGenericType it) {
            String _simpleName = it.getSimpleName();
            return _simpleName;
          }
        };
      Iterable<String> _map = IterableExtensions.<JvmGenericType, String>map(children, _function);
      List<Executable> _emptyList = CollectionLiterals.<Executable>emptyList();
      this.addSuite(parent, context, _map, _emptyList);
    }
  }
  
  public void updateExampleGroup(final XtendClass exampleGroup, final JvmGenericType inferredType) {
    this.makeTestCase(exampleGroup, inferredType);
    this.addTestCase(inferredType, exampleGroup);
    Iterable<String> _children = this.children(exampleGroup);
    Iterable<Executable> _examples = this.examples(exampleGroup);
    this.addSuite(inferredType, exampleGroup, _children, _examples);
    Iterable<XtendFunction> _befores = this.befores(exampleGroup);
    this.generateSetup("setUp", exampleGroup, inferredType, _befores);
    Iterable<XtendFunction> _afters = this.afters(exampleGroup);
    this.generateSetup("tearDown", exampleGroup, inferredType, _afters);
  }
  
  public boolean generateSetup(final String methodName, final XtendClass exampleGroup, final JvmGenericType type, final Iterable<XtendFunction> executables) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference voidType = this._typeReferences.getTypeForName(Void.TYPE, exampleGroup);
      EList<JvmMember> _members = type.getMembers();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PUBLIC);
            EList<JvmTypeReference> _exceptions = it.getExceptions();
            JvmTypeReference _typeForName = JUnit3RuntimeSupport.this._typeReferences.getTypeForName(Exception.class, exampleGroup);
            JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("super.");
                  _builder.append(methodName, "");
                  _builder.append("();");
                  _builder.newLineIfNotEmpty();
                  {
                    for(final XtendFunction executable : executables) {
                      String _methodName = JUnit3RuntimeSupport.this._jnarioNameProvider.toMethodName(executable);
                      _builder.append(_methodName, "");
                      _builder.append("();");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  it.append(_builder);
                }
              };
            JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(exampleGroup, methodName, voidType, _function);
      boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  private Iterable<XtendFunction> befores(final XtendClass exampleGroup) {
    EList<XtendMember> _members = exampleGroup.getMembers();
    Iterable<XtendFunction> _filter = Iterables.<XtendFunction>filter(_members, XtendFunction.class);
    final Function1<XtendFunction,Boolean> _function = new Function1<XtendFunction,Boolean>() {
        public Boolean apply(final XtendFunction it) {
          EClass _eClass = it.eClass();
          String _name = _eClass.getName();
          String _println = InputOutput.<String>println(_name);
          boolean _equals = Objects.equal(_println, "Before");
          return Boolean.valueOf(_equals);
        }
      };
    Iterable<XtendFunction> _filter_1 = IterableExtensions.<XtendFunction>filter(_filter, _function);
    return _filter_1;
  }
  
  private Iterable<XtendFunction> afters(final XtendClass exampleGroup) {
    EList<XtendMember> _members = exampleGroup.getMembers();
    Iterable<XtendFunction> _filter = Iterables.<XtendFunction>filter(_members, XtendFunction.class);
    final Function1<XtendFunction,Boolean> _function = new Function1<XtendFunction,Boolean>() {
        public Boolean apply(final XtendFunction it) {
          EClass _eClass = it.eClass();
          String _name = _eClass.getName();
          boolean _equals = Objects.equal(_name, "After");
          return Boolean.valueOf(_equals);
        }
      };
    Iterable<XtendFunction> _filter_1 = IterableExtensions.<XtendFunction>filter(_filter, _function);
    return _filter_1;
  }
  
  private boolean addSuite(final JvmGenericType it, final XtendClass context, final Iterable<String> children, final Iterable<Executable> tests) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference testType = this._typeReferences.getTypeForName("junit.framework.Test", context);
      EList<JvmMember> _members = it.getMembers();
      final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setStatic(true);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("org.jnario.junit3.JnarioTestSuite suite = new org.jnario.junit3.JnarioTestSuite(\"");
                  String _describe = JUnit3RuntimeSupport.this._jnarioNameProvider.describe(context);
                  _builder.append(_describe, "");
                  _builder.append("\");");
                  _builder.newLineIfNotEmpty();
                  {
                    for(final Executable test : tests) {
                      _builder.append("suite.addTest(new ");
                      String _javaClassName = JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(context);
                      _builder.append(_javaClassName, "");
                      _builder.append("(\"");
                      String _testName = JUnit3RuntimeSupport.this.testName(test);
                      _builder.append(_testName, "");
                      _builder.append("\"));");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  {
                    for(final String child : children) {
                      _builder.append("suite.addTest(");
                      _builder.append(child, "");
                      _builder.append(".suite());");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                  _builder.append("return suite;");
                  _builder.newLine();
                  it.append(_builder);
                }
              };
            JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(context, "suite", testType, _function);
      boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  private boolean makeTestCase(final XtendClass exampleGroup, final JvmGenericType inferredType) {
    boolean _xblockexpression = false;
    {
      final JvmTypeReference stringType = this._typeReferences.getTypeForName("java.lang.String", exampleGroup);
      EList<JvmMember> _members = inferredType.getMembers();
      JvmField _field = this._extendedJvmTypesBuilder.toField(exampleGroup, "__name", stringType);
      this._extendedJvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = inferredType.getMembers();
      final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            JvmFormalParameter _parameter = JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.toParameter(exampleGroup, "name", stringType);
            JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("setName(name);");
                  _builder.newLine();
                  _builder.append("this.__name = name;");
                  it.append(_builder);
                }
              };
            JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmConstructor _constructor = this._extendedJvmTypesBuilder.toConstructor(exampleGroup, _function);
      this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members_1, _constructor);
      EList<JvmMember> _members_2 = inferredType.getMembers();
      final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
                public void apply(final ITreeAppendable it) {
                  StringConcatenation _builder = new StringConcatenation();
                  _builder.append("return org.jnario.runner.NameProvider.create().nameOf(getClass(), __name);");
                  it.append(_builder);
                }
              };
            JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
          }
        };
      JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(exampleGroup, "getName", stringType, _function_1);
      boolean _add = this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public Object addTestCase(final JvmGenericType inferredType, final XtendClass context) {
    Object _xifexpression = null;
    EList<JvmTypeReference> _superTypes = inferredType.getSuperTypes();
    boolean _isEmpty = _superTypes.isEmpty();
    if (_isEmpty) {
      EList<JvmTypeReference> _superTypes_1 = inferredType.getSuperTypes();
      JvmTypeReference _typeForName = this._typeReferences.getTypeForName("junit.framework.TestCase", context);
      boolean _add = this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes_1, _typeForName);
      _xifexpression = _add;
    } else {
      JvmTypeReference _xifexpression_1 = null;
      EList<JvmTypeReference> _superTypes_2 = inferredType.getSuperTypes();
      JvmTypeReference _get = _superTypes_2.get(0);
      String _simpleName = _get.getSimpleName();
      boolean _equals = Objects.equal(_simpleName, "Object");
      if (_equals) {
        EList<JvmTypeReference> _superTypes_3 = inferredType.getSuperTypes();
        JvmTypeReference _typeForName_1 = this._typeReferences.getTypeForName("junit.framework.TestCase", context);
        JvmTypeReference _set = _superTypes_3.set(0, _typeForName_1);
        _xifexpression_1 = _set;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private Iterable<String> children(final XtendClass exampleGroup) {
    EList<XtendMember> _members = exampleGroup.getMembers();
    Iterable<Specification> _filter = Iterables.<Specification>filter(_members, Specification.class);
    final Function1<Specification,String> _function = new Function1<Specification,String>() {
        public String apply(final Specification it) {
          String _javaClassName = JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(it);
          return _javaClassName;
        }
      };
    Iterable<String> _map = IterableExtensions.<Specification, String>map(_filter, _function);
    return _map;
  }
  
  private Iterable<Executable> examples(final XtendClass exampleGroup) {
    EList<XtendMember> _members = exampleGroup.getMembers();
    Iterable<Executable> _filter = Iterables.<Executable>filter(_members, Executable.class);
    final Function1<Executable,Boolean> _function = new Function1<Executable,Boolean>() {
        public Boolean apply(final Executable it) {
          boolean _not = (!(it instanceof Specification));
          return Boolean.valueOf(_not);
        }
      };
    Iterable<Executable> _filter_1 = IterableExtensions.<Executable>filter(_filter, _function);
    return _filter_1;
  }
  
  public void markAsTestMethod(final Executable element, final JvmOperation operation) {
    String _testName = this.testName(element);
    operation.setSimpleName(_testName);
  }
  
  private String testName(final Executable e) {
    String _methodName = this._jnarioNameProvider.toMethodName(e);
    String _plus = ("test" + _methodName);
    return _plus;
  }
  
  public void updateFeature(final XtendClass feature, final JvmGenericType inferredType, final List<JvmGenericType> scenarios) {
    this.addTestCase(inferredType, feature);
    final Function1<JvmGenericType,String> _function = new Function1<JvmGenericType,String>() {
        public String apply(final JvmGenericType it) {
          String _simpleName = it.getSimpleName();
          return _simpleName;
        }
      };
    List<String> _map = ListExtensions.<JvmGenericType, String>map(scenarios, _function);
    List<Executable> _emptyList = CollectionLiterals.<Executable>emptyList();
    this.addSuite(inferredType, feature, _map, _emptyList);
  }
  
  public void updateScenario(final XtendClass scenario, final JvmGenericType inferredType) {
    final JvmTypeReference testType = this._typeReferences.getTypeForName("junit.framework.Test", scenario);
    final Iterable<Executable> tests = this.examples(scenario);
    EList<JvmMember> _members = inferredType.getMembers();
    final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setStatic(true);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("org.jnario.junit3.JnarioTestSuite suite = new org.jnario.junit3.JnarioTestSuite(\"");
                String _describe = JUnit3RuntimeSupport.this._jnarioNameProvider.describe(scenario);
                _builder.append(_describe, "");
                _builder.append("\");");
                _builder.newLineIfNotEmpty();
                String _javaClassName = JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(scenario);
                _builder.append(_javaClassName, "");
                _builder.append(" scenario = new ");
                String _javaClassName_1 = JUnit3RuntimeSupport.this._jnarioNameProvider.toJavaClassName(scenario);
                _builder.append(_javaClassName_1, "");
                _builder.append("(");
                _builder.newLineIfNotEmpty();
                _builder.append("new org.jnario.junit3.TestQueue(");
                _builder.newLine();
                {
                  boolean _hasElements = false;
                  for(final Executable test : tests) {
                    if (!_hasElements) {
                      _hasElements = true;
                    } else {
                      _builder.appendImmediate(", ", "");
                    }
                    _builder.append("\"");
                    String _testName = JUnit3RuntimeSupport.this.testName(test);
                    _builder.append(_testName, "");
                    _builder.append("\"");
                  }
                }
                _builder.append("));");
                _builder.newLineIfNotEmpty();
                {
                  for(final Executable test_1 : tests) {
                    _builder.append("suite.addTest(new org.jnario.junit3.DelegatingTestCase(\"");
                    String _describe_1 = JUnit3RuntimeSupport.this._jnarioNameProvider.describe(test_1);
                    _builder.append(_describe_1, "");
                    _builder.append("\", scenario));");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("return suite;");
                _builder.newLine();
                it.append(_builder);
              }
            };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method = this._extendedJvmTypesBuilder.toMethod(scenario, "suite", testType, _function);
    this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members, _method);
    final JvmTypeReference queueType = this._typeReferences.getTypeForName("org.jnario.junit3.TestQueue", scenario);
    EList<JvmMember> _members_1 = inferredType.getMembers();
    JvmField _field = this._extendedJvmTypesBuilder.toField(scenario, "testQueue", queueType);
    this._extendedJvmTypesBuilder.<JvmField>operator_add(_members_1, _field);
    EList<JvmMember> _members_2 = inferredType.getMembers();
    final Procedure1<JvmConstructor> _function_1 = new Procedure1<JvmConstructor>() {
        public void apply(final JvmConstructor it) {
          EList<JvmFormalParameter> _parameters = it.getParameters();
          JvmFormalParameter _parameter = JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.toParameter(scenario, "testQueue", queueType);
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("setName(testQueue.next());");
                _builder.newLine();
                _builder.append("this.testQueue = testQueue;");
                it.append(_builder);
              }
            };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmConstructor _constructor = this._extendedJvmTypesBuilder.toConstructor(scenario, _function_1);
    this._extendedJvmTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
    final JvmTypeReference voidType = this._typeReferences.getTypeForName(Void.TYPE, scenario);
    EList<JvmMember> _members_3 = inferredType.getMembers();
    final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmTypeReference> _exceptions = it.getExceptions();
          JvmTypeReference _typeForName = JUnit3RuntimeSupport.this._typeReferences.getTypeForName(Exception.class, scenario);
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("if(testQueue.isRunning()){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("return;");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.append("super.");
                _builder.append("setUp", "");
                _builder.append("();");
                it.append(_builder);
              }
            };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method_1 = this._extendedJvmTypesBuilder.toMethod(scenario, "setUp", voidType, _function_2);
    this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_3, _method_1);
    EList<JvmMember> _members_4 = inferredType.getMembers();
    final Procedure1<JvmOperation> _function_3 = new Procedure1<JvmOperation>() {
        public void apply(final JvmOperation it) {
          it.setVisibility(JvmVisibility.PUBLIC);
          EList<JvmTypeReference> _exceptions = it.getExceptions();
          JvmTypeReference _typeForName = JUnit3RuntimeSupport.this._typeReferences.getTypeForName(Exception.class, scenario);
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
          final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
              public void apply(final ITreeAppendable it) {
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("if(testQueue.isDone()){");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("super.");
                _builder.append("tearDown", "	");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("}else{");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("setName(testQueue.next());");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                it.append(_builder);
              }
            };
          JUnit3RuntimeSupport.this._extendedJvmTypesBuilder.setBody(it, _function);
        }
      };
    JvmOperation _method_2 = this._extendedJvmTypesBuilder.toMethod(scenario, "tearDown", voidType, _function_3);
    this._extendedJvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_2);
  }
  
  public void updateSuite(final XtendClass exampleGroup, final JvmGenericType inferredType) {
  }
}
