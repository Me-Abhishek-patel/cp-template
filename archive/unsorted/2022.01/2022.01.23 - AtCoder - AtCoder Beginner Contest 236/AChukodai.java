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

public class AChukodai {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        StringBuilder sb = new StringBuilder(in.readLine());
        int a = in.readInt(), b = in.readInt();
        char c = sb.charAt(a - 1);
        sb.replace(a - 1, a, ""+sb.charAt(b-1) );
        sb.replace(b-1,b,c+"");
        out.printLine(sb);
    }
}
