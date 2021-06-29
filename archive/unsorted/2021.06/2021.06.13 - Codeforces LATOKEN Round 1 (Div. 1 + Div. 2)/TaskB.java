package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        long operations = 0;
        for (int i = 0; i < n; i++) {
            int left = i == 0 ? 0 : arr[i - 1];
            int right = i == (n - 1) ? 0 : arr[i + 1];
            if (left < arr[i] && right < arr[i]) {
                int max = Math.max(left, right);
                operations += (arr[i] - max);
                arr[i] = max;
            }
        }
        long ugliness = 0;
        for (int i = 1; i < n; i++) {
            ugliness += (Math.abs(arr[i] - arr[i - 1]));
        }
        ugliness += (arr[n - 1] + arr[0]);
        out.printLine(ugliness + operations);

    }
}
