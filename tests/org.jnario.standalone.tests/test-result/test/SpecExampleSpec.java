/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package test;

import java.util.Arrays;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import test.SpecExampleNestedExampleSpec;
import test.SpecExampleSpecATable;

@Contains(SpecExampleNestedExampleSpec.class)
@Named("Spec Example")
@SuppressWarnings("all")
public class SpecExampleSpec {
  public ExampleTable<SpecExampleSpecATable> _initSpecExampleSpecATable() {
    return ExampleTable.create("aTable", 
      Arrays.asList("x", "y"), 
      new SpecExampleSpecATable(  Arrays.asList("0", "0"), _initSpecExampleSpecATableCell0(), _initSpecExampleSpecATableCell1())
    );
  }
  
  protected ExampleTable<SpecExampleSpecATable> aTable = _initSpecExampleSpecATable();
  
  public int _initSpecExampleSpecATableCell0() {
    return 0;
  }
  
  public int _initSpecExampleSpecATableCell1() {
    return 0;
  }
  
  @Named("should pass")
  @Order(1)
  public void _shouldPass() throws Exception {
    boolean _doubleArrow = Should.<Integer>operator_doubleArrow(
      Integer.valueOf((1 + 1)), Integer.valueOf(2));
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf((1 + 1))).toString() + "\n", _doubleArrow);
    
  }
}
