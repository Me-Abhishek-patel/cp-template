package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntLongToIntFunction {
    int value(int first, long second);

    default IntToIntFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToIntFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
