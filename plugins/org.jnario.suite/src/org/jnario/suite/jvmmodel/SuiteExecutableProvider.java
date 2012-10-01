package org.jnario.suite.jvmmodel;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptyList;

import java.util.List;

import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.EcoreUtil2;
import org.jnario.Executable;
import org.jnario.jvmmodel.ExecutableProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SuiteExecutableProvider implements ExecutableProvider {

	private SpecResolver specResolver;
	private SuiteNodeBuilder suiteNodeBuilder;
	
	@Inject
	public SuiteExecutableProvider(SpecResolver specResolver, SuiteNodeBuilder suiteNodeBuilder) {
		this.specResolver = specResolver;
		this.suiteNodeBuilder = suiteNodeBuilder;
	}
	
	public List<Executable> getExecutables(Executable specification) {
		if(!(specification instanceof Suite)){
			return emptyList();
		}
		Suite suite = (Suite) specification;
		List<Executable> result = getSubSuites(suite);
		addResolvedSpecs(suite, result);
		return result;
	}

	protected void addResolvedSpecs(Suite suite, List<Executable> result) {
		result.addAll(specResolver.resolveSpecs(suite));
	}

	protected List<Executable> getSubSuites(Suite suite) {
		SuiteFile file = EcoreUtil2.getContainerOfType(suite, SuiteFile.class);
		List<XtendClass> suites = file.getXtendClasses();
		int index = suites.indexOf(suite) + 1;
		List<Executable> children = newArrayList();
		int level = suiteNodeBuilder.level(suite);
		while(index < suites.size()){
			Suite current = (Suite) suites.get(index);
			if(suiteNodeBuilder.level(current) == level + 1){
				children.add(current);
			}
			index++;
		}
		return children;
	}

}
