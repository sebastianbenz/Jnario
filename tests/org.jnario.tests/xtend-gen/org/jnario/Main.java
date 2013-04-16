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
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.spec.SpecStandaloneSetup;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    SpecStandaloneSetup _specStandaloneSetup = new SpecStandaloneSetup();
    final SpecStandaloneSetup setup = _specStandaloneSetup;
    final Injector injector = setup.createInjectorAndDoEMFRegistration();
    final ModelStore modelStore = injector.<ModelStore>getInstance(ModelStore.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("describe \"Example Tables\"{");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("def myExampleWithClosures{");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("| input |       operation            | result |");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("|   \"a\" | [String s | s.toUpperCase] |   \"A\"  |");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("|   \"B\" | [String s | s.toLowerCase] |   \"b\"  | ");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("}  ");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("fact \"supports closures as values\"{   ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("myExampleWithClosures.forEach[");
    _builder.newLine();
    _builder.append("\t          ");
    _builder.append("operation.apply(input) should be result");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    final Resource resource = modelStore.parseSpec(_builder);
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
