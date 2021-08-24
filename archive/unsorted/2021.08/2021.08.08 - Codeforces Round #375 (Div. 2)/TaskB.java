package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int maxLen = 0, count = 0, curLen = 0;
        boolean isInside = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                curLen++;
            } else {
                if (!isInside) maxLen = Math.max(maxLen, curLen);
                else {
                    if(curLen>0)
                    count++;
                }
                if (s.charAt(i) == '(') {
                    isInside = true;
                } else if (s.charAt(i) == ')') {
                    isInside = false;
                }
                curLen = 0;
            }
        }
        maxLen = Math.max(maxLen,curLen);
        out.printLine(maxLen+" "+count);

    }
}
