package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        long sum = 0;
        int n = s.length() ;
        for (int i = s.length() - 4; i >= 0; i--) {
            if (s.substring(i, i + 4).equals("bear")) {

                sum += ((long) (n - (i + 3)) *(i+1));
                n = i + 3;
            }
        }
        out.printLine(sum);
    }

}
