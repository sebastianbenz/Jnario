package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Annotations")
@CreateWith(value = SpecTestCreator.class)
public class AnnotationsSpec {
  @Inject
  @Extension
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("should support class annotations for \\\'describe\\\'")
  @Order(99)
  public void shouldSupportClassAnnotationsForDescribe() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\timport static org.hamcrest.CoreMatchers.*\t\t\t\r\n\t\t\timport com.google.inject.Singleton\r\n\r\n\t\t\t@Singleton\t\t\t\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\tfact \"should support class annotations for describe\"{\r\n\t\t\t\t\tval annotation = typeof(AnnotationsSpec).getAnnotation(typeof(Singleton))\r\n\t\t\t\t\tannotation should not be null\r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
  
  @Test
  @Named("should support method annotations for \\\'examples\\\'")
  @Order(99)
  public void shouldSupportMethodAnnotationsForExamples() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport com.google.inject.Inject\r\n\t\t\timport static org.hamcrest.CoreMatchers.*\r\n\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\t\t@Inject\t\t\t\r\n\t\t\t\tfact \"example\"{\r\n\t\t\t\t\tval annotation = typeof(AnnotationsSpec).getMethod(\"example\").getAnnotation(typeof(Inject))\r\n\t\t\t\t\tannotation should not be null\r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
  
  @Test
  @Named("should support method annotations for \\\'contexts\\\'")
  @Order(99)
  public void shouldSupportMethodAnnotationsForContexts() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport com.google.inject.Singleton\r\n\t\t\t\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\t\t@Singleton\r\n\t\t\t\tcontext \"Context\"{\r\n\t\t\t\t\tfact \"example\"{\r\n\t\t\t\t\t\tassert typeof(AnnotationsContextSpec).isAnnotationPresent(typeof(Singleton))\r\n\t\t\t\t\t} \r\n\t\t\t\t}\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
  
  @Test
  @Named("should support annotations for \\\'fields\\\'")
  @Order(99)
  public void shouldSupportAnnotationsForFields() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport com.google.inject.Inject\r\n\t\t\timport static org.hamcrest.CoreMatchers.*\r\n\t\t\t\r\n\t\t\tdescribe \"Annotations\" {\r\n\t\t\t\r\n\t\t\t\t@Inject\t\t\r\n\t\t\t\tString myField\r\n\t\t\t\t\t\r\n\t\t\t\tfact \"example\"{\r\n\t\t\t\t\tval annotation = typeof(AnnotationsSpec).getDeclaredField(\"myField\").getAnnotation(typeof(Inject))\r\n\t\t\t\t\tannotation should not be null\r\n\t\t\t\t} \r\n\t\t\t\t\t\t\r\n\t\t\t}\r\n\t\t";
    this._behaviorExecutor.executesSuccessfully(spec);
  }
}
