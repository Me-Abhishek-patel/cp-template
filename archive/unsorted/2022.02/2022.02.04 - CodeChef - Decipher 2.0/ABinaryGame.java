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

public class ABinaryGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int count = 0;
        String s = in.readString();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (count <= 0) {
                    out.printLine("no");
                    return;
                } else {
                    count--;
                }
            } else {
                count++;
            }
        }
        out.printLine(count == 0 ?"yes":"no");
    }
}
