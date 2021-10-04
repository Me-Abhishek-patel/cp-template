package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine(), t = in.readLine();
        int count = 0;
        for (int i = 0; i + t.length() <= s.length(); i++) {
            String k = s.substring(i,i+t.length());
            if(k.equals(t)){
                count++;
                i+=t.length()-1;
            }
        }
        out.printLine(count);
    }
}
