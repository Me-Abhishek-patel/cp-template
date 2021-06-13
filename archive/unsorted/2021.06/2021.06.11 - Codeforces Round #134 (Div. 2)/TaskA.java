package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] arr = in.readIntArray(2 * n + 1);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0 && k > 0 && arr[i] - arr[i - 1] > 1 && arr[i] - arr[i + 1] > 1) {
                arr[i]--;
                k--;
            }
        }
        out.print(arr);
    }
}
