package gameoflife;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class CellLocation {
  private static HashSet<CellLocation> NEIGHBOUR_OFFSETS = new Function0<HashSet<CellLocation>>() {
    public HashSet<CellLocation> apply() {
      CellLocation _cell = CellLocation.cell(1, 0);
      CellLocation _cell_1 = CellLocation.cell(1, 1);
      CellLocation _cell_2 = CellLocation.cell(0, 1);
      int _minus = (-1);
      int _minus_1 = (-1);
      CellLocation _cell_3 = CellLocation.cell(_minus, _minus_1);
      int _minus_2 = (-1);
      CellLocation _cell_4 = CellLocation.cell(_minus_2, 0);
      int _minus_3 = (-1);
      CellLocation _cell_5 = CellLocation.cell(_minus_3, 1);
      int _minus_4 = (-1);
      CellLocation _cell_6 = CellLocation.cell(0, _minus_4);
      int _minus_5 = (-1);
      CellLocation _cell_7 = CellLocation.cell(1, _minus_5);
      HashSet<CellLocation> _newHashSet = CollectionLiterals.<CellLocation>newHashSet(_cell, _cell_1, _cell_2, _cell_3, _cell_4, _cell_5, _cell_6, _cell_7);
      return _newHashSet;
    }
  }.apply();
  
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
