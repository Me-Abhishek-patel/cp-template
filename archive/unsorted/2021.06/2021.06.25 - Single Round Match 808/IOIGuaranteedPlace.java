package codes;

import net.egork.generated.collections.pair.IntIntPair;

import java.util.Arrays;
import java.util.Comparator;

public class IOIGuaranteedPlace {
    public int[] solve(int N, int[] day1scores, int[] day2scores) {
        IntIntPair[] arr = new IntIntPair[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new IntIntPair(day1scores[i] + day2scores[i], i);
        }
        Arrays.sort(arr, new Comparator<IntIntPair>() {
            @Override
            public int compare(IntIntPair o1, IntIntPair o2) {
                return o1.first - o2.first;
            }
        });
        int[] G = new int[N];
        G[arr[0].second] = N--;
        for (int i = 1; i < arr.length; i++,N--) {
            if (arr[i].first == arr[i - 1].first)
                G[arr[i].second] = G[arr[i - 1].second];
            else G[arr[i].second] = N;
        }
        return G;
    }
}
