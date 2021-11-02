package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CPerfectPair {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long x = in.readLong(), y = in.readLong(), m = in.readLong();
        if (x + y <= Math.min(x, y) && x < m && y < m && x + y < m) {
            out.printLine(-1);
            return;
        }
        long step = 0;
        if (x < y) {
            long t = x;
            x = y;
            y = t;
        }

        while (x < m) {
            long t = Math.max(x, y);
            if (y < 0 && x > 0 && -y>x) {
                step += (Math.abs(y)) / x;
                y += (-y) / x * x;
            } else {
                x = x + y;
                y = t;
                step++;
            }
            if (x < y) {
                t = x;
                x = y;
                y = t;
            }
        }
        out.printLine(step);
    }
}
