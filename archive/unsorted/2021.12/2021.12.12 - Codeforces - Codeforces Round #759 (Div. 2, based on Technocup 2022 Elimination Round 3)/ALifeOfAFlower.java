package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ALifeOfAFlower {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int ans = a[0] == 0 ? 1 : 2;
        for (int i = 1; i < n; i++) {
            if (a[i] == 0 && a[i - 1] == 0) {
                out.printLine(-1);
                return;
            } else if (a[i] == 1) {
                ans += a[i - 1] == 1 ? 5 : 1;
            }
        }
        out.printLine(ans);

    }
}
