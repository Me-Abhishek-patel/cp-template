package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class MissingSums {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int i = 0, j = 1;
        while (i<n){
            out.print(j+" ");
            j+=2;
            i++;
        }
        out.printLine();
    }
}
