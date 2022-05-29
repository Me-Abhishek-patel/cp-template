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

public class PalindromicFactors {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        int count = 0;
        for (long i = 1; i * i <= n; i++) {

            if (n % i == 0) {
                if (n / i == i) {
                    count += isPalindrome(String.valueOf(i)) ? 1 : 0;
                } else {
                    count += isPalindrome(String.valueOf(i)) ? 1 : 0;
                    count += isPalindrome(String.valueOf(n / i)) ? 1 : 0;
                }
            }
        }
        out.printLine("Case #" + testNumber + ": " + count);

    }
}
