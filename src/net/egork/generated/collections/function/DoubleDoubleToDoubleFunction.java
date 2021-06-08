package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleDoubleToDoubleFunction {
    double value(double first, double second);

    default DoubleToDoubleFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToDoubleFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
