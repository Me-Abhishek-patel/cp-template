package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class MagicalPlanks {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        char c = s.charAt(0);
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != c && s.charAt(i - 1) == c) count++;
        }
        out.printLine(count);
    }
}
