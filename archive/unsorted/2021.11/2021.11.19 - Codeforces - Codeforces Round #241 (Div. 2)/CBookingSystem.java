package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class CBookingSystem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[][] cp = new int[n][3];
        for (int i = 0; i < n; i++) {
            cp[i][0] = i;
            cp[i][1] = in.readInt();
            cp[i][2] = in.readInt();
        }
        Arrays.sort(cp, (x, y) -> y[2] - x[2]);
        int k = in.readInt();
        int[][] r = new int[k][3];
        for (int i = 0; i < k; i++) {
            r[i][0] = i;
            r[i][1] = in.readInt();
        }
        Arrays.sort(r, (x, y) -> x[1] - y[1]);
        long sum = 0, count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int wt = cp[i][1];
            int j = 0;
            while (j < k && (r[j][1] < wt || r[j][2] == 1)) j++;
            if (j != k) {
                r[j][2] = 1;
                count++;
                sum += (cp[i][2]);
                sb.append(cp[i][0] + 1).append(" ").append(r[j][0]+1).append("\n");
            }
        }
        out.printLine(count + " " + sum);
        out.print(sb);


    }
}
