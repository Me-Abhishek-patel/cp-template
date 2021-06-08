package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongLongToDoubleFunction {
    double value(long first, long second);

    default LongToDoubleFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToDoubleFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
