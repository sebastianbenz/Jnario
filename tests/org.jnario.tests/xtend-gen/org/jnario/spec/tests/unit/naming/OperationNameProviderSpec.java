/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.ClasspathTypeProviderFactory;
import org.eclipse.xtext.common.types.access.impl.ClasspathTypeProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.naming.OperationNameProvider;
import org.jnario.spec.tests.unit.naming.OperationNameProviderShouldNameMethodsSimilarToJavaDocLinksSpec;
import org.jnario.spec.tests.unit.naming.OperationNamesExample;
import org.junit.Before;
import org.junit.runner.RunWith;

@Contains(OperationNameProviderShouldNameMethodsSimilarToJavaDocLinksSpec.class)
@Named("OperationNameProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class OperationNameProviderSpec {
  @Inject
  OperationNameProvider subject;
  
  @Inject
  ClasspathTypeProviderFactory typeProviderFactory = new Function0<ClasspathTypeProviderFactory>() {
    public ClasspathTypeProviderFactory apply() {
      Class<? extends OperationNameProviderSpec> _class = OperationNameProviderSpec.this.getClass();
      ClassLoader _classLoader = _class.getClassLoader();
      ClasspathTypeProviderFactory _classpathTypeProviderFactory = new ClasspathTypeProviderFactory(_classLoader);
      return _classpathTypeProviderFactory;
    }
  }.apply();
  
  Map<String,JvmOperation> operations;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore _modelStore;
  
  @Before
  public void setup() {
    final ClasspathTypeProvider typeProvider = this.typeProviderFactory.createTypeProvider();
    String _name = OperationNamesExample.class.getName();
    JvmType _findTypeByName = typeProvider.findTypeByName(_name);
    final JvmGenericType type = ((JvmGenericType) _findTypeByName);
    EList<JvmMember> _members = type.getMembers();
    final Iterable<JvmOperation> jvmOperations = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
    final Function1<JvmOperation,String> _function = new Function1<JvmOperation,String>() {
        public String apply(final JvmOperation it) {
          String _simpleName = it.getSimpleName();
          return _simpleName;
        }
      };
    Map<String,JvmOperation> _map = IterableExtensions.<String, JvmOperation>toMap(jvmOperations, _function);
    this.operations = _map;
  }
  
  public String nameOf(final String operationName) {
    String _xblockexpression = null;
    {
      final JvmOperation op = this.operations.get(operationName);
      QualifiedName _apply = this.subject.apply(op);
      String _string = _apply.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
