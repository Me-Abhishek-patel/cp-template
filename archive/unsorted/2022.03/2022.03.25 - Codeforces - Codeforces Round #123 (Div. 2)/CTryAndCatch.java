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

public class CTryAndCatch {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        ArrayList<String> s = new ArrayList<>();
        in.readLine(false);
        for (int i = 0; i < n; i++) {
            String str = in.readLine(false);
            if (!str.isEmpty())
                s.add(str);
        }
        boolean flag = false;
        int before = 0, after = 0;
        String exception = "";

//        for (String s1 : s) {
//            out.printLine(s1);
//        }

        for (int i = 0; i < s.size(); i++) {
            String str = s.get(i);
            if (str.contains("catch")) {
                if (after > 0) {
                    after--;
                } else {
                    String ce = str.substring(str.indexOf('(') + 1, str.indexOf(',')).trim();

                    if (exception.equals(ce)) {
                        out.printLine(str.substring(str.indexOf('"') + 1, str.lastIndexOf('"')).trim());
                        return;
                    }
                    before--;
                }
            } else if (str.contains("throw")) {
                flag = true;
                exception = str.substring(str.indexOf('(') + 1, str.indexOf(')')).trim();
            } else if (str.contains("try")) {
                if (flag) after++;
                else before++;
            }
        }

        out.printLine("Unhandled Exception");

    }
}
