package net.cplibrary.generated.collections.comparator;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class ReverseComparators {
    private ReverseComparators() {
    }

    public static DoubleComparator reverse(final DoubleComparator comparator) {
        return new DoubleComparator() {
            public int compare(double first, double second) {
                return comparator.compare(second, first);
            }
        };
    }

    public static IntComparator reverse(final IntComparator comparator) {
        return new IntComparator() {
            public int compare(int first, int second) {
                return comparator.compare(second, first);
            }
        };
    }

    public static LongComparator reverse(final LongComparator comparator) {
        return new LongComparator() {
            public int compare(long first, long second) {
                return comparator.compare(second, first);
            }
        };
    }

    public static CharComparator reverse(final CharComparator comparator) {
        return new CharComparator() {
            public int compare(char first, char second) {
                return comparator.compare(second, first);
            }
        };
    }
}