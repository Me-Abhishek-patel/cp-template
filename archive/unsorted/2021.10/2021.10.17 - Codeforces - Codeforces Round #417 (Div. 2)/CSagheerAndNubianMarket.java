package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CSagheerAndNubianMarket {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), s = in.readInt();
        int[] a = in.readIntArray(n);
        int l = 0, r = n+1;
        while (l < r-1) {
            int mid = l + (r-l) / 2;
            if (res(a, mid) <= s) {
                l = mid;
            } else {
                r = mid;
            }
        }
        out.printLine(l+" "+res(a,l));

    }

    private long res(int[] a, int mid) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] + (long) (i + 1) * mid;
        }
        Arrays.sort(b);
        long ans = 0;
        for (int i = 0; i < mid; i++) {
            ans += b[i];
        }
        return ans;
    }
}
