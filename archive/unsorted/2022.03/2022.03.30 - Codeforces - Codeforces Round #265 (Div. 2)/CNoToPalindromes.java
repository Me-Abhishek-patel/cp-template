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

public class CNoToPalindromes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), p = in.readInt();
        char[] s = in.readLine().toCharArray();


        for (int i = n - 1; i >= 0; i--) {
            boolean x2 = false;
            s[i] = (char) (s[i] + 1);
            if (s[i] - 'a' + 1 > p) {
                continue;
            }
            while ((i > 0 && s[i] == s[i - 1]) || (i > 1 && s[i - 2] == s[i])) {
                s[i] = (char) (s[i] + 1);
                if (s[i] - 'a' + 1 > p) {
                    x2 = true;
                    break;
                }

            }
            if (x2) continue;
            if (s[i] - 'a' + 1 <= p) {
                for (int j = i + 1; j < n; j++) {
                    s[j] = 'a';
                    while (s[j] == s[j - 1] || (j > 1 && s[j - 2] == s[j])) {
                        char c = (char) (s[j] + 1);
                        s[j] = c;
                    }
                }
                out.printLine(s);
                return;
            }

        }
        out.printLine("NO");

    }
}
