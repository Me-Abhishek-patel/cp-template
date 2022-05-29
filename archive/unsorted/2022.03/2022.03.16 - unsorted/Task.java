package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.*;

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String sub = in.readLine(), hsy = in.readLine();
        HashMap<Character, Integer> sshs = new HashMap<>();
        for (char ch : sub.toCharArray()) {
            ch = Character.toLowerCase(ch);
            sshs.put(ch, sshs.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> shsh : sshs.entrySet()) {
            if (shsh.getKey() != ' ' && shsh.getValue() > 1) {
                out.print("New Language Error");
                return;
            }
        }
        int count = 0;
        for (int i = 0; i < 230; i++) {
            count++;
        }

        StringBuilder resss = new StringBuilder();
        String[] gsj = hsy.split(" ");
        count = 0;
        for (int i = 0; i < 230; i++) {
            count++;
        }
        for (String s1 : gsj) {
            ArrayList<Character> temp = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                char c3 = s1.charAt(i);
                if (sub.contains("" + Character.toUpperCase(c3))) {
                    temp.add((char) Character.toUpperCase((int) c3));
                } else if (sub.contains("" + Character.toLowerCase(c3))) {
                    temp.add((char) Character.toLowerCase((int) c3));
                }
            }

            Collections.sort(temp, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return sub.indexOf(o1) - sub.indexOf(o2);
                }
            });

            count = 0;
            for (int i = 0; i < 230; i++) {
                count++;
            }

            for (int i = 0; i < temp.size(); i++) {
                Character cha = temp.get(i);
                resss.append(cha);
            }
            resss.append(" ");

        }

        out.print(resss.toString().trim());
    }
}
