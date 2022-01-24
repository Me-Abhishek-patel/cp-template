package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BClimbingTakahashi {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] h = in.readIntArray(n);
        int x = h[0];
        for (int i = 1; i < n; i++) {
            if (h[i] > h[i - 1]) x = h[i];
            else break;
        }
        out.printLine(x);

    }
}
