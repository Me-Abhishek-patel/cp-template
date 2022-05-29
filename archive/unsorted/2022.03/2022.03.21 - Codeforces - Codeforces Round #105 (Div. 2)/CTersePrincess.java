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

public class CTersePrincess {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), a = in.readInt(), b = in.readInt();
        if (a == 0 && b == 0 && n == 1) {
            out.printLine(1);
            return;
        }
        if (b == 0 && a == n - 1) {
            out.printLine(-1);
            return;
        }
        int i = 1;
        int sum = i;
        out.print(i + " ");
        int x = 0;
        for (int i1 = 0; i1 < n - 1; i1++) {
            if (b > 0) {
                i *= 2;
                x++;

                b--;
            } else if (a > 0) {
                if (x == 0) {
                    i--;
                    a++;
                    x++;

                }
                i++;
                a--;
            } else {
                i = 1;
            }
            out.print(i + " ");

        }
        out.printLine();
    }
}
