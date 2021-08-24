package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        char[][] table = in.readTable(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isValid(table, i, j)) out.print(table[i][j]);
            }
        }
    }

    private boolean isValid(char[][] table, int i, int j) {
        char c = table[i][j];
        for (int k = 0; k < table[i].length; k++) {
            if (k!=j && table[i][k] == c) return false;
        }
        for (int k = 0; k < table.length; k++) {
            if (k!=i && table[k][j] == c) return false;
        }
        return true;
    }


}
