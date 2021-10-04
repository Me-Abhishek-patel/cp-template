package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    int k = 0;
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        k = n;
        generate("",0,0,n,out);

    }

    private void generate(String str, int open, int close, int n, OutputWriter out) {
        if(str.length()==2*n){
            if(k>0){
                out.printLine(str);
                k--;
            }
            return;
        }
        if(k>0) {
            if (open < n) {
                generate(str + "(", open + 1, close, n, out);
            }
            if (close < open) {
                generate(str + ")", open, close + 1, n, out);
            }
        }
    }
}
