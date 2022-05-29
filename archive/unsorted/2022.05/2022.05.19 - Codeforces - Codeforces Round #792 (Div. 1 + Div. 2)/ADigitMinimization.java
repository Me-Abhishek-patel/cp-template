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

public class ADigitMinimization {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        if (s.length() <= 2) {
            out.printLine(s.charAt(1));
            return;
        }
        char c = '9';
        for (int i = 0; i < s.length(); i++) {
            c = (char) min((char)s.charAt(i), (char)c);
        }
        out.printLine(c);

    }
}
