package org.jnario.util;

import java.util.Set;

import org.eclipse.emf.common.util.URI;

import com.google.common.collect.Sets;

public class FileExtensions {
	
	private static final Set<String> JNARIO_FILE_EXTENSIONS = Sets.newHashSet("spec", "suite", "feature"); 

	public static boolean isJnarioSpec(URI dslSourceFile) {
		return JNARIO_FILE_EXTENSIONS.contains(dslSourceFile.fileExtension().toLowerCase());
	}
	
}
