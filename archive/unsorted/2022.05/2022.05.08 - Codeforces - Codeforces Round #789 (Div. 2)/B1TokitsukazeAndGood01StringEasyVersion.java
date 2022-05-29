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

public class B1TokitsukazeAndGood01StringEasyVersion {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        ArrayList<Integer> al = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) count++;
            else {
                al.add(count);
                count = 1;
            }
        }
        al.add(count);
        int ans = 0;
        for (int i = 0; i < al.size() - 1; i++) {
            if (al.get(i) % 2 != 0) {
                if (al.get(i) == 1) {
                    if (i != 0) {
                        al.set(i + 1, al.get(i + 1) + al.get(i - 1));
                        al.set(i - 1, 0);
                    }
                    al.set(i, al.get(i) - 1);
                    al.set(i + 1, al.get(i + 1) + 1);
                } else {
                    al.set(i, al.get(i) + 1);
                    al.set(i + 1, al.get(i + 1) - 1);
                }
                ans++;
            } else if (al.get(i) == 0) {
                if (i != 0) {
                    al.set(i + 1, al.get(i + 1) + al.get(i - 1));
                    al.set(i - 1, 0);
                }
            }
        }
        int ans2 = 0;
        for (Integer i : al) {
            if (i != 0) ans2++;
        }
        out.printLine(ans + " " + ans2);
    }
}
