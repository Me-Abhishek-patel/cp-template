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

public class DForGamersByGamers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long c = in.readLong();
        long[][] a = in.readLongTable(n, 3);
        int m = in.readInt();
        long[][] b = in.readLongTable(m, 2);
        for (int i = 0; i < m; i++) {
            long[] mons = b[i];
            long min = Long.MAX_VALUE;
            for (long[] unit : a) {
                long lo = 0, hi = c / unit[0];
                long ans = -1;
                double key = (double) unit[2] / mons[0];
                double x = mons[1] / key;
//                out.printLine(x);

                long req = (long) (unit[1] / x);
                if (req*unit[1] <= x)
                    req++;

                if (req * unit[0] <= c) {
                    min = Math.min(min, unit[0] * req);

                }
//                    while (lo <= hi) {
//                        long mid = lo + (hi - lo + 1) / 2;
//                        double mval = (double) mons[1] / (mid * unit[1]);
//                        if (mval >= key) {
//                            lo = mid + 1;
//                        } else {
//                            ans = mid;
//                            hi = mid - 1;
//                        }
//                    }
//                if (ans != -1) {
//                    min = Math.min(min, unit[0] * ans);
//                }

            }
            out.print(min == Long.MAX_VALUE ? "-1" : min + " ");

        }
    }
}
