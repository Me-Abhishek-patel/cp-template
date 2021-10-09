package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class BDuffInLove {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        if (n <= 3) {
            out.printLine(n);
            return;
        }
        ArrayList<Integer> primes = sieve((int) Math.sqrt(n) + 2);
        int i = 0;
        long k = primes.get(i);
        long res = 1;
        while (k*k <=n) {
           boolean x = true;
            while (n % k == 0) {
                if(x){
                    res *= k;
                    x = false;
                }
                n =n/ k;
            }
            i++;
            if (i == primes.size() ) break;
            k = primes.get(i);
        }
//        out.printLine(primes.toString());
        if (n != 1) res *= n;
        out.printLine(res);

    }

    private ArrayList<Integer> sieve(int n) {
        boolean[] s = new boolean[n+5];
        Arrays.fill(s, true);
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 2; i  <= n; i++) {
            if (s[i]) {
                al.add(i);
                for (long j = (long) i * i; j <= n; j += i) {
                    s[(int) j] = false;
                }
            }
        }
        return al;
    }

}
