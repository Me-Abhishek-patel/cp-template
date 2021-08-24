package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleDoublePredicate {
    boolean value(double first, double second);

    default DoubleFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
