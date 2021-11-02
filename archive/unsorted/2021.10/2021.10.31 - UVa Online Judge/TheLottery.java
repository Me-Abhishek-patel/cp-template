package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class TheLottery {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] primes = IntegerUtils.generatePrimes(10000001);
        try {
            while ((s = br.readLine()) != null) {
                String[] st = s.split(" ");
                long n = Long.parseLong(st[0]);
                int m = Integer.parseInt(st[1]);
                HashSet<Long> hs = new HashSet<>();
                long[] a = new long[m];
                st = br.readLine().split(" ");
                for (int i = 0; i < m; i++) {
                    a[i] = Long.parseLong(st[i]);
                }
                Arrays.sort(a);
                long count = 0;
                long lcm = a[0];
                int k = 0;
                for (long i = a[0]; i <= n; i++) {
                    if (i == a[k]) lcm = IntegerUtils.gcd(lcm, a[k++]);
                    if (i % lcm == 0) count++;
                }
//                for (long l : a) {
//                    hs.add(l);
//                    long t = l * l;
//                    while (t <= n) {
//                        hs.add(t);
//                        t += l;
//                    }
//                }
                out.printLine(n - count);

            }
        } catch (Exception ignored) {

        }
    }
}

