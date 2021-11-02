package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

public class Mint {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), t = in.readInt();
        while (n != 0 || t != 0) {

            int[] a = in.readIntArray(n);
            StringBuilder sb = new StringBuilder();

            while (t-- > 0) {
                long max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                long x = in.readLong();
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        for (int k = j + 1; k < n; k++) {
                            for (int m = k + 1; m < n; m++) {
                                long l = IntegerUtils.lcm(a[i],
                                        IntegerUtils.lcm(a[j],
                                                IntegerUtils.lcm(a[k], a[m])));

                                max = Math.max(max, (long) (Math.floor((double) x / l) * l));
                                min = Math.min(min, (long) (Math.ceil((double) x / l) * l));

                            }
                        }
                    }
                }
                out.printLine(max + " " + min);

            }



            n = in.readInt();
            t = in.readInt();
        }
    }
}
