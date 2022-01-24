package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CTheGreatJulyaCalendar {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        long res = go(n);
        out.printLine(res);
    }

    private long go(long n) {
        if (n < 0) return 0;
        if (n == 0) return 0;
        long k = n, max = Integer.MIN_VALUE;
        while (k > 0) {
            int d = (int) (k % 10);
            k /= 10;
            max = Math.max(max, d);
        }
        return go(n - max) + 1;
    }
}
