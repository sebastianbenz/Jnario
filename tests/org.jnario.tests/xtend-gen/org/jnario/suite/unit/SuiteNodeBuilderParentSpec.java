/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteNodeBuilderParentSpecExamples;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("parent")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteNodeBuilderParentSpec extends SuiteNodeBuilderSpec {
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public SuiteNodeBuilder _suiteNodeBuilder;
  
  public ExampleTable<SuiteNodeBuilderParentSpecExamples> _initSuiteNodeBuilderParentSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("suites", "position", "parent"), 
      new SuiteNodeBuilderParentSpecExamples(  Arrays.asList("suites(\"#0\", \"#1\")", "0", "null"), _initSuiteNodeBuilderParentSpecExamplesCell0(), _initSuiteNodeBuilderParentSpecExamplesCell1(), null),
      new SuiteNodeBuilderParentSpecExamples(  Arrays.asList("suites(\"#0\", \"##1\")", "1", "\"#0\""), _initSuiteNodeBuilderParentSpecExamplesCell3(), _initSuiteNodeBuilderParentSpecExamplesCell4(), _initSuiteNodeBuilderParentSpecExamplesCell5()),
      new SuiteNodeBuilderParentSpecExamples(  Arrays.asList("suites(\"#0\", \"###1\")", "1", "\"#0\""), _initSuiteNodeBuilderParentSpecExamplesCell6(), _initSuiteNodeBuilderParentSpecExamplesCell7(), _initSuiteNodeBuilderParentSpecExamplesCell8()),
      new SuiteNodeBuilderParentSpecExamples(  Arrays.asList("suites(\"#0\", \"#1\", \"###2\")", "2", "\"#1\""), _initSuiteNodeBuilderParentSpecExamplesCell9(), _initSuiteNodeBuilderParentSpecExamplesCell10(), _initSuiteNodeBuilderParentSpecExamplesCell11())
    );
  }
  
  protected ExampleTable<SuiteNodeBuilderParentSpecExamples> examples = _initSuiteNodeBuilderParentSpecExamples();
  
  public List<Suite> _initSuiteNodeBuilderParentSpecExamplesCell0() {
    List<Suite> _suites = this.suites("#0", "#1");
    return _suites;
  }
  
  public int _initSuiteNodeBuilderParentSpecExamplesCell1() {
    return 0;
  }
  
  public Object _initSuiteNodeBuilderParentSpecExamplesCell2() {
    return null;
  }
  
  public List<Suite> _initSuiteNodeBuilderParentSpecExamplesCell3() {
    List<Suite> _suites = this.suites("#0", "##1");
    return _suites;
  }
  
  public int _initSuiteNodeBuilderParentSpecExamplesCell4() {
    return 1;
  }
  
  public String _initSuiteNodeBuilderParentSpecExamplesCell5() {
    return "#0";
  }
  
  public List<Suite> _initSuiteNodeBuilderParentSpecExamplesCell6() {
    List<Suite> _suites = this.suites("#0", "###1");
    return _suites;
  }
  
  public int _initSuiteNodeBuilderParentSpecExamplesCell7() {
    return 1;
  }
  
  public String _initSuiteNodeBuilderParentSpecExamplesCell8() {
    return "#0";
  }
  
  public List<Suite> _initSuiteNodeBuilderParentSpecExamplesCell9() {
    List<Suite> _suites = this.suites("#0", "#1", "###2");
    return _suites;
  }
  
  public int _initSuiteNodeBuilderParentSpecExamplesCell10() {
    return 2;
  }
  
  public String _initSuiteNodeBuilderParentSpecExamplesCell11() {
    return "#1";
  }
  
  @Test
  @Named("parent is suite with less hashes")
  @Order(1)
  public void _parentIsSuiteWithLessHashes() throws Exception {
    final Procedure1<SuiteNodeBuilderParentSpecExamples> _function = new Procedure1<SuiteNodeBuilderParentSpecExamples>() {
        public void apply(final SuiteNodeBuilderParentSpecExamples it) {
          List<Suite> _suites = it.getSuites();
          int _position = it.getPosition();
          Suite _parent = SuiteNodeBuilderParentSpec.this._suiteNodeBuilder.parent(_suites, _position);
          String _name = null;
          if (_parent!=null) {
            _name=_parent.getName();
          }
          String _parent_1 = it.getParent();
          boolean _should_be = Should.<String>should_be(_name, _parent_1);
          Assert.assertTrue("\nExpected parent(suites, position)?.name should be parent but"
           + "\n     parent(suites, position)?.name is " + new StringDescription().appendValue(_name).toString()
           + "\n     parent(suites, position) is " + new StringDescription().appendValue(_parent).toString()
           + "\n     suites is " + new StringDescription().appendValue(_suites).toString()
           + "\n     position is " + new StringDescription().appendValue(_position).toString()
           + "\n     parent is " + new StringDescription().appendValue(_parent_1).toString() + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<SuiteNodeBuilderParentSpecExamples>forEach(this.examples, _function);
  }
}
