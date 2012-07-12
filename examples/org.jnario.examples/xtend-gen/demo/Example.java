/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package demo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Example {
  public static void main(final String[] args) {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("red", "blue", "green");
    List<String> _sort = IterableExtensions.<String>sort(_newArrayList);
    InputOutput.<List<String>>println(_sort);
  }
  
  private Procedure1<? super String> _field;
  
  public Procedure1<? super String> getField() {
    return this._field;
  }
  
  public void setField(final Procedure1<? super String> field) {
    this._field = field;
  }
}
