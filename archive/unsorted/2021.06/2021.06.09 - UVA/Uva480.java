package codes;

import net.egork.io.OutputWriter;

import java.io.BufferedReader;
import java.io.IOException;

public class Uva480 {
    public void solve(int testNumber, BufferedReader in, OutputWriter out) {
        String k = null;
        while (true) {
            try {
                if ((k = in.readLine()) == null) break;
            } catch (IOException e) {
               break;
            }
            String [] str = k.split(" ");
            int step = Integer.parseInt(str[0]), mod = Integer.parseInt(str[1]);
            boolean[] taken = new boolean[mod];
            int cur = 0, cnt = 0;
            while (true) {
                if (taken[cur]) break;
                taken[cur] = true;
                cnt++;
                cur += step;
                cur %= mod;
            }
            String s = (cnt == mod) ? "Good Choice" : "Bad Choice";
            out.printFormat("%10d%10d    %s%n", step, mod, s);
            out.printLine();
        }
    }
}
