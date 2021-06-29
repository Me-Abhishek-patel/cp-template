package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readString();
        if(!s.contains("R"))out.printLine((s.indexOf("L")+1)+" "+(s.indexOf("L")));
        else if(!s.contains("L"))out.printLine((s.indexOf("R")+1)+" "+(s.lastIndexOf("R")+2));
        else {
            out.printLine((s.indexOf("R")+1)+" "+(s.lastIndexOf("R")+1));

        }
    }
}
