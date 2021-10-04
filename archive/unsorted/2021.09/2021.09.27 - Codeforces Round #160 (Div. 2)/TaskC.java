package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int m = in.readInt();
        int[] q = in.readIntArray(m);
        Arrays.sort(q);
        int n = in.readInt();
        Integer[] a = ArrayUtils.toIntegerArray(in.readIntArray(n));
        Arrays.sort(a, Collections.reverseOrder());
        int i = 0;
        int spent = 0;
        while (i < a.length) {
            for (int j = 0; j < q[0] && i<a.length; j++) {
                spent+=a[i++];
            }
            i+=2;
        }
        out.printLine(spent);
    }
}
