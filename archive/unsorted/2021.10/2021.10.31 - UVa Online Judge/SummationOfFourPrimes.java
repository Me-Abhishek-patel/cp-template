package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SummationOfFourPrimes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] primes = IntegerUtils.generatePrimes(10000001);


        try {
            while ((s = br.readLine()) != null) {
                int n = Integer.parseInt(s);
                if (n < 8) out.printLine("Impossible.");
                else {
                    if (n % 2 == 0) {
                        out.print("2 2 ");
                        n-=4;
                    }else {
                        out.print("2 3 ");
                        n-=5;
                    }
                    int i = 0, j = primes.length - 1;
                    while (primes[i] + primes[j] != n) {
                        if (primes[i] + primes[j] < n) i++;
                        else j--;
                    }
                    out.printLine(primes[i] + " " + primes[j]);
                }
            }
        } catch (Exception ignored) {

        }
    }
}
