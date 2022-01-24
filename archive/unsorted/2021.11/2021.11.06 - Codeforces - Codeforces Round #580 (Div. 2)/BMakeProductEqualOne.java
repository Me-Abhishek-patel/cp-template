package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BMakeProductEqualOne {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int neg = 0, zero = 0;
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                neg++;
                res += Math.abs(a[i] - (-1));
            } else if (a[i] == 0) {
                zero++;
                res++;
            } else {
                res += Math.abs(a[i] - (1));
            }
        }
        if (neg % 2 == 0) {
            out.printLine(res);
        } else {
            if (zero > 0) {
                out.printLine(res);
            } else {
                out.printLine(res + 2);
            }
        }
    }
}
