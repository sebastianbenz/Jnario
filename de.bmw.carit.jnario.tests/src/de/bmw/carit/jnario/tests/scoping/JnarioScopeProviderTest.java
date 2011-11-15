package de.bmw.carit.jnario.tests.scoping;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.junit.Test;

import com.google.common.base.Function;
import com.google.inject.Inject;

import de.bmw.carit.jnario.tests.util.Features;
import de.bmw.carit.jnario.tests.util.ModelStore;
import de.bmw.carit.jnario.tests.util.Query;
import de.bmw.carit.jnario.tests.util.RuntimeTest;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Sets.newHashSet;
import static org.junit.matchers.JUnitMatchers.hasItem;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;



@SuppressWarnings("restriction")
public class JnarioScopeProviderTest extends RuntimeTest {

//	@Inject
//	private IScopeProvider fixture;
//	
//	@Inject
//	ModelStore modelStore;
//	
//	@Test
//	public void whatever(){
//		
//		modelStore.parseScenario(Features.header(), Features.examples());
//		
//		EReference reference = XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE;
//		EObject context = Query.query(modelStore).find("x", XVariableDeclaration.class);
//		IScope scope = fixture.getScope(context, reference);
//		Set<String> scopedElements = newHashSet(transform(scope.getAllElements(), new Function<IEObjectDescription, String>() {
//
//			public String apply(IEObjectDescription from) {
//				return from.getQualifiedName().toString();
//			}
//		}));
//		
//		assertThat(scopedElements, (hasItem("x")));
//	}
	
	@Test
	public void dummy() throws Exception {
		
	}
	
}
