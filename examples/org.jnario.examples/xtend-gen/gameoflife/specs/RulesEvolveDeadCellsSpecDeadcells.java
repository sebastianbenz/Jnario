package gameoflife.specs;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class RulesEvolveDeadCellsSpecDeadcells extends ExampleTableRow {
  public RulesEvolveDeadCellsSpecDeadcells(final List<String> cellNames, final int liveNeighbourCount, final boolean result) {
    super(cellNames);
    this.liveNeighbourCount = liveNeighbourCount;
    this.result = result;
    
  }
  
  private int liveNeighbourCount;
  
  public int getLiveNeighbourCount() {
    return this.liveNeighbourCount;
  }
  
  private boolean result;
  
  public boolean getResult() {
    return this.result;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(liveNeighbourCount) ,toString(result));
  }
}
