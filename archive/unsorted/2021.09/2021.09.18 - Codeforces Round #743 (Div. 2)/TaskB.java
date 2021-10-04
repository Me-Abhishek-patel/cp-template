package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n), b = in.readIntArray(n);
        int[] up = new int[n], down = new int[n];
        int min = up[0] = a[0], max = down[0] = b[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(a[i], min);
            up[i] = min;
            max = Math.max(b[i], max);
            down[i] = max;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = bs(up[i], down);
            res = Math.min(res, x + i);
        }
        out.printLine(res);
    }

    private int bs(int key, int[] a) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}
