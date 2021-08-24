package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] x = in.readIntArray(n);
        Arrays.sort(x);
        int q = in.readInt();
        for (int i = 0; i < q; i++) {
            int m = in.readInt();
            out.printLine(binarySearch(x, m)+1);
        }
    }

    private int binarySearch(int[] x, int k) {
        int l = 0, r = x.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (x[mid] == k) {
                l = mid+1;
            } else if (x[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;

    }
}
