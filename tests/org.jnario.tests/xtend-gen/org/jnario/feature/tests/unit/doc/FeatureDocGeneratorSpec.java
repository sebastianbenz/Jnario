/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.doc;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.feature.doc.FeatureDocGenerator;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
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
  @Order(99)
  public void generatesScenarioDocumentation() throws Exception {
    final String actual = this.generateDoc("\r\n\t\t\tpackage test\r\n\r\n\t\t\tFeature: Example Feature\r\n\t\t\t\t\r\n\t\t\t\tThis is a description.\r\n\t\t\t\t\r\n\t\t\t\tScenario: Example Scenario\r\n\t\t\t\t\r\n\t\t\t\t\tString input\r\n\t\t\t\t\r\n\t\t\t\t\tGiven a step with an argument \"something\", another \'argument\' and a multiline string:\r\n\t\t\t\t\t\'\'\'\r\n\t\t\t\t\t\timport java.util.Collections.*;\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tpublic class Greeter{\r\n\t\t\t\t\t\t\tpublic static void main(String args[]){\r\n\t\t\t\t\t\t\t\tList<String> list = new ArrayList<String>(); // should escape angle brackets\r\n\t\t\t\t\t\t\t\tSysten.out.println(\'Hello World\');\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\'\'\' \r\n\t\t\t\t\t\tinput = args.first\r\n\t\t\t\t\t\tprintln(args.last)\r\n\t\t\t\t\tWhen I do something that is pending.\r\n\t\t\t\t\tThen it results in \'something else\'\r\n\t\t\t\t\t\tinput + \' else\' => args.first                                    \r\n\t\t");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p><p>This is a description.</p></p>");
    _builder.newLine();
    _builder.append("<h3  id=\"Scenario_Example_Scenario\">Scenario: Example Scenario");
    _builder.newLine();
    _builder.append("</h3>");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("<li><p><strong>Given</strong> a step with an argument <code>\"something\"</code>, another <code>\'argument\'</code> and a multiline string:</p><pre>import java.util.Collections.*;");
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
    _builder.append("}</pre>");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("<li><p><strong>When</strong> I do something that is pending. [PENDING]</p>");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("<li><p><strong>Then</strong> it results in <code>\'something else\'</code></p>");
    _builder.newLine();
    _builder.append("<ul>");
    _builder.newLine();
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("</li>");
    _builder.newLine();
    _builder.append("</ul>");
    _builder.newLine();
    final String expected = _builder.toString();
    Assert.assertEquals(expected, actual);
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
