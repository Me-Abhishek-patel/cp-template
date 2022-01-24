package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ESequentialNim {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        boolean first = true;
        int[] a = in.readIntArray(n);
        int o = 0;
        int x = 0;
        a[n - 1] = 2;
        for (int i = 0; i < n; i++) {
            if (a[i] > 1) {
                x = i;
                break;
            }
        }

        out.printLine(x % 2 == 0 ? "First" : "Second");
    }
}
