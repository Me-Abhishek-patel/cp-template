package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public static int A = 0, B = 0, C = 0;

    public static void check(String a) {
        if (a.charAt(1) == '>') {
            if (a.charAt(0) == 'A') {
                A++;
                A++;
            }
            if (a.charAt(0) == 'B') {
                B++;
                B++;
            }
            if (a.charAt(0) == 'C') {
                C++;
                C++;
            }
            if (a.charAt(2) == 'A') A++;
            if (a.charAt(2) == 'B') B++;
            if (a.charAt(2) == 'C') C++;

        } else {
            if (a.charAt(2) == 'A') {
                A++;
                A++;
            }
            if (a.charAt(2) == 'B') {
                B++;
                B++;
            }
            if (a.charAt(2) == 'C') {
                C++;
                C++;
            }
            if (a.charAt(1) == 'A') A++;
            if (a.charAt(1) == 'B') B++;
            if (a.charAt(1) == 'C') C++;
        }

    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {

        String a = in.readString(), b = in.readString(), c = in.readString();
        check(a);
        check(b);
        check(c);
        if (A == B || B == C || A == C) {
            out.printLine("Impossible");
            return;
        }
        int[] arr = new int[]{A, B, C};
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            switch (arr[i]){
                case A: out.print();
            }
        }

        out.printLine(A + " " + B + " " + C);
        out.printLine(A + " " + B + " " + C);
    }
    }
