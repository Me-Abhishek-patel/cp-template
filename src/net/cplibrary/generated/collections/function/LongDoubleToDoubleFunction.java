package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongDoubleToDoubleFunction {
    double value(long first, double second);

    default LongToDoubleFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToDoubleFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
