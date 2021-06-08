package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntDoublePredicate {
    boolean value(int first, double second);

    default IntFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
