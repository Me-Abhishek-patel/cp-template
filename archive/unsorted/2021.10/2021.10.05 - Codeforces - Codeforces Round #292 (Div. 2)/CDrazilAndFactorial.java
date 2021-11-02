package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class CDrazilAndFactorial {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        String array[] = {"", "", "2", "3", "322", "5", "53", "7", "7222", "7332"};
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            ans.append(array[s.charAt(i) - '0']);
        }
        char[] a = ans.toString().toCharArray();
        Arrays.sort(a);
        out.printLine(new StringBuilder(String.valueOf(a)).reverse().toString());

    }
}
