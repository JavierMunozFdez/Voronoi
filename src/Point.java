import java.util.Comparator;

public class Point implements Comparable<Point> {

    private double x;
    private double y;

    private boolean vertexEvent = false;
    Point(final double theX, final double theY) {
        x = theX;
        y = theY;
    }

    @Override
    public int compareTo(final Point other) {
        if ((this.y - other.y) > 0) {
            return 1;
        } else if (this.y == other.y) {
            return 0;
        } else {
            return -1;
        }
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isVertexEvent() {
        return vertexEvent;
    }

    public void setVertexEvent(boolean vertexEvent) {
        this.vertexEvent = vertexEvent;
    }

    private static class Horizontal implements Comparator<Point> {
        @Override
        public int compare(final Point first, final Point second) {
            return (int) (first.x - second.y);
        }
    }
}
