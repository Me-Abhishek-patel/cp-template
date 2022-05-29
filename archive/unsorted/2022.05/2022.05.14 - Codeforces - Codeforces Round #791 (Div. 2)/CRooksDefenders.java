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

public class CRooksDefenders {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        int[] rows = new int[n], col = new int[n];
        int[] trows = new int[n],tcol = new int[n];

        int[] rowfeed = new int[n], colfeed = new int[n], rowarr = new int[n], colarr = new int[n];
        Build(rows, n, rowarr, rowfeed);
        Build(col, n, colarr, colfeed);
        for (int i = 0; i < q; i++) {
            int t = in.readInt();
            if (t == 1) {
                int x = in.readInt() - 1, y = in.readInt() - 1;
                update(x, trows[x]+1, n, rowfeed, rowarr);
                update(y, tcol[y] + 1, n, colfeed, colarr);
                trows[x]++;
                tcol[y]++;

            } else if (t == 2) {
                int x = in.readInt() - 1, y = in.readInt() - 1;
                update(x, trows[x] - 1, n, rowfeed, rowarr);
                update(y, tcol[y] - 1, n, colfeed, colarr);
                trows[x]--;
                tcol[y]--;

            } else {
                int x1 = in.readInt() - 1, y1 = in.readInt() - 1, x2 = in.readInt() - 1, y2 = in.readInt() - 1;
                int q1 = query(x1, x2, n, colfeed, colarr);
                int q2 = query(y1, y2, n, rowfeed, rowarr);
//                out.printLine(q1+" "+q2);
//                out.printLine(trows);
//                out.printLine(tcol);
                if (q1 <= 0 && q2 <= 0) {
                    out.printLine("NO");
                } else {
                    out.printLine("NO");
                }
            }

        }
    }

    void update(int index, int val, int n, int feed[], int arr[]) {
        int blocksize = (int) ceil(sqrt(n));
        int feed_pointer = index / blocksize;
        feed[feed_pointer] = min(val, feed[feed_pointer]);
        arr[index] = val;
    }

    int query(int l, int r, int n, int feed[], int arr[]) {
        int min_in_range = Integer.MAX_VALUE;
        int blocksize = (int) ceil(sqrt(n));

        while (l < r && l % blocksize != 0 && l != 0) {
            // traversing first block in range
            if (arr[l] < min_in_range) {
                min_in_range = arr[l];
            }
            l++;
        }
        while (l + blocksize <= r) {
            // traversing completely overlapped blocks in range
            if (feed[l / blocksize] < min_in_range) {
                min_in_range = feed[l / blocksize];
            }
            l += blocksize;
        }
        while (l <= r) {
            // traversing last block in range
            if (arr[l] < min_in_range) {
                min_in_range = arr[l];
            }
            l++;
        }
        return min_in_range;
    }

    void Build(int input[], int n, int arr[], int feed[]) {
        int feed_pointer = -1;

// calculating size of block
        int blocksize = (int) ceil(sqrt(n));

// building the decomposed array
        for (int i = 0; i < n; i++) {
            arr[i] = input[i];
            if (i % blocksize == 0) {
                // entering next block
                // incementing block pointer
                feed_pointer++;
                feed[feed_pointer] = arr[i];
            }

            feed[feed_pointer] = min(feed[feed_pointer], arr[i]);

        }
    }

}
