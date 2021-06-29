package codes;


import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        Arrays.sort(arr);


        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] + arr[i] > arr[i + 1]) {
                out.printLine("YES");
                return;
            }
        }

        out.printLine("NO");
    }
}
