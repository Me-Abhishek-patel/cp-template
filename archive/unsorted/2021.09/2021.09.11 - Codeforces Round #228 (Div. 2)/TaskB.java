package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        char[][] a = in.readTable(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == '#') {
                    if (j != 0 && j != n - 1 && i != n - 2 && i != n - 1) {
                        if (a[i + 1][j] == '#' && a[i + 1][j - 1] == '#' && a[i + 1][j + 1] == '#' && a[i + 2][j] == '#') {
                            a[i][j] = '.';
                            a[i + 1][j] = '.';
                            a[i + 1][j - 1] = '.';
                            a[i + 1][j + 1] = '.';
                            a[i + 2][j] = '.';
                        } else {
                            out.printLine("NO");
                            return;
                        }
                    } else {
                        out.printLine("NO");
                        return;
                    }
                }
            }
        }
        out.printLine("YES");
    }
}
