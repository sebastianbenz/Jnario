package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteNodeBuilderParentListSuiteIntSpecExamples;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("parent[List<Suite>, int]")
public class SuiteNodeBuilderParentListSuiteIntSpec extends SuiteNodeBuilderSpec {
  @Inject
  @Extension
  public SuiteNodeBuilder _suiteNodeBuilder;
  
  @Before
  public void _initSuiteNodeBuilderParentListSuiteIntSpecExamples() {
    
    List<Suite> _suites = this.suites("#0", "#1");
    List<Suite> _suites_1 = this.suites("#0", "##1");
    List<Suite> _suites_2 = this.suites("#0", "###1");
    List<Suite> _suites_3 = this.suites("#0", "#1", "###2");examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("suites", "position", "parent"), 
      new SuiteNodeBuilderParentListSuiteIntSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"#1\")", "0", "null"), _suites, 0, null),
      new SuiteNodeBuilderParentListSuiteIntSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"##1\")", "1", "\"#0\""), _suites_1, 1, "#0"),
      new SuiteNodeBuilderParentListSuiteIntSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"###1\")", "1", "\"#0\""), _suites_2, 1, "#0"),
      new SuiteNodeBuilderParentListSuiteIntSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"#1\", \"###2\")", "2", "\"#1\""), _suites_3, 2, "#1")
    );
  }
  
  protected ExampleTable<SuiteNodeBuilderParentListSuiteIntSpecExamples> examples;
  
  @Test
  @Named("parent is suite with less hashes")
  @Order(99)
  public void parentIsSuiteWithLessHashes() throws Exception {
    final Procedure1<SuiteNodeBuilderParentListSuiteIntSpecExamples> _function = new Procedure1<SuiteNodeBuilderParentListSuiteIntSpecExamples>() {
        public void apply(final SuiteNodeBuilderParentListSuiteIntSpecExamples it) {
          Suite _parent = SuiteNodeBuilderParentListSuiteIntSpec.this._suiteNodeBuilder.parent(it.suites, it.position);
          String _name = _parent==null?(String)null:_parent.getName();
          boolean _should_be = Should.should_be(_name, it.parent);
          Assert.assertTrue("\nExpected parent(suites, position)?.name should be parent but"
           + "\n     parent(suites, position)?.name is " + "\"" + _name + "\""
           + "\n     parent(suites, position) is " + _parent
           + "\n     suites is " + it.suites
           + "\n     position is " + it.position
           + "\n     parent is " + "\"" + it.parent + "\"" + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<SuiteNodeBuilderParentListSuiteIntSpecExamples>forEach(this.examples, _function);
  }
}
