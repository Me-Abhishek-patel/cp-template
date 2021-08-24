package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayFilling {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[][] arr = new int[m][2];
        for (int i = 0; i < m; i++) {
            arr[i][0] = in.readInt();
            arr[i][1] = in.readInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        long res = (long) (n - (n / arr[0][1])) * arr[0][0], mul = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            long k = (n / mul);

            mul *= arr[i][1];

            k -= (n / mul);

            res += k * arr[i][0];
        }
        out.printLine(res);
    }
}
