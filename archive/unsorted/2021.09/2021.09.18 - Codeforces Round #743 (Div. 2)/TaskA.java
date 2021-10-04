package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int res = s.charAt(n - 1)-'0';
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!='0'){
                res += s.charAt(i) - '0'+1;

            }
        }
        out.printLine(res);
    }
}
