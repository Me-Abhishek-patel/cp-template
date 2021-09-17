package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int l = in.readInt(), r = in.readInt();
        int num = r / 2 + 1;
        int res = num < l ? r % l :r%num;
        out.printLine(res);
    }
}
