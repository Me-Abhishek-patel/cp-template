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

public class BTreasureHunt {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int len = s.length();
        int[] f1 = freqArray256(s),
                f2 = freqArray256(in.readLine()), f3 = freqArray256(in.readLine());
        int m1 = maxElement(f1), m2 = maxElement(f2), m3 = maxElement(f3);
        if (n >= s.length()) {
            out.printLine("Draw");
            return;
        }

        int r1 = min(m1 + n, len), r2 = min(m2 + n, len), r3 = min(m3 + n, len);
        if (m1 == len && n==1)
            r1--;
        if (m2 == len && n ==1)
            r2--;
        if (m3 == len && n ==1)
            r3--;

        int res = max(r1, max(r2, r3));
        if (res == r1 && res == r2 || res == r2 && res == r3 || res == r1 && res == r3) {
            out.printLine("Draw");
        } else if (res == r1) {
            out.printLine("Kuro");
        } else if (res == r2) {
            out.printLine("Shiro");
        } else if (res == r3) {
            out.printLine("Katie");
        }


    }
}
