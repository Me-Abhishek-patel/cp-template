package net.egork.string;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class SubstringStringHash extends AbstractStringHash {
    private final StringHash base;
    private final int from;
    private final int to;

    public SubstringStringHash(StringHash base, int from) {
        this(base, from, base.length());
    }

    public SubstringStringHash(StringHash base, int from, int to) {
        this.base = base;
        this.from = from;
        this.to = to;
    }

    public long hash(int from, int to) {
        if (to + this.from > this.to) {
            throw new IndexOutOfBoundsException();
        }
        return base.hash(from + this.from, to + this.from);
    }

    public int length() {
        return to - from;
    }
}
