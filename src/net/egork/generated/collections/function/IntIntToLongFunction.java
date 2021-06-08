package net.egork.generated.collections.function;

/**
 * @author Egor Kulikov
 */
public interface IntIntToLongFunction {
    long value(int first, int second);

    default IntToLongFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToLongFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
