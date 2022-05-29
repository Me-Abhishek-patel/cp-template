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

public class BXYSequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long b = in.readLong(), x = in.readLong(), y = in.readLong();
        long sum = 0, p = 0;
//        out.print(0 + " ");
        for (int i = 1; i <= n; i++) {
            if (p + x <= b) {
                p = p + x;
//                out.print(p + " ");
                sum += p;
            } else {
                p -= y;
//                out.print(p + " ");
                sum += p;
            }
        }
        out.printLine(sum);
    }
}
