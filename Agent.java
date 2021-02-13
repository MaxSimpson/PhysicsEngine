public class Agent {
  public Agent () {pos = new Vector2f(0, 0); id = counter; counter++;}
  public Agent (Vector2f _pos) {pos = _pos; id = counter; counter++;}


  public void update() {
    pos.add(vel);
  }

  //////////////////////////////////////////////////////////////////////////////
  /// {@
  /// Getters
  public int getCounter(){return counter;}
  public int getID() {return id;}
  public Vector2f getPos() {return pos;}
  public Vector2f getVel() {return vel;}
  public float getMass() {return mass;}
  public Vector2f getGravity() {return gravity;}
  /// @}
  //////////////////////////////////////////////////////////////////////////////

  public void addVel(Vector2f newVal){vel.set(vel.getX() + newVal.getX(), vel.getY() + newVal.getY());}

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
  private int id; //< ID of individual agents
  private static Vector2f gravity = new Vector2f(0.f, -9.807f); //< Gravity
  public static int counter; //< Global counter for num of agents
}
