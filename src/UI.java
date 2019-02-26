public class UI {
    UI() {
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(.01);
    }
    void drawVoronoiDiagram(final Voronoi v) {
        Point[] points = v.getVoronoiSites();
        for (Point p : points) {
            StdDraw.point(p.getX(), p.getY());
        }
        StdDraw.show();
    }
}
