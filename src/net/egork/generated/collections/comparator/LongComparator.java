package net.egork.generated.collections.comparator;

/**
 * @author Egor Kulikov
 */
public interface LongComparator {
    LongComparator DEFAULT = (first, second) -> {
        if (first < second) {
            return -1;
        }
        if (first > second) {
            return 1;
        }
        return 0;
    };

    LongComparator REVERSE = (first, second) -> {
        if (first > second) {
            return -1;
        }
        if (first < second) {
            return 1;
        }
        return 0;
    };

    int compare(long first, long second);
}
