package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        ArrayList<HashSet<Integer>> al = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            al.add(new HashSet<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int j = in.readInt(), l = in.readInt(), r = in.readInt();
            for (int k = l; k <= r; k++) {
                al.get(j).add(k);
            }
        }
        int count = al.get(0).size() == 0 ? 1 : 0;
        for (int i = 0; i < n; i++) {
            for (Iterator<Integer> it = al.get(i).iterator(); it.hasNext(); ) {
                int i1 = it.next();
                if()


            }

        }
    }
}
