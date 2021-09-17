package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        for (int i = 1; i < n; i++)
            if (a[a[a[i]]] == i) {
                out.printLine("YES");
                return;
            }
        out.printLine("NO");
    }
}
