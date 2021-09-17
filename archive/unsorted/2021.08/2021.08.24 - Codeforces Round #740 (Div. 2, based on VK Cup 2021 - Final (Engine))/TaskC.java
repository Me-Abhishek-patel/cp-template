package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[][] arr = new int[n][];
        int[][] needed = new int[n][2];
//        int[] kas = new int[n];
        for (int i = 0; i < n; i++) {
            int k = in.readInt();
            needed[i][1] = k;
//            kas[i] = k;

            arr[i] = in.readIntArray(k);
            int p = ArrayUtils.maxPosition(arr[i]);

//
            needed[i][0] = arr[i][p] + 1 - p;

        }
        Arrays.sort(needed, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o2[1] - o1[1];
            }
        });
        int x = needed[0][0];
        int min = x, sum = 0;
        for (int i = 0; i < needed.length; i++) {
            if (needed[i][0] <= x) {
                x += needed[i][1];
                sum += needed[i][1];
            } else {
                x = needed[i][0];
                min = x - sum;
                x +=needed[i][1];
                sum+=needed[i][1];
            }
        }
        out.printLine(min);
    }
}
