package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Stack;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Stack<Character> st = new Stack<>();
        String s = in.readString();
        int count = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            if(c=='(')st.push('(');
            else {
                if(!st.isEmpty() && st.peek()=='(') {
                    st.pop();
                    count+=2;
                }
                else {
                    count =0;
                    st.push(')');
                }

            }
            res = Math.max(count,res);

        }
        out.printLine(s.length()-st.size());

    }
}
