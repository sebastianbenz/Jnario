/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.test.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@SuppressWarnings("all")
public class ConsoleRecorder {
  private PrintStream old;
  
  private ByteArrayOutputStream pipeOut;
  
  public static ConsoleRecorder start() {
    ConsoleRecorder _consoleRecorder = new ConsoleRecorder();
    return _consoleRecorder.startRecording();
  }
  
  public ConsoleRecorder startRecording() {
    ByteArrayOutputStream _byteArrayOutputStream = new ByteArrayOutputStream();
    this.pipeOut = _byteArrayOutputStream;
    this.old = System.out;
    PrintStream _printStream = new PrintStream(this.pipeOut);
    System.setOut(_printStream);
    return this;
  }
  
  public String stop() {
    String _xblockexpression = null;
    {
      System.setOut(this.old);
      _xblockexpression = (this.pipeOut.toString());
    }
    return _xblockexpression;
  }
}
