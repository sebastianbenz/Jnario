package org.jnario.feature.tests.unit.doc;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.Executable;
import org.jnario.feature.doc.FeatureDocGenerator;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecFailure;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("FeatureDocGenerator")
@CreateWith(value = FeatureTestCreator.class)
public class FeatureDocGeneratorSpec {
  @Subject
  public FeatureDocGenerator subject;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Test
  @Named("generates scenario documentation")
  @Order(0)
  public void _generatesScenarioDocumentation() throws Exception {
    final String actual = this.generateDoc("\n\t\t\tpackage test\n\n\t\t\tFeature: Example Feature\n\t\t\t\t\n\t\t\t\tThis is a description.\n\t\t\t\t\n\t\t\t\tScenario: Example Scenario\n\t\t\t\t\n\t\t\t\t\tString input\n\t\t\t\t\n\t\t\t\t\tGiven a step with an argument \"something\", another \"argument\" and a multiline string:\n\t\t\t\t\t\'\'\'\n\t\t\t\t\t\timport java.util.Collections.*;\n\t\t\t\t\t\t\n\t\t\t\t\t\tpublic class Greeter{\n\t\t\t\t\t\t\tpublic static void main(String args[]){\n\t\t\t\t\t\t\t\tList<String> list = new ArrayList<String>(); // should escape angle brackets\n\t\t\t\t\t\t\t\tSysten.out.println(\'Hello World\');\n\t\t\t\t\t\t\t}\n\t\t\t\t\t\t}\'\'\' \n\t\t\t\t\t\tinput = args.first\n\t\t\t\t\t\tprintln(args.last)\n\t\t\t\t\tWhen I do something that is pending.\n\t\t\t\t\tThen it results in \"something else\"\n\t\t\t\t\t\tinput + \' else\' => args.first                                    \n\t\t");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>This is a description.</p>");
    _builder.newLine();
    _builder.append("<div><h3 class=\"scenario \"  id=\"Scenario_Example_Scenario\">Scenario: Example Scenario");
    _builder.newLine();
    _builder.append("</h3>");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("<li><span class=\"step \"><p>Given a step with an argument <code>\"something\"</code>, another <code>\"argument\"</code> and a multiline string:</p><pre>import java.util.Collections.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Greeter{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public static void main(String args[]){");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("List&lt;String&gt; list = new ArrayList&lt;String&gt;(); // should escape angle brackets");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Systen.out.println(\'Hello World\');");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}</pre></span>");
    _builder.newLine();
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("<li><span class=\"step \"><p>When I do something that is pending. [PENDING]</p></span>");
    _builder.newLine();
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("<li><span class=\"step \"><p>Then it results in <code>\"something else\"</code></p></span>");
    _builder.newLine();
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</div>");
    _builder.newLine();
    final String expected = _builder.toString();
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  @Named("Includes failure state in Feature")
  @Order(1)
  public void _includesFailureStateInFeature() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: Example");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Scenario: A failing Scenario");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Given something");
    _builder.newLine();
    _builder.append("When something happens ");
    _builder.newLine();
    _builder.append("Then there is an error");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Scenario: Another scnario");
    _builder.newLine();
    _builder.append("Given something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    _builder.append("Then something else");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"\"       ");
    _builder.newLine();
    this.generateDocWithError(_builder);
  }
  
  @Inject
  JavaIoFileSystemAccess fsa2;
  
  final CharSequence message = new Function0<CharSequence>() {
    public CharSequence apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Expected result => args.first.toInt but      ");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("result is <122>     ");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("args.first.toInt is <120>       ");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("args.first is \"120\"     ");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("args is <[120]>");
      _builder.newLine();
      return _builder;
    }
  }.apply();
  
  boolean toggle = true;
  
  Executable2ResultMapping mapping = new Function0<Executable2ResultMapping>() {
    public Executable2ResultMapping apply() {
      final Function1<Executable,SpecExecution> _function = new Function1<Executable,SpecExecution>() {
          public SpecExecution apply(final Executable it) {
            SpecExecution _xifexpression = null;
            if (FeatureDocGeneratorSpec.this.toggle) {
              Failed _xblockexpression = null;
              {
                boolean _not = (!FeatureDocGeneratorSpec.this.toggle);
                FeatureDocGeneratorSpec.this.toggle = _not;
                String _string = FeatureDocGeneratorSpec.this.message.toString();
                StringConcatenation _builder = new StringConcatenation();
                _builder.append("java.lang.StringIndexOutOfBoundsException: String index out of range: -1");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("at java.lang.String.substring(String.java:1937)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("at java.lang.String.substring(String.java:1904)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("at org.jnario.feature.doc.FeatureDocGenerator$1.apply(FeatureDocGenerator.java:44)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("at org.jnario.feature.doc.FeatureDocGenerator$1.apply(FeatureDocGenerator.java:1)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("at org.jnario.doc.HtmlFile.newHtmlFile(HtmlFile.java:21)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("at org.jnario.feature.doc.FeatureDocGenerator.createHtmlFile(FeatureDocGenerator.java:57)");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("at org.jnario.doc.AbstractDocGenerator$2$1.apply(AbstractDocGenerator.java:88)");
                _builder.newLine();
                String _string_1 = _builder.toString();
                SpecFailure _specFailure = new SpecFailure(_string, "Exception", _string_1);
                Failed _failingSpec = Failed.failingSpec("org.jnario.Class", "This Feature", 0.3, _specFailure);
                _xblockexpression = (_failingSpec);
              }
              _xifexpression = _xblockexpression;
            } else {
              Passed _xblockexpression_1 = null;
              {
                boolean _not = (!FeatureDocGeneratorSpec.this.toggle);
                FeatureDocGeneratorSpec.this.toggle = _not;
                Passed _passingSpec = Passed.passingSpec("org.jnario.class", "Something", 0.4);
                _xblockexpression_1 = (_passingSpec);
              }
              _xifexpression = _xblockexpression_1;
            }
            return _xifexpression;
          }
        };
      return new Executable2ResultMapping() {
          public SpecExecution getResult(Executable executable) {
            return _function.apply(executable);
          }
      };
    }
  }.apply();
  
  public void generateDocWithError(final CharSequence input) {
    final Resource resource = this._modelStore.parseScenario(input);
    this.fsa2.setOutputPath("DOC_OUTPUT", "tmp/");
    this.subject.doGenerate(resource, this.fsa2, this.mapping);
  }
  
  public String generateDoc(final CharSequence input) {
    final Resource resource = this._modelStore.parseScenario(input);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final FeatureFile featureFile = ((FeatureFile) _head);
    EList<XtendClass> _xtendClasses = featureFile.getXtendClasses();
    XtendClass _head_1 = IterableExtensions.<XtendClass>head(_xtendClasses);
    CharSequence _generateContent = this.subject.generateContent(((Feature) _head_1));
    return _generateContent.toString();
  }
}
