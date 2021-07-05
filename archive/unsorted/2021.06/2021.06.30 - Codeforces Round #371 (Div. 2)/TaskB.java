package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        Arrays.sort(arr);

        int i = 1, j = n - 2;
        int diff = arr[n - 1] - arr[0];
        if (arr.length == 1) {
            out.printLine("YES");
            return;
        }
        if (diff % 2 != 0) {
            out.printLine("NO");
            return;
        }
        while (i <= j) {
            if ((i == j)) {
                if ((arr[0] + diff / 2) != arr[i]) {
                    out.printLine("NO");
                    return;
                }
            }else if( arr[j]-arr[i]!=diff){
                out.printLine("NO");
                return;
            }
            i++;
            j--;

        }
        out.printLine("YES");
    }

}
