package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class BVanyaAndLanterns {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), l = in.readInt();
        int[] a = in.readIntArray(n);
        Arrays.sort(a);
        double res = Math.max(l - a[n - 1], a[0]);
        for (int i = 1; i < n; i++) {
            res = Math.max(((a[i] - a[i - 1]) / 2.0), res);
        }
        out.printLine(res);

    }
}
