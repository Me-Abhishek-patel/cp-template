package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CFindMaximum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        String s = in.readLine();
        long res = 0;
        long prev = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                res = Math.max(res + a[i], sum);
            }
            sum += a[i];

        }
        out.printLine(res);
    }
}
