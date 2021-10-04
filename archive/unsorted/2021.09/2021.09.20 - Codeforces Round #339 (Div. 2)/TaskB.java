package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.string.StringUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String[] s = in.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String t = s[i];
            if (t.equals("0")) {
                out.printLine(0);
                return;
            }
            if (sb.length() == 0) {
                sb.append(s[i]);
                continue;
            }
            int c = StringUtils.count(t, '0');
            if (c == t.length() - 1) {
                if (t.charAt(0) == '1') {
                    sb.append(t.substring(1));
                } else {
                    if (sb.length() == 0) {
                        sb.append(s[i]);
                    } else {
                        for (int j = t.length() - 1; j >= 0; j--) {
                            if (t.charAt(j) != '0') {
                                if (j != t.length() - 1) {
                                    sb.append(t.substring(j + 1));
                                }
                                sb.replace(0, 1, t.substring(0, j + 1));
                                break;
                            }

                        }
                    }
                }
            } else {
                if (sb.length() == 0) {
                    sb.append(s[i]);
                } else {
                    for (int j = t.length() - 1; j >= 0; j--) {
                        if (t.charAt(j) != '0') {
                            if (j != t.length() - 1) {
                                sb.append(t.substring(j + 1));
                            }
                            sb.replace(0,   1, t.substring(0, j + 1));
                            break;
                        }

                    }
                }
            }


        }
        out.printLine(sb.toString());
    }
}
