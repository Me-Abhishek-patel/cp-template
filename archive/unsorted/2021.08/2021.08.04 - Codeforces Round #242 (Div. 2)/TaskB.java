package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), s = in.readInt();
        int[][] arr = in.readIntTable(n, 3);
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });
        for (int i = 0; i < n; i++) {
            s += arr[i][2];
            if (s >= 1000000) {
                out.printLine(Math.sqrt(arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1]));
                return;
            }
        }
        out.printLine(-1);
    }
}
