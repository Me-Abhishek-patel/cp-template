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

public class BPrefixRemovals {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int[] freq = freqArray(s);
        int i = 0;
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c - 'a'] > 1) {
                freq[c - 'a']--;
            }else break;
        }
        out.printLine(s.substring(i));
    }
}
