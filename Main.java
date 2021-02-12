import java.util.ArrayList;

import javax.management.relation.Relation;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    // Setup canvas
    Vector2f canvasDim = new Vector2f(720, 480);
    Vector2f realDim = new Vector2f(25, 25);
    Canvas canvas = new Canvas((int)canvasDim.getX(), (int)canvasDim.getY());

    // Blocks
    ArrayList<Object> objs = new ArrayList<Object>();
    objs.add(new Object(new Vector2f(12.5f, 12.5f)));
    // Init objs
    for(Object agent : objs) {
      agent.setVel(new Vector2f(0, 0));
    }

    // Bounding box
    // BoundingBox edges = new BoundingBox(new Vector2f(0.f, 0.f), new Vector2f(10.f, 10.f), true);

    for(int i = 0; i < 100; i++) {
      for(Object agent : objs) {
        // Calculate accelerations
        Vector2f acc = new Vector2f(0.f, -9.807f);

        // Validate paths

        // Move
        acc.multiply(0.5f * 0.0256f);
        agent.addVel(acc);

        // Update
        agent.update();
      }
      
      // Drawing
      StdDraw.clear();
      for(Object agent : objs) {
        Thread.sleep(500);
        Vector2f scaledVal = agent.getPos();
        StdDraw.filledCircle((canvasDim.getX() / realDim.getX() * scaledVal.getX()), (canvasDim.getY() / realDim.getY() * scaledVal.getY()), 5);
      }
      StdDraw.show();
    }
  }
}
