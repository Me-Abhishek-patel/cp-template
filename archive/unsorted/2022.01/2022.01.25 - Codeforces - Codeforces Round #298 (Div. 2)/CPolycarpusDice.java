package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CPolycarpusDice {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long a = in.readLong();
        int[] d = in.readIntArray(n);
        long sum = sumArray(d);
        for (int i = 0; i < n; i++) {

            long above = min(d[i], a - (n - 1));
            long below = max(1L, a - (sum - d[i]));

            out.print((d[i] - (above - below + 1)) + " ");

        }


    }
}
