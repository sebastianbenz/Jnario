package de.bmw.carit.jnario.maven;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.util.Strings.concat;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.MojoExecutionException;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.xtext.xtend2.compiler.batch.Xtend2BatchCompiler;
import org.eclipse.xtext.xtend2.maven.XtendTestCompile;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * Goal which compiles Xtend2 test sources.
 *
 * @author Sebastian Benz
 * @goal testCompile
 * @phase generate-test-sources
 * @requiresDependencyResolution test
 */
public class JnarioTestCompile extends XtendTestCompile {

}
