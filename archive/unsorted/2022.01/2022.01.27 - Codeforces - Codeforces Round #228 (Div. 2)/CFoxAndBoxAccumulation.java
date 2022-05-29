package codes;


import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.*;

public class CFoxAndBoxAccumulation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Integer[] x = ArrayUtils.toIntegerArray(in.readIntArray(n));
        Arrays.sort(x, Collections.reverseOrder());
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            q.add(x[i]);
        }

        while (!q.isEmpty()) {
            count++;
            ArrayList<Integer> al = new ArrayList<>();
            int p = q.poll();
            while (!q.isEmpty()) {
                if (p < q.peek()) {
                    al.add(p);
                }
                p = q.poll();
            }
            q.addAll(al);
        }
        if (count == 0) count++;
        out.printLine(count);

    }
}
