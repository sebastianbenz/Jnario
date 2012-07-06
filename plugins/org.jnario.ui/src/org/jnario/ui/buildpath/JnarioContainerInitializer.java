package org.jnario.ui.buildpath;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.junit.buildpath.BuildPathSupport;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class JnarioContainerInitializer extends ClasspathContainerInitializer {
	
	private static final String JUNIT_BUNDLE = "org.junit";

	private static final String JNARIO_LIB_BUNDLE_ID = "org.jnario.lib";

	private static final Logger LOG = Logger.getLogger(JnarioContainerInitializer.class);
	
	private static final String XTEXT_XBASE_LIB_BUNDLE_ID = "org.eclipse.xtext.xbase.lib";
	
	private static final String XTEND_LIB_BUNDLE_ID = "org.eclipse.xtend.lib";

	public static final Path JNARIO_LIBRARY_PATH = new Path("org.jnario.JNARIO_CONTAINER"); //$NON-NLS-1$

	public static final String[] BUNDLE_IDS_TO_INCLUDE = new String[] {JUNIT_BUNDLE, "org.hamcrest.core", "com.google.guava", XTEXT_XBASE_LIB_BUNDLE_ID, XTEND_LIB_BUNDLE_ID, JNARIO_LIB_BUNDLE_ID };
	
	public void initialize(final IPath containerPath, final IJavaProject project) throws CoreException {
		if (isJnarioPath(containerPath)) {
			IClasspathContainer container = createContainer(containerPath);
			JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project },
					new IClasspathContainer[] { container }, null);
		}
	}
	
	private IClasspathContainer createContainer(final IPath containerPath) {
		return new JnarioClasspathContainer(containerPath);
	}

	private boolean isJnarioPath(final IPath containerPath) {
		return JNARIO_LIBRARY_PATH.equals(containerPath);
	}
	
	private final static class JnarioClasspathContainer implements IClasspathContainer {

		private static final String SOURCE_SUFIX = ".source"; //$NON-NLS-1$

		private final IPath containerPath;

		private JnarioClasspathContainer(IPath containerPath) {
			this.containerPath = containerPath;
		}

		public IClasspathEntry[] getClasspathEntries() {
			List<IClasspathEntry> cpEntries = new ArrayList<IClasspathEntry>();
			for (String bundleId : BUNDLE_IDS_TO_INCLUDE) {
				addEntry(cpEntries, bundleId);
			}
			cpEntries.add(BuildPathSupport.getJUnit4LibraryEntry());
			return cpEntries.toArray(new IClasspathEntry[] {});
		}

		private void addEntry(final List<IClasspathEntry> cpEntries, final String bundleId) {
			IPath bundlePath = findBundle(bundleId);
			if (bundlePath != null) {
				IPath sourceBundlePath = findBundle(bundleId.concat(SOURCE_SUFIX));
				IClasspathAttribute[] extraAttributes = null;
				cpEntries.add(JavaCore.newLibraryEntry(bundlePath, sourceBundlePath, null, new IAccessRule[] {},
						extraAttributes, false));
			}
		}


		private IPath findBundle(String bundleId) {
			Bundle bundle = Platform.getBundle(bundleId);
			if (bundle != null) {
				File bundleFile = null;
				try {
					bundleFile = FileLocator.getBundleFile(bundle);
					URL binFolderURL = FileLocator.find(bundle, new Path("bin"),null);
					IPath path; 
					if(binFolderURL != null)
						path = new Path(FileLocator.toFileURL(binFolderURL).getPath());
					else
						path = new Path(bundleFile.getAbsolutePath());
					if (!path.isAbsolute()) {
						path = path.makeAbsolute();
					}
					return path;
				} catch (IOException e) {
					LOG.error("Can't resolve bundle '" + bundleId + "'", e); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
			return null;

		}

		public String getDescription() {
			return "Jnario Library";
		}

		public int getKind() {
			return IClasspathContainer.K_APPLICATION;
		}

		public IPath getPath() {
			return containerPath;
		}
	}


}
