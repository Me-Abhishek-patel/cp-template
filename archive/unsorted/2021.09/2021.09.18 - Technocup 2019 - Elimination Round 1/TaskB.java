package codes;

import net.cplibrary.geometry.Point;
import net.cplibrary.geometry.Polygon;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), d = in.readInt();
        Polygon rect = new Polygon(new Point(0, d), new Point(d, 0), new Point(n, n - d), new Point(n - d, n));
        int m = in.readInt();
        for (int i = 0; i < m; i++) {
            if(rect.contains(Point.readPoint(in))){
                out.printLine("YES");
            }else out.printLine("NO");
        }
    }
}
