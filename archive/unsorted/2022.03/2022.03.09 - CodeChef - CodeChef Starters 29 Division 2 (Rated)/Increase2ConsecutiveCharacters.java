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

public class Increase2ConsecutiveCharacters {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        String a = in.readLine(), b = in.readLine();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = (b.charAt(i) - a.charAt(i)) % 26;
            if (d[i] < 0) {
                d[i] = 26 + d[i];
            }
        }

        int[] k = new int[n + 1];

        for (int i = 0; i < n; i++) {
            k[i + 1] = d[i] - k[i];
            if (k[i] < 0) {
                k[i] = 26 + k[i];
            }
        }
//        out.printLine(k);
//        out.printLine(d);
        for (int i = 0; i < q; i++) {
            int l = in.readInt(), r = in.readInt();
            if (k[r] - k[l - 1] == 0) out.printLine("Yes");
            else out.printLine("No");
        }
    }
}
