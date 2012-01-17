/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package de.bmw.carit.jnario;

import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider.ExtensionClassNameProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xbase.validation.EarlyExitValidator;
import org.eclipse.xtext.xtend2.compiler.Xtend2OutputConfigurationProvider;
import org.eclipse.xtext.xtend2.featurecalls.Xtend2IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xtend2.jvmmodel.DispatchUtil;
import org.eclipse.xtext.xtend2.jvmmodel.IXtend2JvmAssociations;
import org.eclipse.xtext.xtend2.resource.Xtend2Resource;
import org.eclipse.xtext.xtend2.resource.Xtend2ResourceDescriptionStrategy;
import org.eclipse.xtext.xtend2.resource.XtendEObjectAtOffsetHelper;
import org.eclipse.xtext.xtend2.scoping.Xtend2ImportedNamespaceScopeProvider;
import org.eclipse.xtext.xtend2.scoping.Xtend2ScopeProvider;
import org.eclipse.xtext.xtend2.typing.Xtend2TypeProvider;
import org.eclipse.xtext.xtend2.validation.ClasspathBasedChecks;
import org.eclipse.xtext.xtend2.validation.XtendEarlyExitValidator;

import com.google.inject.Binder;
import com.google.inject.name.Names;

import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmModelGenerator;
import de.bmw.carit.jnario.common.jvmmodel.ExtendedJvmTypesBuilder;
import de.bmw.carit.jnario.common.jvmmodel.JnarioDispatchUtil;
import de.bmw.carit.jnario.common.scoping.JnarioExtensionClassNameProvider;
import de.bmw.carit.jnario.generator.JnarioCompiler;
import de.bmw.carit.jnario.jvmmodel.JnarioFeatureCallToJavaMapping;
import de.bmw.carit.jnario.jvmmodel.JnarioJvmModelInferrer;
import de.bmw.carit.jnario.naming.JnarioQualifiedNameProvider;
import de.bmw.carit.jnario.validation.JnarioClasspathBasedChecks;
import de.bmw.carit.jnario.validation.JnarioResourceValidator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class JnarioRuntimeModule extends de.bmw.carit.jnario.AbstractJnarioRuntimeModule {
	
	public Class<? extends JvmTypesBuilder> bindJvmTypesBuilder(){
		return ExtendedJvmTypesBuilder.class;
	}
	
	public Class<? extends JvmModelGenerator> bindJvmModelGenerator(){
		return ExtendedJvmModelGenerator.class;
	}
	
	@Override
	public java.lang.Class<? extends IScopeProvider> bindIScopeProvider() {
		return Xtend2ScopeProvider.class;
	}
	
	public Class<? extends ExtensionClassNameProvider> bindExtensionClassNameProvider(){
		return JnarioExtensionClassNameProvider.class;
	}
	
	@Override
	public Class<? extends ITypeProvider> bindITypeProvider(){
		return Xtend2TypeProvider.class;
	}
	
	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return Xtend2Resource.class;
	}

	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(Xtend2ImportedNamespaceScopeProvider.class);
	}

	@Override
	public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return Xtend2IdentifiableSimpleNameProvider.class;
	}

	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return JnarioJvmModelInferrer.class;
	}

	public Class <? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return Xtend2ResourceDescriptionStrategy.class;
	}

	public Class<? extends JvmModelAssociator> bindJvmModelAssociator() {
		return IXtend2JvmAssociations.Impl.class;
	}

	public Class<? extends EarlyExitValidator> bindEarlyExitValidator() {
		return XtendEarlyExitValidator.class;
	}
	
	@Override
	public Class<? extends EObjectAtOffsetHelper> bindEObjectAtOffsetHelper() {
		return XtendEObjectAtOffsetHelper.class;
	}
	
	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return JnarioCompiler.class; 
	}	

	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return Xtend2OutputConfigurationProvider.class;
	}
	
	public Class<? extends FeatureCallToJavaMapping> bindFeatureCallToJavaMapping(){
		return JnarioFeatureCallToJavaMapping.class;
	}
	
	public Class<? extends ClasspathBasedChecks> bindClasspathBasedChecks(){
		return JnarioClasspathBasedChecks.class;
	}
	
	public Class<? extends DispatchUtil> bindDispatchUtil(){
		return JnarioDispatchUtil.class;
	}
	
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider(){
		return JnarioQualifiedNameProvider.class;
	}
	
	
	public Class<? extends IResourceValidator> bindIResourceValidator(){
		return JnarioResourceValidator.class;
	}
	
}
