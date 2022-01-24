package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class RemoveElement {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
        if (n == 1) {
            out.printLine("YES");

        } else {
            int max = maxElement(a), min = minElement(a);
            if(max+min<=k){
                out.printLine("YES");
            }else {
                out.printLine("NO");
            }
        }

    }
}
