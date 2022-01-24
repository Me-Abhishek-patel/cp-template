package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;
import net.cplibrary.numbers.IntegerUtils;

import java.util.ArrayList;
import java.util.HashSet;

public class PartitionIt {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.readInt();
        boolean[] isprime = IntegerUtils.generatePrimalityTable(100009);
        while (t-- > 0) {
            int n = in.readInt(), k = in.readInt();
            boolean found = false;
            if (k == 1) {
                out.printLine("Yes");
                out.printLine(1);
                found = true;
                continue;
            }
            HashSet<Integer> al = new HashSet<>();
            int i = n;
            al.add(1);
            if (n - al.size() == k) {
                out.printLine("Yes");
                for (int it = 1; it <= n; it++) {
                    if (!al.contains(it))
                        out.print(it + " ");
                }
                out.printLine();
                found = true;
                continue;
            }
            while ((i * 2) > n) {
                if (isprime[i]) {
                    al.add(i);
                }
                if (al.size() == k) {
                    out.printLine("Yes");
                    for (Integer it : al) {
                        out.print(it + " ");
                    }
                    out.printLine();
                    found = true;
                    break;

                }
                if (n - al.size() == k) {
                    out.printLine("Yes");
                    for (int it = 1; it <= n; it++) {
                        if (!al.contains(it))
                            out.print(it + " ");
                    }
                    out.printLine();
                    found = true;
                    break;
                }
                i--;

            }
            if (!found) {
                out.printLine("No");
            }
        }

    }
}
