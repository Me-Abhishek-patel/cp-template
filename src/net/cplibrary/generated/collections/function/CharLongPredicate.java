package net.cplibrary.generated.collections.function;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public interface CharLongPredicate {
    boolean value(char first, long second);

    default CharFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
