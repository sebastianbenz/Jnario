package de.bmw.carit.jnario.common;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.mwe2.ecore.EcoreGenerator;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.GetGrammarElement;

import com.google.common.base.Function;

public class PatchedEcoreGenerator extends EcoreGenerator {
	

	private boolean customClasses;

	protected final class PatchedMapper implements Function<String, String> {
		public String apply(String from) {
			if (from.startsWith("org.eclipse.emf.ecore"))
				return null;
			for(String srcPath: srcPaths) {
				URI createURI = URI.createURI(srcPath+"/"+from.replace('.', '/')+"Custom.java");
				String customClassName = from+"Custom";
				if (URIConverter.INSTANCE.exists(createURI, null)) {
					return customClassName;
				}
				createURI = URI.createURI(srcPath+"/"+from.replace('.', '/')+"ImplCustom.java");
				if (URIConverter.INSTANCE.exists(createURI, null)) {
					return customClassName;
				}
				if (from.endsWith("Impl") && customClasses) {
					generate(from,customClassName,createURI);
					return customClassName;
				}
			}
			return null;
		}
	}
	
	@Override
	public void setGenerateCustomClasses(boolean generateCustomClasses) {
		customClasses = generateCustomClasses;
		super.setGenerateCustomClasses(generateCustomClasses);
	}

}
