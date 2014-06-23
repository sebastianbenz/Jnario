package org.jnario.formatter

import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.core.formatting.XtendFormatter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.xbase.formatting.FormattableDocument
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory
import org.eclipse.xtext.xbase.formatting.FormattingDataInit
import org.eclipse.xtext.xbase.formatting.NodeModelAccess
import org.jnario.ExampleColumn
import org.jnario.ExampleRow
import org.jnario.ExampleTable
import org.jnario.JnarioPackage

/**
 * @author Sebastian Benz - Initial contribution and API
 */
class JnarioFormatter extends XtendFormatter {
	
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
			format += nodeForKeyword("|").prepend[spaces(columnLength)]	
			cells.forEach[
				format += expression.nodeForEObject.prepend[oneSpace]
				
				val length = 1 + maxLength - getMultilineLastSegmentLength(format, expression.nodeForEObject)
				format += expression.nodeForEObject.append[spaces(length)]
			]
		]
		format += columns.last.nodeForEObject.append[newLine]
	}
	
	def spaces(FormattingDataInit init, int i) {
		init.space = (1..i).fold("", [p1, p2 | p1 + " "])
	}
	
	def private getSplittedMultilineCell(FormattableDocument format, INode node) {
		format.document.substring(node.offset, node.offset + node.length).split("\r?\n")
	}

	def private getMultilineLastSegmentLength(FormattableDocument format, INode node) {
		getSplittedMultilineCell(format, node).last.trim.length
	}
	
	def private getMultilineLength(FormattableDocument format, INode node) {
		getSplittedMultilineCell(format, node).map[trim.length].reduce[p1, p2 | Math.max(p1, p2)]
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