package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BOddGrasshopper {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long x = in.readLong(), n = in.readLong();
        long q = (n / 4) * 4 + 1;
        n %= 4;
        for (int i = 1; i <= n; i++) {
            if (x % 2 == 0) {
                x = x - q;
            } else {
                x = x + q;
            }
            q++;
        }
        out.printLine(x);

    }
}
