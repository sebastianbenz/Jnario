/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.doc;

import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.doc.WhiteSpaceNormalizer;
import org.jnario.jnario.tests.unit.doc.WhiteSpaceNormalizerSpecExamples;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("WhiteSpaceNormalizer")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class WhiteSpaceNormalizerSpec {
  @Subject
  public WhiteSpaceNormalizer subject;
  
  public ExampleTable<WhiteSpaceNormalizerSpecExamples> _initWhiteSpaceNormalizerSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("input", "result"), 
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("null", "\"\""), null, _initWhiteSpaceNormalizerSpecExamplesCell1()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\"", "\"\""), _initWhiteSpaceNormalizerSpecExamplesCell2(), _initWhiteSpaceNormalizerSpecExamplesCell3()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\" \"", "\"\""), _initWhiteSpaceNormalizerSpecExamplesCell4(), _initWhiteSpaceNormalizerSpecExamplesCell5()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\thello\"", "\"hello\""), _initWhiteSpaceNormalizerSpecExamplesCell6(), _initWhiteSpaceNormalizerSpecExamplesCell7()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\thello\\n\\tworld\"", "\"hello\\nworld\""), _initWhiteSpaceNormalizerSpecExamplesCell8(), _initWhiteSpaceNormalizerSpecExamplesCell9()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\t\\thello\\n\\t\\tworld\"", "\"hello\\nworld\""), _initWhiteSpaceNormalizerSpecExamplesCell10(), _initWhiteSpaceNormalizerSpecExamplesCell11()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\t\\thello\\n\\tworld\"", "\"hello\\n\\tworld\""), _initWhiteSpaceNormalizerSpecExamplesCell12(), _initWhiteSpaceNormalizerSpecExamplesCell13()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\n\\t\\thello\\n\\tworld\"", "\"hello\\n\\tworld\""), _initWhiteSpaceNormalizerSpecExamplesCell14(), _initWhiteSpaceNormalizerSpecExamplesCell15()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\n\\t\\thello\\n\\tworld\\n\"", "\"hello\\n\\tworld\\n\""), _initWhiteSpaceNormalizerSpecExamplesCell16(), _initWhiteSpaceNormalizerSpecExamplesCell17()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\thello\\n\\t\"", "\"hello\\n\""), _initWhiteSpaceNormalizerSpecExamplesCell18(), _initWhiteSpaceNormalizerSpecExamplesCell19()),
      new WhiteSpaceNormalizerSpecExamples(  Arrays.asList("\"\\thello\\t\"", "\"hello\\t\""), _initWhiteSpaceNormalizerSpecExamplesCell20(), _initWhiteSpaceNormalizerSpecExamplesCell21())
    );
  }
  
  protected ExampleTable<WhiteSpaceNormalizerSpecExamples> examples = _initWhiteSpaceNormalizerSpecExamples();
  
  public Object _initWhiteSpaceNormalizerSpecExamplesCell0() {
    return null;
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell1() {
    return "";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell2() {
    return "";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell3() {
    return "";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell4() {
    return " ";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell5() {
    return "";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell6() {
    return "\thello";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell7() {
    return "hello";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell8() {
    return "\thello\n\tworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell9() {
    return "hello\nworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell10() {
    return "\t\thello\n\t\tworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell11() {
    return "hello\nworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell12() {
    return "\t\thello\n\tworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell13() {
    return "hello\n\tworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell14() {
    return "\n\t\thello\n\tworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell15() {
    return "hello\n\tworld";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell16() {
    return "\n\t\thello\n\tworld\n";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell17() {
    return "hello\n\tworld\n";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell18() {
    return "\thello\n\t";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell19() {
    return "hello\n";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell20() {
    return "\thello\t";
  }
  
  public String _initWhiteSpaceNormalizerSpecExamplesCell21() {
    return "hello\t";
  }
  
  @Test
  @Named("should remove trailing whitespace")
  @Order(1)
  public void _shouldRemoveTrailingWhitespace() throws Exception {
    final Procedure1<WhiteSpaceNormalizerSpecExamples> _function = new Procedure1<WhiteSpaceNormalizerSpecExamples>() {
        public void apply(final WhiteSpaceNormalizerSpecExamples it) {
          String _input = it.getInput();
          String _normalize = WhiteSpaceNormalizerSpec.this.subject.normalize(_input);
          String _result = it.getResult();
          boolean _doubleArrow = Should.<String>operator_doubleArrow(_normalize, _result);
          Assert.assertTrue("\nExpected subject.normalize(input) => result but"
           + "\n     subject.normalize(input) is " + new StringDescription().appendValue(_normalize).toString()
           + "\n     subject is " + new StringDescription().appendValue(WhiteSpaceNormalizerSpec.this.subject).toString()
           + "\n     input is " + new StringDescription().appendValue(_input).toString()
           + "\n     result is " + new StringDescription().appendValue(_result).toString() + "\n", _doubleArrow);
          
        }
      };
    ExampleTableIterators.<WhiteSpaceNormalizerSpecExamples>forEach(this.examples, _function);
  }
  
  @Test
  @Named("Linebreak at the end")
  @Order(2)
  public void _linebreakAtTheEnd() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hello");
    _builder.newLine();
    _builder.append("world");
    _builder.newLine();
    String _normalize = this.subject.normalize(_builder);
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_normalize, "hello\nworld\n");
    Assert.assertTrue("\nExpected subject.normalize(\r\n\t\t\'\'\'\r\n\t\thello\r\n\t\tworld\r\n\t\t\'\'\') => \"hello\\nworld\\n\" but"
     + "\n     subject.normalize(\r\n\t\t\'\'\'\r\n\t\thello\r\n\t\tworld\r\n\t\t\'\'\') is " + new StringDescription().appendValue(_normalize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     \'\'\'\r\n\t\thello\r\n\t\tworld\r\n\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Linebreak at the end with trailing tabs")
  @Order(3)
  public void _linebreakAtTheEndWithTrailingTabs() throws Exception {
    String _normalize = this.subject.normalize("\n\t\t\t\t\t hello\n\t\t\t\t\t world\n\t\t\t\t\t");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_normalize, "hello\nworld\n");
    Assert.assertTrue("\nExpected subject.normalize(\"\\n\\t\\t\\t\\t\\t hello\\n\\t\\t\\t\\t\\t world\\n\\t\\t\\t\\t\\t\") => \"hello\\nworld\\n\" but"
     + "\n     subject.normalize(\"\\n\\t\\t\\t\\t\\t hello\\n\\t\\t\\t\\t\\t world\\n\\t\\t\\t\\t\\t\") is " + new StringDescription().appendValue(_normalize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("No linebreak at the end")
  @Order(4)
  public void _noLinebreakAtTheEnd() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hello");
    _builder.newLine();
    _builder.append("world");
    String _normalize = this.subject.normalize(_builder);
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_normalize, "hello\nworld");
    Assert.assertTrue("\nExpected subject.normalize(\r\n\t\t\'\'\'\r\n\t\thello\r\n\t\tworld\'\'\') => \"hello\\nworld\" but"
     + "\n     subject.normalize(\r\n\t\t\'\'\'\r\n\t\thello\r\n\t\tworld\'\'\') is " + new StringDescription().appendValue(_normalize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     \'\'\'\r\n\t\thello\r\n\t\tworld\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
}
