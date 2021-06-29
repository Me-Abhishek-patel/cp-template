package net.egork.collections.comparators;

import java.util.Comparator;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class ReverseComparator<T extends Comparable<T>> implements Comparator<T> {
    public int compare(T o1, T o2) {
        return o2.compareTo(o1);
    }
}
