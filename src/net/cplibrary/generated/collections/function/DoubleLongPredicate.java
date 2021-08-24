package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleLongPredicate {
    boolean value(double first, long second);

    default DoubleFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
