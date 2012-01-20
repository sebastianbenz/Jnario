package de.bmw.carit.jnario.tests.util;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.jdt.core.compiler.CompilationProgress;
import org.eclipse.jdt.internal.compiler.batch.Main;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;

import com.google.common.base.Joiner;

public class JnarioJavaCompiler extends EclipseRuntimeDependentJavaCompiler{
	
	
	private OutputStream errorStream;

	public boolean compile(List<String> files) {
		StringBuilder sb = new StringBuilder(getComplianceLevelArg());
		sb.append(" ");
		sb.append(getClasspathArgs());
		sb.append(" ");
		sb.append(Joiner.on(" ").join(files));
		return getMain().compile(Main.tokenize(sb.toString()), new PrintWriter(System.out), new PrintWriter(System.err), new CompilationProgress() {
			
			@Override
			public void worked(int workIncrement, int remainingWork) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTaskName(String name) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isCanceled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void done() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void begin(int remainingWork) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}
