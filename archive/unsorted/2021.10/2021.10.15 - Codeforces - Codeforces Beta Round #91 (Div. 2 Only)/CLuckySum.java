package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Deque;
import java.util.LinkedList;

public class CLuckySum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long l = in.readInt(), r = in.readInt();
        Deque<Long> q = new LinkedList<>(), q2 = new LinkedList<>();
        long p = 0L;
        q.add(p);


        while (q.peekLast() < r) {
            p = q.poll();
            q2.add(p * 10 + 4);
            q2.add(p * 10 + 7);
            q.add(p * 10 + 4);
            q.add(p * 10 + 7);

        }
        p = q.poll();
        q2.add(p * 10 + 4);
        q2.add(p * 10 + 7);
        while (q2.peekFirst() < l) q2.pollFirst();
        long sum = 0;
        while (true) {
            p = q2.pollFirst();
            long diff = Math.min(r, p) - l + 1;
//            out.printLine(diff*p);
            sum += diff * p;
            if (p >= r) break;
            l = p+1;


        }

        out.printLine(sum);

//        while (!q2.isEmpty()) out.printLine(q2.pollFirst());
    }

    private long next(long p) {
        return p % 10 == 4 ? (p / 10) * 10 + 7 : p * 10 + 4;
    }
}
