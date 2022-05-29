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

import java.util.Arrays;
import java.util.HashSet;

public class ClosestVowels {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Character[] vowels = {'c', 'g', 'l', 'r'};

        int n = in.readInt();
        long count = 1;
        HashSet<Character> vowel = new HashSet<>(Arrays.asList(vowels));
        String s = in.readLine();
        for (char c : s.toCharArray()) {
            if (vowel.contains(c)) {
                count = (count % MOD7 * 2 % MOD7) % MOD7;
            }
        }
        out.printLine(count);
    }
}
