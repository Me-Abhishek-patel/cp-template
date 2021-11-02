package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class FixedPoints {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= i + 1) {
                res += (n - i);
            }
        }
        out.printLine(res);
    }
}
