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

public class PerMEXuation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        if (s.charAt(s.length() - 1) == '0' || s.charAt(0) == '0' || s.charAt(1) == '0') {
            out.printLine("No");
            return;
        }
        out.printLine("Yes");
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                if (s.charAt(i + 1) == '1') {
                    out.print(i + " ");
                } else {

                    int j = i + 1;
                    while (j < s.length() - 1 && s.charAt(j) == '0') {
                        out.print(j + " ");
                        j++;
                    }
                    out.print(i + " ");
                    i = j - 1;
                }
            }
        }
        out.printLine();
    }
}
