package codes;


import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Integer[] x = ArrayUtils.toIntegerArray(in.readIntArray(n));
        Arrays.sort(x);
        int count = 0;
        for (int i = 0; i < n; i++) {
        

        }
        if (count == 0) count++;
        out.printLine(count);

    }
}
