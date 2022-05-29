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

public class ANotOverflow {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Long n = in.readLong();
        long max = (1L << 31);
        if (n >= -1 * max && n <=max-1){
            out.printLine("Yes");
        }else {
            out.printLine("No");
        }

    }
}
