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

public class CMarinaAndVasya {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), t = in.readInt();
        String s1 = in.readLine(), s2 = in.readString();
        int diff = differs(s1, s2);
        StringBuilder sb = new StringBuilder();
        if (t < diff) {
            if (t == 0 || diff - t > diff/2) {
                out.printLine(-1);
                return;
            }
            int d1 = 0, d2 = 0;
            int same1 = diff - t;
            int same2 = diff - t;

            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    sb.append(s1.charAt(i));

                } else {
                    if (same1 <= 0 && same2 <= 0) {
                        char c = s1.charAt(i);
                        while (c == s1.charAt(i) || c == s2.charAt(i)) {
                            int k = (c - 'a' + 1) % 26;
                            c = (char) ('a' + k);
                        }
                        sb.append(c);
                    } else {
                        if (t % 2 == 0 && same1 > 0) {
                            sb.append(s1.charAt(i));
                            same1--;
                        } else if (t % 2 != 0 && same2 > 0) {
                            same2--;
                            sb.append(s2.charAt(i));
                        }
                        t--;
                    }

                }
            }

        } else {
            int same = t - diff;
            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) == s2.charAt(i)) {
                    if (same > 0) {
                        char c = s1.charAt(i);
                        while (c == s1.charAt(i) || c == s2.charAt(i)) {
                            int k = (c - 'a' + 1) % 26;
                            c = (char) ('a' + k);
                        }
                        sb.append(c);
                        same--;
                    } else
                        sb.append(s1.charAt(i));

                } else {
                    char c = s1.charAt(i);
                    while (c == s1.charAt(i) || c == s2.charAt(i)) {
                        int k = (c - 'a' + 1) % 26;
                        c = (char) ('a' + k);
                    }
                    sb.append(c);
                }
            }
        }
        out.printLine(sb);

    }
}
