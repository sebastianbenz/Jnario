/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 * 
 */
package org.jnario.ui.builder;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.xtend.ide.builder.SourceRelativeFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.util.StringInputStream;
import org.jnario.generator.JnarioEncodingProvider;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz
 *
 */
@SuppressWarnings("restriction")
public class JnarioSourceRelativeFileSystemAccess extends
		SourceRelativeFileSystemAccess {
	
	@Inject
	private JnarioEncodingProvider encodingProvider;

	public void generateFile(String fileName, String outputName, CharSequence contents) {
		IProgressMonitor monitor = getMonitor();
		if (monitor.isCanceled())
			throw new OperationCanceledException();
		OutputConfiguration outputConfig = getOutputConfig(outputName);
		
		// check output folder exists
		IFolder folder = getFolder(outputConfig);
		if (!folder.exists()) {
			if (outputConfig.isCreateOutputDirectory()) {
				try {
					createFolder(folder);
				} catch (CoreException e) {
					throw new RuntimeException(e);
				}
			} else {
				return;
			}
		}
		
		IFile file = getFile(fileName, outputName);
		IFile traceFile = getTraceFile(file);
		IFile smapFile = getSmapFile(file);
		CharSequence postProcessedContent = postProcess(fileName, outputName, contents);
		String contentsAsString = postProcessedContent.toString(); 
		String charset = getCharSet(file);
		if (file.exists()) {
			if (outputConfig.isOverrideExistingResources()) {
				try {
					StringInputStream newContent = getInputStream(contentsAsString, charset);
					if (hasContentsChanged(file, newContent)) {
						// reset to offset zero allows to reuse internal byte[]
						// no need to convert the string twice
						newContent.reset();
						file.setContents(newContent, true, true, monitor);
						if (file.isDerived() != outputConfig.isSetDerivedProperty()) {
							setDerived(file, outputConfig.isSetDerivedProperty());
						}
					} else {
						if (smapFile != null)
							file.touch(monitor);
					}
					if (smapFile != null)
						updateSmapInformation(smapFile, postProcessedContent, file);
					updateTraceInformation(traceFile, postProcessedContent, outputConfig.isSetDerivedProperty());
				} catch (CoreException e) {
					throw new RuntimeException(e);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				getCallBack().afterFileUpdate(file);
			}
		} else {
			try {
				ensureParentExists(file);
				file.create(getInputStream(contentsAsString, charset), true, monitor);
				if (outputConfig.isSetDerivedProperty()) {
					setDerived(file, true);
				}
				updateTraceInformation(traceFile, postProcessedContent, outputConfig.isSetDerivedProperty());
			} catch (CoreException e) {
				throw new RuntimeException(e);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			getCallBack().afterFileCreation(file);
		}
	}

	private String getCharSet(IFile file) {
		String charset;
		try {
			charset = file.getCharset(true);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		return encodingProvider.getEncoding(file.getFileExtension(), charset);
	}
}
