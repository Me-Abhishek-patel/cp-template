package codes;


import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr) {
            hs.add(i);
        }
        if (hs.size() <= 2) out.printLine("YES");
        else if (hs.size() == 3) {
            int[] a = new int[3];
            Iterator<Integer> itr = hs.iterator();
            for (int i = 0; i < 3; i++) {
                a[i] = itr.next();
            }
            Arrays.sort(a);
            if (2 * a[1] == a[0] + a[2]) {
                out.printLine("YES");
            } else {
                out.printLine("NO");
            }
        } else {
            out.printLine("NO");
        }

    }

}
