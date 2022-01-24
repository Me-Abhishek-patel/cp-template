import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhishek Patel  ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        GraphColoring solver = new GraphColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class GraphColoring {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

    }

    static class InputReader {
        private final InputStream stream;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

    }
}

