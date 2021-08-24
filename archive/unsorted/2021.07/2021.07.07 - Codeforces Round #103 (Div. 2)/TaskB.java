package codes;

import net.cplibrary.geometry.Point;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int xa = in.readInt(), ya = in.readInt(), xb = in.readInt(), yb = in.readInt();
        int n = in.readInt();
        int count = 0;
        int[][] heaters = new int[n][3];
        for (int i = 0; i < n; i++) {
            heaters[i][0] = in.readInt();
            heaters[i][1] = in.readInt();
            heaters[i][2] = in.readInt();

        }
        for (int i = Math.min(ya, yb); i <= Math.max(ya, yb); i++) {
            Point p = new Point(xa, i);
            Point q = new Point(xb, i);
            boolean pflag = false, qflag = false;

            for (int j = 0; j < n; j++) {
                if (p.distance(new Point(heaters[j][0], heaters[j][1])) <= heaters[j][2]) {
                    pflag = true;
                    break;
                }

            }
            for (int j = 0; j < n; j++) {
                if (q.distance(new Point(heaters[j][0], heaters[j][1])) <= heaters[j][2]) {
                    qflag = true;
                    break;
                }

            }
            if (!pflag)
                count++;
            if (!qflag)
                count++;
        }
        for (int i = Math.min(xa, xb)+1; i <= Math.max(xa, xb)-1; i++) {
            Point p = new Point(i, ya);
            boolean pflag = false, qflag = false;
            Point q = new Point(i, yb);
            for (int j = 0; j < n; j++) {
                if (p.distance(new Point(heaters[j][0], heaters[j][1])) <= heaters[j][2]) {
                    pflag = true;
                    break;
                }

            }
            for (int j = 0; j < n; j++) {
                if (q.distance(new Point(heaters[j][0], heaters[j][1])) <= heaters[j][2]) {
                    qflag = true;
                    break;
                }

            }
            if (!pflag)
                count++;
            if (!qflag)
                count++;


        }
        out.printLine(count);
    }

}
