package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[][] arr = new long[n][];
        for (int i = 0; i < n; i++) {
            int c = in.readInt();
            arr[i]  = in.readLongArray(c);
        }
        int m = in.readInt();
        long[][] banned = new long[m][n];
        for (int i = 0; i < m; i++) {
            banned[i] = in.readLongArray(n);
        }
    }
}
