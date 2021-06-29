package codes;

import net.egork.datetime.Date;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class Uva12148 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n;
        while ((n=in.readInt())!=0) {

            int[] s = in.readIntArray(4);

            long sum = 0;
            int count = 0;
            for (int i = 1; i < n; i++) {
                int[] t = in.readIntArray(4);
                Date d = new Date((s[2]), (s[1]), (s[0]));
                Date dt = new Date((t[2]), (t[1]), (t[0]));
                if(d.next().compareTo(dt)==0) {
                    count++;
                    sum += ((t[3]) - (s[3]));
                }
                s = t;
            }
            out.printLine(count+" "+sum);


        }
    }
}
