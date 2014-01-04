package gameoflife;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class CellLocation {
  private static HashSet<CellLocation> NEIGHBOUR_OFFSETS = CollectionLiterals.<CellLocation>newHashSet(
    CellLocation.cell(1, 0), CellLocation.cell(1, 1), CellLocation.cell(0, 1), CellLocation.cell((-1), (-1)), CellLocation.cell((-1), 0), CellLocation.cell((-1), 1), CellLocation.cell(0, (-1)), CellLocation.cell(1, (-1)));
  
  public static CellLocation cell(final int x, final int y) {
    CellLocation _cellLocation = new CellLocation(x, y);
    return _cellLocation;
  }
  
  private final int _x;
  
  public int getX() {
    return this._x;
  }
  
  private final int _y;
  
  public int getY() {
    return this._y;
  }
  
  public Set<CellLocation> neighbours() {
    final Function1<CellLocation,CellLocation> _function = new Function1<CellLocation,CellLocation>() {
      public CellLocation apply(final CellLocation it) {
        CellLocation _plus = CellLocation.this.plus(it);
        return _plus;
      }
    };
    Iterable<CellLocation> _map = IterableExtensions.<CellLocation, CellLocation>map(CellLocation.NEIGHBOUR_OFFSETS, _function);
    Set<CellLocation> _set = IterableExtensions.<CellLocation>toSet(_map);
    return _set;
  }
  
  public CellLocation plus(final CellLocation other) {
    int _x = this.getX();
    int _x_1 = other.getX();
    int _plus = (_x + _x_1);
    int _y = this.getY();
    int _y_1 = other.getY();
    int _plus_1 = (_y + _y_1);
    CellLocation _cell = CellLocation.cell(_plus, _plus_1);
    return _cell;
  }
  
  public CellLocation(final int x, final int y) {
    super();
    this._x = x;
    this._y = y;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + _x;
    result = prime * result + _y;
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CellLocation other = (CellLocation) obj;
    if (other._x != _x)
      return false;
    if (other._y != _y)
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
