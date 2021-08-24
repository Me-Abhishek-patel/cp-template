package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), a = in.readInt(), b = in.readInt();
        for (int i = 0; i < n; i++) {
            long x = in.readInt();
            double dollar = (long) Math.floor((x * a) / b);
            double token = (long) Math.ceil(dollar * b / a);
            out.print((int)(x - token)+" ");
        }
    }
}
