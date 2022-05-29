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

public class CSequenceTransformation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if (n == 3) {
            out.printLine("1" + " 1" + " 3");
            return;
        }
        int even = n / 2;
        int odd = n - even;
        int i = 1;
        String s = "1 ".repeat(odd);
        out.print(s);
        while (even > 0) {
            i *= 2;
            int l = (int) ceil(even / 2.0);
            if (even <= 3) {
                if (even == 1) {
                    out.print(i);
                } else if (even == 2) {
                    out.print(i+" "+(i*2));
                }else {
                    out.print(i+" "+i+" "+(i*3));
                }
                return;
            } else {
                for (int j = 0; j < l; j++) {
                    out.print(i + " ");
                }
            }
            even /= 2;


        }


    }
}
