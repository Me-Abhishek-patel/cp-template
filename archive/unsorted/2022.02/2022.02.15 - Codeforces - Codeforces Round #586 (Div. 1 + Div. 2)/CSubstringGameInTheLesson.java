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

public class CSubstringGameInTheLesson {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        char min = 'z';
        for (int i = 0; i < s.length(); i++) {
            if (min < s.charAt(i)) {
                out.printLine("Ann");
            }else {
                min = s.charAt(i);
                out.printLine("Mike");
            }
        }

    }
}
