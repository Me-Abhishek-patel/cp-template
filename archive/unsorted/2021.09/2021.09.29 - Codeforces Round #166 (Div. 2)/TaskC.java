package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import org.bouncycastle.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        if (n / k <= 2) {
            out.printLine(-1);
            return;
        }
        int t = n / k;
        int[] a = new int[n];
        Arrays.fill(a, k);
        int j = 1, count = 1;
        for (int i = 0; i < n; i++) {
            a[i] = j;
            count++;
            if (count == t) {
                count = 1;
                j++;
            }
        }
        out.printLine(a);
    }
}
