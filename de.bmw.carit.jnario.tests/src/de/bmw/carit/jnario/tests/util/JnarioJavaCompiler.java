package de.bmw.carit.jnario.tests.util;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.internal.compiler.batch.Main;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;

import com.google.common.base.Joiner;

public class JnarioJavaCompiler extends EclipseRuntimeDependentJavaCompiler{
	
	
	private final class Progress extends
			CompilationProgress {
		@Override
		public void worked(int workIncrement, int remainingWork) {
		}

		@Override
		public void setTaskName(String name) {
		}

		@Override
		public boolean isCanceled() {
			return false;
		}

		@Override
		public void done() {
		}

		@Override
		public void begin(int remainingWork) {
		}
	}


	public void compile(List<String> files) {
		StringBuilder sb = new StringBuilder(getComplianceLevelArg());
		sb.append(" ");
		sb.append(getClasspathArgs());
		sb.append(" ");
		sb.append(Joiner.on(" ").join(files));
		OutputStream errorStream = new ByteArrayOutputStream();
		if(!Main.compile(Main.tokenize(sb.toString()), new PrintWriter(System.out), new PrintWriter(errorStream ), new Progress())){
			throw new IllegalArgumentException("Couldn't compile : " + errorStream.toString() + "\n" );
		}
	}
	
}
