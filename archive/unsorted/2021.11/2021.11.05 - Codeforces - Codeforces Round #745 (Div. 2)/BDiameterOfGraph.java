package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BDiameterOfGraph {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
        long sum = (long) (n - 1) * (n) / 2;
        if (m > sum) {
            out.printLine("NO");
            return;
        }
        if (k < 3) {
            if (k == 2 && n == 1) {
                out.printLine("YES");
            } else out.printLine("NO");

        } else if (k == 3) {
            if (m == sum) {
                out.printLine("YES");
            } else {
                out.printLine("NO");
            }

        } else {
            if (m >= n - 1) {
                out.printLine("YES");
            } else
                out.printLine("NO");
        }
    }
}
