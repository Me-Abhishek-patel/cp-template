package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongLongToLongFunction {
    long value(long first, long second);

    default LongToLongFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
