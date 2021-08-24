package net.cplibrary.generated.collections.comparator;

/**
 * @author Egor Kulikov
 */
public interface CharComparator {
    CharComparator DEFAULT = (first, second) -> {
        if (first < second) {
            return -1;
        }
        if (first > second) {
            return 1;
        }
        return 0;
    };

    CharComparator REVERSE = (first, second) -> {
        if (first > second) {
            return -1;
        }
        if (first < second) {
            return 1;
        }
        return 0;
    };

    int compare(char first, char second);
}
