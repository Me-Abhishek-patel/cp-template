package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongLongPredicate {
    boolean value(long first, long second);

    default LongFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
