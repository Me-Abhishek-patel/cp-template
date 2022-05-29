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

import java.util.HashSet;

public class CGoodString {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        HashSet<String> hs = new HashSet<>();
        String p = "0123456789";
        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                hs.add("" + p.charAt(i) + "" + p.charAt(j));
            }
        }
        int min = Integer.MAX_VALUE;

        for (String h : hs) {
            int j = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (j == 2) j = 0;
                if (s.charAt(i) == h.charAt(j)) {
                    j++;
                } else {
                    count++;
                }
            }
            if (j == 1 && h.charAt(0) != h.charAt(1)) count += 1;

            min = Math.min(min, count);
        }
        out.printLine(min);
    }
}
