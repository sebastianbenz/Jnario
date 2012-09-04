package gameoflife;

import com.google.common.collect.Iterables;
import gameoflife.CellPosition;
import gameoflife.GameOfLifeWorldSpec;
import gameoflife.World;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("deadCells")
public class GameOfLifeWorldDeadCellsSpec extends GameOfLifeWorldSpec {
  @Test
  @Named("with no live cells there are no dead cells")
  @Order(99)
  public void _withNoLiveCellsThereAreNoDeadCells() throws Exception {
    List<CellPosition> _emptyList = CollectionLiterals.<CellPosition>emptyList();
    World _worldWith = World.worldWith(_emptyList);
    Set<CellPosition> _deadCells = _worldWith.deadCells();
    Set<?> _emptySet = CollectionLiterals.emptySet();
    boolean _doubleArrow = Should.operator_doubleArrow(_deadCells, _emptySet);
    Assert.assertTrue("\nExpected worldWith(emptyList).deadCells => emptySet but"
     + "\n     worldWith(emptyList).deadCells is " + new StringDescription().appendValue(_deadCells).toString()
     + "\n     worldWith(emptyList) is " + new StringDescription().appendValue(_worldWith).toString()
     + "\n     emptyList is " + new StringDescription().appendValue(_emptyList).toString()
     + "\n     emptySet is " + new StringDescription().appendValue(_emptySet).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("with a live cell all neighbours are dead cells")
  @Order(99)
  public void _withALiveCellAllNeighboursAreDeadCells() throws Exception {
    Set<CellPosition> _deadCells = this.worldWithLiveCell.deadCells();
    Set<CellPosition> _neighbours = this.livingCell.neighbours();
    boolean _doubleArrow = Should.operator_doubleArrow(_deadCells, _neighbours);
    Assert.assertTrue("\nExpected worldWithLiveCell.deadCells => livingCell.neighbours but"
     + "\n     worldWithLiveCell.deadCells is " + new StringDescription().appendValue(_deadCells).toString()
     + "\n     worldWithLiveCell is " + new StringDescription().appendValue(this.worldWithLiveCell).toString()
     + "\n     livingCell.neighbours is " + new StringDescription().appendValue(_neighbours).toString()
     + "\n     livingCell is " + new StringDescription().appendValue(this.livingCell).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("with a live cell all non-living neighbours are dead cells")
  @Order(99)
  public void _withALiveCellAllNonLivingNeighboursAreDeadCells() throws Exception {
    Set<CellPosition> _neighbours = this.livingCell.neighbours();
    Set<CellPosition> _neighbours_1 = this.anotherLivingCell.neighbours();
    Iterable<CellPosition> _plus = Iterables.<CellPosition>concat(_neighbours, _neighbours_1);
    final Set<CellPosition> expectedDeadCells = IterableExtensions.<CellPosition>toSet(_plus);
    expectedDeadCells.remove(this.anotherLivingCell);
    expectedDeadCells.remove(this.livingCell);
    Set<CellPosition> _deadCells = this.worldWithTwoLiveNeighbours.deadCells();
    boolean _doubleArrow = Should.operator_doubleArrow(_deadCells, expectedDeadCells);
    Assert.assertTrue("\nExpected worldWithTwoLiveNeighbours.deadCells => expectedDeadCells but"
     + "\n     worldWithTwoLiveNeighbours.deadCells is " + new StringDescription().appendValue(_deadCells).toString()
     + "\n     worldWithTwoLiveNeighbours is " + new StringDescription().appendValue(this.worldWithTwoLiveNeighbours).toString()
     + "\n     expectedDeadCells is " + new StringDescription().appendValue(expectedDeadCells).toString() + "\n", _doubleArrow);
    
  }
}
