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

public class EvenSubsetXor {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int k = 3;
        while (n > 0) {
            if (Integer.bitCount(k) % 2 == 0) {
                out.print(k+" ");
                n--;
            }
            k++;

        }
        out.printLine();

    }
}
