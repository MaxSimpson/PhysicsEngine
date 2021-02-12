
public class Vector2f {

  //////////////////////////////////////////////////////////////////////////////
  /// {@
  /// Constructors
  public Vector2f() {
    pos[0] = 0;
    pos[1] = 0;
  }
  public Vector2f(float _x, float _y) {
    pos[0] = _x;
    pos[1] = _y;
  }
  public Vector2f(float num) {
   pos[0] = num;
   pos[1] = num;
  }
  public Vector2f(int _x, int _y) {
    pos[0] = (float) _x;
    pos[1] = (float) _y;
  }
  public Vector2f(Vector2f n) {
    pos[0] = n.getX();
    pos[1] = n.getY();
  }
  /// @}
  //////////////////////////////////////////////////////////////////////////////

  //////////////////////////////////////////////////////////////////////////////
  /// {@
  /// Setters
  public void setX(float num) {pos[0] = num;}
  public void setY(float num) {pos[1] = num;}
  public void set(float x, float y) {
    pos[0] = x;
    pos[1] = y;
  }
  /// @}
  //////////////////////////////////////////////////////////////////////////////

  public void multiply(float num) {
    pos[0] *= num;
    pos[1] *= num;
  }
  public void add(Vector2f num) {
    pos[0] += num.getX();
    pos[1] += num.getY();
  }

  //////////////////////////////////////////////////////////////////////////////
  /// {@
  // Getters
  public float getX() {return pos[0];}
  public float getY() {return pos[1];}
  public Vector2f getVec() {return new Vector2f(pos[0], pos[1]);}
  public float getMag() {
    return (float) Math.sqrt((pos[0]*pos[0]) + (pos[1]*pos[1]));
  }
  /// @}
  //////////////////////////////////////////////////////////////////////////////

  private float[] pos = new float[2]; //< Position array
}
