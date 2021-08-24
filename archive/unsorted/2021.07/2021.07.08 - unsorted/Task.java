package codes;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public void solve(int testNumber, Scanner in, PrintStream out) {
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            while (j < n && arr[j] < 2 * arr[i]) j++;
            ans = Math.min(ans, n - j + i);
            i++;
        }
        out.println(ans);
    }
}
