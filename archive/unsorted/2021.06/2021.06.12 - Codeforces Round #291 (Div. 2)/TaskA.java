package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        StringBuilder sb = new StringBuilder();
        if (s.charAt(0) > '4' && s.charAt(0)!='9' ) sb.append((char) ('9'-s.charAt(0)+'0'));
        else sb.append((char) (s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)>'4')sb.append((char) ('9'-s.charAt(i)+'0'));
            else sb.append((char) (s.charAt(i)));
        }
        out.printLine(sb);
    }
}
