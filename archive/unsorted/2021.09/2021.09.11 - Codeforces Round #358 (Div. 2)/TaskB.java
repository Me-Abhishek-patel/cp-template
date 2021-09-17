package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.readInt();
        }
        Arrays.sort(a);
        int i = 0, j = 1;
        for (int i1 : a) {
            if (i1 >= j) {
                j++;
            }
        }


        out.printLine(j);
    }
}
