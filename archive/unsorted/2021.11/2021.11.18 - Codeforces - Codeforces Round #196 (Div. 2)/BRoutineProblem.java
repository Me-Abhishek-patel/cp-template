package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;
import net.cplibrary.numbers.IntegerUtils;

public class BRoutineProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.readInt(), b = in.readInt(), c = in.readInt(), d = in.readInt();
        int max = Math.max(a * d, b * c);
        int min = Math.min(a * d, b * c);
        min = max - min;
        ArrayUtils.
        int g = gcd(max, min);
        out.printLine(min / g + "/" + max / g);
    }
}
