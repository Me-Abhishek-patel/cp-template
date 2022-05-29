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

public class InfinityArea {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        double r = in.readDouble(), a = in.readDouble(), b = in.readDouble();
        double res = 0;
        boolean flag = true;
        while (r > 0) {
            if (flag) {
                res += PI * r * r;
                r = r * a;

            } else {
                res += PI * r * r;
                r = floor(r / b);
            }
            flag = !flag;
        }
        out.printLine("Case #" + testNumber + ": " + res);
    }
}
