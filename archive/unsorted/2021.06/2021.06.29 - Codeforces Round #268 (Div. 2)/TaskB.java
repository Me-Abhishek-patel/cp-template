package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TaskB {
    //---------------------------------------------Main-----------------------------------------------//
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int p = in.readInt(), q = in.readInt(), l = in.readInt(), r = in.readInt();
        int[][] z = in.readIntTable(p, 2);
        int[][] x = in.readIntTable(q, 2);
        Comparator<int[]> comp = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        };
        Arrays.sort(z, comp);
        Arrays.sort(x, comp);
        ArrayList<Integer> al = new ArrayList<>();

        int count = 0;
        for (int i = l; i <= r; i++) {
            if (check(z, x, i)) count++;
        }
        out.printLine(count);

    }

    private boolean check(int[][] z, int[][] x, int i) {
        for (int j = 0; j < x.length; j++) {
            int c = x[j][0] + i, d = x[j][1]+i;
            for (int k = 0; k < z.length; k++) {
                int a = z[k][0] , b= z[k][1];
                if(c <= b && a <= d) return true;
            }
        }
        return false;
    }

}
