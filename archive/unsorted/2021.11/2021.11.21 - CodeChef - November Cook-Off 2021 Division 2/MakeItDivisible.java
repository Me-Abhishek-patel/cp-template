package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class MakeItDivisible {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] freq = new int[3];
        for (int i = 0; i < a.length; i++) {
            freq[(a[i] % 3)]++;
        }
        long temp = freq[1] + freq[2] * 2L;
        if (temp % 3 == 0) {
            int r = min(freq[1], freq[2]);
            int diff = max(freq[2], freq[1]) - r;
            r+=(diff/3)*2;
            out.printLine(r);
        } else {
            out.printLine(-1);
        }
    }
}
