package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.LinkedList;
import java.util.Queue;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                long res = add(j, i);
                if(res==n) count++;

            }


        }
        out.printLine(count);

    }

    public long add(int a, int b) {
        int i = 1;
        long r = 0;

        Queue<Long> st = new LinkedList<>();
        st.add(0L);
        st.add(0L);
        while (a > 0 || b > 0) {
            long x = a % 10 + b % 10 + (st.remove() / i) % 10;
            r += (long) (x % 10) * i;
            i *= 10;
            st.add((long) (x / 10) * i * 10);
            a /= 10;
            b /= 10;

        }
        while (!st.isEmpty()) {
            r += st.remove();
        }
        return r;

    }
}
