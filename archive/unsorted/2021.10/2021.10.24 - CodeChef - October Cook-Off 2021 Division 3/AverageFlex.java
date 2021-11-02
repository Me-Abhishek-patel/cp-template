package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class AverageFlex {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        Arrays.sort(a);
        int[] x = new int[n];
        int c = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                c =  n-i -1;
                x[i] = c;
            } else x[i] = c;
        }
        int count = 0;
//        out.printLine(x);
        for (int i = 0; i < n; i++) {
            if (x[i] < n - x[i]) count++;
        }
        out.printLine(count);

    }
}
