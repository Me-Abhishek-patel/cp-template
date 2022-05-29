package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CBinaryString {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int n = s.length();
        int[] z = new int[n], o = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                if (s.charAt(i) == '0') z[i] = 1;
                else o[i] = 1;
            } else {
                if (s.charAt(i) == '0') {
                    z[i] = 1 + z[i + 1];
                    o[i] = o[i + 1];
                } else {
                    o[i] = 1 + o[i + 1];
                    z[i] = z[i + 1];
                }
            }
        }

        int res = z[0], score0 = z[0], score1 = 0;
        int t1 = Integer.MAX_VALUE, t2 = Integer.MAX_VALUE;
        int ts1 = 0, ts0 = 0;
        for (int i = -1; i < n; i++) {
            if (i != -1) {
                if (s.charAt(i) == '0') {
                    score0--;
                } else {
                    score1++;
                }
            }

            res = min(t1, max(score0, score1));
            for (int j = n - 1; j > i; j--) {
                res = min(res, max(score1 + o[j], score0 - z[j]));
                if (z[j] >= score0 ) break;
            }
            if (score1 >= score0) break;

        }

        out.printLine(res);
    }
}
