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

import net.cplibrary.collections.Pair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class BFacetookPriorityWall {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String me = in.readLine();
        int n = in.readInt();
        PriorityQueue<Pair<String, Integer>> pq = new PriorityQueue<>(new Comparator<Pair<String, Integer>>() {
            @Override
            public int compare(Pair<String, Integer> o1, Pair<String, Integer> o2) {
                if (o1.second != o2.second) {
                    return o2.second - o1.second;
                } else {
                    return o1.first.compareTo(o2.first);
                }
            }
        });
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
            int val = 0;
            String n1 = s[0], n2="";
            if (s[1].equals("posted")) {

                n2 = s[3].substring(0, s[3].length() - 2);
                if (n1.equals(me) || n2.equals(me))
                    val = 15;

            }
            if (s[1].equals("commented")) {

                 n2 = s[3].substring(0, s[3].length() - 2);
                if (n1.equals(me) || n2.equals(me))
                    val = 10;

            }
            if (s[1].equals("likes")) {
                n2 = s[2].substring(0, s[2].length() - 2);
                if (n1.equals(me) || n2.equals(me))
                    val = 5;
            }
            if (!n1.equals(me)) {
                hm.put(n1, hm.getOrDefault(n1, 0) + val);
            }
            if (!n2.equals(me)) {
                hm.put(n2, hm.getOrDefault(n2, 0) + val);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : hm.entrySet()) {
            pq.add(new Pair<>(stringIntegerEntry.getKey(),stringIntegerEntry.getValue()));
        }
        while (!pq.isEmpty()){
            out.printLine(pq.poll().first);
        }
    }
}
