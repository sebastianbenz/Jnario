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
import org.jnario.suite.unit.SuiteClassNameProviderSpec;
import org.jnario.suite.unit.SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toQualifiedJavaClassName")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteClassNameProviderToQualifiedJavaClassNameSpec extends SuiteClassNameProviderSpec {
  @Subject
  public SuiteClassNameProvider subject;
  
  public ExampleTable<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples> _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("name", "packageName", "qualifiedName"), 
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  Arrays.asList("null", "null", "null"), null, null, null),
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  Arrays.asList("\"#\"", "\"test\"", "null"), _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell3(), _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell4(), null),
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  Arrays.asList("\"#my Suite\"", "null", "\"MySuiteSuite\""), _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell6(), null, _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell8()),
      new SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(  Arrays.asList("\"##My Suite \\n with multiple lines\"", "\"test\"", "\"test.MySuiteSuite\""), _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell9(), _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell10(), _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell11())
    );
  }
  
  protected ExampleTable<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples> examples = _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamples();
  
  public Object _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell0() {
    return null;
  }
  
  public Object _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell1() {
    return null;
  }
  
  public Object _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell2() {
    return null;
  }
  
  public String _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell3() {
    return "#";
  }
  
  public String _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell4() {
    return "test";
  }
  
  public Object _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell5() {
    return null;
  }
  
  public String _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell6() {
    return "#my Suite";
  }
  
  public Object _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell7() {
    return null;
  }
  
  public String _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell8() {
    return "MySuiteSuite";
  }
  
  public String _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell9() {
    return "##My Suite \n with multiple lines";
  }
  
  public String _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell10() {
    return "test";
  }
  
  public String _initSuiteClassNameProviderToQualifiedJavaClassNameSpecExamplesCell11() {
    return "test.MySuiteSuite";
  }
  
  @Test
  @Named("examples.forEach[ val actualName = subject.toQualifiedJavaClassName[suite[name, packageName]] actualName => qualifiedName ]")
  @Order(1)
  public void _examplesForEachValActualNameSubjectToQualifiedJavaClassNameSuiteNamePackageNameActualNameQualifiedName() throws Exception {
    final Procedure1<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples> _function = new Procedure1<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples>() {
      public void apply(final SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples it) {
        String _name = it.getName();
        String _packageName = it.getPackageName();
        Suite _suite = Suites.suite(_name, _packageName);
        final String actualName = SuiteClassNameProviderToQualifiedJavaClassNameSpec.this.subject.toQualifiedJavaClassName(_suite);
        String _qualifiedName = it.getQualifiedName();
        boolean _doubleArrow = Should.<String>operator_doubleArrow(actualName, _qualifiedName);
        Assert.assertTrue("\nExpected actualName => qualifiedName but"
         + "\n     actualName is " + new org.hamcrest.StringDescription().appendValue(actualName).toString()
         + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", _doubleArrow);
        
      }
    };
    Each.<SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples>forEach(this.examples, _function);
  }
}
