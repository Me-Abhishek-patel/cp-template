package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Stack;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (st.isEmpty()) st.push(c);
            else if (st.peek() != c) {
                st.pop();
            } else st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        out.printLine(sb.reverse().toString());

    }
}
