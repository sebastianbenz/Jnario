package de.bmw.carit.xspec.generator;

import com.google.inject.Inject;
import de.bmw.carit.xspec.generator.XSpecCompiler;
import de.bmw.carit.xspec.xspec.Given;
import de.bmw.carit.xspec.xspec.Sentence;
import de.bmw.carit.xspec.xspec.Then;
import de.bmw.carit.xspec.xspec.When;
import de.bmw.carit.xspec.xspec.XSpec;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class XSpecGenerator implements IGenerator {
  
  @Inject
  private XSpecCompiler xSpecCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<XSpec> _filter = IterableExtensions.<XSpec>filter(_allContentsIterable, de.bmw.carit.xspec.xspec.XSpec.class);
    for (XSpec spec : _filter) {
      String _moduleName = spec.getModuleName();
      String _operator_plus = StringExtensions.operator_plus(_moduleName, ".java");
      StringConcatenation _compile = this.compile(spec);
      fsa.generateFile(_operator_plus, _compile);
    }
  }
  
  public StringConcatenation compile(final XSpec spec) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _steps = this.steps(spec, importManager);
    _builder.append(_steps, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation steps(final XSpec spec, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.junit.Test;");
    _builder.newLine();
    _builder.append("import org.junit.Before;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _moduleName = spec.getModuleName();
    _builder.append(_moduleName, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Sentence> _specs = spec.getSpecs();
      for(Sentence s : _specs) {
        _builder.append("\t");
        Given _given = s.getGiven();
        Given _given_1 = s.getGiven();
        String _desc = _given_1.getDesc();
        String _extractName = this.extractName(_desc);
        StringConcatenation _given_2 = this.given(_given, _extractName, importManager);
        _builder.append(_given_2, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Test");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void test(){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        When _when = s.getWhen();
        String _desc_1 = _when.getDesc();
        String _extractName_1 = this.extractName(_desc_1);
        String whenName = _extractName_1;
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(whenName, "		");
        _builder.append("(); ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        Then _then = s.getThen();
        String _desc_2 = _then.getDesc();
        String _extractName_2 = this.extractName(_desc_2);
        String thenName = _extractName_2;
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append(thenName, "		");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        When _when_1 = s.getWhen();
        StringConcatenation _when_2 = this.when(_when_1, whenName, importManager);
        _builder.append(_when_2, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        Then _then_1 = s.getThen();
        StringConcatenation _then_2 = this.then(_then_1, thenName, importManager);
        _builder.append(_then_2, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation given(final Given given, final String givenName, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Before");
    _builder.newLine();
    _builder.append("public void ");
    _builder.append(givenName, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    XBlockExpression _code = given.getCode();
    String _compile = this.xSpecCompiler.compile(_code, importManager);
    _builder.append(_compile, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation when(final When when, final String whenName, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private void ");
    _builder.append(whenName, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    XBlockExpression _code = when.getCode();
    String _compile = this.xSpecCompiler.compile(_code, importManager);
    _builder.append(_compile, "	");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation then(final Then then, final String thenName, final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private void ");
    _builder.append(thenName, "");
    _builder.append("(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    XBlockExpression _code = then.getCode();
    String _compile = this.xSpecCompiler.compile(_code, importManager);
    _builder.append(_compile, "	");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String extractName(final String name) {
    {
      String methodName = "";
      String[] _split = name.split(" ");
      String[] words = _split;
      for (String word : words) {
        {
          String _firstUpper = StringExtensions.toFirstUpper(word);
          String upperWord = _firstUpper;
          String _operator_plus = StringExtensions.operator_plus(methodName, upperWord);
          methodName = _operator_plus;
        }
      }
      int _lastIndexOf = methodName.lastIndexOf(".");
      int indexOfSentenceEnd = _lastIndexOf;
      String _substring = methodName.substring(0, indexOfSentenceEnd);
      methodName = _substring;
      String _firstLower = StringExtensions.toFirstLower(methodName);
      methodName = _firstLower;
      return methodName;
    }
  }
}