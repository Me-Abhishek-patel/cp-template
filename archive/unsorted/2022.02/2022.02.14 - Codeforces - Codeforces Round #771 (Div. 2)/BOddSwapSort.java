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

public class BOddSwapSort {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int minodd = 1000000003, mineven = 1000000002;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                if (mineven < a[i]) {
                    out.printLine("No");
                    return;
                }else {
                    mineven = a[i];
                }
            } else {
                if(minodd<a[i]){
                    out.printLine("No");
                    return;
                }else {
                    minodd = a[i];
                }

            }
        }
        out.printLine("Yes");

    }
}
