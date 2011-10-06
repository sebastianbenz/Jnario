package de.bmw.carit.jnario.generator;

import com.google.inject.Inject;
import de.bmw.carit.jnario.generator.JnarioCompiler;
import de.bmw.carit.jnario.jnario.Given;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Then;
import de.bmw.carit.jnario.jnario.When;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JnarioGenerator implements IGenerator {
  
  @Inject
  private JnarioCompiler jnarioCompiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Jnario> _filter = IterableExtensions.<Jnario>filter(_allContentsIterable, de.bmw.carit.jnario.jnario.Jnario.class);
    for (final Jnario feature : _filter) {
      {
        String _name = feature.getName();
        String className = _name;
        String _replaceAll = className.replaceAll("[^A-Za-z0-9_]", "");
        className = _replaceAll;
        String _operator_plus = StringExtensions.operator_plus(className, ".java");
        StringConcatenation _compile = this.compile(feature, className);
        fsa.generateFile(_operator_plus, _compile);
      }
    }
  }
  
  public StringConcatenation compile(final Jnario spec, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    StringConcatenation _steps = this.steps(spec, importManager, className);
    _builder.append(_steps, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation steps(final Jnario feature, final ImportManager importManager, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.junit.Test;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Scenario> _scenarios = feature.getScenarios();
      for(final Scenario s : _scenarios) {
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("@Test");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("public void ");
        String _name = s.getName();
        String _extractName = this.extractName(_name);
        _builder.append(_extractName, "		");
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        this.jnarioCompiler.initializeStringBuilder(importManager);
        _builder.newLineIfNotEmpty();
        {
          Given _given = s.getGiven();
          EList<XBlockExpression> _code = _given.getCode();
          for(final XBlockExpression givenCode : _code) {
            {
              boolean _operator_notEquals = ObjectExtensions.operator_notEquals(givenCode, null);
              if (_operator_notEquals) {
                _builder.append("\t");
                _builder.append("\t");
                String _compile = this.jnarioCompiler.compile(givenCode);
                _builder.append(_compile, "		");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        {
          When _when = s.getWhen();
          EList<XBlockExpression> _code_1 = _when.getCode();
          for(final XBlockExpression whenCode : _code_1) {
            {
              boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(whenCode, null);
              if (_operator_notEquals_1) {
                _builder.append("\t");
                _builder.append("\t");
                String _compile_1 = this.jnarioCompiler.compile(whenCode);
                _builder.append(_compile_1, "		");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        {
          Then _then = s.getThen();
          EList<XBlockExpression> _code_2 = _then.getCode();
          for(final XBlockExpression thenCode : _code_2) {
            {
              boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(thenCode, null);
              if (_operator_notEquals_2) {
                _builder.append("\t");
                _builder.append("\t");
                String _compile_2 = this.jnarioCompiler.compile(thenCode);
                _builder.append(_compile_2, "		");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String extractName(final String name) {
    {
      String methodName = "";
      String[] _split = name.split(" ");
      String[] words = _split;
      for (final String word : words) {
        {
          String _firstUpper = StringExtensions.toFirstUpper(word);
          String upperWord = _firstUpper;
          String _operator_plus = StringExtensions.operator_plus(methodName, upperWord);
          methodName = _operator_plus;
        }
      }
      int _lastIndexOf = methodName.lastIndexOf(".");
      int indexOfSentenceEnd = _lastIndexOf;
      int _operator_minus = IntegerExtensions.operator_minus(1);
      boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)indexOfSentenceEnd), ((Integer)_operator_minus));
      if (_operator_greaterThan) {
        String _substring = methodName.substring(0, indexOfSentenceEnd);
        methodName = _substring;
      }
      String _firstLower = StringExtensions.toFirstLower(methodName);
      methodName = _firstLower;
      String _replaceAll = methodName.replaceAll("[^A-Za-z0-9_]", "");
      methodName = _replaceAll;
      return methodName;
    }
  }
}