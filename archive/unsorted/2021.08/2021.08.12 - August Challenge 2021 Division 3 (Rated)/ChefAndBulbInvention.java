package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ChefAndBulbInvention {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int p = in.readInt();
        int k = in.readInt();

        int v = (p % k) ;
        int extra = n % k;
        int m = n / k;
        long sum = (long) m * v;
        sum += Math.min(extra, p % k);

//
//
//        for (int i = 0; i < v; i++) {
//            sum += (n - i - 1) / k + 1;
//        }
        out.printLine(sum + p / k + 1);

    }
}
