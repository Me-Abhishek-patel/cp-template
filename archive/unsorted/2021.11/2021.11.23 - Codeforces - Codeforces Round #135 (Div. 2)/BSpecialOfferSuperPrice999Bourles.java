package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BSpecialOfferSuperPrice999Bourles {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long p = in.readLong(), d = in.readLong();
        long i = 10;
        int k = 1;
        while (p % i != p) {
            String s = String.valueOf(p);
            long digit = Long.parseLong(s.substring(s.length() - k).charAt(0) + "");
            if (digit != 9) {
                long x = (digit + 1) * (i / 10);
                if (x <= d) {
                    p -= (x);
                    d -= x;
                } else break;
            }
            i *= 10;
            k++;

        }
        out.printLine(p);
    }

}
