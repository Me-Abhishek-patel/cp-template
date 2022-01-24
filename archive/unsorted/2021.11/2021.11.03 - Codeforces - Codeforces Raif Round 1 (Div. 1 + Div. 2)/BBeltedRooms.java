package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BBeltedRooms {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        boolean x = s.contains("<"), y = s.contains(">");

        if (x & y) {
            int ans = 0;
            s+=s.charAt(0);
            for (int i = 0; i < n ; i++) {
                if(s.charAt(i)=='-'|| s.charAt(i+1)=='-')ans++;
            }
            out.printLine(ans);
        } else out.printLine(n);
    }
}
