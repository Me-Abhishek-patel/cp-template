package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AMetro {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), s = in.readInt();
        int[] a = in.readIntArray(n), b = in.readIntArray(n);

        if (a[0] == 1 && a[s - 1] == 1) {

            out.printLine("YES");
            return;
        }
        if (a[0] == 1 && b[s - 1] == 1)
            for (int i = s; i < n; i++) {
                if (a[i] == 1 && b[i] == 1) {
                    out.printLine("YES");
                    return;
                }
            }
        out.printLine("NO");
    }


}

