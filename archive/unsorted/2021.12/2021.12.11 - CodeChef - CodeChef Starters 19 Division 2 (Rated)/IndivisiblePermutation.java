package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class IndivisiblePermutation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n =  in.readInt();
        out.print(n+" ");
        for (int i = 1; i < n; i++) {
            out.print(i+" ");
        }
        out.printLine();
    }
}
