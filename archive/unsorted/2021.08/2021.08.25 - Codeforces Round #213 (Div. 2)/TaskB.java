package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int count = Math.min(n, 2), max =  Math.min(n, 2);
        for (int i = 2; i < n; i++) {
            if (a[i] == a[i - 1] + a[i - 2]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 2;
            }
        }
        max = Math.max(max, count);
        out.printLine(max);
    }
}
