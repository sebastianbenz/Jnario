package gameoflife.specs;

import com.google.common.collect.Iterables;
import gameoflife.CellLocation;
import gameoflife.World;
import gameoflife.specs.WorldSpec;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.StringDescription;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("dead cells")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class WorldDeadCellsSpec extends WorldSpec {
  @Test
  @Named("with no live cells there are no dead cells")
  @Order(1)
  public void _withNoLiveCellsThereAreNoDeadCells() throws Exception {
    List<CellLocation> _emptyList = CollectionLiterals.<CellLocation>emptyList();
    World _worldWith = World.worldWith(_emptyList);
    Set<CellLocation> _deadCells = _worldWith.deadCells();
    Set<Object> _emptySet = CollectionLiterals.<Object>emptySet();
    boolean _doubleArrow = Should.operator_doubleArrow(_deadCells, _emptySet);
    Assert.assertTrue("\nExpected worldWith(emptyList).deadCells => emptySet but"
     + "\n     worldWith(emptyList).deadCells is " + new StringDescription().appendValue(_deadCells).toString()
     + "\n     worldWith(emptyList) is " + new StringDescription().appendValue(_worldWith).toString()
     + "\n     emptyList is " + new StringDescription().appendValue(_emptyList).toString()
     + "\n     emptySet is " + new StringDescription().appendValue(_emptySet).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("with a live cell all neighbours are dead cells")
  @Order(2)
  public void _withALiveCellAllNeighboursAreDeadCells() throws Exception {
    Set<CellLocation> _deadCells = this.worldWithLiveCell.deadCells();
    Set<CellLocation> _neighbours = this.liveCell.neighbours();
    boolean _doubleArrow = Should.operator_doubleArrow(_deadCells, _neighbours);
    Assert.assertTrue("\nExpected worldWithLiveCell.deadCells => liveCell.neighbours but"
     + "\n     worldWithLiveCell.deadCells is " + new StringDescription().appendValue(_deadCells).toString()
     + "\n     worldWithLiveCell is " + new StringDescription().appendValue(this.worldWithLiveCell).toString()
     + "\n     liveCell.neighbours is " + new StringDescription().appendValue(_neighbours).toString()
     + "\n     liveCell is " + new StringDescription().appendValue(this.liveCell).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("with a live cell all non-living neighbours are dead cells")
  @Order(3)
  public void _withALiveCellAllNonLivingNeighboursAreDeadCells() throws Exception {
    Set<CellLocation> _deadCells = this.worldWithTwoLiveNeighbours.deadCells();
    Set<CellLocation> _allNonLivingNeighbours = this.allNonLivingNeighbours();
    boolean _doubleArrow = Should.operator_doubleArrow(_deadCells, _allNonLivingNeighbours);
    Assert.assertTrue("\nExpected worldWithTwoLiveNeighbours.deadCells => allNonLivingNeighbours but"
     + "\n     worldWithTwoLiveNeighbours.deadCells is " + new StringDescription().appendValue(_deadCells).toString()
     + "\n     worldWithTwoLiveNeighbours is " + new StringDescription().appendValue(this.worldWithTwoLiveNeighbours).toString()
     + "\n     allNonLivingNeighbours is " + new StringDescription().appendValue(_allNonLivingNeighbours).toString() + "\n", _doubleArrow);
    
  }
  
  public Set<CellLocation> allNonLivingNeighbours() {
    Set<CellLocation> _xblockexpression = null;
    {
      Set<CellLocation> _neighbours = this.liveCell.neighbours();
      Set<CellLocation> _neighbours_1 = this.anotherLivingCell.neighbours();
      Iterable<CellLocation> _plus = Iterables.<CellLocation>concat(_neighbours, _neighbours_1);
      final Set<CellLocation> allNonLivingNeighbours = IterableExtensions.<CellLocation>toSet(_plus);
      allNonLivingNeighbours.remove(this.anotherLivingCell);
      allNonLivingNeighbours.remove(this.liveCell);
      _xblockexpression = (allNonLivingNeighbours);
    }
    return _xblockexpression;
  }
}
