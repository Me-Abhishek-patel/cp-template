package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        int res = 0, group = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) group++;
            while (i < n && arr[i] == 1) {
                res++;
                i++;
            }
        }

        out.printLine(Math.max(res+group-1,0));
    }
}
