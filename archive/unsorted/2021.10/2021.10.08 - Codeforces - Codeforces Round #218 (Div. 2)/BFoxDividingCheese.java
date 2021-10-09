package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;

public class BFoxDividingCheese {
    HashMap<IntIntPair, Long> hm;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.readInt(), b = in.readInt();
        if (a == b) {
            out.printLine(0);
            return;
        }
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int x = factorize(a, al1);
        int y = factorize(b,al2);
        if(x!=y){
            out.printLine(-1);
            return;
        }
        int[] freq = new int[6];
        for (int i = 0; i < al2.size(); i++) {
            freq[al2.get(i)]++;
        }
        for (int i = 0; i < al1.size(); i++) {
            freq[al1.get(i)]--;
        }
        int ans = 0;
        for (int i = 0; i <freq.length; i++) {
            ans+=Math.abs(freq[i]);
        }
        out.printLine(ans);


    }

    private int factorize(int a, ArrayList<Integer> al1) {
        int i = 2;
        while (i < 6) {
            while (a % i == 0) {
                a /= i;
                al1.add(i);
            }
            i++;
        }
        return a;
    }
}
