package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class MedianRearrangement {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long k = in.readLong();
        int[] a = in.readIntArray(n * n);
        int t = n;
        Arrays.sort(a);
        long sum = 0;
        int count = 0;
        int res = Integer.MAX_VALUE;
        n = n * n;
//        for (int i = n - (n / 2); i >= 0 && count < t; i -= ((n / 2) + 1)) {
//            sum += a[i];
//            res = Math.min(res, a[i]);
//            count++;
//        }
        int i = n - t - 1;
        out.printLine(a);
        for (; i >= 0 && count < t - 1; i -= ((t/2)+1)) {
            sum += a[i];
            out.printLine(a[i]);
            res = Math.min(res, a[i]);
            count++;

        }

        while (i >= 0 && sum + a[i] > k) {
            i--;
        }
        if (i < 0) {
            out.printLine(-1);
            return;
        }

        out.printLine(a[i]);

    }
}
