package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), f = in.readInt();
        int[][] arr = in.readIntTable(n, 2);
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (Math.min(o2[1], 2 * o2[0])-Math.min(o2[1],  o2[0])) - (Math.min(o1[1], 2 * o1[0])-Math.min(o1[1], o1[0]));
            }
        });
        long sum = 0;
        for (int i = 0; i < f ; i++) {
            sum+=Math.min(arr[i][0]*2,arr[i][1]);
        }
        for (int i = f; i < n; i++) {
            sum+=Math.min(arr[i][0],arr[i][1]);

        }
        out.printLine(sum);
    }
}
