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
import net.cplibrary.numbers.IntegerUtils;

import java.util.ArrayList;
import java.util.Collections;

public class CModifiedGCD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int gcd = gcd(in.readInt(), in.readInt());
        int n = in.readInt();
        ArrayList<Integer> divisors = new ArrayList<>();
        divisors.add(-1);
        for (int i = 1; i <= sqrt(gcd); i++) {
            if (gcd % i == 0)
                if (gcd / i == i)
                    divisors.add(i);
                else {
                    divisors.add(i);
                    divisors.add(gcd / i);
                }
        }
        Collections.sort(divisors);
//        out.printLine(divisors.toString());

        for (int k = 0; k < n; k++) {
            int l = in.readInt(), r = in.readInt();
            if (gcd < l) {
                out.printLine(-1);
                continue;
            }

            int idx = Collections.binarySearch(divisors, r);
            if (idx < 0) {
                idx = abs(idx);
                idx -= 2;
            }
//            out.printLine(idx);
            if (divisors.get(idx) < l || divisors.get(idx) == -1) {
                out.printLine(-1);
            } else out.printLine(divisors.get(idx));

        }
    }


    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
