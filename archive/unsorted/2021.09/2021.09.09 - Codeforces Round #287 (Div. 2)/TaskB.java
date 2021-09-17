package codes;

import net.cplibrary.geometry.Point;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int r = in.readInt();
        Point x = Point.readPoint(in), y = Point.readPoint(in);
        double dist = x.distance(y);
        out.printLine((int)Math.ceil(dist/(2*r)));
    }
}
