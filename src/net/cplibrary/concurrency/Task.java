package net.cplibrary.concurrency;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface Task {
    void read(InputReader in);

    void solve();

    void write(OutputWriter out, int testNumber);
}
