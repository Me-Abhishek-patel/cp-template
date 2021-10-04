package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AnotherShortestPathsProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int m = in.readInt();
        int x = in.readInt();
        int y = in.readInt();
        if (2 * x < y) {
            if (n < m) {
                out.printLine((n - 1) * 2 * x + (m - n) * x);
                return;
            } else {
                out.printLine((m - 1) * 2 * x + (n - m) * x);
                return;
            }
        } else {
            if (n < m) {
                out.printLine((n - 1) * y + (m - n) * x);
                return;
            } else {
                out.printLine((m - 1) * y + (m - n) * x);
                return;
            }
        }

    }


}

