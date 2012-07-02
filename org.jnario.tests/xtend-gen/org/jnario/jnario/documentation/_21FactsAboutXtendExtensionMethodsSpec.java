package org.jnario.jnario.documentation;

import java.util.Collections;
import java.util.List;
import org.jnario.jnario.documentation._21FactsAboutXtendSpec;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Extension Methods")
public class _21FactsAboutXtendExtensionMethodsSpec extends _21FactsAboutXtendSpec {
  @Test
  @Named("More readable code with extension methods")
  @Order(99)
  public void moreReadableCodeWithExtensionMethods() throws Exception {
    final List<String> colors = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    Collections.<String>sort(colors);
    JnarioCollectionLiterals.<String>list("blue", "green", "red");
  }
}
