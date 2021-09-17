package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int minEven = Integer.MAX_VALUE, minOdd = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                minEven = Math.min(minEven, a[i]);
            } else minOdd = Math.min(minOdd, a[i]);
            sum += a[i];
        }
        if (sum % 2 == 0) {
            if (minOdd != Integer.MAX_VALUE){
                out.printLine(sum-minOdd);
            }else out.printLine(0);
        }else out.printLine(sum);
    }
}
