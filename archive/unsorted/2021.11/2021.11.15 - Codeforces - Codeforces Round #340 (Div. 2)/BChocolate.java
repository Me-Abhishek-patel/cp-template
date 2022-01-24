package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BChocolate {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long res = 0;
        int count = 0;
        boolean first = true;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                count++;
            } else {
                if (first) {
                    res = 1;
                    first = false;
                } else res *= (count + 1);
                count = 0;
            }
        }
        out.printLine(res);
    }
}
