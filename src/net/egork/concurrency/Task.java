package net.egork.concurrency;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface Task {
    void read(InputReader in);

    void solve();

    void write(OutputWriter out, int testNumber);
}
