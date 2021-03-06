package net.cplibrary.generated.collections.pair;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class DoubleVPair<V> implements Comparable<DoubleVPair<V>> {
    public final double first;
    public final V second;

    private DoubleVPair(double first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <V> DoubleVPair<V> makePair(double first, V second) {
        return new DoubleVPair<V>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DoubleCharPair pair = (DoubleCharPair) o;

        return first == pair.first && second.equals(pair.second);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(first);
        result = 31 * result + second.hashCode();
        return result;
    }

    public KDoublePair<V> swap() {
        return KDoublePair.makePair(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }

    @SuppressWarnings({"unchecked"})
    public int compareTo(DoubleVPair<V> o) {
        int value = Double.compare(first, o.first);
        if (value != 0) {
            return value;
        }
        return ((Comparable<V>) second).compareTo(o.second);
    }
}
