package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class AlternatingWorkDays {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.readLong(), b = in.readLong(), p = in.readLong(), q = in.readLong();
        if (p % a != 0 || q % b != 0) {
            out.printLine("NO");
            return;
        }
        long r = p / a, s = q / b;
        if(Math.abs(r-s)<=1)out.printLine("YES");
        else out.printLine("NO");
    }
}
