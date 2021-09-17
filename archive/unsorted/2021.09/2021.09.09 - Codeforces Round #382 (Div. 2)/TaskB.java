package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), n1 = in.readInt(), n2 = in.readInt();
        int x1 = n1,x2= n2;
        int[] a = in.readIntArray(n);
        Arrays.sort(a);
        double sum1 = 0, sum2 = 0;
        double res = 0;
        if (n1 > n2) {
            for (int i = n - 1; i >= 0; i--) {
                if (n2 > 0) {
                    sum2 += a[i];
                    n2--;
                } else if (n1 > 0) {
                    sum1 += a[i];
                    n1--;
                }
            }
            res = sum2 / x2 + sum1 / x1;
        }else {
            for (int i = n - 1; i >= 0; i--) {
                if (n1 > 0) {
                    sum1 += a[i];
                    n1--;
                } else if (n2 > 0) {
                    sum2 += a[i];
                    n2--;
                }
            }
            res = sum2 / x2 + sum1 / x1;
        }

        out.printLine(res);

    }
}
