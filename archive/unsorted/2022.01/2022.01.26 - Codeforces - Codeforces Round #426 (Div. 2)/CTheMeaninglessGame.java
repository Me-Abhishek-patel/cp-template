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

public class CTheMeaninglessGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        for (int i = 0; i < n; i++) {
            double a = in.readDouble(), b = in.readDouble();
//            if()
            double cube = cbrt(a * b);
            boolean flag = false;
            if (cube % 1.0 == 0.0) {

                if (a % cube == 0 && b % cube == 0) flag = true;
            }
            out.printLine(flag ? "Yes" : "No");
        }

    }
}
