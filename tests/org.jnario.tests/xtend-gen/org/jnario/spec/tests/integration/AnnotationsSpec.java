/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(SpecTestCreator.class)
@Named("Annotations")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class AnnotationsSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("should support class annotations for \\\'describe\\\'")
  @Order(1)
  public void _shouldSupportClassAnnotationsForDescribe() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\timport static org.hamcrest.CoreMatchers.*\t\t\t\r\n\t\t\timport com.google.inject.Singleton\r\n\r\n\t\t\t@Singleton\t\t\t\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\tfact \"should support class annotations for describe\"{\r\n\t\t\t\t\tval annotation = typeof(AnnotationsSpec).getAnnotation(typeof(Singleton))\r\n\t\t\t\t\tannotation should not be null\r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
  
  @Test
  @Named("should support method annotations for \\\'examples\\\'")
  @Order(2)
  public void _shouldSupportMethodAnnotationsForExamples() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport com.google.inject.Inject\r\n\t\t\timport static org.hamcrest.CoreMatchers.*\r\n\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\t\t@Inject\t\t\t\r\n\t\t\t\tfact \"example\"{\r\n\t\t\t\t\tval annotation = typeof(AnnotationsSpec).getMethod(\"_example\").getAnnotation(typeof(Inject))\r\n\t\t\t\t\tannotation should not be null\r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
  
  @Test
  @Named("should support method annotations for \\\'contexts\\\'")
  @Order(3)
  public void _shouldSupportMethodAnnotationsForContexts() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport com.google.inject.Singleton\r\n\t\t\t\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\t\t@Singleton\r\n\t\t\t\tcontext \"Context\"{\r\n\t\t\t\t\tfact \"example\"{\r\n\t\t\t\t\t\tassert typeof(AnnotationsContextSpec).isAnnotationPresent(typeof(Singleton))\r\n\t\t\t\t\t} \r\n\t\t\t\t}\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
  
  @Test
  @Named("should support annotations for \\\'fields\\\'")
  @Order(4)
  public void _shouldSupportAnnotationsForFields() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport com.google.inject.Inject\r\n\t\t\timport static org.hamcrest.CoreMatchers.*\r\n\t\t\t\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\t\t@Inject\t\t\r\n\t\t\t\tString myField\r\n\t\t\t\t\t\r\n\t\t\t\tfact \"example\"{\r\n\t\t\t\t\tval annotation = typeof(AnnotationsSpec).getDeclaredField(\"myField\").getAnnotation(typeof(Inject))\r\n\t\t\t\t\tannotation should not be null\r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
}
