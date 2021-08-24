package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int first = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '?') {
                first = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = first - 1; i >= 0; i--) {
            if ((first - i) % 2 == 0) {
                sb.append(s.charAt(first) == 'R' ? 'R' : 'B');
            } else sb.append(s.charAt(first) == 'R' ? 'B' : 'R');
        }
        String init = sb.reverse().toString();
//        sb = new StringBuilder();
//        for (int i = last + 1; i < n; i++) {
//            if (( i-last) % 2 == 0) {
//                sb.append(s.charAt(last) == 'R' ? 'R' : 'B');
//            } else sb.append(s.charAt(last) == 'R' ? 'B' : 'R');
//        }

        sb = new StringBuilder();
        int p = first;
        for (int i = first; i < n; i++) {
            if (s.charAt(i) != '?') {
                sb.append(s.charAt(i));
                p = i;
            } else {
                if ((i - p) % 2 == 0) {
                    sb.append(s.charAt(p) == 'R' ? 'R' : 'B');
                } else sb.append(s.charAt(p) == 'R' ? 'B' : 'R');
            }
        }
        System.out.println(init + sb.toString());


    }
}
