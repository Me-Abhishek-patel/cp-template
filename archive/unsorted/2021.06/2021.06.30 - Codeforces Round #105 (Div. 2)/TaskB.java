package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int vp = in.readInt(), vd = in.readInt(), t = in.readInt(), f = in.readInt(), c = in.readInt();
        int v = vd - vp;
        if (v <= 0){
            System.out.println(0);
        }else {
            double x = t * vp;
            int k = 0;
            while (x + x / v * vp < c) {
                k++;
                x += (x / v * 2 + f) * vp;
            }
            out.printLine(k);
        }

    }

}
