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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Task4 {
    ArrayList<String> al;
    int n;
    String[] a;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        n = in.readInt();
        al = new ArrayList<>();

        String s = in.readLine();
        String t = in.readLine();
        a = t.split(",");
        go(0, "");

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).length() > 0)
                al.set(i, al.get(i).substring(1));
        }
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int d = t.indexOf(o1) - t.indexOf(o2);
                if (d != 0) return d;
                return o1.length() - o2.length();
            }
        });
        for (String s1 : al) {
            out.printLine(s1);
        }

    }

    private void go(int i, String s) {
        if (i >= n) {
            if (s.length() > 0)
                al.add(s);
            return;
        }
        go(i + 1, s);
        go(i + 1, s + "," + a[i]);
    }
}
