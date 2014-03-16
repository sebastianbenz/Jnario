/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package diverse;

import diverse.StackSpec;
import java.util.EmptyStackException;
import java.util.Stack;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("empty")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StackEmptySpec extends StackSpec {
  @Subject
  public Stack subject;
  
  @Test
  @Named("subject.empty should be true")
  @Order(1)
  public void _subjectEmptyShouldBeTrue() throws Exception {
    throw new Error("Unresolved compilation problems:"
      + "\nAmbiguous feature call.\nThe methods\n\tempty() in Stack and\n\tisEmpty() in Vector\nboth match.");
  }
  
  @Test
  @Named("subject.pop[] throws EmptyStackException")
  @Order(2)
  public void _subjectPopThrowsEmptyStackException() throws Exception {
    boolean expectedException = false;
    String message = "";
    try{
      this.subject.pop();
      message = "Expected " + EmptyStackException.class.getName() + " for \n     subject.pop()\n with:"
       + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString();
    }catch(EmptyStackException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
}
