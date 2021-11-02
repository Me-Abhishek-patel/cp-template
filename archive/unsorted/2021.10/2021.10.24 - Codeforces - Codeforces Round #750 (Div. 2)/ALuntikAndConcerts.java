package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ALuntikAndConcerts {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.readLong(), b = in.readLong(), c = (in.readLong() % 2);
        out.printLine((a+b*2+c*3)%2);

    }
}
