package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class GCDOfPrefixes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] b = in.readIntArray(n);
        StringBuilder sb = new StringBuilder(String.valueOf(b[0]));
        for (int i = 1; i < n; i++) {
            if (b[i - 1] % b[i] == 0) {
                sb.append(" ").append(b[i]);
            } else {
                out.printLine(-1);
                return;
            }

        }
        out.printLine(sb);
    }
}
