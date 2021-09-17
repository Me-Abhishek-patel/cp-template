package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        double a = in.readInt(), x = in.readInt(), y = in.readInt();
        if (y <= 0) {
            out.printLine(-1);
            return;
        }
        double k = Math.ceil(y / a);
        if (k == y / a) {
            out.printLine(-1);
            return;
        }
        if (k != 1 && k % 2 != 0) {
            if (x <= -a || x >= a || x == 0) {
                out.printLine(-1);
                return;
            } else {
                if (x > 0) {
                    out.printLine((int)( k + (k - 1) / 2));
                    return;
                } else {
                    out.printLine((int)( (k + (k - 1) / 2) - 1));
                    return;
                }
            }
        } else {
            if (x<=-a/2 || x>=a/2){
                out.printLine(-1);
                return;
            }else {
                out.printLine((int) (k + (k - 1) / 2));
                return;
            }

        }


    }
}
