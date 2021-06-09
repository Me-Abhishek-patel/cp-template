package codes;

import net.egork.generated.collections.pair.LongLongPair;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BuyMasks {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long n = in.nextInt(), x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
        LongLongPair[] pack = new LongLongPair[3];
        pack[0] = new LongLongPair(10, x);
        pack[1] = new LongLongPair(5, y);
        pack[2] = new LongLongPair(1, z);
        Arrays.sort(pack, new Comparator<LongLongPair>() {
            @Override
            public int compare(LongLongPair o1, LongLongPair o2) {
                return (o1.second / o1.first) > (o2.second / o2.first) ? (o1.second / o1.first) == (o2.second / o2.first) ? o1.compareTo(o2) : 1 : -1;
            }
        });
        long sum = (n/pack[0].first)*pack[0].second;
        n%=pack[0].first;
        sum += (n/pack[1].first)*pack[1].second;
        n%=pack[1].first;
        sum += (n/pack[2].first)*pack[2].second;
        n%=pack[2].first;
        out.println(sum);

    }
}
