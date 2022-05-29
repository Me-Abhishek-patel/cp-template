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

public class AStringBuilding {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int c = 1;
        if (s.length() <= 1) {
            out.printLine("NO");
            return;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                c++;
            } else {
                if (c < 2) {
                    out.printLine("NO");
                    return;
                }
                c = 1;
            }
        }
        if (c < 2) {
            out.printLine("NO");
            return;
        }
        out.printLine("YES");
    }
}
