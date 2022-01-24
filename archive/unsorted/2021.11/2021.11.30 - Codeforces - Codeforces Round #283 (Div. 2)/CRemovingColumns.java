package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CRemovingColumns {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        char[][] a = in.readTable(n, m);
        boolean[] isdeleted = new boolean[m];
        int i = 1, j = 0;
        while (i < n && j < m) {

            int t = j;
            while (t < m && (a[i][t] == a[i - 1][t] || isdeleted[t])) t++;
            if (t == m || a[i][t] >= a[i - 1][t]) {

            } else {

                isdeleted[t] = true;

                j = 0;
                i = 0;
            }
            i++;

        }
        out.printLine(count(isdeleted, true));
    }
}

