import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

class Voronoi {
    private final Point[] voronoiSites;
    private final Random RNG = new Random();
    Voronoi(final int numSites) {
        voronoiSites =new Point[numSites];
        initializePoints();
        Arrays.sort(voronoiSites);
        //printPoints();
        findDiagram();
    }

    private void printPoints() {
        for (final Point p : voronoiSites) {
            System.out.println(p.getY());
        }
    }

    private void findDiagram() {
        LinkedList<Point> points = new LinkedList<>(Arrays.asList(voronoiSites));
        ArrayList<Point> beachLine = new ArrayList<>();
        while (!points.isEmpty()) {
            final Point next = points.removeFirst();
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(next.getX(), next.getY());
            StdDraw.pause(500);
            insert(beachLine, next);
            if (beachLine.size() > 2) {
                checkForVertexEvent();
            }
        }
    }

    private void checkForVertexEvent() {

    }

    private void initializePoints() {
        for(int i = 0; i < voronoiSites.length; i++) {
            final double x = RNG.nextDouble();
            final double y = RNG.nextDouble();
            voronoiSites[i] = new Point(x, y);
        }
    }
    private void insert(final ArrayList<Point> beachLine, final Point p) {

    }
    Point[] getVoronoiSites() {
        return voronoiSites;
    }
}
