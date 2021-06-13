package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int r1 = in.readInt(), r2 = in.readInt(), c1 = in.readInt(), c2 = in.readInt(), d1 = in.readInt(), d2 = in.readInt();
        int d=(c2+r2-d2)/2;
        int a=d1-d;
        int c=r2-d;
        int b=d2-c;

        if(a<1||a>9||b<1||b>9||c<1||c>9||d<1||d>9||a==b||a==c||a==d||b==c||b==d||c==d||a+b!=r1||c+d!=r2||a+c!=c1||b+d!=c2||a+d!=d1||b+c!=d2){
            out.printLine(-1);
        }
        
        else{
            out.printLine(a+" "+b);
            out.printLine(c+" "+d);
        }
    }
}
