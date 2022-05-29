package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class SadSplits {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        long input = in.readLong();

        if ((input % 10) % 2 == 0) {
            input /= 10;
            while (input > 0) {
                long tmp = input % 10;
                input /= 10;
                if (tmp % 2 == 0) {
                    out.printLine("YES");
                    return;
                }
            }
        }
        input /= 10;
        while (input > 0) {
            long tmp = input % 10;
            input /= 10;
            if (tmp % 2 != 0) {
                out.printLine("YES");
                return;
            }
        }
        out.printLine("NO");


    }
}