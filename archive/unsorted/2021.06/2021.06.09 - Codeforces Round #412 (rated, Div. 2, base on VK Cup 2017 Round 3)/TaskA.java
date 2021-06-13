package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int a = in.readInt(), b = in.readInt();
        boolean inversion = false;
        if (a != b) {
            out.printLine("rated");
            return;
        }
        for (int i = 1; i < n; i++) {
            int a1 = in.readInt(), b1 = in.readInt();
            if(a1!=b1){
                out.printLine("rated");
                return;
            }
            if(a<a1) inversion = true;
            a = a1;
        }
        if(inversion) out.printLine("unrated");
        else out.printLine("maybe");
    }
}
