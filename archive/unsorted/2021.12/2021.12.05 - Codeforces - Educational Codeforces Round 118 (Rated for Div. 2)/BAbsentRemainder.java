package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class BAbsentRemainder {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        HashSet<Integer> hs = new HashSet<>();
        for (int i : a) {
            hs.add(i);
        }
        Arrays.sort(a);
        ArrayList<IntIntPair> al = new ArrayList<>();
        for (int i = 0; i < n - 1 && al.size() < n / 2; i++) {
            for (int j = i + 1; j < n && al.size() < n / 2; j++) {
                if (!hs.contains(a[j] % a[i]) && a[j] != a[i]) {
                    al.add(IntIntPair.makePair(a[j], a[i]));
                }
            }
        }
        for (IntIntPair pair : al) {
            out.printLine(pair.first + " " + pair.second);
        }
    }
}
