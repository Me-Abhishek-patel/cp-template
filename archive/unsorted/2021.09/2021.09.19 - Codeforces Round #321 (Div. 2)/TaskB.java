package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), d = in.readInt();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = in.readLong();
            a[i][1] = in.readLong();
        }
        Arrays.sort(a, (x, y) -> (int) (x[0] - y[0]));
        int e = 1;
        long res = 0, sum = a[0][1];
        for (int i = 0; i < n ; i++) {
            while (e < n && a[e][0] < d + a[i][0]) {
                sum += a[e][1];
                e++;
            }

            res = Math.max(res, sum);
            sum -= a[i][1];
        }
        out.printLine(res);
    }
}
