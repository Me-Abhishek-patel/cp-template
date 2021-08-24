package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

public class TaskB {
    static int divCount(int n, boolean[] hash) {

        int total = 1;
        for (int p = 2; p <= n; p++) {
            if (hash[p]) {

                // calculate number of divisor
                // with formula total div =
                // (p1+1) * (p2+1) *.....* (pn+1)
                // where n = (a1^p1)*(a2^p2)....
                // *(an^pn) ai being prime divisor
                // for n and pi are their respective
                // power in factorization
                int count = 0;
                if (n % p == 0) {
                    while (n % p == 0) {
                        n = n / p;
                        count++;
                    }
                    total = total * (count + 1);
                }
            }
        }
        return total;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int max = 100 * 100 * 100;
        int mod = 1073741824;
        boolean[] hash = IntegerUtils.generatePrimalityTable(max);
        int[] divisors = new int[max + 1];
        int a = in.readInt(), b = in.readInt(), c = in.readInt();
        long sum = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    int n = i * j * k;
                    if (divisors[n] == 0) {
                        divisors[n] = divCount(n, hash);
                    }
                    sum = ((sum % mod) + (divisors[n]%mod))%mod;

                }
            }
        }
        out.printLine(sum);
    }
}
