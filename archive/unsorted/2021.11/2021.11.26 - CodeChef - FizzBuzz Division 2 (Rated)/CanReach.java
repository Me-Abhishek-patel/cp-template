package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CanReach {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x = in.readInt(), y = in.readInt(), k = in.readInt();
        if (x % k == 0 && y % k == 0) {
            out.printLine("YES");
        } else {
            out.printLine("NO");
        }
    }
}
