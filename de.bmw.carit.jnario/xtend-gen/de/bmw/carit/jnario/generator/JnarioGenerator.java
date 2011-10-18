package de.bmw.carit.jnario.generator;

import com.google.inject.Inject;
import de.bmw.carit.jnario.generator.JnarioCompiler;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
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
  
  public StringConcatenation compile(final Jnario feature, final String className) {
    StringConcatenation _xblockexpression = null;
    {
      ImportManager _importManager = new ImportManager(true);
      final ImportManager importManager = _importManager;
      String testClassContent = "";
      EList<Scenario> _scenarios = feature.getScenarios();
      for (final Scenario scenario : _scenarios) {
        String _compile = this.jnarioCompiler.compile(scenario, importManager);
        String _operator_plus = StringExtensions.operator_plus(testClassContent, _compile);
        testClassContent = _operator_plus;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import org.junit.Test;");
      _builder.newLine();
      _builder.newLine();
      {
        List<String> _imports = importManager.getImports();
        for(final String i : _imports) {
          _builder.append("import ");
          _builder.append(i, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("public class ");
      _builder.append(className, "");
      _builder.append("{");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append(testClassContent, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}