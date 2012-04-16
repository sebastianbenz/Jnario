package org.jnario.feature.tests.unit.parser;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.jnario.feature.FeatureInjectorProvider;
import org.jnario.feature.tests.unit.parser.examples.Examples;
import org.jnario.jnario.test.util.AbstractParserTest;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(FeatureInjectorProvider.class)
public class ParserTest extends AbstractParserTest {
  public Class<?> context() {
    return Examples.class;
  }
}
