package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ContainsItsAverage {
    public int[] missing(int[] seq) {
        long n = seq.length + 1;
        long sum = 0;
        for (int i : seq) sum += i;
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < seq.length; i++) {
            int x = (int) ((n * seq[i]) - sum);
            if(!hs.contains(x)){
                al.add(x);
                hs.add(x);
            }
        }
        if(sum%(n-1)==0){
            int x = (int) (sum / (n - 1));
            if (!hs.contains(x)) {
                al.add(x);
                hs.add(x);
            }
        }

        int[] res = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            res[i] = al.get(i);
        }
        Arrays.sort(res);

        return res;
    }
}
