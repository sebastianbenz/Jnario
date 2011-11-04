package de.bmw.carit.jnario.generator;

import com.google.inject.Inject;
import de.bmw.carit.jnario.generator.JnarioCompiler;
import de.bmw.carit.jnario.jnario.Background;
import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.Examples;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.AbstractFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class JnarioGenerator implements IGenerator {
  @Inject
  private JnarioCompiler jnarioCompiler;
  
  @Inject
  private ITypeProvider typeProvider;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Jnario> _filter = IterableExtensions.<Jnario>filter(_allContentsIterable, de.bmw.carit.jnario.jnario.Jnario.class);
    for (final Jnario feature : _filter) {
      {
        String _name = feature.getName();
        String featureName = _name;
        EList<Scenario> _scenarios = feature.getScenarios();
        for (final Scenario scenario : _scenarios) {
          {
            if ((fsa instanceof AbstractFileSystemAccess)) {
              {
                String _package = feature.getPackage();
                String packageName = _package;
                boolean _operator_notEquals = ObjectExtensions.operator_notEquals(packageName, null);
                if (_operator_notEquals) {
                  {
                    String _replace = packageName.replace(".", "/");
                    packageName = _replace;
                    String _operator_plus = StringExtensions.operator_plus("src-gen/", packageName);
                    ((AbstractFileSystemAccess) fsa).setOutputPath(_operator_plus);
                  }
                }
              }
            }
            String _name_1 = feature.getName();
            String _name_2 = scenario.getName();
            String _generateClassName = this.generateClassName(_name_1, _name_2);
            String className = _generateClassName;
            boolean withTestAnnotation = true;
            EList<Examples> _examples = scenario.getExamples();
            boolean _isEmpty = _examples.isEmpty();
            boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
            if (_operator_not) {
              {
                String _operator_plus_1 = StringExtensions.operator_plus(className, "Examples.java");
                String _generateExampleContent = this.generateExampleContent(scenario, className);
                fsa.generateFile(_operator_plus_1, _generateExampleContent);
                withTestAnnotation = false;
              }
            }
            String _operator_plus_2 = StringExtensions.operator_plus(className, ".java");
            StringConcatenation _compileScenario = this.compileScenario(feature, scenario, className, withTestAnnotation);
            fsa.generateFile(_operator_plus_2, _compileScenario);
          }
        }
      }
    }
  }
  
  public String generateExampleContent(final Scenario scenario, final String className) {
    String _xblockexpression = null;
    {
      String content = "";
      EList<Examples> _examples = scenario.getExamples();
      for (final Examples example : _examples) {
        {
          String _name = scenario.getName();
          String _extractMethodName = JnarioCompiler.extractMethodName(_name);
          String methodName = _extractMethodName;
          String _operator_plus = StringExtensions.operator_plus(className, "Examples");
          EList<ExampleRow> _rows = example.getRows();
          StringConcatenation _compileExamples = this.compileExamples(_operator_plus, className, _rows, methodName);
          String _operator_plus_1 = StringExtensions.operator_plus(content, _compileExamples);
          content = _operator_plus_1;
        }
      }
      _xblockexpression = (content);
    }
    return _xblockexpression;
  }
  
  public String generateClassName(final String featureName, final String scenarioName) {
    String _xblockexpression = null;
    {
      String _operator_plus = StringExtensions.operator_plus(featureName, scenarioName);
      String className = _operator_plus;
      String _replaceAll = className.replaceAll("[^A-Za-z0-9_]", "");
      String _className = className = _replaceAll;
      _xblockexpression = (_className);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compileScenario(final Jnario feature, final Scenario scenario, final String className, final boolean withTestAnnotation) {
    StringConcatenation _xblockexpression = null;
    {
      ImportManager _importManager = new ImportManager(true);
      final ImportManager importManager = _importManager;
      String backgroundContent = "";
      Background _background = feature.getBackground();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_background, null);
      if (_operator_notEquals) {
        Background _background_1 = feature.getBackground();
        String _compileBackground = this.compileBackground(_background_1, importManager);
        backgroundContent = _compileBackground;
      }
      String _compileScenario = this.jnarioCompiler.compileScenario(scenario, importManager, withTestAnnotation);
      String scenarioContent = _compileScenario;
      String _operator_plus = StringExtensions.operator_plus(backgroundContent, scenarioContent);
      String classContent = _operator_plus;
      EList<Examples> _examples = scenario.getExamples();
      boolean _isEmpty = _examples.isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        String _compileExampleMain = this.compileExampleMain(scenario, className, classContent);
        classContent = _compileExampleMain;
      }
      String _package = feature.getPackage();
      String packageName = _package;
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(packageName, null);
      if (_operator_notEquals_1) {
        String _operator_plus_1 = StringExtensions.operator_plus("package ", packageName);
        String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, ";");
        packageName = _operator_plus_2;
      }
      StringConcatenation _compileClass = this.compileClass(classContent, className, importManager, packageName, withTestAnnotation);
      _xblockexpression = (_compileClass);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compileClass(final String classContent, final String className, final ImportManager importManager, final String packageName, final boolean withTestAnnotation) {
    StringConcatenation _xblockexpression = null;
    {
      StringConcatenation _compileImports = this.compileImports(importManager);
      String _string = _compileImports.toString();
      String imports = _string;
      if (withTestAnnotation) {
        String _operator_plus = StringExtensions.operator_plus("import org.junit.Test;\n", imports);
        imports = _operator_plus;
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(packageName, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append(imports, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("public class ");
      _builder.append(className, "");
      _builder.append("{");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(classContent, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compileImports(final ImportManager importManager) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<String> _imports = importManager.getImports();
      for(final String i : _imports) {
        _builder.append("import ");
        _builder.append(i, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String compileBackground(final Background background, final ImportManager importManager) {
    String _compileBackground = this.jnarioCompiler.compileBackground(background, importManager);
    return _compileBackground;
  }
  
  public String compileExampleMain(final Scenario scenario, final String className, final String classContent) {
    String _xblockexpression = null;
    {
      EList<Examples> _examples = scenario.getExamples();
      Examples _get = _examples.get(0);
      Examples example = _get;
      ExampleHeading _heading = example.getHeading();
      ArrayList<String> _variablesOrValues = this.getVariablesOrValues(_heading);
      ArrayList<String> variables = _variablesOrValues;
      ExampleHeading _heading_1 = example.getHeading();
      EList<XVariableDeclaration> _parts = _heading_1.getParts();
      EList<ExampleRow> _rows = example.getRows();
      ExampleRow _get_1 = _rows.get(0);
      EList<ExampleCell> _parts_1 = _get_1.getParts();
      String _compileFields = this.compileFields(_parts, _parts_1);
      String fields = _compileFields;
      StringConcatenation _compileConstructor = this.compileConstructor(className, variables);
      StringConcatenation constructor = _compileConstructor;
      String _operator_plus = StringExtensions.operator_plus(fields, constructor);
      String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, classContent);
      _xblockexpression = (_operator_plus_1);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compileExamples(final String className, final String exampleClassName, final List<ExampleRow> rows, final String testMethod) {
    StringConcatenation _xblockexpression = null;
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
      StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
      for (final ExampleRow row : rows) {
        {
          this.declareVariableAndJavaStatement(row, appendable);
          String _operator_plus = StringExtensions.operator_plus("instance = new ", exampleClassName);
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "(");
          appendable.append(_operator_plus_1);
          this.getVariables(row, appendable);
          appendable.append(");\n");
          String _operator_plus_2 = StringExtensions.operator_plus("instance.", testMethod);
          String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, "();");
          appendable.append(_operator_plus_3);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import org.junit.Test;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public class ");
      _builder.append(className, "");
      _builder.append("{");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("@Test");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public void examplesTest(){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append(exampleClassName, "		");
      _builder.append(" instance;");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      String _string = appendable.toString();
      _builder.append(_string, "		");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String declareVariableAndJavaStatement(final ExampleRow row, final IAppendable appendable) {
    String _xblockexpression = null;
    {
      EList<ExampleCell> _parts = row.getParts();
      Iterator<ExampleCell> _iterator = _parts.iterator();
      Iterator<ExampleCell> iterator = _iterator;
      boolean _hasNext = iterator.hasNext();
      Boolean _xwhileexpression = _hasNext;
      while (_xwhileexpression) {
        {
          ExampleCell _next = iterator.next();
          XExpression _name = _next.getName();
          XExpression expression = _name;
          this.jnarioCompiler.declareVariableAndJavaStatement(expression, appendable);
          boolean _hasNext_1 = iterator.hasNext();
          if (_hasNext_1) {
            appendable.append("\n");
          }
        }
        boolean _hasNext_2 = iterator.hasNext();
        _xwhileexpression = _hasNext_2;
      }
      String _string = appendable.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public String getVariables(final ExampleRow row, final IAppendable appendable) {
    String _xblockexpression = null;
    {
      EList<ExampleCell> _parts = row.getParts();
      Iterator<ExampleCell> _iterator = _parts.iterator();
      Iterator<ExampleCell> iterator = _iterator;
      boolean _hasNext = iterator.hasNext();
      Boolean _xwhileexpression = _hasNext;
      while (_xwhileexpression) {
        {
          ExampleCell _next = iterator.next();
          XExpression _name = _next.getName();
          XExpression expression = _name;
          this.jnarioCompiler.getVariables(expression, appendable);
          boolean _hasNext_1 = iterator.hasNext();
          if (_hasNext_1) {
            appendable.append(", ");
          }
        }
        boolean _hasNext_2 = iterator.hasNext();
        _xwhileexpression = _hasNext_2;
      }
      String _string = appendable.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
  
  public ArrayList<String> getVariablesOrValues(final ExampleHeading heading) {
    ArrayList<String> _xblockexpression = null;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      ArrayList<String> values = _arrayList;
      EList<XVariableDeclaration> _parts = heading.getParts();
      for (final XVariableDeclaration cell : _parts) {
        String _name = cell.getName();
        values.add(_name);
      }
      _xblockexpression = (values);
    }
    return _xblockexpression;
  }
  
  public String compileFields(final List<XVariableDeclaration> variables, final List<ExampleCell> types) {
    String _xblockexpression = null;
    {
      String fields = "";
      int i = 0;
      for (final XVariableDeclaration variable : variables) {
        {
          ExampleCell _get = types.get(i);
          XExpression _name = _get.getName();
          JvmTypeReference _type = this.typeProvider.getType(_name);
          JvmTypeReference type = _type;
          JvmType _type_1 = type.getType();
          _type_1.getSimpleName();
          String _operator_plus = StringExtensions.operator_plus(fields, "private ");
          String _simpleName = type.getSimpleName();
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, _simpleName);
          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, " ");
          String _name_1 = variable.getName();
          String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, _name_1);
          String _operator_plus_4 = StringExtensions.operator_plus(_operator_plus_3, ";\n");
          fields = _operator_plus_4;
          int _operator_plus_5 = IntegerExtensions.operator_plus(((Integer)i), ((Integer)1));
          i = _operator_plus_5;
        }
      }
      _xblockexpression = (fields);
    }
    return _xblockexpression;
  }
  
  public StringConcatenation compileConstructor(final String className, final ArrayList<String> variables) {
    StringConcatenation _xblockexpression = null;
    {
      String params = "";
      String assignments = "";
      for (final String variable : variables) {
        {
          String _operator_plus = StringExtensions.operator_plus(params, "int ");
          String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "_");
          String _operator_plus_2 = StringExtensions.operator_plus(_operator_plus_1, variable);
          String _operator_plus_3 = StringExtensions.operator_plus(_operator_plus_2, ",");
          params = _operator_plus_3;
          String _operator_plus_4 = StringExtensions.operator_plus(assignments, variable);
          String _operator_plus_5 = StringExtensions.operator_plus(_operator_plus_4, "=");
          String _operator_plus_6 = StringExtensions.operator_plus(_operator_plus_5, "_");
          String _operator_plus_7 = StringExtensions.operator_plus(_operator_plus_6, variable);
          String _operator_plus_8 = StringExtensions.operator_plus(_operator_plus_7, ";\n");
          assignments = _operator_plus_8;
        }
      }
      int _length = params.length();
      int _operator_minus = IntegerExtensions.operator_minus(((Integer)_length), ((Integer)1));
      CharSequence _subSequence = params.subSequence(0, _operator_minus);
      String _operator_plus_9 = StringExtensions.operator_plus("", _subSequence);
      params = _operator_plus_9;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public ");
      _builder.append(className, "");
      _builder.append("(");
      _builder.append(params, "");
      _builder.append("){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append(assignments, "	");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
}
