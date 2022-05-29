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

public class ChallengeNine {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        long sum = 0;
        for (char c : s.toCharArray()) {
            sum = sum + Integer.parseInt(c + "");
        }
        long r = sum % 9;
        r = 9 - r;
        if (r == 9) {
            out.printLine("Case #" + testNumber + ": " + s.charAt(0) + "0" + s.substring(1));
        } else {
            int i = 0;
            while (i < s.length()) {
                if (r >= Integer.parseInt(s.charAt(i) + "")) {
                    i++;
                } else break;
            }
            out.printLine("Case #" + testNumber + ": " + s.substring(0, i) + r + s.substring(i));
        }

    }
}
