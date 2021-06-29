package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class SleepCycle {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int l = in.readInt(), h = in.readInt();
        String s = in.readString();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '0')count++;
            else if(c=='1' & count!=0) {
                if(count>h/2) {
                    h = 2 * (h - count);
                    if (h <= 0) {
                        out.printLine("YES");
                        return;
                    }
                }
                count = 0;
            }
        }
        h = 2*(h-count);
        if(h<=0){
            out.printLine("YES");
            return;
        }else {
            out.printLine("NO");
            return;
        }


    }
}
