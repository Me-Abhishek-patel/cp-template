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

public class ATokitsukazeAndAllZeroSequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int c = 0;
        int[] a = new int[101];
        for (int i = 0; i < n; i++) {
            a[in.readInt()]++;
        }
        if(a[0]!=0){
            out.printLine(n-a[0]);
        }else {
            for (int i : a) {
                if(i>=2){
                    out.printLine(n);
                    return;
                }
            }
            out.printLine(n+1);
        }
    }
}
