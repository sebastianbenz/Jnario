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
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
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
    boolean _empty = this.subject.empty();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_empty), true);
    Assert.assertTrue("\nExpected subject.empty should be true but"
     + "\n     subject.empty is " + new StringDescription().appendValue(Boolean.valueOf(_empty)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
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
       + "\n     subject is " + new StringDescription().appendValue(this.subject).toString();
    }catch(EmptyStackException e){
      expectedException = true;
    }
    Assert.assertTrue(message, expectedException);
  }
}
