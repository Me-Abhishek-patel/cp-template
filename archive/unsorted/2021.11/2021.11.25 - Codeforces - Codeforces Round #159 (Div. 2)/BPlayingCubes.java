package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BPlayingCubes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int k=n+m-1, l=Math.min(n,m);
        out.printLine((k-l)+" "+l);

    }
}
