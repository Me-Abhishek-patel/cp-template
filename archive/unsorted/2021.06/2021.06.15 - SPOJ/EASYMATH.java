package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class EASYMATH {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), m = in.readInt(), a = in.readInt(), d = in.readInt();
        long[] nums = new long[]{a, a + d, a + 2 * d, a + 3 * d, a + 4 * d};
        long subsets = (1 << 5) - 1;
        long ans = 0;
        ans = getAns(m, nums, subsets, ans);

        out.printLine((m-n+1)-ans);
    }

    private long getAns(long n, long[] nums, long subsets, long ans) {
        for (long i = 1; i <= subsets; i++) {
            long denominator = 1;
            long setBits = Long.bitCount(i);

            for (int j = 0; j < 5; j++) {
                if ((i & (1L << j)) != 0){
                    denominator = denominator* nums[j];
                }
            }
            if((setBits&1)==1)
                ans += n /denominator;
            else ans -= n /denominator;
        }
        return ans;
    }
}
