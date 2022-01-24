package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BPashaMaximizes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong(), k = in.readLong();
        char[] s = String.valueOf(n).toCharArray();
        int i = 0;
        while (k > 0 && i < s.length) {
            int j = i;
            int max = i;
            while (j < s.length && j - i <= k) {
                if (s[max] < s[j]) {
                    max = j;
                }
                j++;
            }
            if (max != i && max - i <= k) {
                while (max > i) {
                    swap(s, max, max - 1);
                    max--;
                    k--;
                }
            }
            i++;


        }

        out.printLine(s);

    }

    private void swap(char[] s, int max, int i) {
        char t = s[max];
        s[max] = s[i];
        s[i] = t;

    }
}
