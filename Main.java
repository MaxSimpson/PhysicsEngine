import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    // Setup dt calculation
    long initTime = System.nanoTime();

    // Setup canvas
    Vector2f canvasDim = new Vector2f(720, 480);
    Vector2f realDim = new Vector2f(25, 25);
    Canvas canvas = new Canvas((int)canvasDim.getX(), (int)canvasDim.getY());
    
    // Setup objs
    ArrayList<Agent> objs = new ArrayList<Agent>();
    objs.add(new Agent(new Vector2f(12.5f, 12.5f)));
    System.out.println(objs.get(0).getCounter());

    // Init objs
    for(Agent agent : objs) {
      agent.setVel(new Vector2f(0, 0));
    }
    System.out.println("Init took: " + (System.nanoTime() - initTime) / 1000000);

    // Bounding box
    // BoundingBox edges = new BoundingBox(new Vector2f(0.f, 0.f), new Vector2f(10.f, 10.f), true);

    // Reset Dt for frame counts
    initTime = System.nanoTime();
    float dt = 0.001f;
    for(int i = 0; i < 25; i++) {
      for(Agent agent : objs) {
        // Calculate accelerations
        Vector2f acc = new Vector2f(0.f, -9.807f);

        // Validate paths

        // Move
        acc.multiply(0.5f * (dt * dt));
        agent.addVel(acc);
        if(agent.getID() == 0) {
          System.out.println("Agent acc: " + acc.getX() + " " + acc.getY());
        }
        // Update
        agent.update();
      }
      
      // Drawing
      StdDraw.clear();
      for(Agent agent : objs) {
        Vector2f scaledVal = agent.getPos();
        StdDraw.filledCircle((canvasDim.getX() / realDim.getX() * scaledVal.getX()), (canvasDim.getY() / realDim.getY() * scaledVal.getY()), 5);
      }
      StdDraw.show();

      // Dt stats
      dt = ((System.nanoTime() - initTime) / 100000000.0f);
      initTime = System.nanoTime();
      System.out.println("Frame " + i + " took " + dt + "ms");

    }

  }
}
