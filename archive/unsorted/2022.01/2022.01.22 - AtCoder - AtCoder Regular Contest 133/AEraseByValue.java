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

public class AEraseByValue {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int x = -1;
        int max = -1;
        for (int i = 0; i < n; i++) {
            if(i!=n-1 && a[i]>a[i+1]){
                x = a[i];
                break;
            }
            max = max(a[i],max);
        }
        if(x==-1) x= max;
        for (int i = 0; i < n; i++) {
            if(a[i]!=x){
                out.print(a[i]+" ");
            }
        }
        out.printLine();
    }
}
