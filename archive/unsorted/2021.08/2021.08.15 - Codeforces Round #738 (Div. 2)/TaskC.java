package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int d = - 1;
        boolean flah = false;
        for (int i = 0; i < n; i++) {
            if(a[i]==0) flah = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == 0 && a[i + 1] == 1) {
                d = i;
                break;
            }
        }
        if (d == - 1) {
            if (a[n - 1] == 0) {
                for (int i = 0; i < n; i++) {
                    out.print((i + 1) + " ");
                }
                out.print((n + 1) + "\n");
            } else {
                if()
                out.printLine(-1);
            }
            return;
        } else {
            for (int i = 0; i < n; i++) {
                out.print((i + 1) + " ");
                if (i == d) out.print((n + 1) + " ");
            }
            out.printLine();
        }
    }
}
