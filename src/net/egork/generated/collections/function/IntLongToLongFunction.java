package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntLongToLongFunction {
    long value(int first, long second);

    default IntToLongFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
