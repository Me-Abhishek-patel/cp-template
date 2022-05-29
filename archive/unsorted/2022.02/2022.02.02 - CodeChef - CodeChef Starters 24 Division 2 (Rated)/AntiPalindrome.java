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

public class AntiPalindrome {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String stringinput = in.readLine();
        if (n % 2 != 0) {
            out.printLine("NO");
            return;
        }
        int[] freq = freqArray(stringinput);

        if (maxElement(freq) > n / 2) {
            out.printLine("NO");
            return;
        }
        char[] res = new char[n];
        int i = 0;
        boolean x = false;
        for (int j = 0; j < freq.length; j++) {
            while (freq[j] > 0) {
                res[i] = (char) (j + 'a');
                if (!x)
                    i += 2;
                else i -= 2;
                if (i >= n) {
                    i = n - 1;
                    x = true;
                }
                freq[j]--;
            }
        }
        out.printLine("YES");
        out.printLine(String.valueOf(res));

    }
}
