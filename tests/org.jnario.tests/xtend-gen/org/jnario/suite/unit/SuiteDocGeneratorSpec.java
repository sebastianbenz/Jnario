package org.jnario.suite.unit;

import com.google.inject.Inject;
import junit.framework.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.doc.HtmlFile;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.doc.SuiteDocGenerator;
import org.jnario.suite.suite.SuiteFile;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("SuiteDocGenerator")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SuiteTestCreator.class)
public class SuiteDocGeneratorSpec {
  @Subject
  public SuiteDocGenerator subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Before
  public void before() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("describe \"Red\"{");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("describe \"Blue\"{");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("describe \"Green\"{");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("describe \"Grey\"{");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder);
  }
  
  @Test
  @Named("Generates suite doc with resolved specs")
  @Order(1)
  public void _generatesSuiteDocWithResolvedSpecs() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#Heading");
    _builder.newLine();
    _builder.append("Heading description.");
    _builder.newLine();
    _builder.append("- \"Red\"");
    _builder.newLine();
    _builder.append("- \"Blue\": with a description");
    _builder.newLine();
    _builder.append("##Subheading");
    _builder.newLine();
    _builder.append("Subheading description with **markdown**.");
    _builder.newLine();
    _builder.append("- \\.*G.*\\");
    _builder.newLine();
    final String actual = this.generateDoc(_builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("<p>Heading description.</p>");
    _builder_1.newLine();
    _builder_1.append("<ul>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<li><a class=\"specref pending\" href=\"../test/RedSpec.html\">Red</a> <strong class=\"icon pending\">~</strong></li>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<li><a class=\"specref pending\" href=\"../test/BlueSpec.html\">Blue</a> <strong class=\"icon pending\">~</strong>: with a description</li>");
    _builder_1.newLine();
    _builder_1.append("</ul>");
    _builder_1.newLine();
    _builder_1.append("<span id=\"Subheading\" class=\"suite pending\"><h2>Subheading</h2></span>");
    _builder_1.newLine();
    _builder_1.append("<p>Subheading description with <strong>markdown</strong>.</p>");
    _builder_1.newLine();
    _builder_1.append("<ul>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<li><a class=\"specref pending\" href=\"../test/GreenSpec.html\">Green</a> <strong class=\"icon pending\">~</strong></li>");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("<li><a class=\"specref pending\" href=\"../test/GreySpec.html\">Grey</a> <strong class=\"icon pending\">~</strong></li>");
    _builder_1.newLine();
    _builder_1.append("</ul>");
    _builder_1.newLine();
    final String expected = _builder_1.toString();
    Assert.assertEquals(expected, actual);
  }
  
  public String generateDoc(final CharSequence input) {
    String _xblockexpression = null;
    {
      final Resource resource = this._modelStore.parseSuite(input);
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      HtmlFile _createHtmlFile = this.subject.createHtmlFile(((SuiteFile) _head));
      CharSequence _content = _createHtmlFile.getContent();
      String _string = _content.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
