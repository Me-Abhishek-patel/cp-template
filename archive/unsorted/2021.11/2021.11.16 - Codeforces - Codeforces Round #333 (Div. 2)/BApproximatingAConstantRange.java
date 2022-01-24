package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class BApproximatingAConstantRange {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int j = 0, count = 0, res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = min(min, a[i]);
            max = max(max, a[i]);
            hm.put(a[i], i);
            if (max - min <= 1)
                res = max(i - j + 1, res);
            else {
                if (hm.get(min) < hm.get(max)) {
                    j = hm.get(min) + 1;
                    if (j != n)
                        min = a[j];
                } else {
                    j = hm.get(max) + 1;
                    if (j != n)
                        max = a[j];
                }

            }

        }
        out.printLine(res);
    }
}
