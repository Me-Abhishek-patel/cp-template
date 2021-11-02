package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TwinPrimes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isPrime = IntegerUtils.generatePrimalityTable(20000000);

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
}
