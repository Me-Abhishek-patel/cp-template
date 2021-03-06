package net.cplibrary.generated.collections.hashing;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class LongHash {
    private LongHash() {
    }

    public static int hash(long c) {
        return (int) ((c >>> 32) ^ c);
    }
}
