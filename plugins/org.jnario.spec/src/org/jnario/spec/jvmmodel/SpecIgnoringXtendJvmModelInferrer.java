package org.jnario.spec.jvmmodel;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtend.core.jvmmodel.DispatchHelper;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations;
import org.eclipse.xtend.core.jvmmodel.SyntheticNameClashResolver;
import org.eclipse.xtend.core.jvmmodel.XtendCompileStrategies;
import org.eclipse.xtend.core.jvmmodel.XtendJvmModelInferrer;
import org.eclipse.xtend.core.macro.ActiveAnnotationContext;
import org.eclipse.xtend.core.macro.ActiveAnnotationContextProvider;
import org.eclipse.xtend.core.macro.ActiveAnnotationContexts;
import org.eclipse.xtend.core.macro.AnnotationProcessor;
import org.eclipse.xtend.core.xtend.XtendAnnotationType;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendEnum;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendInterface;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.documentation.IFileHeaderProvider;
import org.eclipse.xtext.resource.CompilerPhases;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeExtensions;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.resource.BatchLinkableResource;
import org.jnario.Specification;

import com.google.inject.Inject;

public class SpecIgnoringXtendJvmModelInferrer extends XtendJvmModelInferrer {
	
	private final static Logger logger = Logger.getLogger(XtendJvmModelInferrer.class);
	@Inject
	private TypesFactory typesFactory;

	@Inject
	private AnnotationProcessor annotationProcessor;
	
	@Inject
	private ActiveAnnotationContextProvider contextProvider;
	
	@Inject
	private CompilerPhases compilerPhases;
	public void infer(EObject object, final IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		if (!(object instanceof XtendFile))
			return;
		XtendFile xtendFile = (XtendFile) object;
		List<Runnable> doLater = newArrayList();
		for (final XtendTypeDeclaration declaration: xtendFile.getXtendTypes()) {
			if (Strings.isEmpty(declaration.getName()))
				continue;
			
			if (declaration instanceof XtendAnnotationType) {
				final JvmAnnotationType annotation = typesFactory.createJvmAnnotationType();
				setNameAndAssociate(xtendFile, declaration, annotation);
				acceptor.accept(annotation);
				if (!preIndexingPhase) {
					doLater.add(new Runnable() {
						public void run() {
							initialize((XtendAnnotationType)declaration, annotation);
						}
					});
				}
			} else if (declaration instanceof XtendClass && !(declaration instanceof Specification)) {
				XtendClass xtendClass = (XtendClass) declaration;
				final JvmGenericType javaType = typesFactory.createJvmGenericType();
				setNameAndAssociate(xtendFile, declaration, javaType);
				copyTypeParameters(xtendClass.getTypeParameters(), javaType);
				acceptor.accept(javaType);
				if (!preIndexingPhase) {
					doLater.add(new Runnable() {
						public void run() {
							initialize((XtendClass) declaration, javaType);
						}
					});
				}
			} else if (declaration instanceof XtendInterface) {
				XtendInterface xtendInterface = (XtendInterface) declaration;
				final JvmGenericType javaType = typesFactory.createJvmGenericType();
				setNameAndAssociate(xtendFile, declaration, javaType);
				copyTypeParameters(xtendInterface.getTypeParameters(), javaType);
				acceptor.accept(javaType);
				if (!preIndexingPhase) {
					doLater.add(new Runnable() {
						public void run() {
							initialize((XtendInterface) declaration, javaType);
						}
					});
				}
			} else if (declaration instanceof XtendEnum) {
				final JvmEnumerationType javaType = typesFactory.createJvmEnumerationType();
				setNameAndAssociate(xtendFile, declaration, javaType);
				acceptor.accept(javaType);
				if (!preIndexingPhase) {
					doLater.add(new Runnable() {
						public void run() {
							initialize((XtendEnum) declaration, javaType);
						}
					});
				}
			}
		}
		ActiveAnnotationContexts contexts = null;
		BatchLinkableResource resource = (BatchLinkableResource)xtendFile.eResource();
		try {
			compilerPhases.setIndexing(xtendFile, true);
			try {
				contexts = contextProvider.computeContext(xtendFile);
			} catch (Throwable t) {
				logger.error("Couldn't create annotation contexts", t);
				return;
			}
			
			for (ActiveAnnotationContext ctx : contexts.getContexts().values()) {
				try {
					annotationProcessor.indexingPhase(ctx, acceptor, CancelIndicator.NullImpl);
				} catch (Throwable t) {
					ctx.handleProcessingError(xtendFile.eResource(), t);
				}
			}
		} finally {
			compilerPhases.setIndexing(xtendFile, false);
			resource.getCache().clear(resource);
		}
		
		if (!preIndexingPhase) {
			for (Runnable runnable : doLater) {
				runnable.run();
			}
			for (ActiveAnnotationContext ctx : contexts.getContexts().values()) {
				try {
					annotationProcessor.inferencePhase(ctx, CancelIndicator.NullImpl);
				} catch (Throwable t) {
					ctx.handleProcessingError(xtendFile.eResource(), t);
				}
			}
		}
	}
	

}
