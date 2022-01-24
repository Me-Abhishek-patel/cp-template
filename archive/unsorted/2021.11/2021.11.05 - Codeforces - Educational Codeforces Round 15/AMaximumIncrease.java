package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AMaximumIncrease {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int cout = 1;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                cout++;
            }else {
                max = Math.max(cout,max);
                cout = 1;
            }
        }
        max = Math.max(cout,max);
        out.printLine(max);
    }
}
