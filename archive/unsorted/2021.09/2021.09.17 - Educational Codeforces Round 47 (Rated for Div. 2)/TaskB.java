package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String arr = in.readLine();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder o = new StringBuilder();
        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == '1')  o.append('1');
            else sb.append(arr.charAt(i));
        }
        if(arr.contains("2")){
            sb.insert(sb.indexOf("2"),o);
        }else {
            sb.append(o);
        }
        out.printLine(sb);
    }
}
