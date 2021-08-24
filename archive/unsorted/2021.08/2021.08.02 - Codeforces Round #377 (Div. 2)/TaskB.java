package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] arr = in.readIntArray(n);
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] + arr[i - 1] < k) {
                int x = (k - (arr[i] + arr[i - 1]));
                sum += x;
                arr[i] = arr[i] + x;
            }
        }
        out.printLine(sum);
        out.printLine(arr);
    }
}
