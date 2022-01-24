package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ASantaClausAndCandies {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int t=0;

        while(n>t){
            t++;
            n-=t;
        }
        out.printLine(t);

        for(int i=1 ; i<t; i++){
            out.printLine(i+" ");

        }
        out.printLine(n+t);
    }
}
