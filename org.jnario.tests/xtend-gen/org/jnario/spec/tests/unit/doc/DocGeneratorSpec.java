package org.jnario.spec.tests.unit.doc;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestInstantiator;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.InstantiateWith;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.doc.DocGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Objects;
import com.google.inject.Inject;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("DocGenerator")
@InstantiateWith(SpecTestInstantiator.class)
public class DocGeneratorSpec {
  @Subject
  public DocGenerator subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Test
  @Named("should generate java script helper files")
  @Order(99)
  public void shouldGenerateJavaScriptHelperFiles() throws Exception {
    this.generateEmptyExampleDoc();
    String _generatedFile = this.generatedFile("js/prettify.js");
    boolean _notEquals = (!Objects.equal(_generatedFile, null));
    Assert.assertTrue("\nExpected generatedFile(\"js/prettify.js\") != null but:"
     + "\n     generatedFile(\"js/prettify.js\") is " + "\"" + _generatedFile + "\"" + "\n", _notEquals);
    
    String _generatedFile_1 = this.generatedFile("js/lang-jnario.js");
    boolean _notEquals_1 = (!Objects.equal(_generatedFile_1, null));
    Assert.assertTrue("\nExpected generatedFile(\"js/lang-jnario.js\") != null but:"
     + "\n     generatedFile(\"js/lang-jnario.js\") is " + "\"" + _generatedFile_1 + "\"" + "\n", _notEquals_1);
    
  }
  
  @Test
  @Named("should generate css helper files")
  @Order(99)
  public void shouldGenerateCssHelperFiles() throws Exception {
    this.generateEmptyExampleDoc();
    String _generatedFile = this.generatedFile("css/bootstrap-responsive.min.css");
    boolean _notEquals = (!Objects.equal(_generatedFile, null));
    Assert.assertTrue("\nExpected generatedFile(\"css/bootstrap-responsive.min.css\") != null but:"
     + "\n     generatedFile(\"css/bootstrap-responsive.min.css\") is " + "\"" + _generatedFile + "\"" + "\n", _notEquals);
    
    String _generatedFile_1 = this.generatedFile("css/custom.css");
    boolean _notEquals_1 = (!Objects.equal(_generatedFile_1, null));
    Assert.assertTrue("\nExpected generatedFile(\"css/custom.css\") != null but:"
     + "\n     generatedFile(\"css/custom.css\") is " + "\"" + _generatedFile_1 + "\"" + "\n", _notEquals_1);
    
    String _generatedFile_2 = this.generatedFile("css/prettify.css");
    boolean _notEquals_2 = (!Objects.equal(_generatedFile_2, null));
    Assert.assertTrue("\nExpected generatedFile(\"css/prettify.css\") != null but:"
     + "\n     generatedFile(\"css/prettify.css\") is " + "\"" + _generatedFile_2 + "\"" + "\n", _notEquals_2);
    
  }
  
  @Test
  @Named("should generate scenario title and heading")
  @Order(99)
  public void shouldGenerateScenarioTitleAndHeading() throws Exception {
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
    Assert.assertTrue("\nExpected scenarioDoc != null && \r\n\t\t\t\tscenarioDoc.contains(\"<title>Example</title>\") but:"
     + "\n     scenarioDoc != null is " + _notEquals
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\""
     + "\n     scenarioDoc.contains(\"<title>Example</title>\") is " + _contains + "\n", _and);
    
    scenarioDoc.contains("<h1>Example</h1>");
  }
  
  @Test
  @Named("should generate scenario documentation")
  @Order(99)
  public void shouldGenerateScenarioDocumentation() throws Exception {
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
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<p>This is an example.</p>\") but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains);
    
    boolean _contains_1 = scenarioDoc.contains("Irrelevant documentation.");
    boolean _not = (!_contains_1);
    Assert.assertTrue("\nExpected !scenarioDoc.contains(\"Irrelevant documentation.\") but:"
     + "\n     scenarioDoc.contains(\"Irrelevant documentation.\") is " + _contains_1
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _not);
    
  }
  
  @Test
  @Named("should generate example documentation")
  @Order(99)
  public void shouldGenerateExampleDocumentation() throws Exception {
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
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'\'\'\r\n\t\t<strong>should do stuff</strong>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\r\n\t\t</p>\'\'\'.toString()) but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\""
     + "\n     \'\'\'\r\n\t\t<strong>should do stuff</strong>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\r\n\t\t</p>\'\'\'.toString() is " + "\"" + _string + "\""
     + "\n     \'\'\'\r\n\t\t<strong>should do stuff</strong>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\r\n\t\t</p>\'\'\' is " + _builder_1 + "\n", _contains);
    
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
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<h1>Example Heading</h1>\") but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains);
    
  }
  
  @Test
  @Named("should generate table for example tables")
  @Order(99)
  public void shouldGenerateTableForExampleTables() throws Exception {
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
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<h4 id=\\\"myExample\\\">MyExample</h4>\") but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains);
    
    boolean _contains_1 = scenarioDoc.contains("<th>a</th>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<th>a</th>\") but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains_1);
    
    boolean _contains_2 = scenarioDoc.contains("<th>b</th>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<th>b</th>\") but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains_2);
    
    boolean _contains_3 = scenarioDoc.contains("<td>1</td>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<td>1</td>\") but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains_3);
    
    boolean _contains_4 = scenarioDoc.contains("<td>2</td>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<td>2</td>\") but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains_4);
    
  }
  
  @Test
  @Named("should filter code based on regex in filter annotation")
  @Order(99)
  public void shouldFilterCodeBasedOnRegexInFilterAnnotation() throws Exception {
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
    boolean _contains = scenarioDoc.contains("\"aaaaaa\"");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'\"aaaaaa\"\') but:"
     + "\n     scenarioDoc is " + "\"" + scenarioDoc + "\"" + "\n", _contains);
    
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
