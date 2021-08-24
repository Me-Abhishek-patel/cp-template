package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String str = in.readString();
        int f = 0,i = 0,a = 0;
        for (char c  : str.toCharArray()) {
            int i1 = c == 'A' ? a++ : (c == 'F' ? f++ : i++);
        }
        if(i!=0)out.printLine(i);
        else out.printLine(a);

    }
}
