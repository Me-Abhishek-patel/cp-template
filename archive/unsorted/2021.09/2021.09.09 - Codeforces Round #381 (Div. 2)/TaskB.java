package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] a = in.readIntArray(n);
        int happines = 0;
        for (int i = 0; i < m; i++) {
            int t = 0;
            int s = in.readInt(), e = in.readInt();
            for (int j = s - 1; j < e; j++) {
                t += a[j];
            }
            if (t > 0) happines+=t;
        }
        out.printLine(happines);
    }
}
