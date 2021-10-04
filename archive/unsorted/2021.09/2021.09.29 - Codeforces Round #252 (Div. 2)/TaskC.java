package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt() - 1;
        int t = k;
        int l = 0;
        int[][] table = new int[n][m];
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                for (int j = 0; j < m; j++) {
                    sb.append(i + 1).append(" ").append(j + 1).append(" ");

                    table[i][j] = k;
                    l++;
                    if (l == 2 && k > 0) {
                        count++;
                        out.printLine((2) + " " + sb.toString());
                        sb = new StringBuilder();
                        l = 0;
                        k--;
                    }
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    sb.append(i + 1).append(" ").append(j + 1).append(" ");
                    table[i][j] = k;
                    l++;
                    if (l == 2 && k > 0) {
                        count++;
                        out.printLine((2) + " " + sb.toString());
                        sb = new StringBuilder();
                        l = 0;
                        k--;
                    }
                }
            }
        }
        out.printLine(((n*m)-(count*2)) + " " + sb.toString());


    }
}
