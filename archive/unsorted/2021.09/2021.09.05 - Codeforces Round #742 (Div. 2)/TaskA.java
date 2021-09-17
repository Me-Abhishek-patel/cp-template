package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') sb.append('D');
            else if (s.charAt(i) == 'D') sb.append('U');
            else {
                sb.append(s.charAt(i));
            }
        }
        out.printLine(sb);


    }
}
