package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class XxOoRr {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt(), res = 0;
        int[] A = in.readIntArray(n);
        int msb = (int)(Math.log10(100000)/Math.log10(2));
        int mask = (1 << msb);
        while (mask > 0) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((A[i] & mask) != 0) {
                    count++;
                    A[i]^=mask;
                }
            }
            res+=Math.ceil((double) count/(double) k);
            mask>>=1;
        }
        out.printLine(res);

    }

}
