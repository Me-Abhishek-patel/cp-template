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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AAsSimpleAsOneAndTwo {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        boolean[] a = new boolean[s.length()];
        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if ((s.charAt(i) == 'e' && s.charAt(i - 1) == 'n' && s.charAt(i - 2) == 'o') ||
                    (s.charAt(i) == 'o' && s.charAt(i - 1) == 'w' && s.charAt(i - 2) == 't')) {
                a[i] = true;

            }
        }
        HashSet<Integer> al = new HashSet<>();
        for (int i = 2; i < s.length(); i++) {
            if (i + 2 < s.length() && a[i] && a[i + 2]) {
                al.add(i + 1);
            } else if (a[i] && a[i - 2]) {
                continue;
            } else if (a[i]) {
                al.add(i);
            }
        }
        out.printLine(al.size());
        for (Integer integer : al) {
            out.print(integer + " ");
        }
        out.printLine();
    }
}
