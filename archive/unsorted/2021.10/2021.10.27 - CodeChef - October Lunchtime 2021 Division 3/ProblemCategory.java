package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ProblemCategory {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if(n<100){
            out.printLine("Easy");
        }else if(n<200){
            out.printLine("Medium");
        }else out.printLine("Hard");
    }
}
