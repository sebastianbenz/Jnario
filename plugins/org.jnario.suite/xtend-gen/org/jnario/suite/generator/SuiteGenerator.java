package org.jnario.suite.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.jnario.suite.doc.SuiteDocGenerator;

import com.google.inject.Inject;

@SuppressWarnings("all")
public class SuiteGenerator implements IGenerator {
  @Inject
  private JvmModelGenerator jvmModelGenerator;
  
  @Inject
  private SuiteDocGenerator docGenerator;
  
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.jvmModelGenerator.doGenerate(input, fsa);
    this.docGenerator.doGenerate(input, fsa);
  }
}
