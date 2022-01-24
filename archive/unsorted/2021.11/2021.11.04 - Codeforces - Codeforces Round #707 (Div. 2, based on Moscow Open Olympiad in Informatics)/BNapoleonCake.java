package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BNapoleonCake {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        for (int i = n - 2; i >= 0; i--) {
            a[i] = Math.max(a[i], a[i + 1] - 1);
        }
        for (int i = 0; i < n; i++) {
            out.print((a[i] > 0 ? 1 : 0)+" ");
        }
        out.printLine();
    }
}
