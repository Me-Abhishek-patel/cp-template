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

public class SpeedTyping {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine(), t = in.readLine();
        int i = 0, j = 0, ans = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                ans++;
                j++;
            }
        }
        if (i < s.length()) {
            out.printLine("Case #" + testNumber + ": IMPOSSIBLE");
        } else {
            out.printLine("Case #" + testNumber + ": " + (ans + t.length() - j));
        }
    }
}
