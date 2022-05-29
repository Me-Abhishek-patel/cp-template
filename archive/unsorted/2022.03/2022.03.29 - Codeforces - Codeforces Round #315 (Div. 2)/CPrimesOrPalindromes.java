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

import net.cplibrary.generated.collections.list.IntArrayList;
import net.cplibrary.generated.collections.list.IntList;
import net.cplibrary.generated.collections.list.LongArrayList;
import net.cplibrary.generated.collections.list.LongList;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CPrimesOrPalindromes {
    int maxn = 1179859;
    boolean[] primes, palindromes;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int p = in.readInt(), q = in.readInt();
        primes = generatePrimalityTable(maxn);
        int ans = 0, pal = 0, pr = 0;
        for (int i = 1; i < maxn; i++) {
            if (primes[i]) pr++;
            if (isPalindrome(String.valueOf(i))) pal++;
            if (pr*q <= pal * p ) ans = i;
        }

//        out.printLine(pr + " " + pal);

        if (ans == 0) {
            out.printLine("Palindromic tree is better than splay tree");
        } else
            out.printLine(ans);

    }


}
