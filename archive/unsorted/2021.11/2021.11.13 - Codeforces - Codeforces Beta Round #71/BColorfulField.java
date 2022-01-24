package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class BColorfulField {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt(), t = in.readInt();
        Integer[] wasteCells = new Integer[k];
        for (int i = 0; i < k; i++) {
            wasteCells[i] = ((in.readInt() - 1) * m) + in.readInt();
        }
        Arrays.sort(wasteCells);
        for (int l = 0; l < t; l++) {
            int cell = ((in.readInt() - 1) * m) + in.readInt();
            int num = Arrays.binarySearch(wasteCells, cell);
//            int num = 0;
//            while (num < k && wasteCells[num] < cell) num++;
//            if (wasteCells[num] ==cell) {
            if(num>=0){
                out.printLine("Waste");
            } else {
                int ans = cell - Math.abs(num)+1;

                switch (ans % 3) {
                    case 0:
                        out.printLine("Grapes");
                        break;
                    case 1:
                        out.printLine("Carrots");
                        break;
                    case 2:
                        out.printLine("Kiwis");
                        break;
                }
            }


        }
    }
}
