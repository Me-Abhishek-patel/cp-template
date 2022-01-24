package codes;

import static java.lang.Math.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class DMultiplyAndRotate {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.readInt(), n = in.readInt();
        int x = go(a, n);
        if (x >= 1000001)
            out.printLine(-1);
        else out.printLine(x);
    }

    private int go(int a, int n) {
        if (n == 1) return 0;
        if (n < 1) return Integer.MAX_VALUE;
        int res = 1000001;
        if (n % a == 0)
            res = min(res, 1 + go(a, n/a));
        String s = String.valueOf(n);
        if (s.length() > 1) {
            int t = Integer.parseInt(s.substring(1) + s.charAt(0));
            res = min(res, go(a, t));
        }
        return res;

    }

    private int go(int a, int n, int x) {
        if (n == x) return 0;
        if (x > n) return 1000001;
        int res = 1000001;

        res = Math.min(res, 1 + go(a, n, x * a));

        if (x >= 10 && x % 10 != 0) {
            String s = String.valueOf(x);
            int t = Integer.parseInt(s.charAt(s.length() - 1) + s.substring(0, s.length() - 1));
            if (s.charAt(0) != s.charAt(s.length() - 1))
                res = min(res, 1 + go(a, n, t));
        }
        return res;

    }
}
