package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BORInMatrix {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int m = in.readInt(), n = in.readInt();
        int[][] b = in.readIntTable(m, n), a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 1) {
                    boolean row = true, col = true;
                    for (int k = 0; k < m; k++) {
                        if (b[k][j] != 1) {
                            row = false;
                            break;
                        }
                    }
                    for (int k = 0; k < n; k++) {
                        if (b[i][k] != 1) {
                            col = false;
                            break;
                        }
                    }
                    if (!col && !row) {
                        out.printLine("NO");
                        return;
                    }
                    if (col && row) {
                        a[i][j] = 1;
                    }
                }
            }

        }
        int[][] c = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
//                    boolean row = true, col = true;
                    for (int k = 0; k < m; k++) {
                        c[k][j] = 1;
                    }
                    for (int k = 0; k < n; k++) {
                        c[i][k] = 1;
                    }
                }
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] != c[i][j]) {
                    out.printLine("NO");
                    return;
                }
            }
        }

        out.printLine("YES");
        out.printIntTable(a);
    }
}
