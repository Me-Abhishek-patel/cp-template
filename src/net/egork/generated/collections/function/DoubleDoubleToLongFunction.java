package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleDoubleToLongFunction {
    long value(double first, double second);

    default DoubleToLongFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToLongFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
