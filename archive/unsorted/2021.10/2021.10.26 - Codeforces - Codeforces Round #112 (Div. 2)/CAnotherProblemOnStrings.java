package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import static net.cplibrary.numbers.IntegerUtils.isPrime;

public class CAnotherProblemOnStrings {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.readInt();
        String s = in.readLine();
        int[] sum = new int[s.length()];
        int len = s.length();
        int c = 0;

        for (int i = 0; i < len; i++) {
            sum[i] = s.charAt(i) == '1' ? ++c : c;
        }
        long res = 0;
        for (int i = 0; i < len; i++) {
            int pos1, pos2;

            int key = i == 0 ? k : sum[i - 1] + k;
            pos1 = ArrayUtils.lowerBound(sum, key, i, sum.length);

            pos2 = ArrayUtils.upperBound(sum, key, i, sum.length);
            res = res + (pos2 - pos1);

        }
        out.printLine(res);
    }

}
