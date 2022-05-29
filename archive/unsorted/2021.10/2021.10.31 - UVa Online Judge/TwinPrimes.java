package codes;


import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TwinPrimes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isPrime = generatePrimalityTable(20000000);

        ArrayList<IntIntPair> twin = new ArrayList<>();
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i - 2] && isPrime[i]) {
                twin.add(IntIntPair.makePair(i - 2, i));
            }
        }
        try {
            while ((s = br.readLine()) != null) {
                int pos = Integer.parseInt(s);
                out.printLine("(" + twin.get(pos - 1).first + ", " + twin.get(pos - 1).second + ")");
            }
        } catch (Exception ignored) {

        }
    }

    public static boolean[] generatePrimalityTable(int upTo) {
        boolean[] isPrime = new boolean[upTo];
        if (upTo < 2) {
            return isPrime;
        }
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i < upTo; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < upTo; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
