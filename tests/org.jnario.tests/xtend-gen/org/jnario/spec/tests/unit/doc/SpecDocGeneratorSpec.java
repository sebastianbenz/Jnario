/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.tests.unit.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.doc.SpecDocGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SpecDocGenerator")
@CreateWith(value = SpecTestCreator.class)
public class SpecDocGeneratorSpec {
  @Subject
  public SpecDocGenerator subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Test
  @Named("generates scenario title and heading")
  @Order(99)
  public void generatesScenarioTitleAndHeading() throws Exception {
    this.generateEmptyExampleDoc();
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(scenarioDoc, null));
    boolean _contains = scenarioDoc.contains("<title>Example</title>");
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (_notEquals && _contains);
    }
    Assert.assertTrue("\nExpected scenarioDoc != null && \r\n\t\t\t\tscenarioDoc.contains(\"<title>Example</title>\") but"
     + "\n     scenarioDoc != null is " + new StringDescription().appendValue(_notEquals).toString()
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString()
     + "\n     scenarioDoc.contains(\"<title>Example</title>\") is " + new StringDescription().appendValue(_contains).toString() + "\n", _and);
    
    scenarioDoc.contains("<h1>Example</h1>");
  }
  
  @Test
  @Named("generates scenario documentation")
  @Order(99)
  public void generatesScenarioDocumentation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Irrelevant documentation.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is an example.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.generateDoc(_builder);
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("<p>This is an example.</p>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<p>This is an example.</p>\") but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
    boolean _contains_1 = scenarioDoc.contains("Irrelevant documentation.");
    boolean _not = (!_contains_1);
    Assert.assertTrue("\nExpected !scenarioDoc.contains(\"Irrelevant documentation.\") but"
     + "\n     scenarioDoc.contains(\"Irrelevant documentation.\") is " + new StringDescription().appendValue(_contains_1).toString()
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _not);
    
  }
  
  @Test
  @Named("generates example documentation")
  @Order(99)
  public void generatesExampleDocumentation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Example documentation");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"should do stuff\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var x = 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x = x + 1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.generateDoc(_builder);
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<strong>should do stuff</strong>");
    _builder_1.newLine();
    _builder_1.append("<p>Example documentation</p>");
    _builder_1.newLine();
    _builder_1.append("<pre class=\"prettyprint lang-spec\">");
    _builder_1.newLine();
    _builder_1.append("var x = 0");
    _builder_1.newLine();
    _builder_1.append("x = x + 1</pre>");
    _builder_1.newLine();
    _builder_1.append("</p>");
    String _string = _builder_1.toString();
    boolean _contains = scenarioDoc.contains(_string);
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'\'\'\r\n\t\t<strong>should do stuff</strong>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\r\n\t\t</p>\'\'\'.toString()) but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString()
     + "\n     \'\'\'\r\n\t\t<strong>should do stuff</strong>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\r\n\t\t</p>\'\'\'.toString() is " + new StringDescription().appendValue(_string).toString()
     + "\n     \'\'\'\r\n\t\t<strong>should do stuff</strong>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\r\n\t\t</p>\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _contains);
    
  }
  
  @Test
  @Named("should support markdown for documentation")
  @Order(99)
  public void shouldSupportMarkdownForDocumentation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* #Example Heading");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.generateDoc(_builder);
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("<h1>Example Heading</h1>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<h1>Example Heading</h1>\") but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
  }
  
  @Test
  @Named("generates table for example tables")
  @Order(99)
  public void generatesTableForExampleTables() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def myExample{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| a | b |");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| 1 | 2 |");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.generateDoc(_builder);
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("<h4 id=\"myExample\">MyExample</h4>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'<h4 id=\"myExample\">MyExample</h4>\') but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
    boolean _contains_1 = scenarioDoc.contains("<th>a</th>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<th>a</th>\") but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_1);
    
    boolean _contains_2 = scenarioDoc.contains("<th>b</th>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<th>b</th>\") but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_2);
    
    boolean _contains_3 = scenarioDoc.contains("<td>1</td>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<td>1</td>\") but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_3);
    
    boolean _contains_4 = scenarioDoc.contains("<td>2</td>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<td>2</td>\") but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_4);
    
  }
  
  @Test
  @Named("filters code based on regex in filter annotation")
  @Order(99)
  public void filtersCodeBasedOnRegexInFilterAnnotation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @filter(bbb)");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"should do stuff\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"aaabbbaaa\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.generateDoc(_builder);
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("aaaaaa");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'aaaaaa\') but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
  }
  
  public void generateEmptyExampleDoc() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.generateDoc(_builder);
  }
  
  public void generateDoc(final CharSequence input) {
    final Resource resource = this._modelStore.parseSpec(input);
    this.subject.doGenerate(resource, this.fsa);
  }
  
  public String generatedFile(final String name) {
    Map<String,CharSequence> _files = this.fsa.getFiles();
    String _plus = ("DOC_OUTPUT/" + name);
    CharSequence _get = _files.get(_plus);
    return _get==null?(String)null:_get.toString();
  }
}
