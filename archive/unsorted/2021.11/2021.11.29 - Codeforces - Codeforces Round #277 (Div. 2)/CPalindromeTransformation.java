package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CPalindromeTransformation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), p = in.readInt() - 1;
        String s = in.readLine();
        long res = 0;
        if (p >= ceil((float) n / 2)) p = n - p - 1;

        int left = p, right = p, leftmin = 0, rightmin = 0;
        for (int i = 0; i < ceil((float) n / 2); i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                if (i < p && leftmin <= p - i) {
                    leftmin = p - i;
                    left = i;
                }
                right = i;
                int diff = abs(s.charAt(i) - s.charAt(n - i - 1));
                res += min(diff, 26 - diff);
            }
        }
//        out.printLine(res);
//        int min = abs(p - left) * 2 + abs(right- p);
//        min = min(min, abs(p - right) * 2 + abs(left- p));
//        min = min(min, (n - left - 1) - p);
//        res += min(n - (n - right - 1), min);
        out.printLine(res>0?res+min(Math.abs(p-left),Math.abs(p-right))+right-left:0);
    }
}
