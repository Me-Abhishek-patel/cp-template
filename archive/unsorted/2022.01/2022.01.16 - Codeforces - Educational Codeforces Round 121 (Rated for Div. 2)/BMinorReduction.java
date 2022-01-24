package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BMinorReduction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int n = s.length();
        for (int i = n - 2; i >= 0; i--) {
            int val = Integer.parseInt("" + s.charAt(i)) + Integer.parseInt("" + s.charAt(i + 1));
            if (val > 9) {
                out.printLine(s.substring(0, i) + val + s.substring(i + 2));
                return;
            }
        }
        int val = Integer.parseInt("" + s.charAt(0)) + Integer.parseInt("" + s.charAt(1));
        out.printLine("" + val + s.substring(2));


    }
}
