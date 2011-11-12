package de.bmw.carit.jnario.spec.validation;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xtend2.validation.IssueCodes;
import org.eclipse.xtext.xtend2.xtend2.XtendFile;
import org.eclipse.xtext.xtend2.xtend2.XtendImport;

import de.bmw.carit.jnario.spec.spec.SpecFile;
 

public class SpecJavaValidator extends AbstractSpecJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	
	
	/* copied from Xtend2JavaValidator */ 
	@Check
	public void checkImports(SpecFile file) {
		final Map<JvmType, XtendImport> imports = newHashMap();
		final Map<JvmType, XtendImport> staticImports = newHashMap();
		final Map<String, JvmType> importedNames = newHashMap();
		
		for (XtendImport imp : file.getImports()) {
			if (imp.getImportedNamespace() != null) {
				warning("The use of wildcard imports is deprecated.", imp, null, IssueCodes.IMPORT_WILDCARD_DEPRECATED);
			} else {
				JvmType importedType = imp.getImportedType();
				if (importedType != null && !importedType.eIsProxy()) {
					Map<JvmType, XtendImport> map = imp.isStatic() ? staticImports : imports;
					if (map.containsKey(importedType)) {
						warning("Duplicate import of '" + importedType.getSimpleName() + "'.", imp, null,
								IssueCodes.IMPORT_DUPLICATE);
					} else {
						map.put(importedType, imp);
						if (!imp.isStatic()) {
							JvmType currentType = importedType;
							String currentSuffix = currentType.getSimpleName();
							importedNames.put(currentSuffix, importedType);
							while (currentType.eContainer() instanceof JvmType) {
								currentType = (JvmType) currentType.eContainer();
								currentSuffix = currentType.getSimpleName()+"$"+currentSuffix;
								importedNames.put(currentSuffix, importedType);
							}
						}
					}
				}
			}
		}
		if(file.getElements().isEmpty()){
			return;
		}
		
		ICompositeNode node = NodeModelUtils.findActualNodeFor(file.getElements().get(0));
		for (INode n : node.getAsTreeIterable()) {
			if (n.getGrammarElement() instanceof CrossReference) {
				EClassifier classifier = ((CrossReference) n.getGrammarElement()).getType().getClassifier();
				if (classifier instanceof EClass
						&& (TypesPackage.Literals.JVM_TYPE.isSuperTypeOf((EClass) classifier) || TypesPackage.Literals.JVM_CONSTRUCTOR
								.isSuperTypeOf((EClass) classifier))) {
					String simpleName = n.getText().trim();
					// handle StaticQualifier Workaround (see Xbase grammar)
					if (simpleName.endsWith("::"))
						simpleName = simpleName.substring(0, simpleName.length() - 2);
					if (importedNames.containsKey(simpleName)) {
						JvmType type = importedNames.remove(simpleName);
						imports.remove(type);
					} else {
						while (simpleName.contains("$")) {
							simpleName = simpleName.substring(0, simpleName.lastIndexOf('$'));
							if (importedNames.containsKey(simpleName)) {
								imports.remove(importedNames.remove(simpleName));
								break;
							}
						}
					}
				}
			}
		}
		for (XtendImport imp : imports.values()) {
			warning("The import '" + imp.getImportedTypeName() + "' is never used.", imp, null,
					IssueCodes.IMPORT_UNUSED);
		}
	}

}
