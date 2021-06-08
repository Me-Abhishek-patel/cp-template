package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntLongPredicate {
    boolean value(int first, long second);

    default IntFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
