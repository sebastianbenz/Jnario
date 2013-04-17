/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.suite.SpecReference;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Named("SuiteJavaValidator")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SuiteTestCreator.class)
@SuppressWarnings("all")
public class SuiteJavaValidatorSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore modelStore;
  
  @Test
  @Named("Suite cannot include itself")
  @Order(1)
  public void _suiteCannotIncludeItself() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#MySuite");
    _builder.newLine();
    _builder.append("- \"MySuite\"\t");
    _builder.newLine();
    this.modelStore.parseSuite(_builder);
    AssertableDiagnostics _validate = this.validate(SpecReference.class);
    _validate.assertErrorContains("Suites cannot include themselves");
  }
  
  public AssertableDiagnostics validate(final Class<? extends EObject> type) {
    Query _query = Query.query(this.modelStore);
    final EObject target = _query.first(type);
    return RegisteredValidatorTester.validateObj(target);
  }
}
