package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] b = in.readIntArray(n);
        long res = Math.abs(b[0]);
        for (int i = 1; i < n; i++) {
            res += Math.abs( b[i]-b[i-1]);
        }
        out.printLine(res);
    }
}
