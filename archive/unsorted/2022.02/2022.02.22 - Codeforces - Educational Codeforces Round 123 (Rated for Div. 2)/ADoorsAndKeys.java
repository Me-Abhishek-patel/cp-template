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

import java.util.HashSet;

public class ADoorsAndKeys {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        boolean rk = false, bk = false, gk = false;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                hs.add(c);
            }else {
                if(!hs.contains(Character.toLowerCase(c))){
                    out.printLine("NO");
                    return;
                }
            }
        }
        out.printLine("YES");
    }
}
