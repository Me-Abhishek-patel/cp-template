package codes;

import net.egork.geometry.Point;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        double n = in.readDouble(), k = in.readDouble();
        double sum = 0;
        Point prev = Point.readPoint(in);
        for (int i = 1; i < n; i++) {
            Point curr = Point.readPoint(in);
            sum+=curr.distance(prev);
            prev = curr;
        }
        out.printLine((float)(k*sum/50.0000000));

    }
}
