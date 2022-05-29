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

public class PrefixZeros {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        String s = in.readLine();
        int[] req = new int[n];
        for (int i = 0; i < s.length(); i++) {
            req[i] = (10 - (s.charAt(i) - '0')) % 10;
        }
        int curmax = req[0];
        int[] max = new int[n];
        max[0] = req[0];
        for (int i = 1; i < req.length; i++) {
            if (req[i] > req[i - 1]) {
                curmax += 10;
            }
            max[i] = curmax;
        }
        int count = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] > k) break;
            count++;
        }
        out.printLine(count);

    }
}
