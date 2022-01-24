package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class ALinearKeyboard {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), i);
        }
        String t = in.readLine();
        int res = 0;
        for (int i = 1; i < t.length(); i++) {
            res+= Math.abs(hm.get(t.charAt(i))-hm.get(t.charAt(i-1)));
        }
        out.printLine(res);
    }
}
