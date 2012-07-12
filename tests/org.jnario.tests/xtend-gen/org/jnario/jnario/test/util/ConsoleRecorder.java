package org.jnario.jnario.test.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@SuppressWarnings("all")
public class ConsoleRecorder {
  private PrintStream old;
  
  private ByteArrayOutputStream pipeOut;
  
  public static ConsoleRecorder start() {
    ConsoleRecorder _consoleRecorder = new ConsoleRecorder();
    ConsoleRecorder _startRecording = _consoleRecorder.startRecording();
    return _startRecording;
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
      String _string = this.pipeOut.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
