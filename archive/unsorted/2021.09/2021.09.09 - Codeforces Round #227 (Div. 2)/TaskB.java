package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] a = in.readIntArray(n);
        int[] b = in.readIntArray(m);
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                i++;
                count++;
            }
            j++;
        }
        out.printLine(n - count);

    }
}
