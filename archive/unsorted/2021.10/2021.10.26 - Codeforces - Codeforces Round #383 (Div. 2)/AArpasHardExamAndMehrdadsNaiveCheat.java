package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AArpasHardExamAndMehrdadsNaiveCheat {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n  = in.readInt();
        if(n==0){
            out.printLine(1);
            return;
        }
        n%=4;
        int x = 0;
        if(n==1) x =8;
        else if(n==2) x = 4;
        else if(n==3) x = 2;
        else x = 6;
        out.printLine(x);
    }
}
