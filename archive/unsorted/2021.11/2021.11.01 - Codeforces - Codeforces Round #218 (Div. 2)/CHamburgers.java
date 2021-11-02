package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CHamburgers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String hb = in.readLine();
        long nb = in.readInt(), ns = in.readInt(), nc = in.readInt();
        long pb = in.readInt(), ps = in.readInt(), pc = in.readInt();
        long r = in.readLong();
        long b = 0, s = 0, c = 0;
        for (char c1 : hb.toCharArray()) {
            if (c1 == 'B') b++;
            if (c1 == 'C') c++;
            if (c1 == 'S') s++;
        }

        long lo = 0, hi = (long) 10e13;
        long x = 0;
        long cost = 0,ans = 0;
        while (lo <= hi) {
            x = lo + (hi - lo) / 2;
            cost = Math.max(x * b - nb, 0) * pb + Math.max(x * s - ns, 0) * ps + Math.max(x * c - nc, 0) * pc;
            if (cost <= r) {
                ans = x;
                lo = x + 1;
            } else hi = x - 1;
        }
//        ArrayUtils.upperBound()
        out.printLine(ans);

    }
}
