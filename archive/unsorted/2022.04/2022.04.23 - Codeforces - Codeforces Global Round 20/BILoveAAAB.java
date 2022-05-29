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

public class BILoveAAAB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        if (s.length() == 1 || !s.contains("B") || s.charAt(s.length() - 1) == 'A') {
            out.printLine("NO");
            return;
        }
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A')c++;
            else c--;
            if(c<0){
                out.printLine("NO");
                return;
            }
        }
        out.printLine("YES");

    }
}
