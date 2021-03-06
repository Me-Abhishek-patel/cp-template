package net.cplibrary.generated.collections.pair;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class LongIntPair implements Comparable<LongIntPair> {
    public final long first;
    public final int second;

    public LongIntPair(long first, int second) {
        this.first = first;
        this.second = second;
    }

    public static LongIntPair makePair(long first, int second) {
        return new LongIntPair(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LongIntPair pair = (LongIntPair) o;

        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(first);
        result = 31 * result + Integer.hashCode(second);
        return result;
    }

    public IntLongPair swap() {
        return IntLongPair.makePair(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }

    @SuppressWarnings({"unchecked"})
    public int compareTo(LongIntPair o) {
        int value = Long.compare(first, o.first);
        if (value != 0) {
            return value;
        }
        return Integer.compare(second, o.second);
    }
}
