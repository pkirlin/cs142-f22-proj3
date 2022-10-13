import java.awt.*;
import java.util.Arrays;

/**
 * A Polygon represents a shape drawn with a sequence of connected line segments.
 */
public class Polygon {
    /** The array of x-coordinates for this Polygon. */
    private double[] xpoints;

    /** The array of y-coordinates for this Polygon. */
    private double[] ypoints;

    /** The color of this Polygon. */
    private Color color;

    /** The next index in the arrays of x/y coordinates that will be filled by addPoint(). */
    private int nextIndex;

    /** Create a new polygon, given how many points it has and its color. */
    public Polygon(int numPoints, Color c)
    {
        xpoints = new double[numPoints];
        ypoints = new double[numPoints];
        color = c;
        nextIndex = 0;
    }

    /** Add a point to this polygon. */
    public void addPoint(double x, double y)
    {
        // your code here
    }

    /** Translate this polygon in the direction given by distx and disty. */
    public void translate(double distx, double disty)
    {
        // your code here
    }

    /** Rotate this polygon around the point (a, b) by the degrees given by angle. */
    public void rotateAround(double a, double b, double angle)
    {
        // your code here
    }

    /** Draw this polygon on a canvas.  The canvas should already be constructed and shown. */
    public void drawOn(SimpleCanvas canvas)
    {
        if (xpoints.length != ypoints.length) {  // sanity check: these should be the same.
            System.err.println("Warning: Length of x and y arrays don't match.");
        }
        if (nextIndex != xpoints.length) { // sanity check: can't draw until these are full.
            System.err.println("Warning: x & y coordinate arrays are not full.");
        }

        // Convert xpoints and ypoints to integers because that's what SimpleCanvas needs.
        int[] newX = new int[xpoints.length];
        int[] newY = new int[ypoints.length];
        for (int i = 0; i < xpoints.length; i++)
        {
            newX[i] = (int)xpoints[i];
            newY[i] = (int)ypoints[i] ;
        }
        canvas.setPenColor(color);
        canvas.drawFilledPolygon(newX, newY);
    }

    /** Return a String representation of this Polygon. */
    public String toString() {
        return ""; // replace this when you start writing this method.
    }
}
