package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] h = in.readIntArray(n);
        int[] arr = new int[n];
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = max;
            max = Math.max(h[i], max);
        }
        for (int i = 0; i < n; i++) {
            if (h[i] > arr[i])out.print(0+" ");
            else out.printLine((arr[i]-h[i]+1)+" ");
        }
    }
}
