package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class MaximumDamage {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                res[i] = (a[i] & a[i + 1]);
            else if (i == n - 1)
                res[i] = (a[i] & a[i - 1]);
            else res[i] = Math.max((a[i] & a[i + 1]),(a[i] & a[i - 1]));

        }
        out.printLine(res);
    }
}
