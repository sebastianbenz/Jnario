package org.jnario.spec.formatting

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.core.formatting.XtendFormatter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.xbase.formatting.FormattableDocument
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory
import org.eclipse.xtext.xbase.formatting.NodeModelAccess
import org.jnario.ExampleColumn
import org.jnario.ExampleRow
import org.jnario.ExampleTable
import org.jnario.JnarioPackage

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class SpecFormatter extends XtendFormatter {
	
	@Inject extension NodeModelAccess
	@Inject extension FormattingDataFactory
	
	def private void formatRows(EList<ExampleRow> rows, FormattableDocument format) { 
		rows.forEach[
			format += nodeForEObject.append[newLine]
		]
	}

	def private void formatColumns(EList<ExampleColumn> columns, FormattableDocument format) {
		columns.forEach[
			val nameNode = nodeForFeature(JnarioPackage.Literals.EXAMPLE_COLUMN__NAME)
			val typeNode= nodeForFeature(JnarioPackage.Literals.EXAMPLE_COLUMN__TYPE)
			
			val headerLength = if (typeNode == null) {
				nameNode.length
			} else {
				nameNode.offset + nameNode.length - typeNode.offset
			}
			
			val maxExprLength = cells.map[getMultilineLength(format, expression.nodeForEObject)].reduce[p1, p2 | Math.max(p1, p2)] ?: 0
			val maxLength = Math.max(headerLength, maxExprLength)
		
			val columnLength = 1 + maxLength - headerLength
			format += nodeForEObject.prepend[oneSpace]	
			format += nodeForKeyword("|").prepend[
				space = (1..columnLength).fold("", [p1, p2 | p1 + " "])
			]	
			cells.forEach[
				format += expression.nodeForEObject.prepend[oneSpace]
				
				val length = 1 + maxLength - getMultilineLastSegmentLength(format, expression.nodeForEObject)
				format += expression.nodeForEObject.append[
					space = (1..length).fold("", [p1, p2 | p1 + " "])
				]
			]
		]
		format += columns.last.nodeForEObject.append[newLine]
	}
	
	def private getMultilineLastSegmentLength(FormattableDocument format, INode node) {
		val str = format.document.substring(node.offset, node.offset + node.length)
		str.split(System.getProperty("line.separator")).last.trim.length
	}
	
	def private getMultilineLength(FormattableDocument format, INode node) {
		val str = format.document.substring(node.offset, node.offset + node.length)
		str.split(System.getProperty("line.separator")).map[trim.length].reduce[p1, p2 | Math.max(p1, p2)]
	}
	
	def protected dispatch void format(ExampleTable table, FormattableDocument format) {
		format += table.nodeForKeyword("{").append[
			increaseIndentation
			newLine
		] 
		format += table.nodeForKeyword("}").prepend[decreaseIndentation]
		formatRows(table.rows, format)
		formatColumns(table.columns, format)
	}
}