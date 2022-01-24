package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.PriorityQueue;

public class BNotSitting {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
//        int[][] grid = new int[n][m];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int x = abs(1 - i) + abs(1 - j);
                int y = abs(n - i) + abs(1 - j);
                int z = abs(1 - i) + abs(m - j);
                int a = abs(n - i) + abs(m - j);
                int max = max(x, max(y, max(z, a)));
                pq.add(max);
            }
        }
        while (!pq.isEmpty()){
            out.print(pq.poll()+" ");
        }
        out.printLine();



    }
}
