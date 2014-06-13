/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typing.IJvmTypeReferenceProvider;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.eclipse.xtext.xtype.XtypeFactory;
import org.eclipse.xtext.xtype.impl.XComputedTypeReferenceImplCustom;
import org.jnario.Specification;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioJvmModelInferrer;
import org.jnario.jvmmodel.TestRuntimeSupport;
import org.jnario.runner.Named;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.jvmmodel.SuiteNode;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;

@SuppressWarnings("all")
public class SuiteJvmModelInferrer extends JnarioJvmModelInferrer {
  @Inject
  @Extension
  private ExtendedJvmTypesBuilder _extendedJvmTypesBuilder;
  
  @Inject
  @Extension
  private SuiteClassNameProvider _suiteClassNameProvider;
  
  @Inject
  @Extension
  private SpecResolver _specResolver;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  @Inject
  @Extension
  private SuiteNodeBuilder _suiteNodeBuilder;
  
  @Inject(optional = true)
  private XtypeFactory xtypesFactory = XtypeFactory.eINSTANCE;
  
  public void doInfer(final EObject e, final IJvmDeclaredTypeAcceptor acceptor, final boolean preIndexingPhase) {
    if ((!(e instanceof SuiteFile))) {
      return;
    }
    final SuiteFile suiteFile = ((SuiteFile) e);
    final Iterable<SuiteNode> nodes = this._suiteNodeBuilder.buildNodeModel(suiteFile);
    final ArrayList<Runnable> doLater = CollectionLiterals.<Runnable>newArrayList();
    final Procedure1<SuiteNode> _function = new Procedure1<SuiteNode>() {
      public void apply(final SuiteNode it) {
        SuiteJvmModelInferrer.this.infer(it, acceptor, doLater, preIndexingPhase);
      }
    };
    IterableExtensions.<SuiteNode>forEach(nodes, _function);
    if (preIndexingPhase) {
      return;
    }
    final Procedure1<Runnable> _function_1 = new Procedure1<Runnable>() {
      public void apply(final Runnable it) {
        it.run();
      }
    };
    IterableExtensions.<Runnable>forEach(doLater, _function_1);
  }
  
  public JvmGenericType infer(final SuiteNode node, final IJvmDeclaredTypeAcceptor acceptor, final List<Runnable> doLater, final boolean preIndexingPhase) {
    JvmGenericType _xblockexpression = null;
    {
      final Suite suite = node.getSuite();
      String _qualifiedJavaClassName = this._suiteClassNameProvider.toQualifiedJavaClassName(suite);
      final JvmGenericType suiteClass = this._extendedJvmTypesBuilder.toClass(suite, _qualifiedJavaClassName);
      boolean _equals = Objects.equal(suiteClass, null);
      if (_equals) {
        return null;
      }
      acceptor.<JvmGenericType>accept(suiteClass);
      List<SuiteNode> _children = node.getChildren();
      final Function1<SuiteNode, JvmGenericType> _function = new Function1<SuiteNode, JvmGenericType>() {
        public JvmGenericType apply(final SuiteNode it) {
          return SuiteJvmModelInferrer.this.infer(it, acceptor, doLater, preIndexingPhase);
        }
      };
      List<JvmGenericType> _map = ListExtensions.<SuiteNode, JvmGenericType>map(_children, _function);
      Iterable<JvmGenericType> _filterNull = IterableExtensions.<JvmGenericType>filterNull(_map);
      final Set<JvmGenericType> subSuites = IterableExtensions.<JvmGenericType>toSet(_filterNull);
      if ((!preIndexingPhase)) {
        final Function1<JvmGenericType, JvmTypeReference> _function_1 = new Function1<JvmGenericType, JvmTypeReference>() {
          public JvmTypeReference apply(final JvmGenericType it) {
            JvmParameterizedTypeReference _createTypeRef = SuiteJvmModelInferrer.this._typeReferences.createTypeRef(it);
            return ((JvmTypeReference) _createTypeRef);
          }
        };
        final Iterable<JvmTypeReference> subSuiteReferences = IterableExtensions.<JvmGenericType, JvmTypeReference>map(subSuites, _function_1);
        final Runnable _function_2 = new Runnable() {
          public void run() {
            EList<JvmAnnotationReference> _annotations = suiteClass.getAnnotations();
            String _describe = SuiteJvmModelInferrer.this._suiteClassNameProvider.describe(suite);
            JvmAnnotationReference _annotation = SuiteJvmModelInferrer.this._extendedJvmTypesBuilder.toAnnotation(suite, Named.class, _describe);
            SuiteJvmModelInferrer.this._extendedJvmTypesBuilder.<JvmAnnotationReference>operator_add(_annotations, _annotation);
            Iterable<JvmTypeReference> _children = SuiteJvmModelInferrer.this.children(suite);
            final Iterable<JvmTypeReference> children = Iterables.<JvmTypeReference>concat(_children, subSuiteReferences);
            boolean _isEmpty = IterableExtensions.isEmpty(children);
            boolean _not = (!_isEmpty);
            if (_not) {
              TestRuntimeSupport _testRuntime = SuiteJvmModelInferrer.this.getTestRuntime();
              Set<JvmTypeReference> _set = IterableExtensions.<JvmTypeReference>toSet(children);
              _testRuntime.addChildren(suite, suiteClass, _set);
            }
            SuiteJvmModelInferrer.this.initialize(suite, suiteClass);
            TestRuntimeSupport _testRuntime_1 = SuiteJvmModelInferrer.this.getTestRuntime();
            _testRuntime_1.updateSuite(suite, suiteClass);
          }
        };
        doLater.add(_function_2);
      }
      _xblockexpression = suiteClass;
    }
    return _xblockexpression;
  }
  
  public Iterable<JvmTypeReference> children(final Suite suite) {
    Iterable<JvmTypeReference> _xblockexpression = null;
    {
      List<Specification> _resolveSpecs = this._specResolver.resolveSpecs(suite);
      final Function1<Specification, Boolean> _function = new Function1<Specification, Boolean>() {
        public Boolean apply(final Specification it) {
          String _javaClassName = SuiteJvmModelInferrer.this._suiteClassNameProvider.toJavaClassName(it);
          return Boolean.valueOf((!Objects.equal(_javaClassName, null)));
        }
      };
      final Iterable<Specification> specs = IterableExtensions.<Specification>filter(_resolveSpecs, _function);
      final Function1<Specification, String> _function_1 = new Function1<Specification, String>() {
        public String apply(final Specification it) {
          return SuiteJvmModelInferrer.this._suiteClassNameProvider.toQualifiedJavaClassName(it);
        }
      };
      final Iterable<String> types = IterableExtensions.<Specification, String>map(specs, _function_1);
      final Function1<String, JvmTypeReference> _function_2 = new Function1<String, JvmTypeReference>() {
        public JvmTypeReference apply(final String it) {
          return SuiteJvmModelInferrer.this.inferredType(it, suite);
        }
      };
      _xblockexpression = IterableExtensions.<String, JvmTypeReference>map(types, _function_2);
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference inferredType(final String name, final EObject context) {
    final XComputedTypeReference result = this.xtypesFactory.createXComputedTypeReference();
    final IJvmTypeReferenceProvider _function = new IJvmTypeReferenceProvider() {
      public JvmTypeReference getTypeReference(final XComputedTypeReferenceImplCustom it) {
        return SuiteJvmModelInferrer.this._typeReferences.getTypeForName(name, context);
      }
    };
    result.setTypeProvider(_function);
    return result;
  }
}
