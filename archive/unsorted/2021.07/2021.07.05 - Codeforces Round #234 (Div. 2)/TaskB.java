package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.HashSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        char[][] rect = in.readTable(n, m);
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int g = 0, s = 0;
            for (int j = 0; j < m; j++) {
                if (rect[i][j] == 'G') g = j;
                if (rect[i][j] == 'S') s = j;
            }
            if (g < s)hs.add(s-g);
            else if(s<g){
                out.printLine("-1");
                return;
            }
        }
        out.printLine(hs.size());
    }

}
