package net.cplibrary.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface DoubleLongToLongFunction {
    long value(double first, long second);

    default DoubleToLongFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToLongFunction setFirst(double first) {
        return v -> value(first, v);
    }
}
