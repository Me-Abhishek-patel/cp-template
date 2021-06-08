package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface LongLongToIntFunction {
    int value(long first, long second);

    default LongToIntFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
