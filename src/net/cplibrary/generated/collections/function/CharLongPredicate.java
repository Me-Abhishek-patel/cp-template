package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
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
