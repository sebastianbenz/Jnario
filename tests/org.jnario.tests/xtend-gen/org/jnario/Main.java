package org.jnario;

import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.jnario.test.util.ModelStore;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    FeatureStandaloneSetup _featureStandaloneSetup = new FeatureStandaloneSetup();
    final FeatureStandaloneSetup setup = _featureStandaloneSetup;
    final Injector injector = setup.createInjectorAndDoEMFRegistration();
    final ModelStore modelStore = injector.<ModelStore>getInstance(ModelStore.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("Feature: Test");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: TestScenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val values = new ArrayList<String>()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a list");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("values += \"hello\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: TestScenario 2");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a list");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Then it should have contents");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("values.size => 1     ");
    _builder.newLine();
    final Resource resource = modelStore.parseScenario(_builder);
    final JvmModelGenerator generator = injector.<JvmModelGenerator>getInstance(JvmModelGenerator.class);
    EList<EObject> _contents = resource.getContents();
    Iterable<JvmGenericType> _filter = Iterables.<JvmGenericType>filter(_contents, JvmGenericType.class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          GeneratorConfig _generatorConfig = new GeneratorConfig();
          CharSequence _generateType = generator.generateType(it, _generatorConfig);
          InputOutput.<CharSequence>println(_generateType);
        }
      };
    IterableExtensions.<JvmGenericType>forEach(_filter, _function);
  }
}
