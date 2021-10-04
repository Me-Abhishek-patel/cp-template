package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n), b = in.readIntArray(n);
        int count = 0, j = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            while (j < a.length && hs.contains(a[j])) j++;
            if (j < a.length && b[i] == a[j]) {
                j++;
            } else {
                count++;
                hs.add(b[i]);
            }
        }
        out.printLine(count);
    }
}
