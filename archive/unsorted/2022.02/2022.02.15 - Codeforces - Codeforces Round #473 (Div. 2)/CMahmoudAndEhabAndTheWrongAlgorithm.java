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

public class CMahmoudAndEhabAndTheWrongAlgorithm {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if (n <= 5) {
            out.printLine(-1);
        } else {
            out.printLine(1 + " " + 2);
            out.printLine(1 + " " + 3);
            out.printLine(1 + " " + 4);
            for (int i = 5; i <= n; i++) {
                out.printLine(3 + " " + i);
            }
        }
        for (int i = 2; i <= n; i++) {
            out.printLine(1 + " " + i);

        }

    }
}
