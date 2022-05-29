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

public class AProfSlim {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int pos = 0, neg = 0;
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) pos++;
            else neg++;
        }
        if(n==1){
            out.printLine("YES");
            return;
        }
        for (int i = 0; i < n; i++) {
            if(neg>0){
                a[i] = -abs(a[i]);
                neg--;
            }else {
                a[i] = abs(a[i]);
            }
        }
        for (int i = 1; i < n; i++) {
            if(a[i]<a[i-1]){
                out.printLine("NO");
                return;
            }
        }
        out.printLine("YES");
    }
}
