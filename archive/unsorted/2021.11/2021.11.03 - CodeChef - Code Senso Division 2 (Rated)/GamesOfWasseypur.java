package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class GamesOfWasseypur {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int z = 0, one = 0, count = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) count++;
        }
        count++;
        if (count == 1)
            out.printLine("SAHID");
        else if (count == 2)
            out.printLine("RAMADHIR");
        else {
            int nth = ((count - 2) / 3) + 1;
            int term = 2 + (nth - 1) * 3;
            if (term == count){
                out.printLine("RAMADHIR");
            }else {
                out.printLine("SAHID");
            }
        }
    }
}
