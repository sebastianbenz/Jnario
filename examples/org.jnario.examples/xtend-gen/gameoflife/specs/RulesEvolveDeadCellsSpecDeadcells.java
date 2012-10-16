package gameoflife.specs;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class RulesEvolveDeadCellsSpecDeadcells extends ExampleTableRow {
  public RulesEvolveDeadCellsSpecDeadcells(final List<String> cellNames, final int liveNeighbourCount, final boolean result) {
    super(cellNames);
    this.liveNeighbourCount = liveNeighbourCount;
    this.result = result;
  }
  
  public int liveNeighbourCount;
  
  public int getLiveNeighbourCount() {
    return liveNeighbourCount;
  }
  
  public boolean result;
  
  public boolean getResult() {
    return result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(liveNeighbourCount) ,toString(result));
  }
}
