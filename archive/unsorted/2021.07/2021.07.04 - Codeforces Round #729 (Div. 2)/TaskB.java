package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), a = in.readInt(), b = in.readInt();
        if(check(n,a,b))out.printLine("YES");
        else out.printLine("NO");
    }

    private boolean check(int n, int a, int b) {
        if(n==1) return true;
        if(n<1) return false;
        return(n%a==0 && check(n/a,a,b))||check(n-b,a,b);
    }

}
