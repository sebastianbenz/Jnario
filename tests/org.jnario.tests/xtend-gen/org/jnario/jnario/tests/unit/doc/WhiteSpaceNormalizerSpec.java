package org.jnario.jnario.tests.unit.doc;

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

@SuppressWarnings("all")
@Named("WhiteSpaceNormalizer")
@RunWith(ExampleGroupRunner.class)
public class WhiteSpaceNormalizerSpec {
  @Subject
  public WhiteSpaceNormalizer subject;
  
  public ExampleTable<WhiteSpaceNormalizerSpecExamples> _initWhiteSpaceNormalizerSpecExamples() {
    return ExampleTable.create("examples", 
      java.util.Arrays.asList("input", "result"), 
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("null", "\"\""), null, ""),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\"", "\"\""), "", ""),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\" \"", "\"\""), " ", ""),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\thello\"", "\"hello\""), "\thello", "hello"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\thello\\n\\tworld\"", "\"hello\\nworld\""), "\thello\n\tworld", "hello\nworld"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\t\\thello\\n\\t\\tworld\"", "\"hello\\nworld\""), "\t\thello\n\t\tworld", "hello\nworld"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\t\\thello\\n\\tworld\"", "\"hello\\n\\tworld\""), "\t\thello\n\tworld", "hello\n\tworld"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\n\\t\\thello\\n\\tworld\"", "\"hello\\n\\tworld\""), "\n\t\thello\n\tworld", "hello\n\tworld"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\n\\t\\thello\\n\\tworld\\n\"", "\"hello\\n\\tworld\\n\""), "\n\t\thello\n\tworld\n", "hello\n\tworld\n"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\thello\\n\\t\"", "\"hello\\n\""), "\thello\n\t", "hello\n"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\thello\\t\"", "\"hello\\t\""), "\thello\t", "hello\t")
    );
  }
  
  protected ExampleTable<WhiteSpaceNormalizerSpecExamples> examples = _initWhiteSpaceNormalizerSpecExamples();
  
  @Test
  @Named("should remove trailing whitespace")
  @Order(1)
  public void _shouldRemoveTrailingWhitespace() throws Exception {
    final Procedure1<WhiteSpaceNormalizerSpecExamples> _function = new Procedure1<WhiteSpaceNormalizerSpecExamples>() {
        public void apply(final WhiteSpaceNormalizerSpecExamples it) {
          String _normalize = WhiteSpaceNormalizerSpec.this.subject.normalize(it.input);
          boolean _doubleArrow = Should.operator_doubleArrow(_normalize, it.result);
          Assert.assertTrue("\nExpected subject.normalize(input) => result but"
           + "\n     subject.normalize(input) is " + new StringDescription().appendValue(_normalize).toString()
           + "\n     subject is " + new StringDescription().appendValue(WhiteSpaceNormalizerSpec.this.subject).toString()
           + "\n     input is " + new StringDescription().appendValue(it.input).toString()
           + "\n     result is " + new StringDescription().appendValue(it.result).toString() + "\n", _doubleArrow);
          
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
    boolean _doubleArrow = Should.operator_doubleArrow(_normalize, "hello\nworld\n");
    Assert.assertTrue("\nExpected subject.normalize(\n\t\t\'\'\'\n\t\thello\n\t\tworld\n\t\t\'\'\') => \"hello\\nworld\\n\" but"
     + "\n     subject.normalize(\n\t\t\'\'\'\n\t\thello\n\t\tworld\n\t\t\'\'\') is " + new StringDescription().appendValue(_normalize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     \'\'\'\n\t\thello\n\t\tworld\n\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("Linebreak at the end with trailing tabs")
  @Order(3)
  public void _linebreakAtTheEndWithTrailingTabs() throws Exception {
    String _normalize = this.subject.normalize("\n\t\t\t\t\t hello\n\t\t\t\t\t world\n\t\t\t\t\t");
    boolean _doubleArrow = Should.operator_doubleArrow(_normalize, "hello\nworld\n");
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
    boolean _doubleArrow = Should.operator_doubleArrow(_normalize, "hello\nworld");
    Assert.assertTrue("\nExpected subject.normalize(\n\t\t\'\'\'\n\t\thello\n\t\tworld\'\'\') => \"hello\\nworld\" but"
     + "\n     subject.normalize(\n\t\t\'\'\'\n\t\thello\n\t\tworld\'\'\') is " + new StringDescription().appendValue(_normalize).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     \'\'\'\n\t\thello\n\t\tworld\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
}
