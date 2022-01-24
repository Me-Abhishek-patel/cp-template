package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SleepTechnique {
    class Interval {
        long l, r, joy;

        public Interval(long l, long r, long joy) {
            this.l = l;
            this.r = r;
            this.joy = joy;
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long a = in.readInt(), b = in.readInt();
        long[] l = new long[n + 2], r = new long[n + 2];
        for (int i = 1; i <= n; i++) {
            l[i] = in.readLong();
            r[i] = in.readLong();
        }
        Arrays.sort(l);
        Arrays.sort(r);
        long prev = 0, joy = 0;
        int i = 1, j = 1;
        PriorityQueue<Interval> pq = new PriorityQueue<>(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return (int) (o2.joy - o1.joy);
            }
        })
        while (i <= n && j <= n) {
            if (l[i] <= r[i]) {
                pq.add(new Interval(prev, l[i] - 1, joy));
                prev = l[i];
                joy++;
                i++;
            } else {
                pq.add(new Interval(prev, r[i], joy));
                prev = r[i] + 1;
                joy--;
                j++;
            }
        }


    }
}
