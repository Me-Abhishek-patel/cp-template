package codes;

import net.cplibrary.geometry.Point;
import net.cplibrary.geometry.Vector;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BSteps {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), m = in.readInt();
        Point curr = Point.readPoint(in);
        int k = in.readInt();
        long res = 0;
        for (int i = 0; i < k; i++) {
            Vector vector = new Vector(Point.readPoint(in));
            long stepx = vector.x > 0 ? (int) ((n - curr.x) / Math.abs(vector.x)) : (int) ((curr.x - 1) / Math.abs(vector.x));
            long stepy = vector.y > 0 ? (int) ((m - curr.y) /Math.abs(vector.y)) : (int) ((curr.y - 1) / Math.abs(vector.y));
            long minstep = Math.abs(Math.min(stepx, stepy));
            if (vector.x == 0 && vector.y != 0) minstep = stepy;
            else if (vector.y == 0 && vector.x != 0) minstep = stepx;
            else if (vector.x == 0 && vector.y == 0) minstep = 0;
            minstep = Math.abs(minstep);
            res += minstep;
            curr = curr.apply(vector, minstep);
//            curr = new Point(curr.x + (vector.x * minstep), curr.y + (vector.y * minstep));
        }
        out.printLine(res);
    }
}
