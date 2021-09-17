package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        HashMap<String, String> hm = new HashMap<>();
        String[] arr = {"+", "-", "[", "]", "<", ">", ".", ","};
        hm.put(">", "1000");
        hm.put("<", "1001");
        hm.put("+", "1010");
        hm.put("-", "1011");
        hm.put(".", "1100");
        hm.put(",", "1101");
        hm.put("[", "1110");
        hm.put("]", "1111");
        String p = in.readLine();
        StringBuilder sb = new StringBuilder();
        int res = 0;
        int mod = 1000003;
        for (char c : p.toCharArray()) {
            int cod =  Integer.parseInt(hm.get(c + ""), 2);
            res <<= 4;
            res+=cod;
            res%=mod;
        }
//        int i = Integer.parseInt(sb.toString(), 2);

        out.printLine(res );


    }
}
