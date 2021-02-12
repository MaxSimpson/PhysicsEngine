public class BoundingBox {

  public BoundingBox() {}
  public BoundingBox(Vector2f _min, Vector2f _max, boolean _inside) {
    setMin(_min);
    setMax(_max);
    setInside(_inside);
  }

  public void setMin(Vector2f _min) {min = _min;} 
  public void setMax(Vector2f _max) {max = _max;} 
  public void setInside(boolean _inside) {insideLimit = _inside;} 

  public Vector2f getMin() {return min;}
  public Vector2f getMax() {return max;}
  public boolean getInside() {return insideLimit;}

  private Vector2f min;
  private Vector2f max;
  private boolean insideLimit; 
}
