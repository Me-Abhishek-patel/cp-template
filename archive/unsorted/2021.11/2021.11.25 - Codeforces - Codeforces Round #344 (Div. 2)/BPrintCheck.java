package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BPrintCheck {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
        int[][] a1 = new int[n][2], a2 = new int[m][2];
        for (int i = 0; i < n; i++) {
            a1[i][1] = -1;
        }
        for (int i = 0; i < m; i++) {
            a2[i][1] = -1;
        }
        for (int i = 0; i < k; i++) {
            int t = in.readInt(), r = in.readInt(), c = in.readInt();
            if (t == 1) {
                a1[r - 1][0] = c;
                a1[r - 1][1] = i;
            } else {
                a2[r - 1][0] = c;
                a2[r - 1][1] = i;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = a2[j][1] >= a1[i][1] ? a2[j][0] : a1[i][0];
                out.print(x+" ");
            }
            out.printLine();

        }

    }
}
