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

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CTheyAreEverywhere {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int min = check(s);
//        min = min(check((new StringBuilder(s)).reverse().toString()), min);
        out.printLine(min);
    }

    private int check(String s) {
        HashMap<Character, ArrayList<Integer>> hm = new HashMap<>();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                ArrayList<Integer> al = hm.get(s.charAt(i));
                al.add(i);
                hm.put(s.charAt(i),al);
            } else {
                j = i;
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                hm.put(s.charAt(i), al);
            }
        }
        int i = 0;
        while (i <= j) {
            char c = s.charAt(i);
            if (find(hm.get(c), i, j)) {
                i++;
            } else {
                return j - i + 1;
            }
        }
        return 1;
    }

    private boolean find(ArrayList<Integer> al, int i, int j) {
        int lo = 0, hi = al.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (al.get(mid) <= j && al.get(mid) > i) {
                return true;
            } else if (al.get(mid) > j) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }
}
