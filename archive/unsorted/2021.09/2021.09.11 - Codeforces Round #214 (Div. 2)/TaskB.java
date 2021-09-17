package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
        int min = Integer.MAX_VALUE, res = 0;
        for (int i = 0; i < k; i++) {
            int j = i;
            int sum = 0;
            
            while (j < n) {
                sum += a[j];
                j+=k;
            }
//            out.print(sum+" ");
            if (sum < min) {
                min = sum;
                res = i;
            }
        }
        out.printLine(res + 1);
    }
}
