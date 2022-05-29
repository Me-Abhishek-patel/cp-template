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

public class SticksAndRectangles {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] freq = new int[101];
        for (int i : a) {
            freq[i]++;
        }

        int count = 0;
        int p = 0;
        for (int i : freq) {
            if (i % 2 != 0) count++;
            p += i / 2;
        }
        if (count + n < 4) {
            out.printLine(4 - n);
        } else {
            if ((p + count) % 2 == 0)
                out.printLine(count);
            else out.printLine(count+2);
        }
    }
}
