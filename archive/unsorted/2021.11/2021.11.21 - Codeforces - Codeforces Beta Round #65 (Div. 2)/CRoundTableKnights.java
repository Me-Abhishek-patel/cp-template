package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.generated.collections.list.LongList;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.List;

public class CRoundTableKnights {
    static int getDivisor(int n) {
        for (int i = 3; i <= n; i++)
            if (n % i == 0)
                return i;
        return n;
    }


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        LongList div = getDivisors(n);
        for (Long d : div) {
            if (d < 3) continue;
            int q = (int) (n / d);
            for (int i = 0; i*d < n; i++) {
                boolean x = true;
                for (int j = i; j < n; j += q) {
                    if (a[j] == 0) x = false;
                }
                if (x) {
                    out.printLine("YES");
                    return;
                }
            }
        }

        out.printLine("NO");

    }
}
