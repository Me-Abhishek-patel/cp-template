package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String[] a = new String[n];
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.next();
            b[i] = in.next();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(b[j])) {
                    b[j] = b[i];
                    a[i] = "";
                    n--;
                    break;
                }

            }
        }
        out.printLine(n);
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(""))
                out.printLine(a[i] + " " + b[i]);
        }


    }


}
