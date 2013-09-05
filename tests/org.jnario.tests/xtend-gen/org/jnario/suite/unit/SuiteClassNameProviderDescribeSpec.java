/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import java.util.Arrays;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteClassNameProviderDescribeSpecExamples;
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("describe")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteClassNameProviderDescribeSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  public ExampleTable<SuiteClassNameProviderDescribeSpecExamples> _initSuiteClassNameProviderDescribeSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("name", "expectedClassName"), 
      new SuiteClassNameProviderDescribeSpecExamples(  Arrays.asList("null", "null"), null, null),
      new SuiteClassNameProviderDescribeSpecExamples(  Arrays.asList("\"#\"", "null"), _initSuiteClassNameProviderDescribeSpecExamplesCell2(), null),
      new SuiteClassNameProviderDescribeSpecExamples(  Arrays.asList("\"#my Suite\"", "\"my Suite\""), _initSuiteClassNameProviderDescribeSpecExamplesCell4(), _initSuiteClassNameProviderDescribeSpecExamplesCell5()),
      new SuiteClassNameProviderDescribeSpecExamples(  Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"My Suite\""), _initSuiteClassNameProviderDescribeSpecExamplesCell6(), _initSuiteClassNameProviderDescribeSpecExamplesCell7())
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderDescribeSpecExamples> examples = _initSuiteClassNameProviderDescribeSpecExamples();
  
  public Object _initSuiteClassNameProviderDescribeSpecExamplesCell0() {
    return null;
  }
  
  public Object _initSuiteClassNameProviderDescribeSpecExamplesCell1() {
    return null;
  }
  
  public String _initSuiteClassNameProviderDescribeSpecExamplesCell2() {
    return "#";
  }
  
  public Object _initSuiteClassNameProviderDescribeSpecExamplesCell3() {
    return null;
  }
  
  public String _initSuiteClassNameProviderDescribeSpecExamplesCell4() {
    return "#my Suite";
  }
  
  public String _initSuiteClassNameProviderDescribeSpecExamplesCell5() {
    return "my Suite";
  }
  
  public String _initSuiteClassNameProviderDescribeSpecExamplesCell6() {
    return "##My Suite \n with multiple lines";
  }
  
  public String _initSuiteClassNameProviderDescribeSpecExamplesCell7() {
    return "My Suite";
  }
  
  @Test
  @Named("examples.forEach[subject.^describe[suite[name]] => expectedClassName]")
  @Order(1)
  public void _examplesForEachSubjectDescribeSuiteNameExpectedClassName() throws Exception {
    final Procedure1<SuiteClassNameProviderDescribeSpecExamples> _function = new Procedure1<SuiteClassNameProviderDescribeSpecExamples>() {
      public void apply(final SuiteClassNameProviderDescribeSpecExamples it) {
        String _name = it.getName();
        Suite _suite = Suites.suite(_name);
        String _describe = SuiteClassNameProviderDescribeSpec.this.subject.describe(_suite);
        String _expectedClassName = it.getExpectedClassName();
        boolean _doubleArrow = Should.<String>operator_doubleArrow(_describe, _expectedClassName);
        Assert.assertTrue("\nExpected subject.^describe(suite(name)) => expectedClassName but"
         + "\n     subject.^describe(suite(name)) is " + new org.hamcrest.StringDescription().appendValue(_describe).toString()
         + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(SuiteClassNameProviderDescribeSpec.this.subject).toString()
         + "\n     suite(name) is " + new org.hamcrest.StringDescription().appendValue(_suite).toString()
         + "\n     name is " + new org.hamcrest.StringDescription().appendValue(_name).toString()
         + "\n     expectedClassName is " + new org.hamcrest.StringDescription().appendValue(_expectedClassName).toString() + "\n", _doubleArrow);
        
      }
    };
    Each.<SuiteClassNameProviderDescribeSpecExamples>forEach(this.examples, _function);
  }
}
