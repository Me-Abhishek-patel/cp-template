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

public class EvenSubarrayXOR {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
//        for (int i = 2; i <= n + 1; i++) {
//            out.print(i + " ");
//        }
//        out.printLine();
//        int c = (Integer.highestOneBit(n) << 1) + 1;
//        if (n == 131072) c = n + 1;
//        for (int i = 0; i < n; i++, c++) {
//            out.print(c + " ");
//        }
//        out.printLine();
//        int xor = 0, xor2 = 0;
//        for (int i = 1; i <= n; i++) {
//            xor ^= i;
//            xor2 ^= (i + n);
//            out.printLine(xor + " " + xor2);
//
//        }
        int p = 2, q = 3;
        for (int i = 1; i <= n; i++, p += 2) {
            out.print(p+" ");
        }
        out.printLine();
        for (int i = 0; i < n; i++,q+=2) {
            out.print(q+" ");
        }
        out.printLine();
    }
}
