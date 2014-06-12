/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderDescribeExampleGroupSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderDescribeExampleSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToFieldNameExampleTableSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToJavaClassNameExampleGroupSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToJavaClassNameExampleTableSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToMethodNameAfterSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToMethodNameBeforeSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToMethodNameExampleSpec;
import org.junit.runner.RunWith;

@Contains({ ExampleNameProviderToJavaClassNameExampleGroupSpec.class, ExampleNameProviderToJavaClassNameExampleTableSpec.class, ExampleNameProviderToMethodNameExampleSpec.class, ExampleNameProviderToMethodNameBeforeSpec.class, ExampleNameProviderToMethodNameAfterSpec.class, ExampleNameProviderToFieldNameExampleTableSpec.class, ExampleNameProviderDescribeExampleGroupSpec.class, ExampleNameProviderDescribeExampleSpec.class })
@CreateWith(SpecTestCreator.class)
@Named("ExampleNameProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore modelStore;
  
  public Query parse(final CharSequence content) {
    final String contentWithPackage = ("package test\n" + content);
    final Resource spec = this.modelStore.parseSpec(contentWithPackage);
    TreeIterator<EObject> _allContents = spec.getAllContents();
    return Query.query(_allContents);
  }
}
