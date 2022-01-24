package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ARotate {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        char[] s = in.readLine().toCharArray();
        String x =""+s[0]+s[1]+s[2], y = ""+s[1]+s[2]+s[0]+"", z = ""+s[2]+s[0]+s[1];
        out.printLine(Integer.parseInt(x)+Integer.parseInt(y)+Integer.parseInt(z));
    }
}
