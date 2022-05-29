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

import java.math.BigInteger;

public class CHackingCypher {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        int n = s.length();
        long a = in.readLong(), b = in.readLong();
        long[] pre = new long[n], post = new long[n];
        long sz = 1;
        for (int i = 0; i < n; i++) {
            int j = n - i - 1;
//            out.print(sz + " ");
            if (i == 0) {
                pre[i] = (s.charAt(i) - '0') % a;
                post[j] = (s.charAt(j) - '0') % b;

            } else {
                pre[i] = (pre[i - 1] * 10 + (s.charAt(i) - '0')) % a;
                post[j] = ((s.charAt(j) - '0') *sz + post[j + 1]) % b;

            }
            sz = (sz * 10) % b;


        }
        for (int i = 0; i < n - 1; i++) {
            if (pre[i] == post[i+1] && pre[i] == 0 && s.charAt(i+1)!='0') {
                out.printLine("YES");
                out.printLine(s.substring(0,i+1));
                out.printLine(s.substring(i+1));
                return;
            }
        }
        out.printLine("NO");



    }
}
