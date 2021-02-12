public class Object {
  public Object () {}
  public Object (Vector2f _pos) {pos = _pos;}

  //////////////////////////////////////////////////////////////////////////////
  /// {@
  /// Getters
  public Vector2f getPos() {return pos;}
  public Vector2f getVel() {return vel;}
  public float getMass() {return mass;}
  /// @}
  //////////////////////////////////////////////////////////////////////////////
  //////////////////////////////////////////////////////////////////////////////
  /// {@
  /// Setters
  public void setPos(Vector2f _pos){pos = _pos;}
  public void setVel(Vector2f _vel){vel = _vel;}
  public void setMass(float _mass){mass = _mass;}
  /// @}
  //////////////////////////////////////////////////////////////////////////////

  private Vector2f pos; //< Position
  private Vector2f vel; //< Velocity
  private float mass; //< Mass
  private static Vector2f gravity = new Vector2f(0.f, -9.807f); //< Gravity
}
