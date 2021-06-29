package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt(), t = in.readInt();
        Integer[] wasteCells = new Integer[k];
        for (int i = 0; i < k; i++) {
            wasteCells[i] = ((in.readInt() - 1) * m) + (in.readInt() - 1);
        }
        Arrays.sort(wasteCells);
        for (int l = 0; l < t; l++) {
            int cell = ((in.readInt() - 1) * m) + (in.readInt() - 1);
            int num = Arrays.binarySearch(wasteCells, cell);
            if (num >= 0) {
                out.printLine("Waste");
            } else {
                num = num == -1 ? 0 : Math.abs(num);
                cell -= num;
                cell++;
                switch (cell % 3) {
                    case 0:
                        out.printLine("Grapes");
                        break;
                    case 1:
                        out.printLine("Kiwis");
                        break;
                    case 2:
                        out.printLine("Carrots");
                        break;
                }
            }


        }
    }

}
