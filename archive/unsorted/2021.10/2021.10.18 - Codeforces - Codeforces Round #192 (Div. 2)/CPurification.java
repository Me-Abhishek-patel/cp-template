package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CPurification {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        char[][] a = in.readTable(n, n);
        boolean r = false, c = false;
        for (int i = 0; i < n; i++) {
            boolean x = false, y = false;
            for (int j = 0; j < n; j++) {
                if (a[i][j] == '.') x = true;
                if (a[j][i] == '.') y = true;
            }
            if (!x) r = true;
            if (!y) c = true;
        }
        if (r && c) {
            out.printLine(-1);
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r) {
                    if (a[j][i] == '.') {
                        out.printLine(((j + 1) + " " + (i + 1)));
                        break;
                    }
                }else {
                    if (a[i][j] == '.') {
                        out.printLine(((i + 1) + " " + (j + 1)));
                        break;
                    }
                }
            }
        }

    }
}
