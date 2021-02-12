public class Main {
  public static void main(String[] args) {
    // Setup canvas
    Vector2f canvasDim = new Vector2f(720, 480);
    Canvas canvas = new Canvas((int)canvasDim.getX(), (int)canvasDim.getY());

    // Blocks
    Object block = new Object(new Vector2f(5, 5));

    // Bounding box
    BoundingBox edges = new BoundingBox(new Vector2f(0.f, 0.f), new Vector2f(10.f, 10.f), true);

  }
}
