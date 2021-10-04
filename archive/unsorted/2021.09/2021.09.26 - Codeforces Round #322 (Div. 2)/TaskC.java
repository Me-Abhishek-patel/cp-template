package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        Integer[] a = ArrayUtils.toIntegerArray(in.readIntArray(n));
        Arrays.sort(a, (x, y) -> (y % 10) - (x % 10));
        int res = 0, rem = 0;
//        out.printLine(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 100  ) {
                int r = 10 - a[i] % 10;
                if(k>=r) {
                    a[i] += r;
                    k -= r;
                    rem += 100 - a[i];
                }else k=0;
                res += a[i] / 10;
            } else {
                res += a[i] / 10;
            }
        }
        if(k>=rem)res+=rem/10;
        else res+=k/10;

        out.printLine(res);
    }
}
