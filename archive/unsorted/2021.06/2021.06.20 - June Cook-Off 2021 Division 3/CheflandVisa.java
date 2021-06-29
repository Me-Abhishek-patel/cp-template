package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class CheflandVisa {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x1 = in.readInt(), x2 = in.readInt(),
                y1 = in.readInt(), y2 = in.readInt(),
                z1 = in.readInt(), z2 = in.readInt();
        if(x1>x2){
            out.printLine("NO");
            return;
        }
        if(y1>y2){
            out.printLine("NO");
            return;
        }
        if(z2>z1){
            out.printLine("NO");
            return;
        }
        out.printLine("YES");
    }
}
