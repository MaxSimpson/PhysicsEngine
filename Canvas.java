public class Canvas {
  public Canvas (int canvasX, int canvasY) {
    // StdDraw Setup
		StdDraw.setCanvasSize(canvasX, canvasY);
		StdDraw.setXscale(0.0, canvasX);
    StdDraw.setYscale(0.0, canvasY);	
		StdDraw.enableDoubleBuffering();
  }
}
