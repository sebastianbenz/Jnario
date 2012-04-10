package org.jnario.spec.tests.unit.parsing;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.jnario.jnario.test.util.AbstractParserTest;
import org.jnario.spec.SpecInjectorProvider;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SpecInjectorProvider.class)
public class ParserTest extends AbstractParserTest {
  public Class<?> context() {
    return ParserTest.class;
  }
}
