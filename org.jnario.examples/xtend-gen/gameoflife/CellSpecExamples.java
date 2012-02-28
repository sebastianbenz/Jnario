package gameoflife;

import gameoflife.Cell;
import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class CellSpecExamples extends ExampleTableRow {
  CellSpecExamples(final List<String> cellNames, final Cell cell, final int neighborCount, final Class<?> newState) {
    super(cellNames);
    this.cell = cell;
    this.neighborCount = neighborCount;
    this.newState = newState;
  }
  
  public Cell cell;
  
  public Cell getCell() {
    return cell;
  }
  
  public int neighborCount;
  
  public int getNeighborCount() {
    return neighborCount;
  }
  
  public Class<?> newState;
  
  public Class<?> getNewState() {
    return newState;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(cell) , String.valueOf(neighborCount) , String.valueOf(newState));
  }
}
