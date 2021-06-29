package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s  = in.readString();
        int i = 0;
        String res = "";
        while (n>0){
            if(n%2==0) res = s.charAt(i++)+res;
            else res += s.charAt(i++);
            n--;
        }
        out.printLine(res);
    }
}
