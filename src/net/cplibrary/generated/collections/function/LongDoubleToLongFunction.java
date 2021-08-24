package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongDoubleToLongFunction {
    long value(long first, double second);

    default LongToLongFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
