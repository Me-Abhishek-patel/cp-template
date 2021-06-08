package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongCharPredicate {
    boolean value(long first, char second);

    default LongFilter setSecond(char second) {
        return v -> value(v, second);
    }

    default CharFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
