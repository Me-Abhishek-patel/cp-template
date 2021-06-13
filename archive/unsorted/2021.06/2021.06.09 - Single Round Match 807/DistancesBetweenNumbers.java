package codes;

public class DistancesBetweenNumbers {
    public long count(int N, int[] Aprefix) {
        int[] A = new int[N];
        int L = Aprefix.length;
        for (int i = 0; i < L; ++i) A[i] = Aprefix[i];
        for (int i = L; i < N; ++i) A[i] = (int) ((A[i - 1] * 1103515245L + 12345L) % (1L << 31));
        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {
                StringBuilder s = new StringBuilder(String.valueOf(A[i]));
                StringBuilder k =new StringBuilder(String.valueOf(A[j]));
                int o = Math.abs(s.length()-k.length());
                StringBuilder m = new StringBuilder();
                for (int l = 0; l < o ; l++) {
                    m.append("0");
                }
                if(s.length()<k.length()){
                   s = new StringBuilder(m.append(s).toString());
                }else if(s.length()>k.length()){
                    k = new StringBuilder(m.append(k).toString());
                }
                s = s.reverse();
                k = k.reverse();
                for (int l = 0; l < s.length() ; l++) {
                    if(s.charAt(l)!=k.charAt(l)) sum++;
                }
            }
        }

        return sum;
    }
}
