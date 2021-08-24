package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleDoubleToIntFunction {
    int value(double first, double second);

    default DoubleToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
