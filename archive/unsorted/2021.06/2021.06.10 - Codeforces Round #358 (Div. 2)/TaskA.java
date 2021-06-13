package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.HashSet;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
       int n = in.readInt(),m=in.readInt();
       int count = 0;
       HashSet<Integer> hs = new HashSet<>();
       for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = i+j;
                if(!hs.contains(x))
                    if((x)%5==0) {
                        count++;
                        hs.add(i)
                    }
            }
        }
        out.printLine(count);
    }
}
