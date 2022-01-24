package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BCosmicTables {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
        int[][] a = in.readIntTable(n, m);
        int[] row = new int[n], col = new int[m];
        for (int i = 0; i < n; i++) row[i] = i;
        for (int i = 0; i < m; i++) col[i] = i;
        for (int i = 0; i < k; i++) {
            String[] s = in.readLine().split(" ");
            int x = Integer.parseInt(s[1]) - 1, y = Integer.parseInt(s[2]) - 1;

//            out.printIntTable(a);
            if (s[0].equals("c")) {

                int t = col[x];
                col[x] = col[y];
                col[y] = t;


            } else if (s[0].equals("r")) {
                int[] t = a[x];
                a[x] = a[y];
                a[y] = t;
            } else {
                out.printLine(a[x][col[y]]);
            }
        }

    }
}
