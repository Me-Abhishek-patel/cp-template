package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
        for (int i = 0; i < n - 1; i++) {
            int t = Math.max(0, a[i + 1] - k);
            m += a[i] - t;
            if (m < 0) {
                out.printLine("NO");
                return;
            }
        }

        out.printLine("YES");

    }

    private boolean go(int[] a, int i, int m, int k) {
        if (i == a.length - 1) return true;
        if (a[i] + k + m >= a[i + 1])
            return go(a, i + 1, Math.max(0, m + a[i] + k - a[i + 1]), k);
        else return false;
    }
}
