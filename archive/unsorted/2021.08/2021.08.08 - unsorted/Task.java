package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int h = in.readInt(), w = in.readInt(), n = in.readInt();
        int[][] mat = in.readIntTable(n, n);
        Arrays.sort(mat, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


    }
}
