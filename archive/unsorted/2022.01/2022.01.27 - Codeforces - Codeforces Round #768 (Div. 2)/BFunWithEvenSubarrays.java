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

public class BFunWithEvenSubarrays {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int size = 1;
        int count = 0;
        count = getCount(n, a, count);
        out.printLine(count);
    }

    private int getCount(int n, int[] a, int count) {
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] != a[n - 1]) {
                count++;
                i -= (n - i - 1) ;
                i++;
            }
        }
        return count;
    }
}
