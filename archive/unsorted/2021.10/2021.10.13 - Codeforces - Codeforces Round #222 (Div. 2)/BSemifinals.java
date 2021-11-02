package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BSemifinals {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = new int[n], x = new int[n], y = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.readInt();
            b[i] = in.readInt();
        }
        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (a[p] < b[q])
                x[p++]++;
            else y[q++]++;
        }
        for (int i = 0; i  < n/2; i++) {
            x[i] = y[i] = 1;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(x[i]);
            sb2.append(y[i]);
        }
        out.printLine(sb);
        out.printLine(sb2);
    }
}
