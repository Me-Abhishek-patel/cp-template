package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class CExams {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[][] a = in.readIntTable(n, 2);
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });
        int premin = Math.min(a[0][0], a[0][1]);
        for (int i = 1; i < n; i++) {
            int currmin = Math.min(a[i][0], a[i][1]);
            if (currmin >= premin)
                premin = currmin;
            else premin = Math.max(a[i][0], a[i][1]);
        }
        out.printLine(premin);
    }
}
