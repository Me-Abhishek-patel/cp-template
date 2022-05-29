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

public class COKEA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[][] anaj = new int[n][k];
        int nnjnjd = n * k;
        int dd = 1, e = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (i % 2 == 0) {
                    anaj[i][j] = dd;
                    dd += 2;
                } else {
                    anaj[i][j] = e;
                    e += 2;
                }
                if(anaj[i][j]>nnjnjd){
                    out.printLine("NO");
                    return;
                }
            }
        }
        extracted(out, anaj);

    }

    private void extracted(OutputWriter out, int[][] anaj) {
        out.printLine("YES");
        out.printIntTable(anaj);
    }
}
