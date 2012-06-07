package org.jnario.compiler;

import com.google.common.base.Objects;
import com.google.inject.Injector;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.compiler.JnarioDocCompiler;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.feature.compiler.batch.FeatureDocCompiler;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.spec.compiler.batch.SpecDocCompiler;

@SuppressWarnings("all")
public class DocGeneratorMain {
  public static void main(final String[] args) {
    boolean _or = false;
    boolean _equals = Objects.equal(args, null);
    if (_equals) {
      _or = true;
    } else {
      int _size = ((List<String>)Conversions.doWrapArray(args)).size();
      boolean _equals_1 = (_size == 0);
      _or = (_equals || _equals_1);
    }
    if (_or) {
      DocGeneratorMain.printUsage();
      return;
    }
    BasicConfigurator.configure();
    {
      SpecStandaloneSetup _specStandaloneSetup = new SpecStandaloneSetup();
      final Injector injector = _specStandaloneSetup.createInjectorAndDoEMFRegistration();
      final SpecDocCompiler compiler = injector.<SpecDocCompiler>getInstance(SpecDocCompiler.class);
      DocGeneratorMain.run(compiler, args);
    }
    {
      FeatureStandaloneSetup _featureStandaloneSetup = new FeatureStandaloneSetup();
      final Injector injector = _featureStandaloneSetup.createInjectorAndDoEMFRegistration();
      final FeatureDocCompiler compiler = injector.<FeatureDocCompiler>getInstance(FeatureDocCompiler.class);
      DocGeneratorMain.run(compiler, args);
    }
  }
  
  private static boolean run(final JnarioDocCompiler compiler, final String[] args) {
    boolean _xblockexpression = false;
    {
      final Iterator<String> arguments = ((List<String>)Conversions.doWrapArray(args)).iterator();
      boolean _hasNext = arguments.hasNext();
      boolean _while = _hasNext;
      while (_while) {
        {
          String _next = arguments.next();
          final String argument = _next.trim();
          boolean _matched = false;
          if (!_matched) {
            boolean _or = false;
            boolean _equals = Objects.equal(argument, "-cp");
            if (_equals) {
              _or = true;
            } else {
              boolean _equals_1 = Objects.equal(argument, "-classpath");
              _or = (_equals || _equals_1);
            }
            if (_or) {
              _matched=true;
              String _next_1 = arguments.next();
              compiler.setClassPath(_next_1);
            }
          }
          if (!_matched) {
            if (Objects.equal(argument,"-d")) {
              _matched=true;
              String _next_2 = arguments.next();
              compiler.setOutputPath(_next_2);
            }
          }
          if (!_matched) {
            if (Objects.equal(argument,"-results")) {
              _matched=true;
              String _next_3 = arguments.next();
              compiler.setResultFolder(_next_3);
            }
          }
          if (!_matched) {
            if (Objects.equal(argument,"-encoding")) {
              _matched=true;
              String _next_4 = arguments.next();
              compiler.setFileEncoding(_next_4);
            }
          }
          if (!_matched) {
            compiler.setSourcePath(argument);
          }
        }
        boolean _hasNext_1 = arguments.hasNext();
        _while = _hasNext_1;
      }
      boolean _compile = compiler.compile();
      _xblockexpression = (_compile);
    }
    return _xblockexpression;
  }
  
  private static void printUsage() {
    InputOutput.<String>println("Usage: JnarioDocCompiler <options> <source directories>");
    InputOutput.<String>println("where possible options include:");
    InputOutput.<String>println("-d <directory>             Specify where to place generated documentation files");
    InputOutput.<String>println("-results <folder>          Specify folder containing JUnit XML test results");
    InputOutput.<String>println("-encoding <encoding>       Specify character encoding used by source files");
  }
}
