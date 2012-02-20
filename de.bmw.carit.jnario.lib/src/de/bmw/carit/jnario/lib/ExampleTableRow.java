/**
 * 
 */
package de.bmw.carit.jnario.lib;

import java.util.List;

/**
 * @author Sebastian Benz
 *
 */
public abstract class ExampleTableRow {

	private final List<String> cells;

	public ExampleTableRow(List<String> cells) {
		this.cells = cells;
	}
	
	List<String> getCells(){
		return cells;
	}
	
}
