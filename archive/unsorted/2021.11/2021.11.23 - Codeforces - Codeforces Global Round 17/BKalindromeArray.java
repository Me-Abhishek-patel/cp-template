package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BKalindromeArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int i = 0, j = n - 1;
        int removed = -1;
        while (i < j) {
            if (a[i] == a[j]) {
                i++;
                j--;
            } else {
                int t = i;
                if (checkPal(a, i, j, a[i]) ||checkPal(a,i,j,a[j])) {
                    out.printLine("YES");
                    return;
                }else {
                    out.printLine("NO");
                    return;
                }
            }
        }
        out.printLine("YES");

    }

    private boolean checkPal(int[] a, int i, int j, int r) {
        while (i < j) {
            if (a[i] == r) {
                i++;
            } else if (a[j] == r) {
                j--;
            } else if (a[i] == a[j]) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }
}
