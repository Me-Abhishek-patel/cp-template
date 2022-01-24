package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BArrayEversion {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int max = maxElement(a);
        int tm = a[n - 1];
        if (tm == max) {
            out.printLine(0);
            return;
        }
        int op = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > tm) {
                if (a[i] == max) {
                    out.printLine(op);
                    return;
                }
                op++;
                tm = a[i];
            }
        }
        out.printLine(op);
    }
}
