package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AAlexAndARhombus {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        out.printLine(2 *(n*n-n)+1);
    }
}
