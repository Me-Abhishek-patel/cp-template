package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CVasyaAndPetyasGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        boolean[] isprime = generatePrimalityTable(n + 1);

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isprime[i]) {
                for (int j = i; j <= n; j *= i) {
                    sb.append(j).append(" ");
                    count++;
                }
            }

        }
        out.printLine(count);
        out.printLine(sb);
    }
}
