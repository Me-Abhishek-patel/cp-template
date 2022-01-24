package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BPashaAndString {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        char[] c = in.readLine().toCharArray();
        int n = in.readInt();
        int[] a = new int[c.length];
        for (int i = 0; i < n; i++) {
            a[in.readInt() - 1]++;
        }

        for (int i = 0; i < c.length / 2; i++) {
            if (i != 0) a[i] += a[i - 1];
            if (a[i] % 2 != 0) {
                char t = c[i];
                c[i] = c[c.length - 1 - i];
                c[c.length - 1 - i] = t;
            }
        }
        out.printLine(c);

    }
}
