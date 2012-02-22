/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package introduction;

import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Named;
import de.bmw.carit.jnario.runner.Order;
import de.bmw.carit.jnario.tests.util.SpecExecutor;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Tutorial")
public class TutorialSpec {
  /**
   * @filter('''.executesSuccessfully)
   */
  @Test
  @Named("Implicit subject creation")
  @Order(0)
  public void implicitSubjectCreation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.ArrayList");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe ArrayList{");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("it \"should automatically create an instance of ArrayList called subject\"{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("subject.should.be(typeof(ArrayList))");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    SpecExecutor.executesSuccessfully(_builder);
  }
}
