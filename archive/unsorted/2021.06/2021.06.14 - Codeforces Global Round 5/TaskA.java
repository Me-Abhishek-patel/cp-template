package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int flag = 1;
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            if(x % 2 == 0){
                out.printLine(x / 2);
            }else{
                out.printLine((x + flag) / 2);
                flag *= -1;
            }
        }
    }
}
