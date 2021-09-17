package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int size = 0, sub = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
            if (s[0].charAt(0) == '+')
                hs.add(Integer.parseInt(s[1]));
            else if (s[0].charAt(0) == '-') {
                int k = Integer.parseInt(s[1]);
                if (hs.contains(k))
                    hs.remove(k);
                else size++;
            }
            size = Math.max(size, hs.size());
        }
        out.printLine(size+sub);
    }
}
