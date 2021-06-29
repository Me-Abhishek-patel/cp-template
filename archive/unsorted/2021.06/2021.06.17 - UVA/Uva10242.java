package codes;

import net.egork.geometry.Point;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class Uva10242 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Point p1 = new Point(in.readDouble(), in.readDouble()), p2 =new Point(in.readDouble(), in.readDouble()), p3 = new Point(in.readDouble(), in.readDouble());
        double dx = p1.x + (p3.x - p2.x);
        double dy = p3.y + (p2.y - p1.y);
        out.printLine(dx + " "+dy);

    }
}
