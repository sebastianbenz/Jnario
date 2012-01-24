package de.bmw.carit.jnario.spec.doc;

import com.google.inject.Inject;
import de.bmw.carit.jnario.spec.naming.ExampleNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecFile;
import de.bmw.carit.jnario.spec.util.Strings;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.xtend2.XtendClass;

@SuppressWarnings("all")
public class DocGenerator implements IGenerator {
  @Inject
  private ExampleNameProvider _exampleNameProvider;
  
  private Set<String> cssFiles = new Function0<Set<String>>() {
    public Set<String> apply() {
      HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("bootstrap.min.css", "custom.css", "prettify.css");
      return _newHashSet;
    }
  }.apply();
  
  private Set<String> jsFiles = new Function0<Set<String>>() {
    public Set<String> apply() {
      HashSet<String> _newHashSet = CollectionLiterals.<String>newHashSet("lang-xtend.js", "prettify.js");
      return _newHashSet;
    }
  }.apply();
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
      this.copy(fsa, "css", this.cssFiles);
      this.copy(fsa, "js", this.jsFiles);
      EList<EObject> _contents = input.getContents();
      Iterable<SpecFile> _filter = IterableExtensions.<SpecFile>filter(_contents, de.bmw.carit.jnario.spec.spec.SpecFile.class);
      for (final SpecFile spec : _filter) {
        {
          XtendClass _xtendClass = spec.getXtendClass();
          final ExampleGroup exampleGroup = ((ExampleGroup) _xtendClass);
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(exampleGroup, null);
          if (_operator_notEquals) {
            String _fileName = this.fileName(exampleGroup);
            CharSequence _generate = this.generate(exampleGroup);
            fsa.generateFile(_fileName, _generate);
          }
        }
      }
  }
  
  public String fileName(final ExampleGroup exampleGroup) {
      String _javaClassName = this._exampleNameProvider.toJavaClassName(exampleGroup);
      String _operator_plus = StringExtensions.operator_plus("/", _javaClassName);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".html");
      final String fileName = _operator_plus_1;
      String _packageName = exampleGroup.getPackageName();
      boolean _operator_equals = ObjectExtensions.operator_equals(_packageName, null);
      if (_operator_equals) {
        return fileName;
      }
      String _packageName_1 = exampleGroup.getPackageName();
      String _replaceAll = _packageName_1.replaceAll("\\.", "/");
      String _operator_plus_2 = StringExtensions.operator_plus("/", _replaceAll);
      String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, fileName);
      return _operator_plus_3;
  }
  
  public void copy(final IFileSystemAccess fsa, final String targetFolder, final Set<String> files) {
    for (final String file : files) {
      String _operator_plus = StringExtensions.operator_plus("/", targetFolder);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "/");
      String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, file);
      String _load = this.load(file);
      fsa.generateFile(_operator_plus_2, _load);
    }
  }
  
  public String load(final String file) {
      Class<? extends Object> _class = this.getClass();
      InputStream _resourceAsStream = _class.getResourceAsStream(file);
      final InputStream inputStream = _resourceAsStream;
      String _convertStreamToString = Strings.convertStreamToString(inputStream);
      return _convertStreamToString;
  }
  
  public String folder(final String name, final ExampleGroup context) {
    String _root = this.root(context);
    String _operator_plus = StringExtensions.operator_plus(_root, name);
    return _operator_plus;
  }
  
  public String root(final ExampleGroup exampleGroup) {
      SpecFile _containerOfType = EcoreUtil2.<SpecFile>getContainerOfType(exampleGroup, de.bmw.carit.jnario.spec.spec.SpecFile.class);
      final SpecFile specFile = _containerOfType;
      XtendClass _xtendClass = specFile.getXtendClass();
      String _packageName = _xtendClass.getPackageName();
      final String packageName = _packageName;
      boolean _operator_equals = ObjectExtensions.operator_equals(packageName, null);
      if (_operator_equals) {
        return "";
      }
      String[] _split = packageName.split("\\.");
      final String[] fragments = _split;
      final String[] _typeConverted_fragments = (String[])fragments;
      final Function1<String,String> _function = new Function1<String,String>() {
          public String apply(final String s) {
            return "../";
          }
        };
      List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_typeConverted_fragments)), _function);
      final List<String> path = _map;
      String _join = IterableExtensions.join(path, "");
      return _join;
  }
  
  public CharSequence generate(final ExampleGroup exampleGroup) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("<title>");
    String _describe = this._exampleNameProvider.describe(exampleGroup);
    _builder.append(_describe, "");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("<meta name=\"description\" content=\"\">");
    _builder.newLine();
    _builder.append("<meta name=\"author\" content=\"Jnario\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->");
    _builder.newLine();
    _builder.append("<!--[if lt IE 9]>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<![endif]-->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le styles -->");
    _builder.newLine();
    {
      for(final String cssFile : this.cssFiles) {
        _builder.append("<link rel=\"stylesheet\" href=\"");
        String _folder = this.folder("css", exampleGroup);
        _builder.append(_folder, "");
        _builder.append("/");
        String _folder_1 = this.folder("css", exampleGroup);
        _builder.append(_folder_1, "");
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final String jsFile : this.jsFiles) {
        _builder.append("<script type=\"text/javascript\" src=\"");
        String _folder_2 = this.folder("css", exampleGroup);
        _builder.append(_folder_2, "");
        _builder.append("/");
        _builder.append(jsFile, "");
        _builder.append("\"></script>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body onload=\"prettyPrint()\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"content\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"page-header\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<h1>");
    String _describe_1 = this._exampleNameProvider.describe(exampleGroup);
    _builder.append(_describe_1, "				");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<footer>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>Generated by Jnario.</p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</footer>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- /container -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
