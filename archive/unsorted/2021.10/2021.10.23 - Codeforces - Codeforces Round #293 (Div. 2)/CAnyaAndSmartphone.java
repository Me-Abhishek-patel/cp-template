package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CAnyaAndSmartphone {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
        int[] a = new int[n + 1], pos = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int x = in.readInt();
            a[i] = x;
            pos[x] = i;
        }
        long res = 0;
        for (int i = 0; i < m; i++) {
            int x = in.readInt();
            int y = pos[x];
            res += ((y-1) / k) + 1;
            if (y != 1) {
                int z = a[y - 1];
                a[y] = a[y - 1];
                a[y - 1] = x;
                pos[x]--;
                pos[z]++;
            }
        }

        out.printLine(res);

    }
}
