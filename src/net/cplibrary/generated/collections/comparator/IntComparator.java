package net.cplibrary.generated.collections.comparator;

/**
 * @author Egor Kulikov
 */
public interface IntComparator {
    IntComparator DEFAULT = (first, second) -> {
        if (first < second) {
            return -1;
        }
        if (first > second) {
            return 1;
        }
        return 0;
    };

    IntComparator REVERSE = (first, second) -> {
        if (first > second) {
            return -1;
        }
        if (first < second) {
            return 1;
        }
        return 0;
    };

    int compare(int first, int second);
}
