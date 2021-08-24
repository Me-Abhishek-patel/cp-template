package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleLongToDoubleFunction {
    double value(double first, long second);

    default DoubleToDoubleFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToDoubleFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
