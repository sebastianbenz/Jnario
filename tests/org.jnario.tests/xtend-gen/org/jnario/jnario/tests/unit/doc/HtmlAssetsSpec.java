package org.jnario.jnario.tests.unit.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.hamcrest.StringDescription;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.doc.HtmlAssets;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("HtmlAssets")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = SpecTestCreator.class)
public class HtmlAssetsSpec {
  @Subject
  public HtmlAssets subject;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Before
  public void before() throws Exception {
    this.subject.generate(this.fsa);
  }
  
  @Test
  @Named("generates java script helper files")
  @Order(1)
  public void _generatesJavaScriptHelperFiles() throws Exception {
    String _generatedFile = this.generatedFile("js/prettify.js");
    boolean _notEquals = (!Objects.equal(_generatedFile, null));
    Assert.assertTrue("\nExpected generatedFile(\"js/prettify.js\") != null but"
     + "\n     generatedFile(\"js/prettify.js\") is " + new StringDescription().appendValue(_generatedFile).toString() + "\n", _notEquals);
    
    String _generatedFile_1 = this.generatedFile("js/lang-jnario.js");
    boolean _notEquals_1 = (!Objects.equal(_generatedFile_1, null));
    Assert.assertTrue("\nExpected generatedFile(\"js/lang-jnario.js\") != null but"
     + "\n     generatedFile(\"js/lang-jnario.js\") is " + new StringDescription().appendValue(_generatedFile_1).toString() + "\n", _notEquals_1);
    
  }
  
  @Test
  @Named("generates css helper files")
  @Order(2)
  public void _generatesCssHelperFiles() throws Exception {
    String _generatedFile = this.generatedFile("css/bootstrap-responsive.min.css");
    boolean _notEquals = (!Objects.equal(_generatedFile, null));
    Assert.assertTrue("\nExpected generatedFile(\"css/bootstrap-responsive.min.css\") != null but"
     + "\n     generatedFile(\"css/bootstrap-responsive.min.css\") is " + new StringDescription().appendValue(_generatedFile).toString() + "\n", _notEquals);
    
    String _generatedFile_1 = this.generatedFile("css/custom.css");
    boolean _notEquals_1 = (!Objects.equal(_generatedFile_1, null));
    Assert.assertTrue("\nExpected generatedFile(\"css/custom.css\") != null but"
     + "\n     generatedFile(\"css/custom.css\") is " + new StringDescription().appendValue(_generatedFile_1).toString() + "\n", _notEquals_1);
    
    String _generatedFile_2 = this.generatedFile("css/prettify.css");
    boolean _notEquals_2 = (!Objects.equal(_generatedFile_2, null));
    Assert.assertTrue("\nExpected generatedFile(\"css/prettify.css\") != null but"
     + "\n     generatedFile(\"css/prettify.css\") is " + new StringDescription().appendValue(_generatedFile_2).toString() + "\n", _notEquals_2);
    
  }
  
  public String generatedFile(final String name) {
    Map<String,CharSequence> _files = this.fsa.getFiles();
    String _plus = (DocOutputConfigurationProvider.ASSET_OUTPUT + name);
    CharSequence _get = _files.get(_plus);
    return _get==null?(String)null:_get.toString();
  }
}
