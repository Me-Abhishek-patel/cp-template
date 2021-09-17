package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int i = 0;
        int min = a[0];
        while (i < n-1) {
            if (i == n - 2 || a[i + 1] > a[i + 2]) {
                min = Math.min(min, a[i + 1]);
                i++;
            } else {
                min = Math.min(min,a[i+2]);
                i+=2;
            }
        }
        out.printLine(min);
    }
}
