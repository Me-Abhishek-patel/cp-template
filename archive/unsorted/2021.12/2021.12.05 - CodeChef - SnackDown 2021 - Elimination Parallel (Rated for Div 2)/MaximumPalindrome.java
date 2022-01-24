package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class MaximumPalindrome {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if (n % 2 != 0) {
            out.print('b');
            n--;
            for (int i = 0; i < n; i++) {
                out.print('a');
            }
        } else {
            for (int i = 0; i < n; i++) {
                out.print(i % 2 == 0 ? 'a' : 'b');
            }
        }
        out.printLine();

    }
}
