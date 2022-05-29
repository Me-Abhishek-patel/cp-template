package codes;

import static net.cplibrary.misc.ArrayUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class OutOf5 {
    boolean isPossible = false;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        while (true) {
            int[] a = in.readIntArray(5);
            if (sumArray(a) == 0) break;
            isPossible = false;
            backtrack(a, a[0], new HashSet<>());
            if (isPossible) {
                out.printLine("Possible");
            } else {
                out.printLine("Impossible");
            }
        }

    }


    private void backtrack(int[] a, int val, HashSet<Integer> hs) {
        if (hs.size() == 5) {
            if (val == 23)
                isPossible = true;
            return;
        }
        if (isPossible) return;
        for (int j = 0; j < a.length; j++) {
            if (!hs.contains(j)) {

                if (hs.isEmpty()) {
                    hs.add(j);
                    backtrack(a, a[j], hs);

                } else {
                    hs.add(j);
                    backtrack(a, val + a[j], hs);
                    backtrack(a, val - a[j], hs);
                    backtrack(a, val * a[j], hs);
                }
                hs.remove(j);
            }
        }


    }
}
