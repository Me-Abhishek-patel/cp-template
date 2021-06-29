package codes;

import net.egork.geometry.Point;
import net.egork.geometry.Polygon;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;


import java.util.ArrayList;

public class Uva476 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        char ch;
        ArrayList<Polygon> rectangles = new ArrayList<>();
        while ((ch = in.readCharacter()) != '*') {
            Point tl = Point.readPoint(in), br = Point.readPoint(in);
            Polygon rect = new Polygon(tl, new Point(tl.x, br.y), br, new Point(br.x, tl.y));
            rectangles.add(rect);
        }
        int i = 1;

        while (true) {
            double x = in.readDouble(), y = in.readDouble();
            if (x == 9999.9 && y == 9999.9) return;
            Point point = new Point(x, y);
            boolean isPresent = false;
            for (int j = 0; j < rectangles.size(); j++) {
                if (rectangles.get(j).contains(point)) {
                    isPresent = true;
                    out.printLine("Point " + (i) + " is contained in figure " + (j + 1));
                }

            }
            if(!isPresent) out.printLine("Point "+i+" is not contained in any figure");
            i++;
        }

    }
}
