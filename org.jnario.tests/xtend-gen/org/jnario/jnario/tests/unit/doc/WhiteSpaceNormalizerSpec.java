package org.jnario.jnario.tests.unit.doc;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.WhiteSpaceNormalizer;
import org.jnario.jnario.tests.unit.doc.WhiteSpaceNormalizerSpecExamples;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("WhiteSpaceNormalizer")
public class WhiteSpaceNormalizerSpec {
  @Subject
  public WhiteSpaceNormalizer subject;
  
  @Before
  public void _initWhiteSpaceNormalizerSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("input", "result"), 
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("null", "\"\""), null, ""),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\"", "\"\""), "", ""),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\" \"", "\"\""), " ", ""),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\thello\"", "\"hello\""), "\thello", "hello"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\thello\\n\\tworld\"", "\"hello\\nworld\""), "\thello\n\tworld", "hello\nworld"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\t\\thello\\n\\t\\tworld\"", "\"hello\\nworld\""), "\t\thello\n\t\tworld", "hello\nworld"),
      new WhiteSpaceNormalizerSpecExamples(  java.util.Arrays.asList("\"\\t\\thello\\n\\tworld\"", "\"hello\\n\\tworld\""), "\t\thello\n\tworld", "hello\n\tworld")
    );
  }
  
  protected ExampleTable<WhiteSpaceNormalizerSpecExamples> examples;
  
  @Test
  @Named("should remove trailing whitespace")
  @Order(99)
  public void shouldRemoveTrailingWhitespace() throws Exception {
    final Procedure1<WhiteSpaceNormalizerSpecExamples> _function = new Procedure1<WhiteSpaceNormalizerSpecExamples>() {
        public void apply(final WhiteSpaceNormalizerSpecExamples it) {
          String _normalize = WhiteSpaceNormalizerSpec.this.subject.normalize(it.input);
          Should.operator_doubleArrow(_normalize, it.result);
        }
      };
    ExampleTableIterators.<WhiteSpaceNormalizerSpecExamples>forEach(this.examples, _function);
  }
}
