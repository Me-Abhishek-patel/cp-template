package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongDoublePredicate {
    boolean value(long first, double second);

    default LongFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
