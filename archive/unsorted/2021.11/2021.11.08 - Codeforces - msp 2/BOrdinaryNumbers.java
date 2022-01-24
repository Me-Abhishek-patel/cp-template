package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BOrdinaryNumbers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int res = 0;
        for (long pw = 1; pw <= n; pw = pw * 10 + 1) {
            for (int d = 1; d <= 9;  d++) {
                if (pw * d <= n) {
                    res++;
                }
            }
        }
        out.printLine(res);
    }
}
