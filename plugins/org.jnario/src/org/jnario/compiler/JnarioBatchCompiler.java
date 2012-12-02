/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.compiler;

import static com.google.common.collect.Iterables.addAll;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import java.io.File;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtend.core.resource.XtendResource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Sebastian - Initial contribution and API
 */
public abstract class JnarioBatchCompiler extends XtendBatchCompiler {

	/**
	 * @author sebastian - Initial contribution and API
	 */
	public class WrappedResourceSetProvider implements Provider<ResourceSet> {

		private final ResourceSet resourceSet;

		public WrappedResourceSetProvider(ResourceSet resourceSet) {
			this.resourceSet = resourceSet;
		}

		public ResourceSet get() {
			return resourceSet;
		}

	}

	private static final Logger log = Logger.getLogger(JnarioBatchCompiler.class);
	
	@Inject
	private JvmModelGenerator generator;
	
	public void setResourceSet(ResourceSet resourceSet) {
		resourceSetProvider = new WrappedResourceSetProvider(resourceSet);
	}
	
	@Override
	protected File createStubs(ResourceSet resourceSet) {
		File outputDirectory = createTempDir("stubs");
		JavaIoFileSystemAccess fileSystemAccess = javaIoFileSystemAccessProvider.get();
		fileSystemAccess.setOutputPath(outputDirectory.toString());
		List<EObject> objectsWithClasses = getObjectsWithClasses(resourceSet);
		for (EObject eObject : objectsWithClasses) {
			StringBuilder classSignatureBuilder = new StringBuilder();
			String packageName = getPackageName(eObject);
			if (!Strings.isEmpty(packageName)) {
				classSignatureBuilder.append("package " + packageName + ";");
				classSignatureBuilder.append("\n");
			}
			classSignatureBuilder.append("public class " + getClassName(eObject) + "{}");
			String javaFileName = getJavaFileName(eObject);
			if (log.isDebugEnabled()) {
				log.debug("create java stub '" + javaFileName + "'");
			}
			fileSystemAccess.generateFile(javaFileName, classSignatureBuilder.toString());
		}
		return outputDirectory;
	}
	
	@Override
	protected void generateJavaFiles(ResourceSet resourceSet) {
		JavaIoFileSystemAccess javaIoFileSystemAccess = javaIoFileSystemAccessProvider.get();
		javaIoFileSystemAccess.setOutputPath(outputPath);
		
		for (Resource resource : jnarioResources(resourceSet)) {
			XtendFile file = filter(resource.getContents(), XtendFile.class).iterator().next();
			for (XtendClass xtendClass : file.getXtendClasses()) {
				String packageName = toPath(xtendClass.getPackageName());
				for (JvmGenericType type : filter(resource.getContents(), JvmGenericType.class)) {
					CharSequence generatedType = generator.generateType(type);
					String fileName = packageName + type.getSimpleName() + ".java";
					javaIoFileSystemAccess.generateFile(fileName, generatedType);
				}
			}
		}
	}
	
	@Override
	protected List<Issue> validate(ResourceSet resourceSet) {
		List<Issue> issues = Lists.newArrayList();
		List<Resource> resources = newArrayList(resourceSet.getResources());
		for (Resource resource : resources) {
			if(fileExtensionProvider.isValid(resource.getURI().fileExtension())){
				IResourceServiceProvider resourceServiceProvider = ((XtendResource)resource).getResourceServiceProvider();
				IResourceValidator resourceValidator = resourceServiceProvider.getResourceValidator();
				List<Issue> result = resourceValidator.validate(resource, CheckMode.ALL, null);
				addAll(issues, result);
			}
		}
		return issues;
	}
	
	protected Iterable<Resource> jnarioResources(ResourceSet resourceSet){
		return newArrayList(filter(resourceSet.getResources(), new Predicate<Resource>() {

			public boolean apply(Resource resource) {
				return fileExtensionProvider.isValid(resource.getURI().fileExtension());
			}
		}));
	}
	
	protected String getJavaFileName(EObject obj) {
		String packageName = getPackageName(obj);
		String javaClassName = getClassName(obj) + ".java";
		return toPath(packageName) + javaClassName;
	}

	private String toPath(String packageName) {
		if(packageName == null){
			return "";
		}
		return packageName.replaceAll("\\.", "/") + "/";
	}
	
	protected String getPackageName(EObject obj) {
		return getContainerOfType(obj, XtendClass.class).getPackageName();
	}

	protected abstract String getClassName(EObject eObject);

	protected abstract List<EObject> getObjectsWithClasses(ResourceSet resourceSet);

}
