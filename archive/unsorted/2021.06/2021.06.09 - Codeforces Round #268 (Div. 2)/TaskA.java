package codes;




import net.egork.geometry.Point;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int p = in.readInt();
        boolean[] arr = new boolean[n+1];
        for (int i = 0; i < p; i++) {
            arr[in.readInt()] = true;
        }
        int q = in.readInt();
        for (int i = 0; i < q; i++) {
            arr[in.readInt()] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if(!arr[i]) arr[0] = true;
        }
        if(arr[0]) out.printLine("Oh, my keyboard!");
        else out.printLine("I become the guy.");
        Point a = new Point(1,2),b = new Point(3,4);

    }
}
