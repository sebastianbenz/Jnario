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
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.doc.SpecDocGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SpecDocGenerator")
@RunWith(ExampleGroupRunner.class)
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
  @Order(1)
  public void _generatesScenarioTitleAndHeading() throws Exception {
    this.generateEmptyExampleDoc();
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _notEquals = (!Objects.equal(scenarioDoc, null));
    boolean _contains = scenarioDoc.contains("<title>Example</title>");
    boolean _and = (_notEquals && _contains);
    Assert.assertTrue("\nExpected scenarioDoc != null && \n\t\t\t\tscenarioDoc.contains(\"<title>Example</title>\") but"
     + "\n     scenarioDoc != null is " + new StringDescription().appendValue(_notEquals).toString()
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString()
     + "\n     scenarioDoc.contains(\"<title>Example</title>\") is " + new StringDescription().appendValue(_contains).toString() + "\n", _and);
    
    scenarioDoc.contains("<h1>Example</h1>");
  }
  
  @Test
  @Named("generates scenario documentation")
  @Order(2)
  public void _generatesScenarioDocumentation() throws Exception {
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
    
    boolean _contains_1 = scenarioDoc.contains("<p>Irrelevant documentation.</p>");
    boolean _not = (!_contains_1);
    Assert.assertTrue("\nExpected !scenarioDoc.contains(\"<p>Irrelevant documentation.</p>\") but"
     + "\n     scenarioDoc.contains(\"<p>Irrelevant documentation.</p>\") is " + new StringDescription().appendValue(_contains_1).toString()
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString() + "\n", _not);
    
  }
  
  @Test
  @Named("generates example documentation")
  @Order(3)
  public void _generatesExampleDocumentation() throws Exception {
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
    _builder.append("}");
    this.generateDoc(_builder);
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<p id=\"should_do_stuff\" class=\"example notrun\"><strong>should do stuff</strong></p>");
    _builder_1.newLine();
    _builder_1.append("<p>Example documentation</p>");
    _builder_1.newLine();
    _builder_1.append("<pre class=\"prettyprint lang-spec linenums\">");
    _builder_1.newLine();
    _builder_1.append("var x = 0");
    _builder_1.newLine();
    _builder_1.append("x = x + 1</pre>");
    String _string = _builder_1.toString();
    boolean _contains = scenarioDoc.contains(_string);
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'\'\'\n\t\t<p id=\"should_do_stuff\" class=\"example notrun\"><strong>should do stuff</strong></p>\n\t\t<p>Example documentation</p>\n\t\t<pre class=\"prettyprint lang-spec linenums\">\n\t\tvar x = 0\n\t\tx = x + 1</pre>\'\'\'.toString()) but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString()
     + "\n     \'\'\'\n\t\t<p id=\"should_do_stuff\" class=\"example notrun\"><strong>should do stuff</strong></p>\n\t\t<p>Example documentation</p>\n\t\t<pre class=\"prettyprint lang-spec linenums\">\n\t\tvar x = 0\n\t\tx = x + 1</pre>\'\'\'.toString() is " + new StringDescription().appendValue(_string).toString()
     + "\n     \'\'\'\n\t\t<p id=\"should_do_stuff\" class=\"example notrun\"><strong>should do stuff</strong></p>\n\t\t<p>Example documentation</p>\n\t\t<pre class=\"prettyprint lang-spec linenums\">\n\t\tvar x = 0\n\t\tx = x + 1</pre>\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _contains);
    
  }
  
  @Test
  @Named("supports markdown for documentation")
  @Order(4)
  public void _supportsMarkdownForDocumentation() throws Exception {
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
  @Order(5)
  public void _generatesTableForExampleTables() throws Exception {
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
    boolean _contains = scenarioDoc.contains("<p id=\"myExample\"><strong>MyExample</strong></p>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'<p id=\"myExample\"><strong>MyExample</strong></p>\') but"
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
  @Named("No code block for examples without description")
  @Order(6)
  public void _noCodeBlockForExamplesWithoutDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact 1 + 1 => 2");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.generateDoc(_builder);
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<pre class=\"prettyprint lang-spec linenums\">");
    _builder_1.newLine();
    _builder_1.append("1 + 1 =&gt; 2</pre>");
    boolean _should_contain = Should.should_contain(scenarioDoc, _builder_1);
    Assert.assertFalse("\nExpected scenarioDoc should not contain \'\'\'<pre class=\"prettyprint lang-spec linenums\">\n1 + 1 =&gt; 2</pre>\'\'\' but"
     + "\n     scenarioDoc is " + new StringDescription().appendValue(scenarioDoc).toString()
     + "\n     \'\'\'<pre class=\"prettyprint lang-spec linenums\">\n1 + 1 =&gt; 2</pre>\'\'\' is " + new StringDescription().appendValue(_builder_1).toString() + "\n", _should_contain);
    
  }
  
  @Test
  @Named("filters code based on regex in filter annotation")
  @Order(7)
  public void _filtersCodeBasedOnRegexInFilterAnnotation() throws Exception {
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
  
  @Test
  @Named("includes failing state for examples")
  @Order(8)
  public void _includesFailingStateForExamples() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'Example\'{");
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
