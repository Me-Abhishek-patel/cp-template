import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
        BDuffInLove solver = new BDuffInLove();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDuffInLove {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.readLong();
            if (n <= 3) {
                out.printLine(n);
                return;
            }
            ArrayList<Integer> primes = sieve((int) Math.sqrt(n) + 2);
            int i = 0;
            long k = primes.get(i);
            long res = 1;
            while (k * k <= n) {
                boolean x = true;
                while (n % k == 0) {
                    if (x) {
                        res *= k;
                        x = false;
                    }
                    n = n / k;
                }
                i++;
                if (i == primes.size()) break;
                k = primes.get(i);
            }
//        out.printLine(primes.toString());
            if (n != 1) res *= n;
            out.printLine(res);

        }

        private ArrayList<Integer> sieve(int n) {
            boolean[] s = new boolean[n + 5];
            Arrays.fill(s, true);
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (s[i]) {
                    al.add(i);
                    for (long j = (long) i * i; j <= n; j += i) {
                        s[(int) j] = false;
                    }
                }
            }
            return al;
        }

    }

    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public interface SpaceCharFilter {
            boolean isSpaceChar(int ch);

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

        public void printLine(long i) {
            writer.println(i);
        }

    }
}

