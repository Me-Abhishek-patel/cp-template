package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class TaskB {


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        int dp[] = new int[n+1];
        out.printLine(go(arr, 0, new HashSet<Integer>(),dp));

    }

    private int go(int[] arr, int i, HashSet<Integer> integers,int[] dp) {
        if (i == arr.length) {
            return integers.size();
        }
        if(dp[i]!=0) return dp[i];
        HashSet<Integer> hs = new HashSet<>(integers);
        integers.add(arr[i]);
        hs.add(arr[i] + 1);
        return dp[i] =  Math.max(go(arr, i + 1, integers,dp), go(arr,i+1,hs,dp));

    }
}
