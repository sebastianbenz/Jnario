/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator;

import calculator.Calculator;
import calculator.CalculatorSpec;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("substract")
public class CalculatorSubstractSpec extends CalculatorSpec {
  @Subject
  public Calculator subject;
  
  @Test
  @Named("subject.substract[5, 3] should be 2")
  @Order(99)
  public void subjectSubstract53ShouldBe2() throws Exception {
    int _substract = this.subject.substract(5, 3);
    boolean _should_be = Should.should_be(Integer.valueOf(_substract), Integer.valueOf(2));
    Assert.assertTrue("\nExpected subject.substract(5, 3) should be 2 but"
     + "\n     subject.substract(5, 3) is " + new StringDescription().appendValue(Integer.valueOf(_substract)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
}
