package de.bmw.carit.jnario.validation;

import static com.google.common.collect.Maps.newHashMap;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipse.xtext.xtend2.validation.IssueCodes;
import org.eclipse.xtext.xtend2.xtend2.XtendImport;

import com.google.inject.Inject;

import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.Examples;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.JnarioPackage;
 

public class JnarioJavaValidator extends AbstractJnarioJavaValidator {
	
	@Inject
	private ITypeProvider typeProvider;

	@Check
	public void checkExampleHeaderAndRowsHaveSameColumnNumber(Examples examples){
		ExampleHeading heading = examples.getHeading();
		EList<ExampleRow> rows = examples.getRows();
		int headingColumnNumber = heading.getParts().size();
		boolean rowsHaveSameNumberOfColumns = doRowsHaveSameNumberOfColumns(rows, headingColumnNumber);

		if(rowsHaveSameNumberOfColumns){
			hasSameTypesInColumns(rows);
		}
		else{
			error("Examples rows have to have the same number of columns", JnarioPackage.Literals.EXAMPLES__HEADING);
		}
	}
	
	private boolean doRowsHaveSameNumberOfColumns(EList<ExampleRow> rows, int headingColumnNumber){
		for(ExampleRow row: rows){
			if(row.getParts().size() != headingColumnNumber){			
				return false;
			}
		}
		return true;
	}
	
	private void hasSameTypesInColumns(EList<ExampleRow> rows){
		int colNum = 0;
		if(rows.size() > 0){
			for(ExampleCell cell: rows.get(0).getParts()){
				JvmType type = typeProvider.getType(cell.getName()).getType();
				//starting with second row
				for(int rowNum = 1; rowNum < rows.size(); rowNum++){
					EList<ExampleCell> parts = rows.get(rowNum).getParts();
					XExpression expression = parts.get(colNum).getName();
					JvmType compareType = typeProvider.getType(expression).getType();
					if(!type.equals(compareType)){
						error("Examples columns have to have the same type - Conflicting types: " + type.getQualifiedName() + ", " + compareType.getQualifiedName(), JnarioPackage.Literals.EXAMPLES__ROWS);
					}
				}
				colNum++;
			}
		}
	}
	
	@Check
	public void checkVariableDeclaration(XVariableDeclaration declaration) {
		if(getContainerOfType(declaration, Examples.class) == null){
			super.checkVariableDeclaration(declaration);
		}
	}
	
	protected void checkDeclaredVariableName(EObject nameDeclarator, EObject attributeHolder, EAttribute attr) {
		if (nameDeclarator.eContainer() == null)
			return;
		if (attr.getEContainingClass().isInstance(attributeHolder)) {
			String name = (String) attributeHolder.eGet(attr);
			// shadowing 'it' is allowed
			if (name == null || name.equals(XbaseScopeProvider.IT.toString()))
				return;
			int idx = 0;
			if (nameDeclarator.eContainer() instanceof XBlockExpression) {
				idx = ((XBlockExpression)nameDeclarator.eContainer()).getExpressions().indexOf(nameDeclarator);
			}
			IScope scope = getScopeProvider().createSimpleFeatureCallScope(nameDeclarator.eContainer(), XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, nameDeclarator.eResource(), true, idx);
			Iterable<IEObjectDescription> elements = scope.getElements(QualifiedName.create(name));
			for (IEObjectDescription desc : elements) {
				if (desc.getEObjectOrProxy()!=nameDeclarator && !(desc.getEObjectOrProxy() instanceof JvmFeature)) {
					error("Duplicate variable name '"+name+"'", attributeHolder, attr,-1, org.eclipse.xtext.xbase.validation.IssueCodes.VARIABLE_NAME_SHADOWING);
				}
			}
		}
	}
	
	/* copied from Xtend2JavaValidator */ 
	@Check
	public void checkImports(Jnario file) {
		final Map<JvmType, XtendImport> imports = newHashMap();
		final Map<JvmType, XtendImport> staticImports = newHashMap();
		final Map<String, JvmType> importedNames = newHashMap();
		
		for (XtendImport imp : file.getFeature().getImports()) {
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
		if(file.getFeature().getScenarios().isEmpty()){
			return;
		}
		
		ICompositeNode node = NodeModelUtils.findActualNodeFor(file.getFeature().getScenarios().get(0));
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
