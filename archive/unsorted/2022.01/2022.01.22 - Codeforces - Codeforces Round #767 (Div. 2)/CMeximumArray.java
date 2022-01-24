package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class CMeximumArray {
    static int MAXN = 200001;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);

        int mexidx = -1, mex = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (mexidx < n - 1 && al.size() < n) {
            int i = mexidx + 1;
            HashSet<Integer> hs = new HashSet<>();
            mex = mex(a, i, n);
            for (; i < n; i++) {
                if ((a[i]) < mex) {
                    hs.add(a[i]);
                }
                if (hs.size() == mex) {
                    i++;
                    break;
                } ;
            }
            mexidx = i - 1;
            al.add(mex);


        }
        out.printLine(al.size());
        for (Integer integer : al) {
            out.print(integer + " ");
        }
        out.printLine();


    }

    private TreeSet<Integer> getMex(int mex) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i <= mex; i++) {
            ts.add(i);
        }
        return ts;
    }

    static int mex(int arr[], int l, int n) {
        int MAXN = n + 5;
        int hash[] = new int[MAXN];

        for (int i = l; i < n; i++) {
            hash[arr[i]] = i + 1;
        }


        int MexOfArr = 0;

        for (int i = 0; i <= MAXN; i++) {
            if (hash[i] == 0) {
                MexOfArr = i;
                break;
            }
        }
        return MexOfArr;


    }

}
