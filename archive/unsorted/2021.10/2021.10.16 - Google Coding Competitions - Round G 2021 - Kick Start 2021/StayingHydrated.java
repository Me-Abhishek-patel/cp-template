package codes;

import net.cplibrary.geometry.Point;
import net.cplibrary.geometry.Polygon;
import net.cplibrary.geometry.Segment;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;


public class StayingHydrated {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.readInt();
        Polygon[] a = new Polygon[k];
        for (int i = 0; i < k; i++) {
            Point c = Point.readPoint(in), b = Point.readPoint(in);
            Point x = new Point(c.x, b.y), d = new Point(b.x, c.y);
            a[i] = new Polygon(x, b, d, c);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < k - 1; i++) {
            Polygon p = a[i];
            Segment[] psides = p.sides();
            int sum = 0;
            for (int e = 0; e < psides.length; e++) {
                Segment s = psides[e];
                int temp = 0;
                for (int j = i + 1; j < k; j++) {
                    Polygon q = a[j];
                    Segment[] qsides = q.sides();

                    double min = Integer.MAX_VALUE;
                    for (int m = 0; m < qsides.length; m++) {
                        min = Math.min(min, s.distanceManhattan(qsides[m]));
                    }
                    temp += min;
                }
                sum = Math.min(sum, temp);
            }
            res = Math.min(res, sum);

        }
        out.printLine(res);

    }


}

