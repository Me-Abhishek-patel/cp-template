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

public class CUnusualProduct {
    int[][] a;
    int n;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        n = in.readInt();
        a = in.readIntTable(n, n);
        int q = in.readInt();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += calculateDotp(i);

        }
        for (int k = 0; k < q; k++) {
            int op = in.readInt();
            if (op == 1) {
                int j = in.readInt() - 1;
                sum += (1 - a[j][j]) == 0 ? -1 : 1;
                a[j][j] = 1 - a[j][j];
//                for (int i = 0; i < n; i++) {
//                    if (i != j) {
//                        if (a[i][j] != 0) sum += (1 - a[j][i]) == 0 ? -1 * 2 : 2;
//                    } else {
//                        sum += (1 - a[j][i]) == 0 ? -1 : 1;
//                    }
//
//                    a[j][i] = 1 - a[j][i];
//                }

            } else if (op == 2) {
                int j = in.readInt() - 1;
                sum += (1 - a[j][j]) == 0 ? -1 : 1;
                a[j][j] = 1 - a[j][j];
//                for (int i = 0; i < n; i++) {
//                    if (i != j) {
//                        if (a[j][i] != 0) sum += (1 - a[i][j]) == 0 ? -1 * 2 : 2;
//                    } else {
//                        sum += (1 - a[i][j]) == 0 ? -1 : 1;
//                    }
//                    a[i][j] = 1 - a[i][j];
//
//
//                }

            } else {
                sb.append(sum % 2);
            }
        }
        out.printLine(sb);
    }

    private int calculateDotp(int i) {
        int res = 0;
        for (int j = 0; j < n; j++) {
            res += a[i][j] * a[j][i];
        }
        return res;
    }
}
