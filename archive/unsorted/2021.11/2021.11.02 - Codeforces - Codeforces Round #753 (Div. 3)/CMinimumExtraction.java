package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CMinimumExtraction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[] a = in.readLongArray(n);
        Arrays.sort(a);
        long max = a[0];
        long sum = a[0];
        for (int i = 1; i < n; i++) {
            a[i] = a[i] - sum;
            sum += a[i];
            max = Math.max(max, a[i]);
        }
        out.printLine(max);

    }
}
