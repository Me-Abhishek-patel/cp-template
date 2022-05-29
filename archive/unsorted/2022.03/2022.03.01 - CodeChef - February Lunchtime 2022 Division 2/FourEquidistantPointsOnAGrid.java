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

public class FourEquidistantPointsOnAGrid {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int d = in.readInt();
        if (d % 2 != 0) {
            out.printLine(-1);
        } else {
            out.printLine(0 + " " + (d / 2));
            out.printLine("-" + (d / 2) + " " + 0);
            out.printLine(0 + " " + "-" + (d / 2));
            out.printLine( (d / 2) + " " + 0);

        }
    }
}
