package codes;

import net.cplibrary.geometry.GeometryUtils;
import net.cplibrary.geometry.Point;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Point initialPoint = Point.readPoint(in);
        ArrayList<Point> al = new ArrayList<>(n);
        HashSet<Point> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Point p = Point.readPoint(in);
            al.add(p);
            hs.add(p);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            Point p = al.get(i);
            if (hs.contains(p)) {
                for (int j = i+1; j < n; j++) {
                    if (GeometryUtils.isCollinear(initialPoint, p, al.get(j)))
                        hs.remove(al.get(j));

                }
                count++;
            }
        }
        out.printLine(count);


    }
}
