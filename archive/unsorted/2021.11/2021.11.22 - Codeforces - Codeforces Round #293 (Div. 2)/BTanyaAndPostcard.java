package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class BTanyaAndPostcard {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine(), t = in.readLine();
        int[] f = new int[280];
        for (char c : t.toCharArray()) {
            f[c]++;
        }
        int y = 0, n = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (f[c]-- > 0) {
                y++;

            } else {
                hs.add(i);
            }

        }
        for (Integer i : hs) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                if (f[Character.toUpperCase(c)] > 0) {
                    f[Character.toUpperCase(c)]--;
                    n++;
                }
            } else {
                if (f[Character.toLowerCase(c)] > 0) {
                    f[Character.toLowerCase(c)]--;
                    n++;
                }
            }

        }
        out.printLine(y + " " + n);
    }

}

