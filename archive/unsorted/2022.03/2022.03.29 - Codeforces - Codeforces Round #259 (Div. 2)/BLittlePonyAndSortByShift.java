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

public class BLittlePonyAndSortByShift {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int count = 0;
        int n = in.readInt(), k = n;
        int[] a = in.readIntArray(n);
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                k = i;
                count++;
            }
        }
        if (a[0] < a[n - 1]) count++;
        if(count>1){
            out.printLine(-1);
        }else out.printLine(n-k);

    }
}
