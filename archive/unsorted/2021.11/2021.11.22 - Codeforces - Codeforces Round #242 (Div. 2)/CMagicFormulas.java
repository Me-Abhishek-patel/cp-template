package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CMagicFormulas {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] p = in.readIntArray(n);
        long res = 0;
        int[] x = new int[n + 1];
        for (int i = 0; i < n; i++) {
            res ^= p[i];
            int q = n / (i + 1);
            int r = n % (i + 1);
            if (q % 2 != 0) {
                x[i]++;
            }
            x[r]++;
        }
//        out.printLine(x);
        for (int i = n; i > 0; i--) {
            x[i - 1] += x[i];
        }
//        out.printLine(x);
        for (int i = 0; i <= n; i++) {
            if (x[i] % 2 != 0)
                res ^=i;
        }
        out.printLine(res);


    }
}
