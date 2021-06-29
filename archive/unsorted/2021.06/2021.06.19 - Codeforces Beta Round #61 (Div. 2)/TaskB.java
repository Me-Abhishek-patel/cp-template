package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;
import net.egork.misc.ArrayUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        int[] left = new int[n];
        left[0] = 1;
        int x = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] <= arr[i]) {
                left[i] = ++x;
            } else {
                x = 0;
                left[i] = ++x;
            }
        }
        x = 1;
//        out.printLine(left);
        left[n - 1]++;
        for (int i = n - 2; i >= 0; --i) {
            if (arr[i + 1] <= arr[i]) {
                left[i] = (left[i] + ++x);
            } else {
                x = 0;
                left[i] = (left[i] + ++x);
            }
        }

        int max = ArrayUtils.maxElement(left);
        System.out.println(max - 1);
    }
}
