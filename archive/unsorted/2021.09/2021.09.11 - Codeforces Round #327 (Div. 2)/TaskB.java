package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        String s = in.readLine();
        int[] ch = new int[26];
        for (int i = 0; i < 26; i++) {
            ch[i] = i+'a';
        }
        for (int i = 0; i < m; i++) {
            char x = in.readCharacter(), y = in.readCharacter();
            for (int j = 0; j < 26; j++) {
                if(ch[j]==x)ch[j] = y;
                else if(ch[j]==y) ch[j] = x;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append((char) ch[c-'a']);
        }

        out.printLine(sb);
    }
}
