package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;
import net.egork.string.StringUtils;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        int c = StringUtils.count(s,'1');
        if(c>1){
            out.printLine((s.length()+1)/2);
        }else {
            out.printLine((s.length())/2);
        }

    }
}
