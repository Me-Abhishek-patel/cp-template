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

import net.cplibrary.generated.collections.list.LongList;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class DivisorsAndReciprocals {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x = in.readInt(), a = in.readInt(), b = in.readInt();
        if (x % a != 0) {
            out.printLine(-1);
        } else {
            int n = (x / a) * b;
            LongList l = getDivisors(n);
            long sum = 0;
            for (Long aLong : l) {
                sum += aLong;
            }
//            out.printLine(l);
            if (sum == x)
                out.printLine(n);
            else out.printLine(-1);
        }
    }
}
