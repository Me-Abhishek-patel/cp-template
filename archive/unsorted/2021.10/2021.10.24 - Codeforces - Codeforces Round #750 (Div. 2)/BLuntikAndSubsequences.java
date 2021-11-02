package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BLuntikAndSubsequences {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int zero = 0, one = 0;
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            if (x == 0) zero++;
            if (x == 1) one++;
        }
        if (zero != 0)
            out.printLine((zero + 1) * one);
        else {
            out.printLine(one);
        }
    }
}
