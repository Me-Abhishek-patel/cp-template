package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class Subsequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] c = in.readIntArray(n);
        ArrayList<Integer> z = new ArrayList<>();
        ArrayList<Integer> o = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                z.add(c[i]);
            else o.add(c[i]);
        }
        Collections.sort(o);
        Collections.sort(z, Collections.reverseOrder());
        long s = 0;
        for (int i = 0; i < z.size(); i++) {
            for (int j = i; j < o.size(); j++) {
                s += (long) z.get(i) * o.get(j);
            }
        }
        for (int i = 0; i < z.size(); i++) {
            if (i < o.size())
                out.print(z.get(i) + " " + o.get(i) + " ");
            else out.printLine(z.get(i));
        }
        out.printLine();
        out.printLine(s);

    }
}
