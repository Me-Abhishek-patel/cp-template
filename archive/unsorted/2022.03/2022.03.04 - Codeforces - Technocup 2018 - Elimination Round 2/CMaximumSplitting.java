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

import java.util.ArrayList;

public class CMaximumSplitting {
    int maxn = 1000000009;
    boolean[] isPrime;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.readInt();
//        isPrime = generatePrimalityTable((int) (sqrt(maxn) * 10));
//        ArrayList<Integer> composites = new ArrayList<>();
//        for (int i = 0; i < isPrime.length; i++) {
//            if (isPrime)
//        }
        int[] no = {1, 2, 3, 5, 7, 11};
        while (t-- > 0) {
            int n = in.readInt();
            int mod = n % 4;
            if (find(no, n) >= 0) {
                out.printLine(-1);
            } else if (mod % 2 == 0) {
                out.printLine(n / 4);
            } else {
                out.printLine((n / 4) - 1);
            }

        }

    }
}
