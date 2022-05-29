package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class DCyclicRotation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n), b = in.readIntArray(n);
        int[] freq = new int[n + 1];
        Deque<Integer> dq1 = new LinkedList<>(), dq2 = new LinkedList<>();
        for (int i : a) {
            freq[i]++;
        }
        for (int i = 0; i < n; i++) {
            dq1.addLast(a[i]);
            dq2.addLast(b[i]);
        }

        while (!dq1.isEmpty() && !dq2.isEmpty()) {
            while (!dq2.isEmpty() && !dq1.isEmpty() && freq[dq1.getLast()] % 2 != 0 && dq1.getLast() == dq2.getLast()) {
                freq[dq1.getLast()]--;
                dq1.removeLast();
                dq2.removeLast();
            }
            if (!dq2.isEmpty() && !dq1.isEmpty()) {

                if (dq1.getFirst() == dq2.getFirst() && dq1.getLast() == dq2.getLast() && dq1.getFirst() == dq1.getLast()) {
                    freq[dq1.getLast()] -= 2;
                    dq1.removeFirst();
                    dq2.removeFirst();
                    dq1.removeLast();
                    dq2.removeLast();
                } else {
                    int x = dq2.removeLast();
                    if (x == dq2.getLast() && dq1.getLast() == dq2.getLast() && dq1.getFirst() == dq1.getLast()) {
                        freq[x] -= 2;
                        dq1.removeLast();
                        dq1.removeFirst();
                        dq2.removeLast();

                    } else {
                        dq2.addLast(x);
                        if (freq[dq1.getFirst()] % 2 != 0 && dq1.getFirst() == dq2.getFirst()) {
                            freq[dq1.getFirst()]--;
                            dq1.removeFirst();
                            dq2.removeFirst();
                        } else {

                            out.printLine("NO");
                            return;
                        }
                    }
                }

            }
        }
        out.printLine("YES");

    }
}
