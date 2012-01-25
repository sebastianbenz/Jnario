package de.bmw.carit.jnario.spec.doc;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xtend2.compiler.Xtend2OutputConfigurationProvider;

@SuppressWarnings("restriction")
public class DocOutputConfigurationProvider extends Xtend2OutputConfigurationProvider{

	public static final String DOC_OUTPUT = "DOC_OUTPUT";

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> configuration = super.getOutputConfigurations();
		OutputConfiguration docOutput = new OutputConfiguration(DOC_OUTPUT);
		docOutput.setDescription("Output folder for generated documentation files");
		docOutput.setOutputDirectory("doc-gen");
		docOutput.setOverrideExistingResources(true);
		docOutput.setCreateOutputDirectory(false);
		docOutput.setCanClearOutputDirectory(false);
		docOutput.setCleanUpDerivedResources(true);
		docOutput.setSetDerivedProperty(true);
		configuration.add(docOutput);
		return configuration;
	}
	
}
