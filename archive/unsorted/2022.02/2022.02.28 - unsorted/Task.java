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

import net.cplibrary.collections.Pair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.*;

class Contributer {
    public String name;
    public int skillcount;
    public HashMap<String, Integer> skills;

    public Contributer(String name, int skillcount) {
        this.name = name;
        this.skillcount = skillcount;
        skills = new HashMap<>();
    }
}

class Project {
    public String name;
    public int d, s, b, r;
    public ArrayList<Pair<String, Integer>> skills;

    public Project(String name, int d, int s, int b, int r) {
        this.name = name;
        this.d = d;
        this.s = s;
        this.b = b;
        this.r = r;
        skills = new ArrayList<>();
    }
}

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int c = in.readInt(), p = in.readInt();
        ArrayList<Contributer> contributers = new ArrayList<>();
        ArrayList<Project> projects = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            String[] s = in.readLine().split(" ");
            contributers.add(new Contributer(s[0], Integer.parseInt(s[1])));
            for (int j = 0; j < contributers.get(i).skillcount; j++) {
                s = in.readLine().split(" ");
                contributers.get(i).skills.put(s[0], Integer.parseInt(s[1]));
            }
        }
        for (int i = 0; i < p; i++) {
            String[] s = in.readLine().split(" ");
            projects.add(new Project(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]), Integer.parseInt(s[4])));
            for (int j = 0; j < projects.get(i).r; j++) {
                s = in.readLine().split(" ");
                projects.get(i).skills.add(Pair.makePair(s[0], Integer.parseInt(s[1])));
            }
        }
        Collections.sort(projects, (x, y) -> x.s - y.s);
        Project pro = projects.get(p - 1);
        ArrayList<Contributer> al;

        al = new ArrayList<>();
        for (int i = p - 1; i >= 0; i--) {
            pro = projects.get(i);
            int skillmet = 0;
            al = new ArrayList<>();
            HashSet<Integer> takenAlready = new HashSet<>();
            for (Pair<String, Integer> reqskill : pro.skills) {
                for (int j = 0; j < contributers.size(); j++) {
                    if (!takenAlready.contains(j)) {
                        Contributer contributer = contributers.get(j);
                        if (contributer.skills.containsKey(reqskill.first)) {
                            if (contributer.skills.get(reqskill.first) >= reqskill.second) {
                                takenAlready.add(j);
                                skillmet++;
                                al.add(contributer);
                                break;
                            }
                        }
                    }
                }
            }

            HashSet<String> hs = new HashSet<>();

            if (skillmet == pro.r) {
                out.printLine(1);
                out.printLine(pro.name);
                StringBuilder sb = new StringBuilder();
                for (Contributer contributer : al) {
//                    if (hs.add(contributer.name))
                    sb.append(contributer.name).append(" ");
                }
                out.printLine(sb);
                return;
            }

        }


    }

    private Project getMaxProject(ArrayList<Project> projects) {
        Project max = new Project("temp", 0, 0, 0, 0);
        for (Project project : projects) {
            if (project.s >= max.s) {
                max = project;
            }
        }
        return max;
    }
}
