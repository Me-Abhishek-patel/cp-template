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

public class CAndMatching {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        if (n == 4 && k == 3) {
            out.printLine(-1);
            return;
        }
        if (k == n - 1) {
            out.printLine((n - 1) + " " + (n - 2));
            out.printLine(1 + " " + 3);
            int i = 2, j = n - 3;
            k = 3;
            while (i < j) {
                if (i == k) {
                    out.printLine(j + " " + 0);
                } else if (j == k) {
                    out.printLine(i + " " + 0);
                } else {
                    out.printLine(i + " " + j);
                }
                i++;
                j--;
            }
            return;

        }
        out.printLine(k + " " + (int) (n - 1));
        int i = 1, j = n - 2;
        while (i < j) {
            if (i == k) {
                out.printLine(j + " " + 0);
            } else if (j == k) {
                out.printLine(i + " " + 0);
            } else {
                out.printLine(i + " " + j);
            }
            i++;
            j--;
        }

    }
}
