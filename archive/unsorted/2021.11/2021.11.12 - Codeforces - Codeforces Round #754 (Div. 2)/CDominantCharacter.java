package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CDominantCharacter {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();

        if (s.contains("aa")) {
            out.printLine(2);
        } else if (s.contains("aba") || s.contains("aca")) {
            out.printLine(3);
        } else if (s.contains("abca") || s.contains("acba")) {
            out.printLine(4);
        } else if (s.contains("abbacca") || s.contains("accabba")) {
            out.printLine(7);
        } else out.printLine(-1);

    }
}
