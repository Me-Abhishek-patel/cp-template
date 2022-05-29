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

public class AGCDVsLCM {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if (n - 2 == 2) {
            out.print(1 + " " + 1);
            out.printLine(" " + 1 + " " + 1);

        } else {
            n = n - 2;
            if (n % 2 == 0) {
                if ((n / 2) % 2 == 0) {
                    out.print((n / 2 - 1) + " " + (n / 2 + 1));
                    out.printLine(" " + 1 + " " + 1);
                } else {
                    out.print((n - 1) + " " + (1));
                    out.printLine(" " + 1 + " " + 1);
                }
            } else {
                out.print((n / 2) + " " + (n / 2 + 1));
                out.printLine(" " + 1 + " " + 1);
            }
        }

    }
}
