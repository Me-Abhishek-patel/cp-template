package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AEquidistantLetters {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int[] freq = freqArray(s);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                sb.append((char) (i + 'a'));
            } else if (freq[i] == 1) {
                sb2.append((char) (i + 'a'));
            }
        }
        out.printLine(sb.toString() + sb.toString() + sb2.toString());
    }
}
