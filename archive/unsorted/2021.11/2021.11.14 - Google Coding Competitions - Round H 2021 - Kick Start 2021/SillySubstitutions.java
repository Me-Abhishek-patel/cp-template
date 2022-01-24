package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class SillySubstitutions {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        boolean x = true;
        while (x) {
            x = false;
            if (s.contains("01")) {
                x = true;
                s = s.replaceAll("01", "2");
            }
            if (s.contains("12")) {
                x = true;
                s = s.replaceAll("12", "3");
            }
            if (s.contains("23")) {
                x = true;
                s = s.replaceAll("23", "4");
            }
            if (s.contains("34")) {
                x = true;
                s = s.replaceAll("34", "5");
            }
            if (s.contains("45")) {
                x = true;
                s = s.replaceAll("45", "6");
            }
            if (s.contains("56")) {
                x = true;
                s = s.replaceAll("56", "7");
            }
            if (s.contains("67")) {
                x = true;
                s = s.replaceAll("67", "8");
            }
            if (s.contains("78")) {
                x = true;
                s = s.replaceAll("78", "9");
            }
            if (s.contains("89")) {
                x = true;
                s = s.replaceAll("89", "0");
            }
            if (s.contains("90")) {
                x = true;
                s = s.replaceAll("90", "1");
            }
        }
        out.printLine("Case #" + testNumber + ": " + s);

    }
}
