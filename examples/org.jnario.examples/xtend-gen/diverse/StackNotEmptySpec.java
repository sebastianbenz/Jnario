/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package diverse;

import diverse.StackSpec;
import java.util.Stack;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("not empty")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StackNotEmptySpec extends StackSpec {
  @Subject
  public Stack subject;
  
  @Test
  @Named("increases size when pushing")
  @Order(1)
  public void _increasesSizeWhenPushing() throws Exception {
    this.subject.push("something");
    int _size = this.subject.size();
    Assert.assertTrue("\nExpected subject.size => 1 but"
     + "\n     subject.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(1)));
    
  }
  
  @Test
  @Named("decreases size when popping")
  @Order(2)
  public void _decreasesSizeWhenPopping() throws Exception {
    this.subject.push("something");
    this.subject.pop();
    int _size = this.subject.size();
    Assert.assertTrue("\nExpected subject.size => 0 but"
     + "\n     subject.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(0)));
    
  }
}
