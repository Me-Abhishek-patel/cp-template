package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CLittleGirlAndMaximumSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        int[] a = in.readIntArray(n);
        int[] freq = new int[n];
        int[][] queries = in.readIntTable(q, 2);
        for (int[] query : queries) {
            if (query[0] != 1)
                freq[query[0] - 2]--;
            freq[query[1] - 1]++;
        }
        for (int i = n - 1; i > 0; i--) {
            freq[i - 1] += freq[i];
        }
        Arrays.sort(a);
        PriorityQueue<IntIntPair> pq = new PriorityQueue<>(new Comparator<IntIntPair>() {
            @Override
            public int compare(IntIntPair o1, IntIntPair o2) {
                return o2.first - o1.first;
            }
        });
        int i = n - 1;
        for (int j = 0; j < n; j++) {
            pq.add(new IntIntPair(freq[j], j));
        }
        long[] arr = new long[n];
        while (!pq.isEmpty()) {
            IntIntPair pair = pq.poll();
//            out.printLine(pair.first+" "+ pair.second);
            arr[pair.second] = a[i--];
        }

//        System.out.println(Arrays.toString(freq));
//        System.out.println(Arrays.toString(arr));

        arr = ArrayUtils.prefixSumArray(arr);
//        System.out.println(Arrays.toString(arr));
        long sum = 0;
        for (int[] query : queries) {
            if (query[0] - 2 >= 0)
                sum += arr[query[1] - 1] - arr[query[0] - 2];
            else sum += arr[query[1] - 1];
        }
        out.printLine(sum);
    }
}
