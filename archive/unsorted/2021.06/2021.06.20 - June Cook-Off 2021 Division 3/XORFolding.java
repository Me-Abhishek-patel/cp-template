package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class XORFolding {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int m = in.readInt(), n = in.readInt();
        char[][] grid = in.readTable(m, n);
        int res = 0;
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') count++;
            }
            if (count % 2 != 0) res++;
        }
        if(res%2!=0)
            out.printLine("YES");
        else out.printLine("NO");
    }

}
