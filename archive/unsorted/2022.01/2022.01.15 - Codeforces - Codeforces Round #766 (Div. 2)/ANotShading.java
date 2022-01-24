package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ANotShading {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), r = in.readInt() - 1, c = in.readInt() - 1;
        char[][] grid = in.readTable(n, m);
        if (grid[r][c] == 'B') {
            out.printLine(0);
            return;
        }
        for (int i = 0; i < m; i++) {
            if (grid[r][i] == 'B') {
                out.printLine(1);
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            if (grid[i][c] == 'B') {
                out.printLine(1);
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'B') {
                    out.printLine(2);
                    return;
                }
            }
        }
        out.printLine(-1);

    }
}
