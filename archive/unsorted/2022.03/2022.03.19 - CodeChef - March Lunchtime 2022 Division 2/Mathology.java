package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;

public class Mathology {
    static int getAnswer(int[] arr, int n, int k) {
        Arrays.sort(arr);

        int high = arr[n-1];
        int[] divisors = new int[high + 1];

        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= Math.sqrt(arr[i]); j++) {

                if (arr[i] % j == 0) {
                    divisors[j]++;
                    if (j != arr[i] / j)
                        divisors[arr[i] / j]++;
                }
            }
        }


        for (int i = high; i >= 1; i--)
            if (divisors[i] >= k) return i;
        return 0;
    }

    public void solve(int testNumber, InputReader sc, OutputWriter out) {
        int n = sc.readInt(), q = sc.readInt();
        int array[] = sc.readIntArray(n);
        int[][] mat = new int[n + 1][n + 1];
        for (int[] ints : mat) {
            Arrays.fill(ints,-1);
        }
        while (q-- > 0) {
            int left = sc.readInt() - 1;
            int right = sc.readInt() - 1;
            long res = 1;

            if(mat[left][right]==-1) {
                int[] newA = new int[right - left + 1];
                for (int i = 0; i < right - left + 1; i++) {
                    newA[i] = array[i + left];
                }

                res = mat[left][right] = getAnswer(newA, right - left + 1, 2);
            }else res = mat[left][right];
            out.printLine(res);
        }
    }
}