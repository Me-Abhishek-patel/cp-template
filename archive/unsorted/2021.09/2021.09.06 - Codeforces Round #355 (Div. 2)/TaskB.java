package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), h = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
        int i = 0;
        long t = 0;
        long res = 0;
        while (i < n) {
            while (i < n && (t + a[i]) <= h) {
                t += a[i++];
            }
            if (t > k) {
                res += t / k;
                t = t % k;
            } else {
                res++;
                t =0;
            }
        }
        if (t > 0)
            res++;
        out.printLine(res);
    }
}
