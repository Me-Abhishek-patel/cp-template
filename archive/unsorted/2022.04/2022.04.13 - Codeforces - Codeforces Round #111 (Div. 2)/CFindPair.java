package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.generated.collections.pair.LongLongPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.*;

public class CFindPair {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long k = in.readLong();
        long[] a = in.readLongArray(n);
        long sum = 0;
        HashMap<Long, Long> hm = new HashMap<>();
        for (long i : a) {
            hm.put(i, hm.getOrDefault(i, 0L) + 1);
        }
        ArrayList<LongLongPair> al = new ArrayList<>();
        for (Map.Entry<Long, Long> entry : hm.entrySet()) {
            al.add(new LongLongPair(entry.getKey(), entry.getValue()));
        }
        al.sort(new Comparator<LongLongPair>() {
            @Override
            public int compare(LongLongPair o1, LongLongPair o2) {
                int value = Long.compare(o1.first, o2.first);
                if (value != 0) {
                    return value;
                }
                return Long.compare(o1.second, o2.second);
            }
        });
        for (int i = 0; i < al.size(); i++) {
            long t = al.get(i).second * n;
            if (sum + t < k) {
                sum += t;
            } else {
                for (int j = 0; j < al.size(); j++) {
                    long tp = al.get(j).second * al.get(i).second;
                    if (sum + tp < k) {
                        sum += tp;
                    } else {
                        out.printLine(al.get(i).first + " " + al.get(j).first);
                        return;
                    }
                }
            }
        }

    }
}
