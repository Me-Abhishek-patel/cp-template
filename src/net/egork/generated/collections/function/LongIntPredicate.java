package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongIntPredicate {
    boolean value(long first, int second);

    default LongFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
