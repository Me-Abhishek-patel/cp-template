package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CLuckyPermutationTriple {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if(n%2==0){
            out.printLine(-1);
            return;
        }
        for (int i = 0; i < n; i++) {
            out.print(i+" ");
        }
        out.printLine();
        for (int i = 0; i < n; i++) {
            out.print(i+" ");
        }
        out.printLine();
        for (int i = 0; i < n; i++) {
            out.print((i+i)%n+" ");
        }
        out.printLine();
    }
}
