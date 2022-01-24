package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AAMDeviation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long[] a = in.readLongArray(3);

        out.printLine(Math.abs(a[0] + a[2] - 2 * a[1]) % 3 == 0 ? 0 : 1);

    }
}
