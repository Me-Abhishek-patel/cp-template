package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int count = destroy(a, 0, a.length - 1, n, false, false);
        out.printLine(count);
    }

    private int destroy(int[] a, int i, int l, int n, boolean lowest, boolean highest) {
        if (lowest && highest) return 0;
        if (i >= l) return 0;
        int steps = 0;
        if (a[i] == 1) {
            steps = Math.min(destroy(a, i + 1, l, n, true, highest), destroy(a, i, l - 1, n, lowest, highest));
        } else if (a[l] == 1) {
            steps = Math.min(destroy(a, i + 1, l, n, lowest, highest), destroy(a, i, l - 1, n, true, highest));
        } else if (a[i] == n) {
            steps = Math.min(destroy(a, i + 1, l, n, lowest, true), destroy(a, i, l - 1, n, lowest, highest));
        } else if (a[l] == n) {
            steps = Math.min(destroy(a, i + 1, l, n, lowest, highest), destroy(a, i, l - 1, n, lowest, true));
        } else steps = Math.min(destroy(a, i + 1, l, n, lowest, highest), destroy(a, i, l - 1, n, lowest, highest));


        return 1 + steps;
    }
}
