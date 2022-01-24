package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

public class CDesignTutorialLearnFromMath {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        boolean[] isPrime = IntegerUtils.generatePrimalityTable(n);
        int i = 4;
        while (true) {
            if (!isPrime[i] && !isPrime[n - i]) {
                out.printLine(i + " " + (n - i));
                return;
            }
            i++;
        }
    }
}
