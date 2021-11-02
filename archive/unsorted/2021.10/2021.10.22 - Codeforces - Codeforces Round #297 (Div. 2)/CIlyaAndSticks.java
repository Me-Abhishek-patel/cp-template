package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CIlyaAndSticks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        Arrays.sort(a);
        long sum = 0;
        for (int i = n - 1; i >= 0; ) {
            while (i > 0 && a[i] - a[i - 1] > 1) i--;
            int j = i - 2;
            while (j > 0 && a[j] - a[j - 1] > 1) j--;
            if (j > 0) {
                sum += (long) Math.min(a[i], a[i - 1]) * Math.min(a[j], a[j - 1]);
            }
            i = j - 2;
        }
        out.printLine(sum);
    }
}
