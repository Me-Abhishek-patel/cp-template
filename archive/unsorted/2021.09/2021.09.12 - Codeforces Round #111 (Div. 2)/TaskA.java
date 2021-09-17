package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        int[] b = new int[n];
        Arrays.sort(arr);
        b[0] = arr[0];

        for (int i = 1; i < n; i++) {
            b[i] = b[i - 1] + arr[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            arr[i] = arr[i + 1] + arr[i];
        }
        int res = 0;
        for (int i = n - 1; i > 0; i--) {
            res++;
            if (arr[i] > b[i-1]) {
                out.printLine(res);
                return;
            }
        }
        out.printLine(n);
    }
}
