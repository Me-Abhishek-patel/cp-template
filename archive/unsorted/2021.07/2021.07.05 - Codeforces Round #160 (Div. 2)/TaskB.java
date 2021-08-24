package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] arr = in.readIntArray(n);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (k > 0 && arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
                k--;
            }
            sum += arr[i];
        }
        if (k > 0 && k % 2 != 0) {
            sum -=( 2*ArrayUtils.minElement(arr));
        }
        out.printLine(sum);
    }

}
