/**
 * 
 */
package org.jnario.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz
 *
 */
public class JnarioJavaIoFileSystemAccess extends JavaIoFileSystemAccess {

	@Inject
	private JnarioEncodingProvider encodingProvider;
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.generator.JavaIoFileSystemAccess#getEncoding(org.eclipse.emf.common.util.URI)
	 */
	@Override
	protected String getEncoding(URI fileURI) {
		return encodingProvider.getEncoding(fileURI.fileExtension(), super.getEncoding(fileURI));
	}
	
}
