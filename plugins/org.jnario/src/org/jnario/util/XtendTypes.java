package org.jnario.util;

import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.EcoreUtil2;

public class XtendTypes {

	public static String packageName(XtendTypeDeclaration typeDeclaration){
		XtendFile xtendFile = EcoreUtil2.getContainerOfType(typeDeclaration, XtendFile.class);
		if(xtendFile == null){
			return null;
		}
		return xtendFile.getPackage();
	}
	
}
