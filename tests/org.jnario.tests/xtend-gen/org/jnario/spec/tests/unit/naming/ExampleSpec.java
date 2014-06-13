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
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleImplementationSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameSpec;
import org.jnario.spec.tests.unit.naming.ExamplePendingSpec;
import org.junit.runner.RunWith;

@Contains({ ExampleNameSpec.class, ExampleImplementationSpec.class, ExamplePendingSpec.class })
@CreateWith(SpecTestCreator.class)
@Named("Example")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore modelStore;
  
  public Example parse(final String content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(content, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    final Resource spec = this.modelStore.parseSpec(_builder);
    TreeIterator<EObject> _allContents = spec.getAllContents();
    Query _query = Query.query(_allContents);
    return _query.<Example>first(Example.class);
  }
  
  public boolean pendingStateOf(final String string) {
    Example _parse = this.parse(string);
    return _parse.isPending();
  }
}
