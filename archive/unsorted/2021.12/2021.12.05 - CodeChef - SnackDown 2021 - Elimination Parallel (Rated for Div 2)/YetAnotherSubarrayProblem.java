package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class YetAnotherSubarrayProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int k = n % 2 == 0 ? 1 : 2;
        for (int i = 0; i < n; i++, k += 2) {
            out.print(k+" ");
        }
        out.printLine();
    }
}
