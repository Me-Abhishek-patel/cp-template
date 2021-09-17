package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        long left = (long) n * n;
        for (int k = 0; k < m; k++) {

            int i = in.readInt(),j = in.readInt();
            row.add(i);
            col.add(j);
            left = ((long) n *n)- ((long) row.size() *n+ (long) col.size() *n- (long) row.size() *col.size());
            out.printLine(left);


        }
    }
}
