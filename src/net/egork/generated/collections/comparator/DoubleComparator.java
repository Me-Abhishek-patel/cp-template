package net.egork.generated.collections.comparator;

/**
 * @author Egor Kulikov
 */
public interface DoubleComparator {
    DoubleComparator DEFAULT = (first, second) -> {
        if (first < second) {
            return -1;
        }
        if (first > second) {
            return 1;
        }
        return 0;
    };

    DoubleComparator REVERSE = (first, second) -> {
        if (first > second) {
            return -1;
        }
        if (first < second) {
            return 1;
        }
        return 0;
    };

    int compare(double first, double second);
}
