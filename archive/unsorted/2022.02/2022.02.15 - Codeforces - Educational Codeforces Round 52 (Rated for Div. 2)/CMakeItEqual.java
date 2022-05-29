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

public class CMakeItEqual {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int maxN = 200001;
        int[] h = in.readIntArray(n), a = new int[maxN];
        for (int i = 0; i < h.length; i++) {
            a[h[i]]++;
        }
        a[0] = n;
        for (int i = maxN - 2; i > 0; i--) {
            a[i] += a[i + 1];
        }
        int sum = 0, count = 0;
        for (int i = maxN - 1; i >= 0; i--) {
            if (a[i] == n) {
                if(sum!=0){
                    count++;
                }
                break;
            }
            if (sum + a[i] <= k) {
                sum += a[i];
            } else {
                count++;
                sum = a[i];
            }


        }
        out.printLine(count);


    }
}
