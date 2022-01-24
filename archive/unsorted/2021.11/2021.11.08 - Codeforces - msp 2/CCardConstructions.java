package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CCardConstructions {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.readInt();
        long[] a = new long[100000];
        a[0] = 2;

        int uperb = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i - 1] + 2 * (i + 1) + i;
            if (a[i - 1] >= (int) (10e9)) {
                uperb = i;
                break;
            }
        }
//        out.printLine(a);
        while (t-- > 0) {
            int n = in.readInt();
//            out.printLine(n);
            int res = 0;
            while (n >= 2) {
                int x = Arrays.binarySearch(a, 0, uperb, n);
                if (x < 0) {
                    x = Math.abs(x) - 2;
                }
//                out.printLine("lb: " + x);
                n -= a[x];
                res++;
            }
            out.printLine(res);


        }

    }
}
