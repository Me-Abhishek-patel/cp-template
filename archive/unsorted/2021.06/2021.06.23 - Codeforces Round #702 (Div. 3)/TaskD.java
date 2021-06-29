package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        makeTree(0, arr, 0, n - 1);
        out.printLine(arr);
    }

    private void makeTree(int d, int[] arr, int s, int e) {
        if (s <= e) {
            int imax = s, max = arr[s];
            for (int i = s; i <= e; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    imax = i;
                }
            }
            arr[imax] = d;
            makeTree(d+1,arr,s,imax-1);
            makeTree(d+1,arr,imax+1,e);
        }

    }
}
